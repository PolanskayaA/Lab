import java.util.Random;

class StopWatch {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
class StopWatchTest {
    public static void main(String[] args) {
        int[] array = new Random().ints(100000, 0, 100000).toArray();
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        selectionSort(array);
        stopwatch.stop();
        System.out.println("Время сортировки (мс): " + stopwatch.getElapsedTime());
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
