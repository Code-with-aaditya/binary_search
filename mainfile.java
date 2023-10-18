import java.util.Scanner;

public class mainfile {
    public static int binary_search(int[] arr, int k) {
        int st = 0;
        int ed = arr.length - 1;

        while (st <= ed) {
            int mid = (st + ed) / 2;
            if (arr[mid] == k) {
                return mid;
            }

            if (arr[mid] < k) {
                st = mid + 1;
            }
            else {
                ed = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key element: ");
        int key = sc.nextInt();
        System.out.println(binary_search(arr, key));
    }
}
