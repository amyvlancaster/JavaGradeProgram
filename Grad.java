
/**
*  @Course: SDEV 250 ~ Java Programming I
*  @Author Name: Amy Lancaster
*  @Assignment Name: Week 11: Assignment: Inheritance and Polymorphism
*  @Date: Jul 28, 2020
*  @Subclass Grad Description: Grad subclass 
*/
//Begin Subclass Grad
public class Grad extends Student {
    
    
    //Variables
    final double APERCENTAGE = 0.40;
    final double DPERCENTAGE = 0.15;
    final double MPERCENTAGE = 0.15;
    final double TPERCENTAGE = 0.30;
    
     /**
     * Method setThesisGrade: Takes grade value for Grad calculations
     * @param t 
     */
    @Override
    public void setThesisGrade(double t) {
        thesisGrade = t;
    }
    
     /**
     * Method getThesisGrade: Gets thesis grade for Grad student
     * @return thesisGrade
     */
    public double getThesisGrade() {
        return thesisGrade;
    }
    
    /**
     * Method calcualteFinalGrade: Calculates the final grade for grad
     * @return (getAssignment()*APERCENTAGE) + (getDiscussion()*DPERCENTAGE)
                + (getMidweek()*MPERCENTAGE) + (getThesisGrade()*TPERCENTAGE) 
                + exc;
     */
    @Override
    public double calculateFinalGrade() {
        int exc = 0;
        if (getExtraCredit() == 1) {
            exc = 1;
        }
        return (getAssignment()*APERCENTAGE) + (getDiscussion()*DPERCENTAGE)
                + (getMidweek()*MPERCENTAGE) + (thesisGrade*TPERCENTAGE) 
                + exc;
    }

} //End Subclass Grad

