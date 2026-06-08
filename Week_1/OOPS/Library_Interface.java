@interface
interface User{
  void Account();
  void Book();
}
class Child implements User{
  String Book_name_Type;
  int age;
  @override
  public void Account(){
  if(age<15)
    System.out.println("Registered Successfully!");
  else
    System.out.println("Error! Age must be less than 15");
}
@override
public void Book(){
  if(Book_name_Type.equals("Child"))
    System.out.println("BOOK Issued!");
  else
    System.out.println("Select child book only!");
}
class Adult implements User{
  int age;      
  String Book_name_Type;
  @override
  public void Account(){
  if(age<15)
    System.out.println("You are a child!");
  else
    System.out.println("Registered Successfully");
  }
}
public class Library_Interface{
  public static void main(String args[])
  {
    System.out.println("CHILD USER"):
    Child c = new Child();
    c.age=9;
    c.Account();
    
