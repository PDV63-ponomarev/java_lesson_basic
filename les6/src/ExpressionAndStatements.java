public class ExpressionAndStatements {
    public static void main(String[] args) {

        // выражения
        double distance = 150.0;
        double time = 2.5;
        double speed = distance / time;
        String outputString = "Speed: " + speed + " km/h";
        System.out.println(outputString);


        // Conditional Expression
        int apples = 7;
        int oranges = 5;
        String fruitMessage = (apples + oranges > 10) ? // если яблок и апельсинов больше 10
                "You have a lot of fruits!" : // если true присваивается переменной текст
                "You have a few fruits."; // Если false присваивается переменной текст

        System.out.println(fruitMessage); // "You have a lot of fruits!"


        //  Инструкции. Declaration Statement
        int initialBalance = 500;          // обьявление и присвоение
        initialBalance -= 50;              // выражение конвертированное в инструкцию
        System.out.println(initialBalance += 50);
        System.out.println(initialBalance = 100);

        System.out.println("initialBalance = " + initialBalance);


        // Conditional Statement
        int score = 0;                     // обьявление и присвоение
        score++;                           // выражение-инсрукция

        if (score > 0) {                   // инструкция
            System.out.println("You have earned a point!");
        } else {
            System.out.println("No points earned.");
        }
    }
}
