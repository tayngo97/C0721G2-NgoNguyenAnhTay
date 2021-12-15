import static java.lang.Integer.max;

public class Main {
    public static void main(String[] args) {
        int[] numberArr = {-1,-5, -6, -2, 3, -8, -5, -6};

        System.out.println(maxSubArraySum(numberArr));
    }

    static int maxSubArraySum(int a[])
    {
        int max_so_far = a[0], max_ending_here = 0;

        for (int i = 0; i < a.length; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0)
                max_ending_here = 0;
            else if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }
}
