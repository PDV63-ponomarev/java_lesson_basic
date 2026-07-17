public class OperatorsConditional {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 1000;
        int smallerNum = num1 < num2 ? num1 : num2;
        int largerNum = num1 > num2 ? num1 : num2;
        // результат сохраняется типа int, посколько результат выражений int
        System.out.println("Меньшее число: " + smallerNum);
        System.out.println("Большее число: " + largerNum);

        boolean bigNums = num2 >= 1000 ? true : false;

        String isSmaller = num1 <= 100 ? "Small" : "Not small";


        double morningTemperature = 18.5;
        double afternoonTemperature = 20.0;
        double eveningTemperature = 19.9;

        double highestTemperature = morningTemperature > afternoonTemperature
                ? (morningTemperature > eveningTemperature ? morningTemperature : eveningTemperature)
                : (afternoonTemperature > eveningTemperature ? afternoonTemperature : eveningTemperature);

        double highestTemperature2 = morningTemperature > afternoonTemperature
                ? (Math.max(morningTemperature, eveningTemperature))
                : (Math.max(afternoonTemperature, eveningTemperature));

        double highestTemperature3 = Math.max(morningTemperature, Math.max(afternoonTemperature, eveningTemperature));

        // Если утром теплее чем днем,
        // то проверяет утром или вечером теплее
        // иначе проверяет днем или вечером теплее
        System.out.println("Самая высокая температору днем: " + highestTemperature);
    }
}
