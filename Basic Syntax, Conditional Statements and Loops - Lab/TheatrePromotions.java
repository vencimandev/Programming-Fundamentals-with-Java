import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на типа ден и възрастта
        String dayType = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        if (age >= 0 && age <= 18) {
            switch (dayType) {
                case "weekday": price = 12; break;
                case "weekend": price = 15; break;
                case "holiday": price = 5; break;
            }
        } else if (age > 18 && age <= 64) {
            switch (dayType) {
                case "weekday": price = 18; break;
                case "weekend": price = 20; break;
                case "holiday": price = 12; break;
            }
        } else if (age > 64 && age <= 122) {
            switch (dayType) {
                case "weekday": price = 12; break;
                case "weekend": price = 15; break;
                case "holiday": price = 10; break;
            }
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.println(price + "$");
    }
}
