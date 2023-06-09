import java.util.Scanner;

public class PRACTICE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("ADULT");

        } else {
            System.out.println("NOT ADULT");

        }
    }
}

class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");

        }
    }
}

class condition01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int x = sc.nextInt();
        System.out.println("enter second number");

        int y = sc.nextInt();
        if (x == y) {
            System.out.println("equal");

        } else {
            if (x > y) {
                System.out.println("first number is greater ");

            } else {
                System.out.println("first number is lesser");
            }
        }


    }
}

class button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter button number");
        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("hello");

        } else if (button == 2) {
            System.out.println("namaste");

        } else if (button == 3) {
            System.out.println("bongour");

        } else {
            System.out.println("ohh wrong button");
        }
    }
}

class switchstatmennt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter button number");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namste");
                break;
            case 3:
                System.out.println("bongour");
                break;
            default:
                System.out.println("uhh wrong button");

        }

    }
}