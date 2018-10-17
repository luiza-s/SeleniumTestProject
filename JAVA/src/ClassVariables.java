/**
 * Created by luiza.suryan on 9/13/2018.
 */
public class ClassVariables {
    final static int staticVar=100;
    int instanceVar=200;

    public static void main (String[] args){
        int localVar = 300;

        localVar = 301;

        System.out.println("value of Static variable is: "+staticVar);
        ClassVariables var= new ClassVariables();
        var.instanceVar = 201;
        System.out.println("value ov instance variable is: "+var.instanceVar);

        System.out.println("value ov local variable is: "+localVar);
        int staticVar=500;
        //var.staticVar = 501;
        System.out.println("value of Static variable is: "+var.staticVar);
    }
}
