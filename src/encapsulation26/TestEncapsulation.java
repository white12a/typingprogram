package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate e=new Encapsulate();//setting values of the variables
        e.setRollNo(51);
        e.setAge(19);
        e.setName("Amit");

        //Displaying values of the variables
        System.out.println("Prime's name: " +  e.getName());
        System.out.println("Prime's age: " +  e.getAge());
        System.out.println("Prime's rollNo: " + e.getRollNo());
    }
}
