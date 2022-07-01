package my.practice;

public class EmpWageMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");

        int randomCheck= (int) Math.round(Math.random());
        if ( 1 == randomCheck)
        {
            System.out.println("Employee is present");
        }

        else
        {
            System.out.println("Employee is absent");
        }

    }
}