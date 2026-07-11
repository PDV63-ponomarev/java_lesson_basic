import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        // ожидание ввода с клавиатуры
        Scanner input = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        // ввод с клавиатуры
        String name = input.nextLine();

        System.out.println("Ваше имя " + name);

    }
}
