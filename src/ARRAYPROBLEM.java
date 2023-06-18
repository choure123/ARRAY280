import java.util.Arrays;
import java.util.Scanner;

public class ARRAYPROBLEM {
    public static void main(String[] args) {
        // Creating an integer array
        // named arr of size 10.
        int[] arr = new int[10];
        // accessing element at 0 index
        // and setting its value to 5.
        arr[0] = 5;
        // access and print value at 0
        // index we get the output as 5.
        System.out.println(arr[0]);

    }
}

class ARRAY01 {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}

class array02 {
    public static void main(String[] args) {
        // Declaring 2-D array with 2 rows
        int arr[][] = new int[2][];

        // Making the above array Jagged

        // First row has 3 columns
        arr[0] = new int[3];

        // Second row has 2 columns
        arr[1] = new int[2];

        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}

class array2 {
    public static void main(String[] args) {
        int[] number = new int[100];
        for (int i = 0; i < 100; i++) {
            number[i] = i + 1;
            if (i % 5 == 0) {
                System.out.println(number[i]);
            }


        }
    }
}

class asscendingorder {
    public static void main(String[] args) {
        int[] arry = {5, 6, 7, 8, 83, 4, 2, 9, 98};
        Arrays.sort(arry);
        System.out.println("Array.(arry)");
    }
}

class frequency0 {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 10, 30, 10, 40};
        int freq = 0, key = 10;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                freq++;

            }
        }
        System.out.println("frequency of 10");

    }
}

class reverseoderarrar {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("enter array elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();

        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");

        }
        System.out.println("/n array reverse elements ");
        for (int i = a.length - 1; i >= 0; i--) ;
        {


        }

    }
}

class smallestelement {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 4, 21, 3, 3,};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("the smallest element in the array is: " + min);
    }
}

class LargestElement_array {
    public static void main(String[] args) {

        //Initialize array
        int[] arr = new int[]{25, 11, 7, 75, 56};
        //Initialize max with first element of array.
        int max = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with max
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}

class EvenPosition {
    public static void main(String[] args) {

        //Initialize array
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println("Elements of given array present on even position: ");
        //Loop through the array by incrementing value of i by 2
        //Here, i will start from 1 as first even positioned element is present at position 1.
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}

class OddPosition {
    public static void main(String[] args) {
        //Initialize array
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Elements of given array present on odd position: ");
        //Loop through the array by incrementing value of i by 2
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}

class DuplicateElement {
    public static void main(String[] args) {

        //Initialize array
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}

class SortAsc {
    public static void main(String[] args) {

        //Initialize array
        int[] arr = new int[]{5, 2, 8, 7, 1};
        int temp = 0;

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class SecondLargestInArrayExample {
    public static int getSecondLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 2];
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 5, 6, 3, 2};
        int b[] = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Second Largest: " + getSecondLargest(a, 6));
        System.out.println("Second Largest: " + getSecondLargest(b, 7));
    }
}

