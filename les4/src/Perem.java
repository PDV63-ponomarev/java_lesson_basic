public class Perem {
    public static void main(String[] args) {

        int age; //обьявление
        age = 18; // присвоение

        // примитивные типы

        byte one = 127; // -128 ~ 127 диапозон. 1 Байт
        short two = 32767; // -32768 ~ 32767 диапозон. 2 Байта
        int three = 2147483647; // -2,147,483,648 ~ 2,147,483,647. 4 Байта
        long four = 8_000_000_000L; // Миллиарды. 8 Байт.

        float temperature = 36.6f; // f или F. 4 байта
        double pi = 3.14; // d или D опционально. 8 байтов

        boolean bool = true; // false по умолчанию

        char letter = 'F'; // один символ, либо код. 2 Байта
        char number = '5';
        char symbol = '@';
        char greek = '\u03A9'; //Unicode
        char digit = 53; // код символа `;`



        // не примитивные типы. Ссылочный тип данных
        // Class, Interface, Array, Annotation, Enumaration, String

        String word = "Word";



    }
}
