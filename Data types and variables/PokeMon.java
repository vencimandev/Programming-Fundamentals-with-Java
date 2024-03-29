import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine()); //текуща сила (N)
        int startPower = power; //стартова сила
        int distance = Integer.parseInt(scanner.nextLine()); //разстоянието между целите (M)
        int factor = Integer.parseInt(scanner.nextLine()); //фактор на изтощение (Y)
        int countPoked = 0;//брой на намушканите цели



        while (power >= distance) {
            //1. стигаме до целта: сила - разстояние
            power -= distance;
            //2. действието намушкване
            countPoked++;

            //проверка за умората
            if (power == startPower / 2) {
                //достигаме до изтощение
                //текущата сила / фактор на изтощение

                //factor (делимо) == 0 -> невъзможно деление
                //factor (делимо) != 0 -> възможно деление
                if (factor != 0) {
                    //възможна операцията деление
                    power /= factor;
                }

            }
        }

        System.out.println(power);
        System.out.println(countPoked);
    }
}