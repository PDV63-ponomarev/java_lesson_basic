import java.util.Scanner;

public class Statment {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваш возрост");

        int age = input.nextInt();

        if (age >= 18 && age <= 100){
            System.out.println("Совершенолетний");
        } else if (age <= 0 || age > 100){
            System.out.println("Нет такого возроста");
        }
        else {
            System.out.println("Ребенок");
        }

        input.close();
    }
}
