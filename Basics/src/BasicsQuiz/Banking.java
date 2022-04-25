package BasicsQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class CreditCard implements Comparable{
	private int id;
	private String name;
	private String date;
	CreditCard(int id , String name , String date){
		this.id = id;
		this.name = name;
		this.date = date;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		return date == other.date && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Object o) {
	return this.getDate().compareTo(((CreditCard) o).getDate());
	}
	
}

class Customer{
	private String name;
	private int id;
	public Customer(int id , String name) {
		this.name= name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}
public class Banking {
	
	static Map<CreditCard , Customer> sortingList(Set<CreditCard> sl , Map<CreditCard , Customer> main){
		List<CreditCard> l1 = new ArrayList<CreditCard>(sl);
		Collections.sort(l1);
		Map<CreditCard , Customer> output = sortingcus( l1,  main);
		
		return output;
	}
	
		static Map<CreditCard , Customer> sortingcus(List<CreditCard> x, Map<CreditCard , Customer> main){
			Map<CreditCard , Customer> test = new LinkedHashMap<CreditCard , Customer>();
			for(CreditCard y : x) {
				test.put(y, main.get(y));
			}
			return test;
			
		}
		

	public static void main(String[] args) {
		
		CreditCard c1=new CreditCard(101,"aadi","2010");
		CreditCard c2=new CreditCard(102,"Raju","2006");
		CreditCard c3=new CreditCard(103,"shesha","2004");
		CreditCard c4=new CreditCard(104,"ganesh","2007");
		CreditCard c5=new CreditCard(105,"naveen","2001");
		
		Customer cu1 =new Customer(101,"aadi");
		Customer cu2 =new Customer(102,"Raju");
		Customer cu3 =new Customer(103,"shesha");
		Customer cu4 =new Customer(104,"ganesh");
		Customer cu5 =new Customer(105,"naveen");
		
		Map<CreditCard , Customer> mymap = new LinkedHashMap<CreditCard , Customer>();
		
		mymap.put(c1, cu1);
		mymap.put(c2, cu2);
		mymap.put(c3, cu3);
		mymap.put(c4, cu4);
		mymap.put(c5, cu5);
		
//		System.out.println(mymap);
		
		Map<CreditCard , Customer> mapres = sortingList(mymap.keySet(),mymap);
		
		
		for(CreditCard x : mapres.keySet())
			System.out.println(x+" = "+mapres.get(x));
		
//		System.out.println(mapres);

	}
}
