public class employeeWageComputation {

         //Constants
         public static final int is_fullTime=1;
         public static final int is_PartTime=2;
         public static final int ratePerHrs=20;
         public static final int numberOfDays=20;
        public static void main(String[] args)
        {
		 System.out.println("Welcome to Employee wage computation problem..");
                //variables
                int empHrs=0;
                int empWage=0;
                int totalEmpWage=0;
                //computation
                for (int day=0; day<numberOfDays; day++)
                {
                        double randomCheck=Math.floor(Math.random()*10)%3;

                        switch ((int)randomCheck)
                        {
                        case is_fullTime:
                                        empHrs=8;
                                        break;
                        case is_PartTime:
                                        empHrs=4;
                                        break;
                        default:
                                        empHrs=0;
                                        break;
                        }
                        totalEmpWage+=empWage;
                        empWage=ratePerHrs*empHrs;
                        System.out.println("Employee Wage : "+empWage);
                }

                System.out.println("Total employee wage: "+totalEmpWage);

        }
}
