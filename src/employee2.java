
class Employee{
 int salary;
 String name;
 public int getSalary(){
  return salary;
 }
 public String getName(){
  return name;
 }
 public void setname(String n){
  name =  n;
 }

}
class CellPhone{
 public void ringing(){
  System.out.println("ringing...");
 }
 public void vibrating(){
  System.out.println("vibrating...");
 }
  public void callFriend(){
   System.out.println("calll...");
 }
}
class Squre{
  int side;
  public int area(){
   return side * side;
  }
  public int perimeter(){
   return  4*side;
  }
}
class tommy{
 public void hit(){
  System.out.println("hitting the enemy");
 }
 public void run(){
  System.out.println("runing the enemy");
 }
 public void fire(){
  System.out.println("firing the enemy");
 }
}
public class employee2 {
 public static void main(String[] args){
 Employee harry = new Employee();
harry.setname("code with harry"); // if i comment this line so NULL will be printed
  harry.salary = 233;
  System.out.println(harry.getSalary());
  System.out.println( harry.getName());


  CellPhone vivo = new CellPhone();
  vivo.callFriend();
  vivo.vibrating();
  vivo.ringing();

  Squre sq = new Squre();
  sq.side = 2;
  System.out.println(sq.area());
  System.out.println(sq.perimeter());

  tommy prince= new tommy();
  prince.fire();
  prince.hit();
  prince.run();



 }
}
