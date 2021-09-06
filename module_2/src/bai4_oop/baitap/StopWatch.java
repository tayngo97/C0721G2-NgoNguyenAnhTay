package bai4_oop.baitap;
import java.util.Arrays;
import java.util.Scanner;
public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedtime() {
        double elapsedTime;
        elapsedTime = this.endTime - this.startTime;
        return elapsedTime;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void selectionSort(int arr[], int n) {
        int i, j, minIdx;

        // One by one move boundary of unsorted subarray
        for (i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            minIdx = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;

            // Swap the found minimum element with the first element
            swap(arr[minIdx], arr[i]);
        }
    }

    /* Function to print an array */
    void printArray(int arr[], int size) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println("in put n");
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("input n=100000 and n>0");
            } else if (n != 100000) {
                System.out.println("input n=100000 and n>0");
            }
        } while (n != 100000 );
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += 1;
            arr[i] = arr[i] + sum;
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("time of watch is running");
        // vì phương thức selection sort là kiểu static nên gọi ko cần thông qua đối tượng mới
        // mà gọi trực tiếp từ lớp
        StopWatch.selectionSort(arr, n);
        stopWatch.stop();
        // hàm printArray ko thuộc kiểu static nên phải gọi thông qua đối tượng stopWatch
        stopWatch.printArray(arr, n);
        double elapsedTime = stopWatch.getElapsedtime();
        System.out.println();
        System.out.println("Elapsed time is: " + elapsedTime + " milisecond");
    }
}
