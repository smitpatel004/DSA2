class MyMainEmployee{
    private int id;
    private String name;
    public String getName(){return name;}
    public void setName(String n){this.name = n;}
    public void setId(int i){this.id = i;}
    public int getId(){return id;}
    public MyMainEmployee(){
        id = 45;
        name = "smit";
    }
    public MyMainEmployee(String myname,int myid){
//        id = 45;
        id = myid;

//        name = "smit";
        name = myname;
    }

}
public class constructer {
    public static void main (String[] args){
//     MyMainEmployee harry = new MyMainEmployee();
//    MyMainEmployee harry = new MyMainEmployee("donbb",18);
        MyMainEmployee harry= new MyMainEmployee();
//     harry.setName("codewithharry");
//     harry.setId(12);

        System.out.println(harry.getName());
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
