class MyTime {
    private int hour;
    private int minute;
    private int second;
    public MyTime() {
        setTime(System.currentTimeMillis());
    }
    public MyTime(long elapsedTime) {
        setTime(elapsedTime);
    }
    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int) (totalHours % 24);
    }
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(555550000);
        MyTime time3 = new MyTime(5, 23, 55);
        System.out.printf("Текущее время: %02d:%02d:%02d\n", time1.getHour(), time1.getMinute(), time1.getSecond());
        System.out.printf("Время 555550000 мс: %02d:%02d:%02d\n", time2.getHour(), time2.getMinute(), time2.getSecond());
        System.out.printf("Время 5:23:55: %02d:%02d:%02d\n", time3.getHour(), time3.getMinute(), time3.getSecond());
    }
}

