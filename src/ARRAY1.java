public class ARRAY1 {
    public static void main(String[] args) {
        //declare and initialize the array
        int[] arr = {50, 60, 55, 67, 70};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
class star {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {


                System.out.print("*");
            }
            System.out.println();
        }
    }


}
class star1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 45; j++) {


                System.out.print("*");
            }
            System.out.println();
        }
    }


}

class star3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {


                System.out.print("*");
            }
            System.out.println();
        }
    }


}
class star4{
    public static void main(String[] args) {
        int n;
        n = 5;
        for (int row = 1; row < n; row++) {
            for (int cal = 1; cal < n - row; cal++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
class star5{
        public static void main(String[] args) {
            int n=10;

            for (int row = 0; row < 2 * n; row++) {
                int totalcalsinrow= row>2 ? n - row : row;
                for (int cal = 0; cal < totalcalsinrow; cal++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
    }

