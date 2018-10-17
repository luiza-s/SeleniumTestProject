public class Employee {
    int empId;
    String empName;

    public Employee(){

    }

    public Employee(int empId, String empName){
        this.empId=empId;
        this.empName=empName;
    }

    public Employee(Employee e){
        this.empId=e.empId;
        this.empName=e.empName;
    }
    @Override
public String toString(){
        String printString="Name: "+empName + " Id: "+empId;
        return printString;
}

    public static void main(String[] args) {
        Employee e1=new Employee(10, "Axasi");
        Employee e2=new Employee();

        e2.empId=e1.empId;
        e2.empName=e1.empName;

        System.out.println(e1.toString());
        System.out.println(e2.toString());

    }
}
