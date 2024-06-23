public class IfElseIf {
    public static void main(String[] args) {
        int salary = 5000;
        if (salary<=2000){
            salary=salary+1000;
        } else if (salary<=3000) {
            salary = salary+2000;
        }
        else{
            salary=salary+3000;
        }
        System.out.println("The new Salary is " +salary);
    }
}
