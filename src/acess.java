class MyEmployee{
    private int id;
   private String Name;
 public String getName(){
      return Name;
    }
 public void setName(String n){
     Name = n;
 }

    }
// public void getId(){
//     return id;
// }
//public void setId(int i){
//    id = i ;
//}
public class acess {
    public static void main(String[] args){
    MyEmployee harry = new MyEmployee();
//    harry.id = 1; //throw error cause private acess
//    harry.Name = "harry patel";
        harry.setName("code with harry");
        System.out.println(harry.getName());
    }
}
