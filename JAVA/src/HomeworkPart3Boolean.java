public class HomeworkPart3Boolean {

    static void Homework1() {
        /*Boolean6. Даны три целых числа: A, B, C. Проверить истинность высказыва-
ния: «Справедливо двойное неравенство A < B < C».*/
        int a = 12;
        int b = 589;
        int c = 1000;

        if (a < b && b < c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static void Homework2() {
        /*Boolean7°. Даны три целых числа: A, B, C. Проверить истинность высказыва-
ния: «Число B находится между числами A и C».*/
        int a = 12;
        int b = 589;
        int c = 1000;

        if (a < b && b < c) {
            System.out.println("B is in (a;c)");
        } else {
            System.out.println("B isn't in (a;c)");
        }
    }


    static void Homework3() {
        /*Boolean8. Даны два целых числа: A, B. Проверить истинность высказывания:
«Каждое из чисел A и B нечетное».*/
        int a = 121;
        int b = 589;


        if (a%2!=0 && b%2!=0) {
            System.out.println("нечетное");
        } else {
            System.out.println("четное");
        }
    }

    static void Homework4() {
        /*Boolean9. Даны два целых числа: A, B. Проверить истинность высказывания:
«Хотя бы одно из чисел A и B нечетное».*/
        int a = 18;
        int b = 322;


        if (a%2!=0 || b%2!=0) {
            System.out.println("нечетное");
        } else {
            System.out.println("четное");
        }
    }

    static void Homework5() {
        /*Boolean10°. Даны два целых числа: A, B. Проверить истинность высказывания:
«Ровно одно из чисел A и B нечетное».*/
        int a = 10;
        int b = 322;


        if (a%2!=0 && b%2==0 || a%2==0 && b%2!=0 ) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    static void Homework6() {
        /*Boolean12. Даны три целых числа: A, B, C. Проверить истинность высказыва-
ния: «Каждое из чисел A, B, C положительное».*/
        int a = -10;
        int b = -322;
        int c = -58;


        if (a>0 && b>0 && c>0 ) {
            System.out.println("Каждое из чисел A, B, C положительное");
        }
        else {
            System.out.println("False");
        }
    }

    static void Homework7() {
        /*Boolean13. Даны три целых числа: A, B, C. Проверить истинность высказыва-
ния: «Хотя бы одно из чисел A, B, C положительное».*/
        int a = -10;
        int b = -322;
        int c = -58;


        if (a>0 || b>0 || c>0 ) {
            System.out.println("True: Хотя бы одно из чисел A, B, C положительное");
        }
        else {
            System.out.println("False");
        }
    }

    static void Homework8() {
        /*Boolean14. Даны три целых числа: A, B, C. Проверить истинность высказыва-
ния: «Ровно одно из чисел A, B, C положительное».*/
        int a = -10;
        int b = -322;
        int c = 58;


        if (a>0 && b<0 && c<0 || a<0 && b>0 && c<0 || a<0 && b<0 && c>0) {
            System.out.println("True:Ровно одно из чисел A, B, C положительное.");
        }
        else {
            System.out.println("False");
        }
    }

    static void Homework9() {
        /*Boolean15. Даны три целых числа: A, B, C. Проверить истинность высказыва-
ния: «Ровно два из чисел A, B, C являются положительными».*/
        int a = 10;
        int b = 322;
        int c = -58;
        int count = 0;
//        if (a>0 && b>0 && c<0 || a<0 && b>0 && c>0 || a>0 && b<0 && c>0) {
//            System.out.println("Ровно два из чисел A, B, C являются положительными");
//        }

        if (a>0) {
            count = count +1;
        }
        if(b>0){
            count = count +1;
        }
        if(c>0){
            count = count +1;
        }
        if(count==2){
            System.out.println("Ровно два из чисел A, B, C являются положительными");
        }
    }

    static void Homework10() {
        /*Boolean11. Даны два целых числа: A, B. Проверить истинность высказывания:
«Числа A и B имеют одинаковую четность».*/
        int a = -12;
        int b = 36;

        if (a%2==b%2 || a%2!=0 && b%2!=0) {
            System.out.println("True:Числа A и B имеют одинаковую четность");
        }
        else {
            System.out.println("False");
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
