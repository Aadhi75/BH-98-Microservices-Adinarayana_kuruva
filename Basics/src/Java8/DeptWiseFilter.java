package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeptWiseFilter {

	public static void main(String[] args) {
		
		Department d1 = new Department(111,"EEE");
		Department d2 = new Department(222,"ECE");
		Department d3 = new Department(333,"CSE");
		
		Student s1 = new Student(101,"Shesha",d1,90,95,93);
		Student s2 = new Student(102,"Raju",d2,87,92,89);
		Student s3 = new Student(103,"Ganesh",d2,66,97,78);
		Student s4 = new Student(104,"Naveen",d3,79,87,85);
		Student s5 = new Student(105,"Venu",d2,94,78,81);
		Student s6 = new Student(106,"Deepak",d1,91,92,85);
		Student s7 = new Student(107,"Avinash",d3,83,67,90);
		

		
		List<Student> stlist = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		
		Map<Department, List<Student>> result = stlist.stream().collect(Collectors.groupingBy(Student::getDept_id));
		
	    
	    
	    
//		System.out.println(result);
		
		
//		Iterator itr = result.Iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		System.out.println(result);
//		
		for(Department st : result.keySet()){
			System.out.println(st+" = "+result.get(st));
		}
		
		
	}


}
