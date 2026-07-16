public class OperatorsLogician {
    public static void main(String[] args) {
        boolean one = true;
        boolean two = false;
        boolean three = true;

        boolean primer1 = one && two; // false
        boolean primer2 = one || two; // true
        boolean primer3 = !one; // false
        primer3 = !primer3; // true

        boolean primer4 = one && two && three; //false
        boolean primer5 = one || two || three; //true

        boolean primer6 = one && two || three; // true и false или true (результат true)
        System.out.println(primer6);
    }
}
