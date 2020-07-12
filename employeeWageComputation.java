public class employeeWageComputation {

		public static final int is_fullTime=1;
        	public static final int is_PartTime=2;
  	        public static final int ratePerHrs=20;
		public static final int NumberOfWorkingDays=20;
		public static final int MaxHrsInMonth=10;

	public static void main(String[] args) {

	System.out.println("Welcome to Employee Wage Computation problem..");
	//variables
	int empWage=0;
	int EmpHrs=0;
	int TotalWorkingDays=0;
	//computation
	while (empWage <= MaxHrsInMonth && TotalWorkingDays < NumberOfWorkingDays) 
	{
		TotalWorkingDays++;
		int empcheck=((int)Math.floor(Math.random() * 10))%3;
		switch (( empcheck ))
		{
			case is_fullTime:
				EmpHrs=8;
				break;
		        case is_PartTime:
				EmpHrs=4;
				break;
		        default:
				EmpHrs=0;
		}

		empWage=ratePerHrs*EmpHrs;
		System.out.println("Employee wage: " + empWage);

	}
	     int TotalEmpWage = empWage * ratePerHrs; //UseCase6- Total employee wage
	     System.out.println("Total Emp Wage: " +TotalEmpWage);
	}
}
