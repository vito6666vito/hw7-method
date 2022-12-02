public class Main {
    public static void definitionYear (int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {System.out.println( year + " год является високосным"); }
        else  {System.out.println( year + " год не является високосным");}
    }
    public static void checkOutOS (int clientOS1,int clientDeviceYear){
        if (clientOS1 == 0 && clientDeviceYear < 2015)
        {System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientOS1 == 0 && clientDeviceYear >= 2015)
        {System.out.println("Установите версию приложения для iOS по ссылке");}
        if (clientOS1 == 1 && clientDeviceYear < 2015)
        {System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else if (clientOS1 == 1 && clientDeviceYear >= 2015) {System.out.println("Установите версию приложения для Android по ссылкее");}
    }
    public static void calculationOfDelivery (int deliveryDistance, int deliveryTime){
        if (deliveryDistance >20) {deliveryTime++;}
        if (deliveryDistance >60) {deliveryTime++;}
        {System.out.println("Потребуется дней: " +deliveryTime ); }
    }
    public static void main(String[] args) {
        System.out.println("Задение 1");
        int year = 40_000;
        definitionYear (year);

        System.out.println("Задение 2");
        int clientOS1 = 0;
        int clientDeviceYear = 2022;
        checkOutOS (clientOS1,clientDeviceYear);

        System.out.println("Задение 3");
        int deliveryDistance = 80;
        int deliveryTime = 1;
        calculationOfDelivery (deliveryDistance,deliveryTime);
    }
}

