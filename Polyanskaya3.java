import java.util.Date;

public class Main {
    public static void main(String[] args) {
        for (long curyear = 10; curyear <= 100000000; curyear *= 10) {
            System.out.println(new Date(curyear * 1000));
        }
    }
}


