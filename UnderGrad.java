
//Imports

//Begin Subclass UnderGrad
public class UnderGrad extends Student {
    
    //Variables
    final double APERCENTAGE = 0.65;
    final double DPERCENTAGE = 0.25;
    final double MPERCENTAGE = 0.10;
    
    /**
     * Method calculatFinalGrade: Calculates the final grade for undergrad
     * @return (getAssignment()*APERCENTAGE) + (getDiscussion()*DPERCENTAGE)
                + (getMidweek()*MPERCENTAGE) + exc;
     */
    @Override
    public double calculateFinalGrade() {
        int exc = 0;
        if (getExtraCredit() == 1) {
            exc = 1;
        }
        return (getAssignment()*APERCENTAGE) + (getDiscussion()*DPERCENTAGE)
                + (getMidweek()*MPERCENTAGE) + exc;
    }


} //End Subclass UnderGrad
