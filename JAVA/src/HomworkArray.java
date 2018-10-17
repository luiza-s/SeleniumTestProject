import java.util.ArrayList;

public class HomworkArray {


    static void Homework1() {
        /*Series1°. Даны десять вещественных чисел. Найти их сумму*/

        final int n = 10;
        double[] arr = {1, 2, 8.88, 1.01, 7, 10, 2, 7.7, 6, 5.5};
        double s = 0;

        for (int i = 0; i < arr.length; ++i) {
            s = s + arr[i];
        }
        System.out.println(s);
    }

    static void Homework2() {
        /*Series2. Даны десять вещественных чисел. Найти их произведение.*/

        final int n = 10;
        double[] arr = {1, 2, 8.88, 1.01, 7, 10, 2, 7.7, 6, 5.5};
        double m = 1;

        for (int i = 0; i < arr.length; ++i) {
            m = m * arr[i];
        }
        System.out.println(m);
    }


    static void Homework3() {
        /*Series3. Даны десять вещественных чисел. Найти их среднее арифметическое.*/

        final int n = 10;
        double[] arr = {1, 2, 8.88, 1.01, 7, 10, 2, 7.7, 6, 5.5};
        double s = 0;

        for (int i = 0; i < arr.length; ++i) {
            s = s + arr[i];
        }
        System.out.println(s / arr.length + s % arr.length);
    }

    static void Homework4() {
        /*Series4. Дано целое число N и набор из N вещественных чисел. Вывести сумму
и произведение чисел из данного набора.*/

        final int n = 10;
        double[] arr = {1, 2, 8.88, 1.01, 7, 10, 2, 7.7, 6, 5.5};
        double s = 0;
        double m = 1;

        for (int i = 0; i < n; ++i) {
            s = s + arr[i];
            m = m * arr[i];
        }
        System.out.println(s);
        System.out.println(m);
    }

    static void Homework5() {
        /*Series5. Дано целое число N и набор из N положительных вещественных чисел.
Вывести в том же порядке целые части всех чисел из данного набора (как
вещественные числа с нулевой дробной частью), а также сумму всех целых
частей.*/

        final int n = 10;
        double[] arr = {1, 2, 8.88, 1.01, 7, 10, 2, 7.7, 6, 5.5};
        double a = 0;
        int S = 0;

        for (int i = 0; i < n; ++i) {
            a = arr[i];
            S = S + (int) (a);
            System.out.print((int) (a) + " ");
        }
        System.out.println(" ");
        System.out.print(S);
    }

    static void Homework6() {
        /*Series6. Дано целое число N и набор из N положительных вещественных чисел.
Вывести в том же порядке дробные части всех чисел из данного набора
(как вещественные числа с нулевой целой частью), а также произведение
всех дробных частей.*/

        final int n = 10;
        double[] arr = {1, 2, 8.88, 1.01, 7, 10, 2, 7.7, 6, 5.5};
        double a = 0;
        double m = 1;

        for (int i = 0; i < n; ++i) {
            a = arr[i];
            m = m * (a - (int) (a));
            System.out.print(a - (int) (a) + " ");
        }
        System.out.println(" ");
        System.out.print(m);
    }

    static void Homework7() {
        /*Series7. Дано целое число N и набор из N вещественных чисел. Вывести в том
же порядке округленные значения всех чисел из данного набора (как целые
числа), а также сумму всех округленных значений.*/

        final int n = 10;
        double[] arr = {1, 2, 8.88, 1.01, 7, 10, 2, 7.7, 6, 5.5};
        double a = 0;
        int S = 0;

        for (int i = 0; i < n; ++i) {
            a = arr[i];
            if ((a - (int) (a)) >= 0.5) {
                int a1 = (int) (a + 0.5);
                S = S + a1;
                System.out.println(a1 + " ");
            } else {
                int a1 = (int) (a);
                S = S + a1;
                System.out.println(a1 + " ");
            }
        }
        System.out.println(S + " ");
    }

    static void Homework8() {
        /*Series8. Дано целое число N и набор из N целых чисел. Вывести в том же по-
рядке все четные числа из данного набора и количество K таких чисел.*/

        final int n = 10;
        int[] arr = {1, 2, 800, 1, 7, 10, 2, 7, 6, 55};
        double a = 0;
        int k = 0;

        for (int i = 0; i < n; ++i) {
            a = arr[i];
            if (a % 2 == 0) {
                k = k + 1;
                System.out.println(a + " ");
            }
        }
        System.out.println(k + " ");
    }

    static void Homework9() {
        /*Series9. Дано целое число N и набор из N целых чисел. Вывести в том же по-
рядке номера всех нечетных чисел из данного набора и количество K таких
чисел.*/

        final int n = 10;
        int[] arr = {1, 2, 800, 1, 7, 10, 2, 7, 6, 55};
        double a = 0;
        int k = 0;

        for (int i = 0; i < n; ++i) {
            a = arr[i];
            if (a % 2 != 0) {
                k = k + 1;
                System.out.println(a + " ");
            }
        }
        System.out.println(k + " ");
    }

