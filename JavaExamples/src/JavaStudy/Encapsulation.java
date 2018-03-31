package JavaStudy;

public class Encapsulation {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setEmpid(10);
		
		System.out.println(emp.getEmpid());
		
		
		emp.setEmpname("ab");
		
		System.out.println(emp.getEmpname());
		
		
		
		//emp.empname = "ab";
		
		

	}
}