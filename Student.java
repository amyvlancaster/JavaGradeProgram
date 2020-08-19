
/**
 *  @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Amy Lancaster
 * @Assignment Name: Week 11: Assignment: Inheritance and Polymorphism
 * @Date: Jul 28, 2020
 * @Subclass Student Description: Student Superclass
 */
//Imports
import java.util.*;

//Begin Subclass Student
public class Student {

    //Variables
    String fName;
    String extraCredit;
    int type;
    int numOfAssignments;
    int numOfDiscussions;
    int numOfMidweek;
    int EXC;
    double assignmentGrade;
    double discussionGrade;
    double midweekGrade;
    double thesisGrade;
    ArrayList<Double> assignment = new ArrayList<>();
    ArrayList<Double> discussion = new ArrayList<>();
    ArrayList<Double> midweek = new ArrayList<>();

    //Public Constructor
    Student(String fullName, int studentType) {
        fName = fullName;
        type = studentType;
    }

    //Default Constructor
    Student() {
        fName = null;
        type = 0;
    }
    /**
     * Method SetAssignment: Adds assignment grades to the assignment arrayList
     * @param g 
     */
    public void setAssignment(double g) {
        assignment.add(g);
    }
    
    /**
     * Method setDiscussion: Adds discussion grades to discussion arrayList
     * @param g 
     */
    public void setDiscussion(double g) {
        discussion.add(g);
    }
    
    /**
     * Method setMidweek: Adds midweek grades to midweek arrayList
     * @param g 
     */
    public void setMidweek(double g) {
        midweek.add(g);
    }
    
    /**
     * Method setThesisGrade: Takes grade value for Grad calculations
     * @param t 
     */
    public void setThesisGrade(double t) {
        thesisGrade = 0;
    }
    
    /**
     * Method setExtraCredit: Sets extra credit score if applicable
     * @param e 
     */
    public void setExtraCredit(String e) {
        if (e.equalsIgnoreCase("Y")) {
            EXC = 1;
        } else {
            EXC = 0;
        }
    }

    /**
     * Method getAssignment: averages grades in assignment arrayList
     * @return assignmentGrade
     */
    public double getAssignment() {
        double avg = 0;
        for (int i = 0; i < assignment.size(); i++) {
            avg = avg + assignment.get(i);
        }
        assignmentGrade = avg / assignment.size();
        return assignmentGrade;
    }

    /**
     * Method getDiscussion: averages grades in discussion arrayList
     * @return discussionGrade
     */
    public double getDiscussion() {
        double avg = 0;
        for (int i = 0; i < discussion.size(); i++) {
            avg = avg + discussion.get(i);
        }
        discussionGrade = avg / discussion.size();
        return discussionGrade;
    }

    /**
     * Method getMidweek: averages grades in midweek arrayList
     * @return midweekGrade
     */
    public double getMidweek() {
        double avg = 0;
        for (int i = 0; i < midweek.size(); i++) {
            avg = avg + midweek.get(i);
        }
        midweekGrade = avg / midweek.size();
        return midweekGrade;
    }

    /**
     * Method getExtraCredit: Gets extra credit score if applicable
     * @return EXC
     */
    public double getExtraCredit() {
        return EXC;
    }

    /**
     * Method calculateFinalGrade: Calculates the final grade for student 
     * Default method
     * @return 0
     */
    public double calculateFinalGrade() {
        return 0;
    }

}//End Subclass Student
