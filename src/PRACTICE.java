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

class Stopwatch {
    public static void main(String[] args) {
        System.out.println("Stopwatch Program");
        System.out.println("Press Enter to start the stopwatch");
        new Scanner(System.in).nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("Stopwatch started. Press Enter to stop the stopwatch");
        new Scanner(System.in).nextLine();

        long endTime = System.currentTimeMillis();

        long elapsedMillis = endTime - startTime;
        double elapsedSeconds = elapsedMillis / 1000.0;

        System.out.println("Elapsed time: " + elapsedSeconds + " seconds");
    }
}

class elapsedtime {
    static void main(String[] args) {
        System.out.println("Stopwatch Program");
        System.out.println("Press Enter to start the stopwatch");
        new Scanner(System.in).nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("Press Enter to stop the stopwatch");
        new Scanner(System.in).nextLine();

        long endTime = System.currentTimeMillis();

        long elapsedMillis = endTime - startTime;
        long elapsedSeconds = elapsedMillis / 1000;

        System.out.println("Elapsed time: " + elapsedSeconds + " seconds");
    }
}

class flipss {
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

class main {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter no of term");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("additon" + sum);

    }
}

class reverse {
    public static void main(String[] args) {
        int n, r;
        System.out.println("enter any number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();

        while (n > 0) {
            r = n % 10;
            System.out.println(r);

            n = n / 10;

        }
    }
}

class sum {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("enter no of tern");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for (int i = 1; i <= n; i++) ;
        {
            sum = sum + 1;

        }
        System.out.println("addition " + sum);
    }
}

class leap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}

class string {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                int num = Integer.parseInt(args[i]);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument: " + args[i]);
                invalidCount++;
            }
        }
    }
}
class string1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        int year = input.nextInt();

        if (year >= 1582) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Invalid input. Year must be >=1582.");
        }
    }
}
