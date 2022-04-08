package encapsulation26;

public class Encapsulate {
    // private variables declared these can only be accessed by public
    private String name;
    private  int rollNo;
    private  int age;

    //get method for name to access private name
    public String getName(){
        return name;
    }
    //set method for name to access private variable
    public void setName(String name){
        this.name=name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }



}
