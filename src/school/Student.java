package school;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits,double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }

    public String getName(){

        return name;
    }

    public void setName(String aName){

        name = aName;
    }

    public int getStudentId(){

        return studentId;
    }

    public void setStudentId(int aStudentId){
        studentId = aStudentId;
    }

    public int getNumberOfCredits(){

        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(double gpa){
        return gpa;
    }

    public void setGpa(double aGpa){
        gpa = aGpa;
    }

    public void speak(){
        System.out.println("Hello " + "I am " + name + ". " + "My GPA is: " + gpa + " Student ID is: " + studentId + " My number of credits is: "+ numberOfCredits);
    }

}

class App{
    public static void main(String[] args){
        Student student1 = new Student("Jesse Williams",1 );

        student1.setGpa(3.5);
        student1.speak();


    }
        }