    static void Homework10() {
        /*Series10. Дано целое число N и набор из N целых чисел. Если в наборе имеют-
ся положительные числа, то вывести True; в противном случае вывести
False.*/

        final int n = 10;
        int[] arr = {-1, -2, -800, -1, -7, -10, -2, -7, -6, -55};
        double a = 0;
        int k = 0;

        for (int i = 0; i < n; ++i) {
            a = arr[i];
            if (a > 0) {
                k = k + 1;
            }
        }
        if (k > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static void Homework11() {
        /*Series11. Даны целые числа K, N и набор из N целых чисел. Если в наборе
имеются числа, меньшие K, то вывести True; в противном случае вывести
False..*/

        final int n = 10;
        int[] arr = {155, 52, 800, 51, 75, 10, 52, 57, 76, 55};
        int K = 10;
        int k = 0;

        for (int i = 0; i < n; ++i) {
            if (arr[i] < K) {
                k = k + 1;
            }
        }
        if (k > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static void Homework12() {
        /*Series12. Дан набор ненулевых целых чисел; признак его завершения — чис-
ло 0. Вывести количество чисел в наборе.*/

        final int n = 10;
        int[] arr = {155, 80, 0, 51, 75, 10, 52, 57, 76, 5};
        int K = 10;
        int k = 0;

        for (int i = 0; i < n; ++i) {
            if (arr[i] != 0) {
                k = k + 1;
            } else {
                break;
            }
        }
        System.out.println("количество чисел в наборе: " + k);

    }

    static void Homework13() {
        /*Series13. Дан набор ненулевых целых чисел; признак его завершения — чис-
ло 0. Вывести сумму всех положительных четных чисел из данного набора.
Если требуемые числа в наборе отсутствуют, то вывести 0.*/

        final int n = 10;
        int[] arr = {7, 2, 2, 2, 2, 2, 2, 2, 2, 0};
        int k = 0;
        int S = 0;

        for (int j = 0; j < n; ++j) {
            if (arr[j] == 0) {
                break;
            } else if (arr[j] > 0 && arr[j] % 2 == 0) {
                S = S + arr[j];
                k = k + 1;
            }
        }
        System.out.println("сумма всех положительных четных чисел " + S);

        if (k == 0) {
            System.out.println("требуемые числа в наборе отсутствуют ");
        }
    }


    static void Homework14() {
        /*Series14. Дано целое число K и набор ненулевых целых чисел; признак его за-
вершения — число 0. Вывести количество чисел в наборе, меньших K.*/

        final int n = 10;
        int[] arr = {7, 5, 88, 5, 11, 9, 2, 88, 2, 0};
        int k = 5;
        int K = 0;

        for (int j = 0; j < n; ++j) {
            if (arr[j] < k) {
                K = K + 1;
            }
        }
        System.out.println("количество чисел в наборе, меньших K " + K);

    }

    static void Homework15() {
        /*Series15°. Дано целое число K и набор ненулевых целых чисел; признак его за-
вершения — число 0. Вывести номер первого числа в наборе, большего K.
Если таких чисел нет, то вывести 0.*/

        final int n = 10;
        int[] arr = {1, 5, 1, 1, 1, 1, 2, 1, 2, 0};
        int k = 5;
        int K = 0;

        for (int j = 0; j < n; ++j) {
            if (arr[j] > k) {
                K = K + 1;
                System.out.println("номер первого числа в наборе, большего K. " + j);
                break;
            }
        }
        if (K == 0) {
            System.out.println("таких чисел нет " + 0);
        }

    }

    static void Homework16() {
        /*Series16°. Дано целое число K и набор ненулевых целых чисел; признак его за-
вершения — число 0. Вывести номер последнего числа в наборе, больше-
го K. Если таких чисел нет, то вывести 0.*/

        final int n = 10;
        int m = 0;
        int[] arr = {15, 1, 88, 2, 15, 34, 24, 15, 25, 15};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int k = 5;
        int K = 0;
        int J = 0;

        for (int j = 0; j < n; ++j) {
            if (arr[j] > k) {
                K = K + 1;
                J = j;
                list.add(arr[j]);
            }
        }
            if(K ==0){
        System.out.println("таких чисел нет " + 0);
             }
    else if(K !=0)
    {
        System.out.println("номер последнего числа в наборе, большего K. " + J);
        System.out.println(list);
    }
}


    static void Homework18() {
        /*Series18. Дано целое число N и набор из N целых чисел, упорядоченный по
возрастанию. Данный набор может содержать одинаковые элементы. Вы-
вести в том же порядке все различные элементы данного набора.*/

        int[] a = {3, 4, 5, 6, 9};


        for (int i = 0; i <a.length-1; i++) {
                if ( a[i]!=a[i+1]) {
                    System.out.println(a[i]);}
                }
        if(a[a.length-1]!=a[a.length-2]){
            System.out.println(a[a.length-1]);
        }
            }


    static void Homework19() {
        /*Series18. Дано целое число N и набор из N целых чисел, упорядоченный по
возрастанию. Данный набор может содержать одинаковые элементы. Вы-
вести в том же порядке все различные элементы данного набора.*/

        int[] myArray = {10, 50, 1, -8, 99, 1888, 2, 99999};
        int max=0;

        for(int i=0; i<myArray.length; i++){
            if(max<=myArray[i]){
                max=myArray[i];
            }
        }
        System.out.println(max);
    }
    static void Homework20() {
        /*Series20. Дано целое число N (> 1) и набор из N целых чисел.
         Вывести те элементы в наборе, которые меньше своего правого соседа,
         и количество K таких элементов.*/
        int N=10;
        int[] myArray = {19,20,17,25,15,14,13,30,150,10};
        int K=0;

        for(int i=0; i<myArray.length-1; i++){
            if(myArray[i]<myArray[i+1]){
                K=K+1;
                System.out.println(myArray[i+1]);
            }
        }
        System.out.println(K);
    }

    static void Homework21() {
        /*Series21. Дано целое число N (> 1) и набор из N вещественных чисел.
        Проверить, образует ли данный набор возрастающую последовательность.
        Если образует, то вывести True, если нет — вывести False.*/
        int N=10;
        int[] myArray = {19,20,21,30,35,36,40,60,70,80};
        int K=0;

        for(int i=0; i<myArray.length-1; i++){
            if(myArray[i]<myArray[i+1]){
                K=K+1;
            }
        }
                if (K==9){
            System.out.println("True");}
            else{
                System.out.println("False");
            }
        }

    static void Homework22() {
        /*Series22. Дано целое число N (> 1) и набор из N вещественных чисел.
        Если данный набор образует убывающую последовательность, то вывести 0;
        в противном случае вывести номер первого числа, нарушающего закономерность.*/
        int N=10;
        int[] myArray = {19,15,14,11,10,9,9,4,3,0};
        int K=0;
        int M=0; // arajin elementy wric orinachaputjuny xaxtvum e

        for(int i=0; i<myArray.length-1; i++){
            if(myArray[i]>myArray[i+1]){
                K=K+1;
            }
            else if(myArray[i]<=myArray[i+1]){
                M=myArray[i];
                break;
            }
        }
        if (K==9){
            System.out.println("0");
        }
        else
        {
            System.out.println(M);
        }
    }

    static void Homework23() {
        /*Series23. Дано целое число N (> 2) и набор из N вещественных чисел.
         Набор называется пилообразным, если каждый его внутренний элемент либо больше,
         либо меньше обоих своих соседей (то есть является «зубцом»).
         Если данный набор является пилообразным, то вывести 0;
         в противном случае вывести номер первого элемента, не являющегося зубцом.*/
        int N = 10;
        int[] myArray = {1, 3, 14, 15, 19, 20, 22, 24, 888, 30};
        int K = 0;

        for (int i = 0; i < myArray.length - 2; i++) {
            if (myArray[i] < myArray[i + 1] && myArray[i + 1] < myArray[i + 2] || myArray[i] > myArray[i + 1] && myArray[i + 1] > myArray[i + 2]) {
                K = K + 1;
                if (myArray[myArray.length - 1] < myArray[myArray.length - 2] && myArray[myArray.length - 2] < myArray[myArray.length - 3] || myArray[myArray.length - 1] > myArray[myArray.length - 2] && myArray[myArray.length - 2] > myArray[myArray.length - 3]) {
                    K = K + 1;
                } else if (myArray[i] <= myArray[i + 1] && myArray[i + 1] <= myArray[i + 2]) {
                    System.out.println(myArray[i]);
                    break;
                } else if (myArray[i] < myArray[i + 1] && myArray[i + 1] <= myArray[i + 2]) {
                    System.out.println(myArray[i + 1]);
                    break;
                } else if (myArray[i] < myArray[i + 1] && myArray[i + 1] > myArray[i + 2]) {
                    System.out.println(myArray[i + 1]);
                    break;
                } else if (myArray[i] > myArray[i + 1] && myArray[i + 1] <= myArray[i + 2]) {
                    System.out.println(myArray[i + 1]);
                    break;
                }
            }
            if (K == 9) {
                System.out.println(88);
            }
        }
    }

    static void Homework24() {
        /*Nareki xndiry - kisel trvac array, skzbum tpel 2rd kesi elemntnery heto arajin kesiny 1 arrayum*/

        final int n = 10;
        int m = 0;
        int[] arr = {15, 1, 88, 2, 15, 34, 24, 15, 25, 15};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int L = arr.length;


        for (int j = L / 2; j < L; ++j) {
            list.add(arr[j]);
        }
        for (int j = 0; j < L / 2; ++j) {
            list.add(arr[j]);
        }
        System.out.println(list);
    }



    public static void main(String[] args) {

        //Homework1();
        //Homework2();
        //Homework3();
        //Homework4();
        //Homework5();
        //Homework6();
        // Homework7();
        //Homework8();
        //Homework9();
        //Homework10();
        //Homework11();
        //Homework12();
        //Homework13();
        //Homework14();
        //Homework15();
        //Homework16();
        //Homework18();
        //Homework19();
        //Homework20();
        //Homework21();
        //Homework22();
        Homework24();
        //Homework24;
    }
}
