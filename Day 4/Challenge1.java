import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        // finding sum of all elements
        // searching an element
        // finding max element
        // finding second largest element
        int[] a = { 1, 2, 4, 5, 7, 7, 3, 6, 6 };
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("array sum = " + sum);

        // searching an element
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int element = sc.nextInt();
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            System.out.println("Element present at index " + index);
        } else {
            System.out.println("Element is not present in the array");
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max value of array is " + max);
        /* Second max of the array */

        int maxi = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxi) {
                secMax = maxi;
                maxi = a[i];
            } else if (a[i] < maxi && a[i] > secMax) {
                secMax = a[i];
            }

        }
        System.out.println("Sec Max element is " + secMax);

        sc.close();

    }
}
