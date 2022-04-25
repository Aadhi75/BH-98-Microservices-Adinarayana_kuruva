package BasicsQuiz;

//import java.util.Scanner;

class Employee1{
	private int id;
	private String name;
	private double salary;
	private String design;
	public Employee1(int id, String name, double salary, String design) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.design = design;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
}
public class Bonus {
	public static void getBonus(Employee1 e){
		if(e.getDesign()=="Manager"){
			double comm= (e.getSalary()*30)/100;
			System.out.println("Your bonus ammount is: "+(e.getSalary()+comm));
		}
		else if(e.getDesign()=="Lead"){
			double comm= (e.getSalary()*25)/100;
			System.out.println("Your bonus ammount is: "+(e.getSalary()+comm));
		}
		else if(e.getDesign()=="Associate"){
			double comm= (e.getSalary()*20)/100;
			System.out.println("Your bonus ammount is: "+(e.getSalary()+comm));
		}
	}
	public static void main(String[] args) {
		Employee1 e=new Employee1(101,"ganesh",2400,"Associate");
		getBonus(e);
}}

