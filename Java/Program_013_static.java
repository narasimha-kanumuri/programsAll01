class Student {
    //Instance Variables
    private String name;

    //Instance Variable- but we generate it
    private int id;

    //Common Value - Total No. of Students who took admission. 
    
    //Class Variable - better be private
    public static int studentsJoined = 0;

    Student(String name) {
        this.name = name;
        this.studentsJoined++;
        this.id = Student.studentsJoined;
    }

    public void getDetails(){
        System.out.println(name + " " + id);
        System.out.println(Student.studentsJoined);
    }
}

public class Program_013_static {
    public static void main(String[] args) {
        Student s1 = new Student("Karthik");
        s1.getDetails();
        Student s2 = new Student("Bhargav");
        s2.getDetails();
        Student s3 = new Student("Ramesh");
        s3.getDetails();
        Student s4 = new Student("Suresh");
        s4.getDetails();

        Student.studentsJoined = 100;
        s1.getDetails();
    }
}
