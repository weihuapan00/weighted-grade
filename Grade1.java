public class Grade1{
    // initialize the variable in 
    private double total = 0; // total point 
    private double earned = 0; // earned point
    private double percent = 0; // Assignment percentage
    private double grade = 0; //total weight grade

    // set the correct value of variable
    public Grade1(double total, double earned, double percent){
        this.total = total;
        this.earned = earned;
        this.percent = percent;
    }

    //calculate the total weight grade
    public void calculateGrade(){
        this.grade = earned / total * percent;
    }
    /* toString method print out the data Grade class stored,
     and calculate the total weight grade.*/ 
    public String toString(){
        String toReturn = "";
        toReturn += "Total point: " + total + "\n";
        toReturn += "Earned point: " + earned + "\n";
        toReturn += "Assignment percentage: " + percent + "\n";
        toReturn += "Total weight grad: " + grade + "\n";
        return toReturn;
    }

    public double  getGrade(){
        return this.grade;
    }

}