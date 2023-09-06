public class MaxSubarray {
    public static int maxSubarray(int[] arr, int n) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 18, -6, -6, -5, 7, 10, 16, -6, -2, 0 };
        int n = arr.length;
        int ans = maxSubarray(arr, n);
        System.out.println(ans);
    }

}