package OOPS;
class thisclass{
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name; //this.name denotes instance variable and name denotes parameter
    }
    public String getName(){
        return name;
    }
}
public class ThisKeyword {
    public static void main(String[] args){
        thisclass obj = new thisclass();
        obj.setAge(10);
        obj.setName("Karthik");
        System.out.println(obj.getAge()+ ":" + obj.getName());

    }
}
