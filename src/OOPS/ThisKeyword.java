package OOPS;
class thisclass{
    private int age;
    private String name;
    public thisclass(){
        //this is a constructor which has same name as the class name
        // never returns anything
        // even if u dont call the constructor it will be called everytime u create a new  object
        System.out.println("in constructor");
    }
    public thisclass(int age, String name){
        this.age = age;
        this.name = name;
    }
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
        thisclass obj1 = new thisclass(18,"Ram");
        obj.setAge(10);
        obj.setName("Karthik");
        System.out.println(obj.getAge()+ ":" + obj.getName());

    }
}
