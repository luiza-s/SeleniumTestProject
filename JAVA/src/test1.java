
/**
 * Created by Administrator on 11/6/2017.
 */
public class test1 {

//    public static int square(int x) { // square(-6) -> 36
//        return x * x;
//    }
//
//    public static void printAsterics(int n) {
//        for(int i = 1; i <= n; ++i) {
//            for(int j = 1; j <= i; ++j) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void printAsterics2(int n) {
//        for(int i = 1; i <= n; ++i) {
//            for(int j = n; j >= i; --j) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//
//    public static int quarter(int x, int y) {
//        if(x > 0) {
//            if( y > 0 ) {
//                return 1;
//            }
//            if( y < 0 ) {
//                return 4;
//            }
//
//            return -1;
//
//        }
//
//        if(x < 0) {
//            if(y > 0) {
//                return 2;
//            }
//            if( y < 0 ) {
//                return 3;
//            }
//
//            return -1;
//
//        }
//        return -1;
//    }
//
//    public static int calc(int a, int b, int op) {
//        switch(op) {
//            case 1:
//                return a - b;
//            case 2:
//                return a * b;
//            case 3:
//                return a / b;
//            default:
//                throw new IllegalArgumentException( "operation must be 1, 2 or 3");
//        }
//    }
//
//    public static double circle2Area(double r1, double r2) {
//        if(r1 <= 0 || r2 <= 0 || r1 <= r2) {
//            throw new IllegalArgumentException( "arguments must be: r1 > 0 & r2 > 0 & r1 > r2");
//        }
//
//        double s1 = Math.PI * r1 * r1;
//        double s2 = Math.PI * r2 * r2;
//
//        double res = s1 - s2;
//        return res;
//    }

    public static boolean isPrime(int n) {
        if(n <= 1) {
            throw new IllegalArgumentException("argument must be: n > 1");
        }
        // 1, 2, 3, | 6, 9, 18
        for(int i = 2; i * i <= n; ++i) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrimeNumbers(int n) {
        int counter = 0;
        for(int i = 2; i <= n; ++i) {
            if(isPrime(i)) {
                ++counter;
                if(counter % 20 == 0) {
                    System.out.println(i);
                    counter = 0;
                } else {
                    System.out.print(i + "\t\t");
                }

            }
        }
    }

    /*
    *
    *           |
    *          _ _
    *           |
    * */

    // 4

    // *
    // *    *
    // *    *   *
    // *    *   *   *
    // *    *   *   *   *

    // 5
    // *    *   *   *   *
    // *    *   *   *
    // *    *   *
    // *    *
    // *
    public static void main(String[] args) {
//
//
//        System.out.println(calc(8,3,1));
//        System.out.println(calc(8,3,2));
//        System.out.println(calc(8,3,3));
//        System.out.println(calc(8,3,1));


        System.out.println(isPrime(100));

        printPrimeNumbers(100);
//       printAsterics(10);
//        printAsterics2(10);


    }
}

