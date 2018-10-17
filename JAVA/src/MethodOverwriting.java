public class MethodOverwriting {

    public int sum(int a, int b){
      //  System.out.println("sum(int a, int b) invoked");
        return a+b;
    }

    public double sum(int a, double b, int c){
        //System.out.println("sum(int a, double b, int c) invoked");
        return a+b+c;
    }

    public static void main (String[] atgs){
        MethodOverwriting c1= new MethodOverwriting();
         System.out.println("Sum of two numbers: " + c1.sum(20,88));
        System.out.println("Sum of tree numbers: " + c1.sum(20,88.555,25));
    }
}
