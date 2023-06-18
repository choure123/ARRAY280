import java.util.*;


/*public class NEWPROBLEMONCOMPANY {
    public static void main(String[] args){
        int[][] 2dArray = new int[2][];
        2dArray[0] = new int[3];
        2dArray[1] = new int[4];
        int counter = 0;
        for(int row=0; row <2dArray.length; row++){
            for(int col=0; col < 2dArray[row].length; col++){
                2dArray[row][col] = counter++;
            }
        }
        for(int row=0; row < 2dArray.length; row++){
            System.out.println();
            for(int col=0; col < 2dArray[row].length; col++){
                System.out.print(2dnArray[row][col] + " ");
            }
        }
    }
}
/*

 /*   void segregatearray(int arr[], int size)
    {
        int left = 0, right = size - 1;
        while (left < right)
        {

            while (arr[left] == 0 && left < right)
                left++;
            while (arr[right] == 1 && left < right)
                right--;
            if (left < right)
            {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args)
    {
        Segregate seg = new Segregate();
        int arr[] = new int[]{0, 1, 0, 1, 1, 1};
        int i, arr_size = arr.length;
        seg.segregatearray(arr, arr_size);
        System.out.print("Array after segregation is ");
        for (i = 0; i < 6; i++)
            System.out.print(arr[i] + " ");
    }

 */

class InterviewBit {

    static String str = "[[]][]()";
    static int Count = 0;
    static int i = 0;
    static int j = -1;

    static int helperFunc(char compare) {
        Count--;
        char temp = str.charAt(j);
        if (j > -1 && temp == compare) {
            str = str.replace(str.charAt(i), '#');
            str = str.replace(str.charAt(j), '#');
            temp = str.charAt(j);
            while (j >= 0 && temp == '#') j--;
            i++;
            return 1;
        } else return 0;
    }

    static boolean isValid() {
        if (str.length() == 0) return true;

        else {
            int result;
            while (i < str.length()) {
                char temp = str.charAt(i);
                if (temp == '}') {
                    result = helperFunc('{');
                    if (result == 0) {
                        return false;
                    }
                } else if (temp == ')') {
                    result = helperFunc('(');
                    if (result == 0) {
                        return false;
                    }
                } else if (temp == ']') {
                    result = helperFunc('[');
                    if (result == 0) {
                        return false;
                    }
                } else {
                    j = i;
                    i++;
                    Count++;
                }
            }


            return true;
        }
    }

    public static void main(String args[]) {
        if (isValid()) System.out.println("No");
        else System.out.println("Yes");
    }
}

class output {
    public static void main(String[] args) {
        int[] val = new int[10];
        System.out.println(val[0]);
    }
}

class ArrayBasics {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Element at index " + i + ": " + anArray[i]);
        }
    }
}

class Arraystoreexap {
    public static void main(String[] args) {
        Object x[] = new Employee[3];
        x[0] = new String("javaguides");
    }
}

class Employee {

}

class Anonymous {
    public static void main(String[] args) {
        // anonymous array
        sum(new int[]{1, 2, 3});
    }

    public static void sum(int[] a) {
        int total = 0;

        // using for-each loop
        for (int i : a)
            total = total + i;

        System.out.println("The sum is:" + total);
    }
}

class duplicate {
    public static void main(String args[]) {

        String[] arr1 = {"abc", "acd", "acd", "abb", "bacc"};

        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {

                if (arr1[i].equals(arr1[j]) && i != j) {
                    System.out.println("Duplicate in Array is : " + arr1[j]);

                }
            }
        }
    }
}

class largestandsmallestnumber {
    public static void main(String args[]) {

        // Given Array
        int[] inputArr = {10, 43, 27, 98, 75, 59, 191};

        // Setting largest value
        int largest = inputArr[0];

        // Setting smallest value
        int smallest = inputArr[0];

        // Iterate through the Given Array
        for (int number : inputArr) {
            if (number > largest) {
                largest = number;
            } else if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("Largest and Smallest numbers are " + largest + " " + smallest);
    }
}

class sumvaules {
    public static void main(String args[]) {

        // Given Array
        int[] inputArr = {10, 43, 27, 98, 75, 59, 191};

        int sum = 0;

        //Iterating through the Array
        for (int num : inputArr) {
            sum = sum + num;
        }

        System.out.println(sum);

    }
}

class zerononzero {
    public static void main(String args[]) {

        // Given Array
        int[] inputArr = {0, 10, 43, 27, 0, 98, 75, 59, 191, 0};

        int counter = 0;

        //Iterating through the Array

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] != 0) {
                inputArr[counter] = inputArr[i];
                counter++;
            }
        }

        while (counter < inputArr.length) {
            inputArr[counter] = 0;
            counter++;
        }

        System.out.println(Arrays.toString(inputArr));

    }

}

class FirstRepeating {

    public static void main(String args[]) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 7, 4, 9};
        firstRepeating(arr);
    }

    public static void firstRepeating(int[] arr) {

        int minimum = -1;
        HashSet set = new HashSet();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) minimum = i;
            else set.add(arr[i]);
        }
        if (minimum != -1) {
            System.out.println("first repeating element is  : " + arr[minimum]);
        }
    }
}

class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}

class Factorial {
    public static void main(String[] args) {
        int n = 5; // Number to calculate factorial

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}

class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest number in the array: " + largest);
    }
}

class SumAverageArray {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3};

        int sum = 0;
        double average;

        for (int number : numbers) {
            sum += number;
        }

        average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3};

        System.out.println("Original array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int[] reversed = new int[numbers.length];

        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            reversed[i] = numbers[j];
        }

        System.out.println("\nReversed array: ");
        for (int number : reversed) {
            System.out.print(number + " ");
        }
    }
}
 class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }
}
 class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
class flips {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int count = 1;
        double random = 0.0;
        System.out.println("please enter the number:");
        Scanner n = new Scanner(System.in);
        int flips = n.nextInt();
        while (count <= flips) {
            random = Math.random();
            System.out.println(count + " random");
            if (random < 0.5) {
                heads++;
                System.out.println("heads");
            } else {
                tails++;
                System.out.println("tails");

            }
            count++;

        }
        System.out.println();
        System.out.println(" number of tails:" + tails);
        System.out.println(" number of heads:" + heads);
        double headpercent = (double) heads / flips * 100;
        double tailspercent = (double) tails / flips * 100;
        System.out.println("percentage of heads :" + headpercent);
        System.out.println("percentage of heads :" + tails);


    }

}
class reverseoderarrar1 {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.println("enter array elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();

        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");

        }
        System.out.println( "/n array reverse elements ");
        for(int i=a.length-1;i>=0;i--);
        {


        }

    }
}
class smallestelemento {
    public static void main(String[] args) {
        int[] arr={5,6,7,4,21,3,3,};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the smallest element in the array is: "+min);
    }
}