package Day_6.hometask;

public class Nested {
        public static void main(String[] args) {

            int daysCompleted = 0;

            for (int month = 1; month <= 12; month++) {

                int days = 31;

                if (month == 2) {
                    days = 28;
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    days = 30;
                }

                for (int day = 1; day <= days; day++) {
                    daysCompleted++;
                }
            }

            System.out.println("Total days completed : " + daysCompleted);
        }
    }
