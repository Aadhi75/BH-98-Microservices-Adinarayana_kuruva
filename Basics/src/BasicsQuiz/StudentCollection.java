package BasicsQuiz;

class Student3 {
int roll_no;
String name;
String grade;
public Object getGrade;



public Student3(int roll_no, String name, String grade) {
this.roll_no = roll_no;
this.name = name;
this.grade = grade;
}



public int getRoll_no() {
return roll_no;
}



public void setRoll_no(int roll_no) {
this.roll_no = roll_no;
}



public String getName() {
return name;
}



public void setName(String name) {
this.name = name;
}



public String getGrade() {
return grade;
}



public void setGrade(String grade) {
this.grade = grade;
}

}
class StudentCollection
{
public static void collection(Student3 stu)
{
if(stu.getGrade().equals("A") ||stu.getGrade().equals("B"))
{
System.out.println(stu.roll_no+" " + stu.name +" " + stu.grade);
}



}
public static void main(String[] args) {
Student3 stu1 = new Student3( 101, "Tommy", "A");
Student3 stu2 = new Student3( 102, "John", "A");
Student3 stu3 = new Student3( 103, "Sam", "B");
Student3 stu4 = new Student3( 104, "Rajeev","C");
Student3 stu5 = new Student3(105,"Suraj", "D");

collection(stu1);
collection(stu2);
collection(stu3);
collection(stu4);
collection(stu5);


}
}