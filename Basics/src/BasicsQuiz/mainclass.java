package BasicsQuiz;
class Inher{
public int a=10;

}
 class B extends Inher
 {
    public int b = 20;
public void test()
{
 System.out.println(a);
 System.out.println(b);
    }
 }
class mainclass
 {
  public static void main(String[]args)
{

B y = new B(); /////we have to create the object for the subclass
y.test();
}
 }
