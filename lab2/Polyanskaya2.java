import java.util.GregorianCalendar;

class GregorianCalendarExample {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Текущая дата:");
        System.out.println(calendar.get(GregorianCalendar.YEAR) + "-" +
                (calendar.get(GregorianCalendar.MONTH) + 1) + "-" +
                calendar.get(GregorianCalendar.DAY_OF_MONTH));


        calendar.setTimeInMillis(1234567898765L);
        System.out.println("\nДата для 1234567898765L:");
        System.out.println(calendar.get(GregorianCalendar.YEAR) + "-" +
                (calendar.get(GregorianCalendar.MONTH) + 1) + "-" +
                calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
