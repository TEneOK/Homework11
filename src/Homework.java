import java.time.LocalDate;

public class Homework {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        int clientDeviceYear = 2015;
        int clientOS = 1;
        int deliveryDistance = 95;
        int day = 20;
        int twoDay = 60;
        int threeDay = 100;
        int deliveryDays = 1;
        years(currentYear);
        version(clientDeviceYear, clientOS);
        deliverTheCard(deliveryDistance, day, twoDay, threeDay, deliveryDays);
        System.out.println(deliverTheCard(deliveryDistance, day, twoDay, threeDay, deliveryDays));
    }

    public static void years(int currentYear) {
        if (currentYear > 1584 && (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0)) {
            System.out.println(currentYear + " год является високосным");
        } else {
            System.out.println(currentYear + " год не является високосным");
        }
    }

    public static void version(int clientDeviceYear,
                               int clientOS) {
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для IOS");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите обычную версию приложения для Android");
        } else if (clientDeviceYear < 2015 && clientOS == 1)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }

    public static int deliverTheCard(int deliveryDistance, int day, int twoDay, int threeDay, int deliveryDays) {
        if (deliveryDistance > threeDay) {
            deliveryDays--;
        } else if (deliveryDistance > day) {
            deliveryDays++;
        } else if (deliveryDistance > twoDay) {
            deliveryDays++;
        }
        return deliveryDays;
    }
}