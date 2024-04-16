public class Convert_Number_To_Word {

        private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        private static final String[] groups = { "", "Thousand", "Million", "Billion" };
    
        private static String convertGroup(int num) {
            if (num == 0) {
                return "";
            }
            if (num < 20) {
                return units[num];
            }
            if (num < 100) {
                return tens[num / 10] + " " + convertGroup(num % 10);
            }
            return units[num / 100] + " Hundred " + convertGroup(num % 100);
        }
    
        public static String convertToWords(int number) {
            if (number == 0) {
                return "Zero";
            }
    
            StringBuilder words = new StringBuilder();
            int groupIndex = 0;
    
            while (number > 0) {
                int group = number % 1000;
                if (group != 0) {
                    String groupWords = convertGroup(group);
                    words.insert(0, groupWords + " " + groups[groupIndex] + " ");
                }
                number /= 1000;
                groupIndex++;
            }
    
            return words.toString().trim();
        }
    
        public static void main(String[] args) {
            int number = 438237764;
            String words = convertToWords(number);
            System.out.println(words);
        }
    }
    