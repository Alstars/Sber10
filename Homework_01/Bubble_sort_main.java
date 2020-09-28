import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bubble_sort_main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type in value");
        int n = in.nextInt();
        System.out.println("Your array length:" + n);
        System.out.println("Resulting sorted array looks like this:" + Arrays.toString(Sort.sort(Sort.createArray(n), n)));

    }
}
    class Sort {
        public static int[] createArray(int arrayLength) {
            int[] arr = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                Random rn = new Random();
                arr[i] = rn.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            return arr;
        }

        public static int [] sort(int [] arr, int n) {
            for (int i=0; i<n-1; i++)
            {
                if (arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    System.out.println(Arrays.toString(arr));
                    Sort.sort(arr, n);
                }
            }
            return(arr);
        }
    }
