public class conditionalOperators {
        public static void main(String[] args) {
            int clientOS = 1;
            int clientDeviceYear = 2015;
            if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
                if (clientOS == 1 && clientDeviceYear < 2015) {
                    System.out.println("Установите обдегченную версию приложения для Android по ссылке");
            }
                if (clientOS == 0 && clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для IOS по ссылке");
                }
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
            int year = 2000;
            if ( ( year % 400 == 0 ) || ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) ) {
                System.out.println( year + " год является високосным.");
            }
            else {
                System.out.println( year + " год не является високосным.");
            }
            int deliverySpeed = 1;
            for (int distance = 20; distance < 95; deliverySpeed++) {
                distance = distance + 40;
            }
                System.out.println("Потребуется дней: " + deliverySpeed);
            int monthNumber = 4;
            switch (monthNumber) {
                case 1:
                case 2: System.out.println("зима");
                    break;
                case 3:
                case 4:
                case 5: System.out.println("весна");
                    break;
                case 6:
                case 7:
                case 8: System.out.println("лето");
                    break;
                case 9:
                case 10:
                case 11: System.out.println("осень");
                    break;
                case 12: System.out.println("зима");
                    break;
                default:
            }
        }
    }
