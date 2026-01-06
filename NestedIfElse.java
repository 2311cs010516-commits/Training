public class NestedIfElse {
    public static void main(String[] args) {
        int age=30;
        int salary=25000;

        if(age>=21){
            if(salary>20000){
                System.out.println("Loan approved");
            }
            else{
                System.out.println("Loan cannot be approved");
            }
        }
        else{
            System.out.println("age and salary not upto requirment");
        }
    }
}
