import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesFormatter {
    public static void main(String[] args) {
        // переменная для работы с датой
        Date currentDate = new Date();

        // создание форматировшика даты в день недели
        SimpleDateFormat dayOfWeekFormat= new SimpleDateFormat("EEEE");

        // создания дня недели
        String dayOfWeek = dayOfWeekFormat.format(currentDate);
        System.out.println("Сегодня день недели: " + dayOfWeek);

        //число месяца
        SimpleDateFormat dayOfMonthFormat= new SimpleDateFormat("dd");
        String dayOfMonth = dayOfMonthFormat.format(currentDate);
        System.out.println("Сегодня число: " + dayOfMonth);

        //месяц
        SimpleDateFormat mayOfYearFormat= new SimpleDateFormat("MMMM");
        String mayOfYear = mayOfYearFormat.format(currentDate);
        System.out.println("Сегодня месяц: " + mayOfYear);
    }
}

