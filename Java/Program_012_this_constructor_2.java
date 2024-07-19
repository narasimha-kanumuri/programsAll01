/*
 * Student Details:
 * Name
 * Age
 * Year of Joining
 * branch
 * course
 * Fee
 * College Name
 * Generate id
 * phone
 * email
 */

class Student {
    private int id;
    private String name;
    private int age;
    private int year;
    private String branch;
    private String department;
    private String phone;
    private String email;
    private int fee;

    private static String college = "IIT";


    Student(String Name, int age, int joiningYear,
            String branch, String course, int fee,
            long phone, String email) {

        this.Name = Name;
        this.age = age;
        this.joiningYear = joiningYear;
        this.branch = branch;
        this.course = course;
        this.phone = phone;
        this.email = email;
        //this.fee
        //this.id                
    }
    
    public void getDetails(){
        System.out.println("Name: " + this.Name);
        System.out.println("Age: " + this.age);
        System.out.println("Joining Year: " + this.joiningYear);
        System.out.println("Branch: " + this.branch);
        System.out.println("Course: " + this.course);
        System.out.println("Phone: " + this.phone);
        System.out.println("Email: " + this.email);
        System.out.println("Fee: " + this.fee);
        System.out.println("College: " + Student.college);
    }
}

public class Program_012_this_constructor_2 {
    
}
