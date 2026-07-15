public class OperatorsArifmetics {
    public static void main(String[] args) {
        int one = 80;
        int two = 75;

        int summary = one + two;
        int different = one - two;
        int total = one * two;
        double delete = one / two; //double потому что результат не целое число
        int remainder = one % two; //остаток от деления

        one++; //постфиксное увеличение
        ++two; //префиксное увеличение

        one--; //постфиксное уменьшение
        --two; //префиксное уменьшение


        int num1 = 1;
        int num2 = 2;
        int result1 = num1 * num2++; // num2 увеличивается после умножения
        System.out.println("result1 = " + result1); // 2
        System.out.println("num2 = " + num2); // 3

        int num3 = 1;
        int num4 = 2;
        int result2 = num3 * ++num4; //num2 увеличится перед умножением
        System.out.println("result2 = " + result2); // 3
        System.out.println("num2 = " + num4); // 3

        System.out.println("num4 = " + num4--); // сначала выводит результат, затем меняет значение
        System.out.println("num4 = " + num4);
    }
}
