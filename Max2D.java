import java.util.Arrays;

public class Max2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 444, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {8, 12}
        };
        int[]ans = new int[]{max(arr)};
        System.out.println(Arrays.toString(ans));

    }
    static int max(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }
}
