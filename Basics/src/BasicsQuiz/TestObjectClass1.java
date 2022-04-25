package BasicsQuiz;


//Object class --> parent of all the java classes
//comes with some special methods --> 1) toString() --> object's String representation	
//										2) equals(Object obj) --> decides how two objects are equal or not
//										3) hashCode() --> used for increasing performance
class Employee{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	//use employee name whenever you need to represent employee object
	/*
	public String toString() {
		return this.getId() + this.getName();
	}
	*/
	
	public boolean equals(Object obj) {
		if(obj instanceof Employee && this.getId()==((Employee) obj).getId()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public int hashCode() {
		return this.getId()*5;
	}
	
	
}

public class TestObjectClass1{

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Rajesh");
		System.out.println(emp1);
		Employee emp2 = new Employee(101,"Rajesh");
		System.out.println(emp2);
		
		System.out.println(emp1.equals(emp2));
		
		//if two objects are equal will they have same hascode or different?
		//yes
		
		//if two objects are different will they have same hashcode?
		//may or may not have same hashcode
		

	}

}