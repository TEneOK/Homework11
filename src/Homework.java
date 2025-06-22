import java.time.LocalDate;

public class Homework {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        int clientDeviceYear = 2015;
        int clientOS = 1;
        int deliveryDistance = 20;
        years(currentYear);
        version(clientDeviceYear, clientOS);
        delivery(deliveryDistance);
    }

    public static void years(int currentYear) {
        if (currentYear > 1584 && (currentYear % 4 == 0 && currentYear % 100 == 0 || currentYear % 400 == 0)) {
            System.out.println(currentYear + " год является високосным");
        } else
            System.out.println(currentYear + " год не является високосным");
        return;
    }

    public static void version(int clientDeviceYear,
    int clientOS) {
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для IOS");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }

        else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите обычную версию приложения для Android");
        } else if (clientDeviceYear < 2015 && clientOS == 1)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        return;
    }

    public static void delivery(int deliveryDistance) {
        int day = 20;
        int twoDay = 60;
        int threeDay = 100;
        int deliveryDays = 1;
        if (deliveryDistance > threeDay) {
            System.out.println("Доставки нет.");
        } else if (deliveryDistance > day) {
            deliveryDays++;
        } else if (deliveryDistance > twoDay) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        return;
    }
}