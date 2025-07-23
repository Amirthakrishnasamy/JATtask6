package JATtask6;

public class Person {
    String name;
    int age;    

    public Person(String i, int j) {
        name = i;
        age = j;  
    }

   
    public String getName() {
        return name; 

    } 
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
    	Person obj=new Person("Anshuman",45);
        System.out.println("Name of the person: "+ obj.getName());
        System.out.println("Age of the person: "+ obj.getAge());
    }
}
