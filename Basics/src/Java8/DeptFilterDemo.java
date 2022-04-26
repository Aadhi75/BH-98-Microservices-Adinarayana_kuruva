package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student1 {
	private int id;
	private String name;
	private int dept_id;
	private int cmarks,pmarks,mmarks;
	public Student1(int id, String name, int dept_id, int cmarks, int pmarks, int mmarks) {
		super();
		this.id = id;
		this.name = name;
		this.dept_id = dept_id;
		this.cmarks = cmarks;
		this.pmarks = pmarks;
		this.mmarks = mmarks;
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
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public int getCmarks() {
		return cmarks;
	}
	public void setCmarks(int cmarks) {
		this.cmarks = cmarks;
	}
	public int getPmarks() {
		return pmarks;
	}
	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}
	public int getMmarks() {
		return mmarks;
	}
	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}
	public int getTmarks() {
		return this.cmarks+this.pmarks+this.mmarks;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", dept_id=" + dept_id + ", cmarks=" + cmarks + ", pmarks="
				+ pmarks + ", mmarks=" + mmarks + "]";
	}
	

}
public class DeptFilterDemo {
	public static void main(String[] args) {
		Student1 s1 = new Student1(101,"Sumit",300,90,95,93);
		Student1 s2 = new Student1(102,"Rajesh",111,87,95,93);
		Student1 s3 = new Student1(103,"Suraj",222,66,95,78);
		Student1 s4 = new Student1(104,"Tom",111,79,95,93);
		Student1 s5 = new Student1(105,"Shiva",222,90,78,93);
		Student1 s6 = new Student1(106,"Jay",333,90,95,93);
		Student1 s7 = new Student1(107,"Sagar",222,83,67,93);
		
		List<Student1> Student1s = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		Map<Integer, List<Student1>> Student1DeptWise = Student1s.stream().collect(Collectors.groupingBy(Student1::getDept_id));
	
//		System.out.println(Student1DeptWise);
		for(Integer st : Student1DeptWise.keySet()){
			System.out.println(st+" = "+Student1DeptWise.get(st));
		}
	}

}
