

public class Cases { //  [Case1 - Case5] 		( Page 21 )

    static void Homework20() //Case1: trvac e tveri 1-7 mijakajqy. amen tvi hamar tpel tiv-y ev iren hamapatasxan shabatva ory
    {
        int Day=10;
        switch(Day)
        {
            case 1:
                System.out.println("1-Monday");
                break;
            case 2:
                System.out.println("2-Tuesday");
                break;
            case 3:
                System.out.println("3-Wednesday");
                break;
            case 4:
                System.out.println("3-Thursday");
                break;
            case 5:
                System.out.println("3-Friday");
                break;
            case 6:
                System.out.println("4-Saturday");
                break;
            case 7:
                System.out.println("4-Sunday");
                break;
            default:
                System.out.println("No Week days found ");
        }
    }

    static void Homework21() //Case2:trvac e tveri 1-5 mijakajqy. amen tvi hamar tpel tiv-y ev iren gnahatakani anvanumy , hakarak depqum error
    {
        int X=1;
        switch(X)
        {
            case 1:
                System.out.println("1- плохо");
                break;
            case 2:
                System.out.println("2- неудовлетворительно");
                break;
            case 3:
                System.out.println("3-удовлетворительно");
                break;
            case 4:
                System.out.println("4-хорошо");
                break;
            case 5:
                System.out.println("5-отлично");
                break;


            default:
                System.out.println("ошибка ");
        }
    }


    static void Homework22() //Case3: trvac en 1-12 tvery, amen tvin hamapatasxanum e ir Amisy, tpel hamapatasxan exanaki anvanumy
    {
        int M=1;
        switch(M)
        {

            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("зима");
                break;
            case 3:
                System.out.println("зима");
                break;
            case 4:
                System.out.println("весна");
                break;
            case 5:
                System.out.println("весна");
                break;
            case 6:
                System.out.println("весна");
                break;
            case 7:
                System.out.println("лето");
                break;
            case 8:
                System.out.println("лето");
                break;
            case 9:
                System.out.println("лето");
                break;
            case 10:
                System.out.println("осень");
                break;
            case 11:
                System.out.println("осень");
                break;
            case 12:
                System.out.println("осень");
                break;

            default:
                System.out.println("ошибка ");
        }
    }


    static void Homework23() //Case4: trvac en 1-12 tvery, amen tvin hamapatasxanum e ir Amisy, tpel oreri qanaky amen amsva hamar
    {
        int M1=1;
        int days=30;
        switch(M1)
        {

            case 1:
                System.out.println(days+1);
                break;
            case 2:
                System.out.println(days-2);
                break;
            case 3:
                System.out.println(days+1);
                break;
            case 4:
                System.out.println(days);
                break;
            case 5:
                System.out.println(days+1);
                break;
            case 6:
                System.out.println(days);
                break;
            case 7:
                System.out.println(days+1);
                break;
            case 8:
                System.out.println(days);
                break;
            case 9:
                System.out.println(days+1);
                break;
            case 10:
                System.out.println(days);
                break;
            case 11:
                System.out.println(days+1);
                break;
            case 12:
                System.out.println(days);
                break;

            default:
                System.out.println("ошибка ");
        }
    }

    static void Homework24() //Case5: A eb b tveri het katarel hetevjal gorcoxutjunnery 1+, 2-, 3*, 4/, B!=0
    {
        int A=10;
        int B=25;
        int N=1;
        switch(N)
        {
            case 1:
                System.out.println(A+B);
                break;
            case 2:
                System.out.println(A-B);
                break;
            case 3:
                System.out.println(A*B);
                break;
            case 4:
                System.out.println(A/B);
                break;


            default:
                System.out.println("out of range ");
        }
    }

    static void Homework25()
//    Case6. Единицы длины пронумерованы следующим образом: 1 — дециметр,
//    2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр. Дан номер еди-
//    ницы длины (целое число в диапазоне 1–5) и длина отрезка в этих едини-
//    цах (вещественное число). Найти длину отрезка в метрах.
    {
       int Metics =10;
       double L=35;
       double lenght=0;

        switch(Metics) {
            case 1:
                lenght = L / 10 ;
                System.out.println(lenght);
                break;
            case 2:
                lenght = L * 1000;
                System.out.println(lenght);
                break;
            case 3:
                lenght = L;
                System.out.println(lenght);
                break;
            case 4:
                lenght = L/1000;
                System.out.println(lenght);
                break;
            case 5:
                lenght = L/100;
                System.out.println(lenght);
                break;

            default:
                System.out.println("out of range ");
        }
    }

    static void Homework26()
   /* Case8. Даны два целых числа: D (день) и M (месяц), определяющие правиль-
    ную дату невисокосного года// 365 or//. Вывести значения D и M для даты, предше-
    ствующей указанной.*/ {
        int D = 31;
        int M = 12;

        D = D - 1;
        if (D == 0) {
            M = M - 1;
            if (M == 0) {
                M = 12;
            }
            switch (M) {

                case 2:
                    D = 28;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    D = 30;
                    break;

                default:
                    D = 31;
                    break;
            }
            System.out.println("dd-mm:" + D + '-' + M);
        } else {
            System.out.println("dd-mm:" + D + '-' + M);
        }
    }


    static void Homework27()
   /* Case9°. Даны два целых числа: D (день) и M (месяц), определяющие правиль-
ную дату невисокосного года. Вывести значения D и M для даты, следую-
щей за указанной.*/ {
        int D = 30;
        int M = 4;

        D = D + 1;
        if (D == 32) {
            M = M + 1;
            if (M == 13) {
                M = 1;
            }
            switch (M) {

                case 2:
                    D = 28;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    D = 30;
                    break;

                default:
                    D = 31;
                    break;
            }


            System.out.println("dd-mm:" + D + '-' + M);
        } else {
            System.out.println("dd-mm:" + D + '-' + M);
        }
    }


    static void Homework28() {
        char c = 'W';
        int n1 = -1; // -1, 1, 2
        int n2 = 1;
        int p = (n1 + n2) % 4;
        switch (c) {
            case 'N':
                switch (p) {
                    case 0:
                        System.out.println('N');
                        break;
                    case 1:
                        System.out.println('W');
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 'S':
                switch (p) {
                    case 0:
                        System.out.println('N');
                        break;
                    case 1:
                        System.out.println('W');
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 'W':
                switch (p) {
                    case 0:
                        System.out.println('N');
                        break;
                    case 1:
                        System.out.println('W');
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            case 'E':
                switch (p) {
                    case 0:

                        System.out.println('N');
                        break;
                    case 1:
                        System.out.println('W');
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                break;
            default:
                System.out.println("No side");
                break;
        }
    }


    public static void main(String[] args) {

        //Homework20();
        // Homework21();
        // Homework22();
        // Homework23();
        // Homework24();
       //Homework25();
        //Homework26();
         //Homework27();
        Homework28();
    }
}


