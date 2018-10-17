public class HomeworkPart3If {

    static void Homework1() {
         /*If6°. Даны два числа. Вывести большее из них.*/
        int a = 15;
        int b = 15;

        if (a > b) {
            System.out.println("Max is: " + a);
        } else if (b > a) {
            System.out.println("Max is: " + b);
        } else {
            System.out.println("a and b are equal");
        }
    }

    static void Homework2() {
         /*If7. Даны два числа. Вывести порядковый номер меньшего из них.*/
        int a = 150;
        int b = 100;
        int c = 0;

        if (a > b) {
            c = c + 2;
            System.out.println(c);
        } else if (a < b) {
            c = c + 1;
            System.out.println(c);
        } else {
            System.out.println("a and b are equal");
        }
    }

    static void Homework3() {
         /*Даны два числа. Вывести вначале большее, а затем меньшее из них.*/
        int a = 50;
        int b = 10;

        if (a > b) {
            System.out.println(a + " " + b);
        } else if (a < b) {
            System.out.println(b + " " + a);
        } else {
            System.out.println("a and b are equal");
        }
    }

    static void Homework4() {
         /*Даны две переменные вещественного типа: A, B. Перераспределить значе-
ния данных переменных так, чтобы в A оказалось меньшее из значений,
а в B — большее. Вывести новые значения переменных A и B.*/
        double a = 500;
        double b = 100;
        double c = 0;

        if (a < b) {
            c = a;
            a = b;
            b = c;
            System.out.println("new a=" + a + " " + "new b=" + b);
        } else if (a > b) {
            c = b;
            b = a;
            a = c;
            System.out.println("new a=" + a + " " + "new b=" + b);
        } else {
            System.out.println("havasar en");
        }
    }

    static void Homework5() {
         /*Даны две переменные целого типа: A и B. Если их значения не равны, то
присвоить каждой переменной сумму этих значений, а если равны, то при-
своить переменным нулевые значения. Вывести новые значения перемен-
ных A и B.*/
        int a = 20;
        int b = 20;
        int c = 0;

        if (a != b) {
            c = a;
            a = a + b;
            b = c + b;
            System.out.println("new a=" + a + " " + "new b=" + b);
        } else if (a == b) {
            c = b;
            b = 0;
            a = 0;
            System.out.println("new a=" + a + " " + "new b=" + b);
        }
    }

    static void Homework6() {
         /*If11 Даны две переменные целого типа: A и B. Если их значения не равны, то
присвоить каждой переменной большее из этих значений, а если равны, то
присвоить переменным нулевые значения. Вывести новые значения пере-
менных A и B.*/
        int a = 200;
        int b = 200;

        if (a != b) {
            if (a > b) {
                b = a;
                System.out.println("new a=" + a + " " + "new b=" + b);
            } else if (a < b) {
                a = b;
                System.out.println("new a=" + a + " " + "new b=" + b);
            }
        } else if (a == b) {
            b = 0;
            a = 0;
            System.out.println("new a=" + a + " " + "new b=" + b);
        }
    }

    static void Homework7() {
         /*If12 - Даны три числа. Найти наименьшее из них.*/
        int a = 200;
        int b = 200;
        int c = 200;

        if (a < b && a < c) {
            System.out.println("Min is:" + a);
        } else if (b < a && b < c) {
            System.out.println("Min is:" + b);
        } else if (c < a && c < b) {
            System.out.println("Min is:" + c);
        }
    }


    static void Homework8() {
         /*If13. Даны три числа. Найти среднее из них (то есть число, расположенное ме-
жду наименьшим и наибольшим)*/
        int a = 8;
        int b = 9;
        int c = 8;

        if (a < b && b < c) {
            System.out.println(b);
        } else if (b < a && a < c) {
            System.out.println(a);
        } else if (a < c && c < b) {
            System.out.println(c);
        } else {
            System.out.println("2 or 3 numbers are equal");
        }
    }

    static void Homework9() {
         /*If14. Даны три числа. Вывести вначале наименьшее, а затем наибольшее из дан-
ных чисел.*/
        int a = 4;
        int b = 88;
        int c = 5;

        if (a > b) {
            if (a > c) {
                System.out.println("Max is: " + a);
            } else if (a < c) {
                System.out.println("Max is: " + c);
            } else {
                System.out.println("a is equal c");
            }
        } else if (b > c) {
            System.out.println("Max is: " + b);
        } else if (b < c) {
            System.out.println("Max is: " + c);
        } else {
            System.out.println("b is equal c");
        }
    }


    static void Homework10() {
         /*If15. Даны три числа. Найти сумму двух наибольших из них.*/
        int a = 15000;
        int b = 8000;
        int c = 9000;

        if (a < b && b < c) {
            System.out.println(b+c);}
        else if((a > b && b < c)){
            System.out.println(c + a);
        }

         if (a < c && c < b) {
            System.out.println(c + b);
        }
//         else if((a > c && c < b)){
//             System.out.println(b+a);
//         }

        if (b < c && c < a) {
            System.out.println(c+a);
        }
        else if (b > c && c < a) {
            System.out.println(a+b);
        }


    }


    public static void main(String[] args) {


        //Homework1();
        //Homework2();
        //Homework3();
        //Homework4();
        //Homework5();
        //Homework6();
       //Homework7();
        //Homework8();
        //Homework9();
        Homework10();

    }
}
