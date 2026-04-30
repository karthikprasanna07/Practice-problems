package OOPS;

class Encap{
    private String name;
    private int age;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int a) {
        age = a;
    }
    public void setName(String str){
        name = str;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encap obj = new Encap();
        obj.setAge(30);
        obj.setName("Karthik");

        System.out.println(obj.getAge() + ":" + obj.getName());
        //private variable can be accessed only inside a method not directly using object
        // obj.name("karthik");, cannot be accessed
    }

}
