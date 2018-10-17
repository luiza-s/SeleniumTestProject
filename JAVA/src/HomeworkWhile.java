public class HomeworkWhile {

    static void Homework1(){
        /*While1°. Даны положительные числа A и B (A > B). На отрезке длины A разме-
щено максимально возможное количество отрезков длины B (без наложе-
ний). Не используя операции умножения и деления, найти длину незанятой
части отрезка A.*/

        int a=10;
        int b=3;

        while(a>b){
            a=a-b;
        }
        System.out.println(a);
    }

    static void Homework2(){
        /*While2. Даны положительные числа A и B (A > B). На отрезке длины A разме-
щено максимально возможное количество отрезков длины B (без наложе-ний).
Не используя операции умножения и деления, найти количество от-резков B, размещенных на отрезке A.*/

        int a=10;
        int b=3;
        int count=0;

        while(a>b){
            a=a-b;
            count=count+1;
        }
        System.out.println(count);
    }

    static void Homework3(){
        /*While3. Даны целые положительные числа N и K. Используя только операции
сложения и вычитания, найти частное от деления нацело N на K, а также
остаток от этого деления.*/

        double n=10.8;
        double k=5;
        int d=0;

        while(n>k){
            n=n-k;
            d=d+1;
            if (n<=0){
                break;
            }
                    }
        System.out.println("остаток от этого деления: "+ n);
        System.out.println("частное от деления нацело N на K: "+d);
    }


    static void Homework4() {
        /*While4°. Дано целое число N (> 0). Если оно является степенью числа 3, то вы-
вести True, если не является — вывести False.*/

        int n = 29;
        while (n % 3 == 0) {
            n = n / 3;
        }
        if (n == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    static void Homework5() {
        /*While5. Дано целое число N (> 0), являющееся некоторой степенью числа 2:
N = 2K. Найти целое число K — показатель этой степени.*/

        int n = 32;
        int k=0;
        while (n % 2 == 0) {
            n = n / 2;
            k=k+1;
        }
        if (n == 1) {
            System.out.println(k);
        } else {
            System.out.println("trvac tivy 2-i astichan che");
        }
    }


    static void Homework6() {
        /*Дано целое число N (> 0). Найти двойной факториал N:
N!! = N·(N–2)·(N–4)·…
(последний сомножитель равен 2, если N — четное, и 1, если N — нечет-
ное). Чтобы избежать целочисленного переполнения, вычислять это произ-
ведение с помощью вещественной переменной и вывести его как вещест-
венное число.*/

        int n = 7;
        double factorial=1;

        while (n>=2) {
            factorial=factorial*n;
            n=n-2;
              if(n<0){
                    break;
                     }
            }
        System.out.println(factorial);
        }


    static void Homework7() {
        /*While7°. Дано целое число N (> 0). Найти наименьшее целое положительное
число K, квадрат которого превосходит N: K2 > N. Функцию извлечения
квадратного корня не использовать.*/

        int n = 7;
        double factorial=1;

        while (n>=2) {
            factorial=factorial*n;
            n=n-2;
            if(n<0){
                break;
            }
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        //Homework1();
        //Homework2();
        Homework3();
       //Homework4();
       //Homework5();
        //Homework6();

    }
}
