package employee_wage;

public class emp_Uc1 {

	public static void main(String[] args) {
		int is_present= 1;
		double emp_attendance = Math.floor(Math.random ()* 10) % 2;
		if ( emp_attendance == is_present )
		System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		
	}
}
