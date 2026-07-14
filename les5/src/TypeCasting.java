public class TypeCasting {
    public static void main(String[] args) {

        // неявная конвертация
        int count = 20;
        long bottleCount = count;

        // явная конвертация
        long bottleCount2 = 20L;
        int count2 = (int) bottleCount2;


        //потеря информации. Было 150.7 стало 150.
        double carSpeed = 150.7;
        int speed = (int) carSpeed;
        System.out.println("Double: " + carSpeed);
        System.out.println("Int: " + speed);

        //  конвертация с потерей информации. Не имеет смысла
        long yearlyRevenue = 2_500_000_000L;
        int truncatedRevenue = (int) yearlyRevenue;
        System.out.println("Годовой доход (усечено до целого числа): " + truncatedRevenue); // -1794967296


        // конвертация символа к числу
        char currencySymbol = '$'; // Example: currency symbol '$'
        int currencyAscii = currencySymbol; // char -> int: implicit type casting (no data loss)
        System.out.println("Конвертация символа " + currencySymbol + " в ASCII: " + currencyAscii); // Output: 36


        // Конвертация числа в символ
        int examScore = 65; // не все числа можно конвектировать в символ
        char grade = (char) examScore; // int -> char: explicit type casting (possible data loss)

        System.out.println("Конвертация числа " + examScore + " в символ по ASCII: " + grade); // Output: 'A'


        //конвертация числа в строку
        int num = 123;
        String str = String.valueOf(num);

        // конвертации строки с числом
        String numStr = "123";
        int numInt = Integer.parseInt(numStr);  // 123

        String strPi = "3.1415";
        double pi = Double.parseDouble(strPi); // 3.1415

    }

}