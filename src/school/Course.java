package school;



import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private HashMap<String, String> courseAndDescription = new HashMap<>();
    private int creditWorth;
    private String instructor;
    private ArrayList<String> roster = new ArrayList<>();


    public Course(double creditWorth, String instructor) {

        this.creditWorth = 3;
        this.instructor = instructor;
        this.roster = roster;

    }


    public void setCourseAndDescription(String aKey, String aValue) {
        courseAndDescription.put(aKey, aValue);
    }


    public void setCreditWorth(int aCreditWorth) {
        creditWorth = aCreditWorth;
    }


    public int getCreditWorth() {
        return creditWorth;
    }

    public ArrayList<String> getRoster() {
        return roster;
    }

    public void setRoster(String aRoster) {
        roster.add(aRoster);
    }


    public void results() {
        System.out.println("**********" + "\n" + "The course name & Decription: " + courseAndDescription.entrySet() + "\n" + "Number of Credits: " +
                creditWorth + "\n" + "Instructor: " + instructor + "\n" + "roster: " + roster + "\n" + "************"+ "\n" + "\n");
    }

}

class App2 {
    public static void main(String[] args) {
        Course basketweaving = new Course(3, "Mr. Lawson");
        basketweaving.setCourseAndDescription("basketweaving", "this is a descriptiom");
        basketweaving.setRoster("Jesse Williams");

        basketweaving.results();


        Course pottery = new Course(3, "Mr. Dinkles");
        pottery.setCourseAndDescription("pottery", "this is a shitty class");
        pottery.setRoster("Amanda Becker Williams");

        pottery.results();


        Student student3 = new Student("Vera Williams", 3);
        pottery.setRoster(student3.getName());
        basketweaving.setRoster(student3.getName());
        student3.setNumberOfCredits(pottery.getCreditWorth() + basketweaving.getCreditWorth());
        pottery.results();
        basketweaving.results();
        System.out.println("Total number of credits: " + student3.getNumberOfCredits());


    }

}


