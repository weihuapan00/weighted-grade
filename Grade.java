public class Grade{
    // initialize the variable in the class
    public double grade = 0; //total weight grade
    
    public Grade(){
    }

    //calculate the grade in one assignment and add to the total grade
    public void calculateGrade(double total,double earned,double percent){
        this.grade += earned / total * percent;
    }
    /* toString method print out the data Grade class stored,
     and calculate the total weight grade.*/ 
    public String toString(){
        String toReturn = "";
        toReturn += "Total weight grad now: " + grade + "\n";
        return toReturn;
        
    }

}