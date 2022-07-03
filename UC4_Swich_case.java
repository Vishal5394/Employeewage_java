package employee_wage;

public class Case_UC4 {
	public static final int is_present= 1;
	public static final int is_present_parttime= 2;

	public static void main(String[] args) {
		
		int Emp_wage_per_hr = 20;
		int working_hr = 0;
		int emp_attendance =(int) Math.floor(Math.random ()* 10) % 3;
		int daily_wage = 0 ;
		switch (emp_attendance) {
		case is_present:
			working_hr = 8;
			break;
		case is_present_parttime:
			working_hr = 4;
			break;
		default:
				working_hr = 0;
		}
		daily_wage = working_hr * Emp_wage_per_hr ;
		System.out.println("Employee is present = "+ working_hr +" hr."+ "  Employee wage = "+ daily_wage +" Rs.");

	}

}
