package employee_wage;

public class Assumework_UC5 {

	public static void main(String[] args) {
		int Total_working_day = 20;
		int is_present_parttime= 1;
		int is_present= 2;
		int Emp_wage_per_hr = 20;
		int emp_hr = 0;
		int daily_wage = 0;
		int Total_wage=0;
		double emp_attendance = Math.floor(Math.random ()* 10) % 3;
	
		if ( emp_attendance == is_present )
		emp_hr = 8;
		
		else if (emp_attendance ==is_present_parttime)
		emp_hr = 4;
		
		else
			emp_hr = 0;
		
		daily_wage = emp_hr * Emp_wage_per_hr ;
		Total_wage = Total_working_day * daily_wage;
		
		System.out.println("Employee is present = "+ emp_hr +" hr ");
		System.out.println("Employee total 20 days wage = "+ Total_wage);
	}

}
