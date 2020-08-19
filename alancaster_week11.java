//Imports
import java.util.*;

//Begin Class JavaGradeProgram
public class JavaGradeProgram {

    //Polymorphic Instances
    static Student student = new Student();
    static Student myUGStudent = new UnderGrad();
    static Student myGStudent = new Grad();

    //Begin Main Method
    public static void main(String[] args) {

        //Scanner object
        Scanner sc = new Scanner(System.in);

        //Global Variables
        String anotherStudent;
        int numOfAssignments;
        int numOfDiscussions;
        int numOfMidweek;

        System.out.println("Welcome to the Student Grade Calculator");
        do {
            //Input
            System.out.print("Enter Student's First Name: ");
            String firstName = sc.nextLine();
            System.out.print("Enter Student's Last Name: ");
            String lastName = sc.nextLine();

            //Student type
            String fullName = firstName + " " + lastName;
            System.out.printf("Select %s's student type:\n",
                    fullName);
            System.out.println("1. Undergraduate Student");
            System.out.println("2. Graduate Student");
            System.out.print("->: ");
            int studentType = sc.nextInt();
            if (studentType < 1 || studentType > 2) {
                do {
                    System.out.println("Please enter 1 or 2.");
                    System.out.println("1. Undergraduate Student");
                    System.out.println("2. Graduate Student");
                    System.out.print("->: ");
                    studentType = sc.nextInt();
                } while (studentType < 1 || studentType > 2);
            }

            //Create new student
            student = new Student(fullName, studentType);

            //Undergrad Calculations
            if (studentType == 1) {

                //Grade Input - Assignments
                System.out.print("Enter the number of Assignment grades: ");
                numOfAssignments = sc.nextInt();
                for (int i = 0; i < numOfAssignments; i++) {
                    System.out.printf("Enter Assignment grade number %d: ", i + 1);
                    myUGStudent.setAssignment(sc.nextDouble());
                }

                //Grade Input - Discussions
                System.out.print("Enter the number of Discussion grades: ");
                numOfDiscussions = sc.nextInt();
                for (int i = 0; i < numOfDiscussions; i++) {
                    System.out.printf("Enter Discussion grade number %d: ", i + 1);
                    myUGStudent.setDiscussion(sc.nextDouble());
                }

                //Grade Input - Midweek
                System.out.print("Enter the number of Midweek grades: ");
                numOfMidweek = sc.nextInt();
                for (int i = 0; i < numOfMidweek; i++) {
                    System.out.printf("Enter Midweek grade number %d: ", i + 1);
                    myUGStudent.setMidweek(sc.nextDouble());
                }

                //Extra Credit Input
                System.out.printf("Did %s fill out the IDEA Survey? "
                        + "(Y for Yes - N for No): ", fullName);
                myUGStudent.setExtraCredit(sc.next());

                System.out.printf("%s's final grade is: %.2f", fullName,
                        myUGStudent.calculateFinalGrade());

            } 
            //Grad calculations
            else if (studentType == 2) {

                //Grade Input - Assignments
                System.out.print("Enter the number of Assignment grades: ");
                numOfAssignments = sc.nextInt();
                for (int i = 0; i < numOfAssignments; i++) {
                    System.out.printf("Enter Assignment grade number %d: ", 
                            i + 1);
                    myGStudent.setAssignment(sc.nextDouble());
                }

                //Grade Input - Discussions
                System.out.print("Enter the number of Discussion grades: ");
                numOfDiscussions = sc.nextInt();
                for (int i = 0; i < numOfDiscussions; i++) {
                    System.out.printf("Enter Discussion grade number %d: ", 
                            i + 1);
                    myGStudent.setDiscussion(sc.nextDouble());
                }

                //Grade Input - Midweek
                System.out.print("Enter the number of Midweek grades: ");
                numOfMidweek = sc.nextInt();
                for (int i = 0; i < numOfMidweek; i++) {
                    System.out.printf("Enter Midweek grade number %d: ", i + 1);
                    myGStudent.setMidweek(sc.nextDouble());
                }
                
                //Thesis Grade Input
                System.out.printf("Enter the Thesis grade for %s: ", fullName);
                double tGrade = sc.nextDouble();
                myGStudent.setThesisGrade(tGrade);

                //Extra Credit Input
                System.out.printf("Did %s fill out the IDEA Survey? "
                        + "(Y for Yes - N for No): ", fullName);
                myGStudent.setExtraCredit(sc.next());

                System.out.printf("%s's final grade is: %.2f", fullName,
                        myGStudent.calculateFinalGrade());
            }
            
            //Run Program Again
            System.out.println("\nRun program again?");
            System.out.print("(Y for yes, N to exit): ");
            anotherStudent = sc.next();
            if (anotherStudent.matches("N|n")) {
                System.out.print("\nThank you for using the program. Goodbye!\n");
                System.exit(0);
            } else if (!anotherStudent.matches("N|n|Y|y")) {
                System.out.print("\nERROR: Incorrect entry. Exiting program.\n");
                System.exit(1);
            }
            sc.nextLine();
        } while (anotherStudent.equalsIgnoreCase("Y"));
        
    } //End Main Method
} //End Class alancaster_week11
