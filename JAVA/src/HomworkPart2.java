import java.util.Date;

public class HomworkPart2 {

//[Begin1 - Begin5]		( Page 10 )   -From abr-1.pdf

    static void Homework1() //hasvel qarakusu paragicy
    {
        double a = 25;
        double P = 4 * a;
        System.out.println(P);
    }

    static void Homework2() //hasvel qarakusu makeresy
    {
        double a = 25;
        double S = a * a;
        System.out.println(S);
    }

    static void Homework3() //hasvel uxxankyan makeresy ev Paragicy
    {
        double a = 10;
        double b = 20;
        double S = a * b;
        double P = 2 * (a + b);
        System.out.println(S);
        System.out.println(P);
    }

    static void Homework4() //hasvel shrjanagci erkarutjuny
    {
        int d = 15;
        final double pi = 3.14;
        double L = pi * d;

        System.out.println(L);
    }

    static void Homework5() //hasvel shrjanagci erkarutjuny
    {
        double a = 2;
        double V;
        double S;

        System.out.println("V=" + Math.pow(a, 3));
        System.out.println("S=" + 6 * Math.pow(a, 2));
    }

    //[Integer1 - Integer5]	( Page 14 )

    static void Homework6() //CM-ov trvac hatvaci erkarutjan mej gtnel qani amboxj metreri qanaky
    {
        int L = 555;

        System.out.println("Amboxj mertneri qanaky = " + 555 / 100);

    }

    static void Homework7() //KG-ov trvac zangvaci mej gtnel amboxj tonnaneri qanaky
    {
        int M = 2978;

        System.out.println("Amboxj tonnaneri qanaky = " + 2978 / 1000);

    }

    static void Homework8() //Byte-ov trvac file-i hamar gtnel nra size-y amboxj KB-erov
    {
        int Size = 3277;

        System.out.println("Amboxj KB-eri qanaky = " + Size / 1024);

    }

    static void Homework9() //A, B hatvacner en tvac. Gtnel B-n qani angam e texavorvum A-i mej ete A>B
    {
        int A = 50;
        int B = 12;

        System.out.println("B-n A- mej texavorvum e  = " + A / B + " angam");

    }


    static void Homework10() //A, B hatvacner en tvac. Gtnel A hatvaci mnacordajin masy wry chi zbaxecnum B-n, A>B depqum
    {
        int A1 = 50;
        int B1 = 12;

        System.out.println("A havaci mnacordajin masy kazmum e  = " + (A1 - A1 / B1 * B1));
    }

//[Boolean1 - Boolean5]	( Page 16 )

    static void Homework11() //stugel travac amboxj tivy drakan e artahajtutjan chisht linely
    {
        int A2 = 90;

        if (A2 > 0) {

            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static void Homework12() //stugel travac amboxj tivy kent e artahajtutjan chisht linely
    {
        int A3 = 90;

        if (A3 % 2 != 0) {

            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static void Homework13() //stugel travac amboxj tivy zujg e artahajtutjan chisht linely
    {
        int A4 = 0;

        System.out.println(A4 % 2);

        if (A4 % 2 < 0 || A4 % 2 > 0) {

            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    static void Homework14() //trvac A ev B amboxj tveri hyamar stugel  A>2 ev B<=3 artahajtutjan chisht linely
    {
        int A5 = 1;
        int B5 = 1;

        if (A5 > 2 && B5 <= 3) {

            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static void Homework15() //trvac A ev B amboxj tveri hyamar stugel  A>=0 kam B<-2 artahajtutjan chisht linely
    {
        int A6 = -55;
        int B6 = 2;

        if (A6 >= 0 || B6 < -2) {

            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    //[If1 - If5]				( Page 19 )

    static void Homework16() //ete trvac tivy drakan e avelacnel 1, hakarak depqum toxnel nujny. Artacel stacvac tivy
    {
        int A7 = 58;


        if (A7 > 0) {

            System.out.println(++A7);
        } else {
            System.out.println(A7);
        }
    }

    static void Homework17() //ete trvac tivy drakan e avelacnel 1, hakarak depqum hanel 2. Artacel stacvac tivy
    {
        int A8 = -1;


        if (A8 > 0) {

            System.out.println(A8 + 1);
        } else {
            System.out.println(A8 - 2);
        }
    }

    static void Homework18() //ete trvac tivy drakan e avelacnel 1, hakarak depqum hanel 2, isk ete 0 e poxarinel 10-ov. Artacel stacvac tivy
    {
        int A8 = 0;


        if (A8 > 0) {

            System.out.println(A8 + 1);
        } else if (A8 < 0) {
            System.out.println(A8 - 2);
        } else {
            A8 = 10;
            System.out.println(A8);
        }
    }

    static void Homework19() // trvac 3 amboxj tveri mej hashvel drakan teveri qanaky
    {
        int a = -88;
        int b = 0;
        int c = -9;
        int count = 0;



        if (a > 0) {
            count = ++count;
            System.out.println(count);
        }
        if (b > 0) {
            count = ++count;
            System.out.println(count);
        }
         if (c > 0) {
             count = ++count;
            System.out.println(count);
        }
    }

    static void Homework25() // trvac 3 amboxj tveri mej hashvel drakan ev bacasakan teveri qanaky
    {
        int a = 88;
        int b = -99;
        int c = -9;
        int countP = 0;
        int countN = 0;


        if (a > 0) {
            countP = ++countP;
        }
        else if (a<0){
            countN = ++countN;
        }
        if (b > 0) {
            countP = ++countP;

        }
        else if (b<0){
            countN = ++countN;
        }
        if (c > 0) {
            countP = ++countP;

        }
        else if (c<0){
            countN = ++countN;
        }


            System.out.println("drakan tveri qanaky: " +countP);
            System.out.println("bacasakan tveri qanaky: " +countN);
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
        //Homework10();
        //Homework11();
        //Homework12();
        //Homework13();
        //Homework14();
        //Homework15();
        //Homework16();
        //Homework17();
        //Homework18();
        //Homework19();
        //Homework20();
        // Homework21();
        // Homework22();
        // Homework23();
        // Homework24();
       //Homework25();

    }
}
