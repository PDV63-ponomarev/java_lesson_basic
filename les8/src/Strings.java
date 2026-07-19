public class Strings {
    public static void main(String[] args) {
        String name = "Dima Ponomarev";

        String firstName = "Dima";
        String lastName = "Ponomarev";
        String fullname = firstName + " " + lastName;
        System.out.println(fullname); // Dima Ponomarev

        int lenghtName = name.length(); // длина строки. Кол-во символов
        System.out.println(lenghtName); // 14

        boolean isEmptiName = name.isBlank(); // true если строка пустая
        System.out.println(isEmptiName); // false

        String upperName = name.toUpperCase(); // строка в верхнем регистре
        System.out.println(upperName); // DIMA PONOMAREV

        String lowerName = name.toLowerCase(); // строка в нижний регистр
        System.out.println(lowerName); //dima ponomarev

        String fruit = "   Mango   ";
        System.out.println(fruit.strip()); // обрезает пробелы
        System.out.println(fruit); // исходный не меняется

        boolean isEqual = firstName.equals(lastName); //сравнение строк
        System.out.println(isEqual); //false

        char data[] = {'a','b','c'}; // массив символов
        String str = new String(data); // массив символов передается в строку
        System.out.println(str); // abc

        char firstSimvol = firstName.charAt(0); //получить первый символ строки
        char lastSimvol = firstName.charAt(firstName.length() - 1); // получить последний символ
        System.out.println(firstSimvol + " " + lastSimvol);


        System.out.println("Hello\tWorld"); // втсавляет tab
        System.out.println("Hello\nWorld"); // переход на новую строку
        System.out.println("Hello \"World\""); // Hello "World"
        System.out.println("Hello\\World"); // Hello\World
        System.out.println("Hello \rWorld"); // World
    }
}
