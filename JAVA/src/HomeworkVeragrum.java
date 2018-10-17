public class HomeworkVeragrum {

    static void Homework1(){
        /*1.	Հայտարարել չորս հատ իրական տիպի a,b,c,d փոփոխականները։
         a փոփոխականի մեջ տեղափոխել b փոփոխականի արժեքը,
        b-ի մեջ, a-ի արժեքը, c-ի մեջ d-ի արժեքը, d-ի մեջ c-ի արժեքը։*/

        double a=10;
        double b=20;
        double c=30;
        double d=40;
        double x;


        x=a;
        a=b;
        b=x;
        x=c;
        c=d;
        d=x;
        System.out.println(a+", "+b+", "+c+", "+", "+d);
    }

    static void Homework2(){
        /*1.	2.	Հայտարարել չորս հատ իրական տիպի a,b,c,d փոփոխականները։
         a փոփոխականի մեջ տեղափոխել b փոփոխականի արժեքը, b-ի մեջ,
         a-ի արժեքը, c-ի մեջ d-ի արժեքը, d-ի մեջ a-ի արժեքը։*/

        double a=10;
        double b=20;
        double c=30;
        double d=40;
        double x;


        x=a;
        a=b;
        b=x;
        x=c;
        c=d;
        d=b;
        System.out.println(a+", "+b+", "+c+", "+", "+d);
    }

    static void Homework3(){
        /*3.	Հայտարարել չորս հատ իրական տիպի a,b,c,d փոփոխականները։
         a փոփոխականի մեջ տեղափոխել b փոփոխականի արժեքը,
          b-ի մեջ, a-ի արժեքը, c-ի մեջ d-ի արժեքը, d-ի մեջ b-ի արժեքը։*/

        double a=10;
        double b=20;
        double c=30;
        double d=40;
        double x;


        x=a;
        a=b;
        b=x;
        x=c;
        c=d;
        d=a;
        System.out.println(a+", "+b+", "+c+", "+", "+d);
    }

    static void Homework4(){
        /*4.	Հայտարարել չորս հատ իրական տիպի a,b,c,d փոփոխականները։
        a փոփոխականի մեջ տեղափոխել d փոփոխականի արժեքը,
         b-ի մեջ, c-ի արժեքը, c-ի մեջ b-ի արժեքը, d-ի մեջ a-ի արժեքը։*/

        double a=10;
        double b=20;
        double c=30;
        double d=40;
        double x;


        x=a;
        a=d;
        d=x;
        x=b;
        b=c;
        c=x;
        System.out.println(a+", "+b+", "+c+", "+", "+d);
    }

    static void Homework5(){
        /*5.	Հայտարարել վեց հատ իրական տիպի a,b,c,d,e,f փոփոխականները։
         a փոփոխականի մեջ տեղափոխել b փոփոխականի արժեքը, b-ի մեջ, a-ի արժեքը,
          c-ի մեջ d-ի արժեքը, d-ի մեջ c-ի արժեքը, e-ի մեջ f-ի արժեքը,f-ի մեջ e-ի արժեքը:։*/

        double a=10;
        double b=20;
        double c=30;
        double d=40;
        double e=50;
        double f=60;
        double x;


        x=a;
        a=b;
        b=x;
        x=c;
        c=d;
        d=x;
        x=e;
        e=f;
        f=x;
        System.out.println(a+", "+b+", "+c+", "+d+", " +e+", "+f);
    }

    static void Homework6(){
        /*6.	Հայտարարել վեց հատ իրական տիպի a,b,c,d,e,f փոփոխականները։
         a փոփոխականի մեջ տեղափոխել b փոփոխականի արժեքը, b-ի մեջ, c-ի արժեքը,
          c-ի մեջ d-ի արժեքը, d-ի մեջ e-ի արժեքը, e-ի մեջ f-ի արժեքը,f-ի մեջ a-ի արժեքը:*/

        double a=10;
        double b=20;
        double c=30;
        double d=40;
        double e=50;
        double f=60;
        double x1;
        double x2;


        x1=a;
        a=b;
        b=c;
        c=d;
        d=e;
        e=f;
        f=x1;

        System.out.println(a+", "+b+", "+c+", "+d+", " +e+", "+f);
    }

    public static void main(String[] args) {
        //Homework1();
        //Homework2();
        //Homework3();
        //Homework4();
        //Homework5();
        Homework6();
    }
}
