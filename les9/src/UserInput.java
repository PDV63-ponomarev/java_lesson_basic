import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = input.nextLine();

        System.out.print("Введите ваш возрост: ");
        int old = input.nextInt();

        System.out.print("Введите температуру: ");
        double temperature = input.nextDouble();

        System.out.println("Вы ввели: " + name + ", " + old + ", " + temperature);

        input.close(); // закрывает сканер. Не обезательно для маленьких программ

        //автоматическое закрытие сканера после выполнения блока try-with-resources
        try (Scanner input2 = new Scanner(System.in)){
            System.out.print("Введите слово: ");
            String word = input2.nextLine();
            System.out.println("Вы ввели:" + word);
        }

    }
}
