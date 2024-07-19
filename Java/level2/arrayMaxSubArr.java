public class arrayMaxSubArr {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println();
    }
    
    public static int maxSubArr(int[] num) {
        int maxSoFar = num[0];
        int maxEndingHere = num[0];

        for (int i = 1; i < num.length; i++) {
            maxEndingHere = Math.max(num[i], maxEndingHere + num[i]);

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
    }
}
