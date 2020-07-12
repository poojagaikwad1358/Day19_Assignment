public class employeeWageComputation {

     public static void main(String[] args) {
	//UseCase1- Employee Present or not
        System.out.println("Welcome to Employee Wage Computation Problem..");

	int IsFullTime=1;
	double empCheck = Math.floor(Math.random() * 10)%2;
	if ( empCheck == IsFullTime)
		System.out.println("Employee is Present.");
	else
	    	System.out.println("Employee is Absent.");
	}
}
