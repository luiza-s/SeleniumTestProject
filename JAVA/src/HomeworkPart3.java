public class HomeworkPart3 {

//[Begin6 - Begin15]

    static void Homework1() //Begin6
/*Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его
    объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).*/
    {
     double a=2;
     double b=3;
     double c=5;
     double V;
     double S;

        System.out.println(V=a*b*c);
        System.out.println(S = 2*(a*b + b*c + a*c));
    }


    static void Homework2(){  //Begin15.
                /* Дана площадь S круга. Найти его диаметр D и длину L окружности,
ограничивающей этот круг, учитывая, что L = π·D, S = π·D2/4. В качестве
значения π использовать 3.14.*/

     double S=5.5;
     final double Pi =3.14;
     double L;
     double D;

        System.out.println(D=Math.sqrt(4*S/Pi));
        System.out.println(L = Pi*D);
    }


    //[Integer6 - Integer15]
    static void Homework3(){  //Integer6
                /* Дано двузначное число. Вывести вначале его левую цифру (десятки),
а затем — его правую цифру (единицы). Для нахождения десятков исполь-
зовать операцию деления нацело, для нахождения единиц — операцию
взятия остатка от деления.*/

        int S=-71;

        System.out.println("1st number is: "+ S/10);
        System.out.println("2nd number is: " + (S-S/10*10));
    }


    static void Homework4(){  //Integer7
   /* Дано двузначное число. Найти сумму и произведение его цифр.*/

        int S=38;

        System.out.println(S/10 + (S-S/10*10) );
        System.out.println(S/10*(S-S/10*10));
    }


    static void Homework5(){  //Integer8
   /* Дано двузначное число. Вывести число, полученное при перестанов-
ке цифр исходного числа.*/

        int S=38;
        int a1=S/10;
        int a2=(S-S/10*10);

        System.out.println("reversed number is: " + (a2*10+a1));
    }

    static void Homework6(){  //Integer11
   /* Дано трехзначное число. Найти сумму и произведение его цифр.*/

        int S=103;
        int a1=S/100;
        int a2=S%100/10;
        int a3=S%10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a1*a2*a3);
        System.out.println(a1+a2+a3);
    }


    static void Homework7(){  //Integer12
   /* Дано трехзначное число. Вывести число, полученное при прочтении
исходного числа справа налево.*/

        int S=103;
        int a1=S/100;
        int a2=S%100/10;
        int a3=S%10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("reversed number is: " + (a3*100+a2*10+a1));
    }

    static void Homework8(){  //Integer13
   /* Дано трехзначное число. В нем зачеркнули первую слева цифру и
приписали ее справа. Вывести полученное число.*/

        int S=103;
        int a1=S/100;
        int a2=S%100/10;
        int a3=S%10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("number is: " + (a2*100+a3*10+a1));
    }


    static void Homework9() {  //Integer14
   /* Дано трехзначное число. В нем зачеркнули первую слева цифру и
приписали ее справа. Вывести полученное число.*/

        int S = 103;
        int a1 = S / 100;
        int a2 = S % 100 / 10;
        int a3 = S % 10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("number is: " + (a3 * 100 + a1 * 10 + a2));
    }

    static void Homework10() {  //Integer15
   /* Дано трехзначное число. Вывести число, полученное при переста-
новке цифр сотен и десятков исходного числа (например, 123 перейдет
в 213).*/

        int S = 183;
        int a1 = S / 100;
        int a2 = S % 100 / 10;
        int a3 = S % 10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("number is: " + (a2 * 100 + a1 * 10 + a3));
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
