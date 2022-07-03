package employee_wage;

public class Maxwork_UC6 {
	public static final int is_present= 1;
	public static final int is_present_parttime= 2;
	public static final int total_emp_hr = 20;
	public static final int num_of_working_days = 2;
	public static final int Max_hrs_in_months = 10;

	public static void main(String[] args) {
		int working_hr = 0, total_emp_hr = 0, total_working_days = 0;
		while (total_emp_hr <= Max_hrs_in_months && total_working_days < num_of_working_days) {
			total_working_days++;
		int emp_attendance =(int) Math.floor(Math.random ()* 10) % 3;
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
		total_emp_hr += working_hr;
		System.out.println("DAY#: " + total_working_days +" Emp hr : "+ working_hr);
		}
		int totalEmpWage = total_emp_hr * total_emp_hr;
		System.out.println("Total Emp Wage: " + totalEmpWage );

	}


}
