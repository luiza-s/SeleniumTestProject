public class HomeworkFor {
    static void Homework1(){
        /*For1. Даны целые числа K и N (N > 0). Вывести N раз число K.*/

        int n=5;
        int k=7;
        for(int i=0; i<=k; i=i+1){
            System.out.println(n);
        }
    }

    static void Homework2(){
        /*For2. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все
целые числа, расположенные между A и B (включая сами числа A и B),
а также количество N этих чисел.*/

        int a=5;
        int b=20;
        int count=0;

        for(int i=a; i<=b; i=i+1){
            System.out.println(i);
            count=count+1;
        }
        System.out.println("count = "+count);
    }


    static void Homework3(){
        /*For3. Даны два целых числа A и B (A < B). Вывести в порядке убывания все це-
лые числа, расположенные между A и B (не включая числа A и B), а также
количество N этих чисел.*/

        int a=5;
        int b=20;
        int count=0;

        for(int i=b; i>=a; i=i-1){
            System.out.println(i);
            count=count+1;
        }
        System.out.println("count = "+count);
    }

    static void Homework4(){
        /*For4. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1,
2, …, 10 кг конфет.*/

        double a=55.5; // 1kg-i giny

        for(int i=1; i<=10; i=i+1){
            System.out.println(i*a);
        }

    }

    static void Homework5(){
        /*For5°. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1,
0.2, …, 1 кг конфет.*/

        double a=55.5; // 1kg-i giny

        for(double i=0.1; i<=1; i=i+0.1){
            System.out.println(i*a);
        }
    }

    static void Homework6(){
        /*For6. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
1.4, …, 2 кг конфет.*/

        double a=2; // 1kg-i giny

        for(double i=1.2; i<=2; i=i+0.2){
            //System.out.println(i);
            System.out.println(i*a);
        }
    }



    public static void main(String[] args) {
        //Homework1();
       //Homework2();
        //Homework3();
        //Homework4();
        //Homework5();
        //Homework6();

    }
}
