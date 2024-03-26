class employee
{
 int empno;
 String name;
 int age;
 employee(int emno,String n,int a)
 {
  empno=emno;
  name=n;
  age=a;
  }
 void print()
  {
   System.out.println("Employee number="+empno);
   System.out.println("Name="+name);
   System.out.println("Age="+age);
   }
} 
class employeedemo
{
 public static void main(String args[])
 {
  employee em=new employee(191,"Saanvi",25);
  em.print();
  }
}