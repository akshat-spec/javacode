import java.util.HashSet;

public class tripletsumwithhashset {
    public static void findTriplets(int[] arr, int sum) {
        for (int i = 0; i < arr.length - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int currentSum = sum - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (set.contains(currentSum - arr[j])) {
                    System.out.println("Triplet is: " + arr[i] + ", " + arr[j] + ", " + (currentSum - arr[j]));
                }
                set.add(arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 1, 6, 9};
        int sum = 24;
        findTriplets(arr, sum);
    }
}