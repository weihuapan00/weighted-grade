public class Grade{
    // initialize the variable in the class
    private double grade = 0; //total weight grade
    private int size = 9;
    private double[] percentage = new double[8];
    private double[] total_grade = new double[8];
    private double[] earned_grade = new double[8];

    public Grade(double[] percentage, double[] total_grade, double[] earned_grade){
        setPercentage(percentage);
        setTotal_grade(total_grade);
        setEarned_grade(earned_grade);
    }

    //calculate the grade in one assignment and add to the total grade
    public void calculateGrade(double total,double earned,double percent){
        int temp = 0;
        for(int i=0; i< this.size; i++ ){
            temp +=  earned / total * percent;
        }
        setGrade(temp);
    }
    /* toString method print out the data Grade class stored,
     and calculate the total weight grade.*/ 
    public String toString(){
        String toReturn = "";
        toReturn += "Total weight grad now: " + grade + "\n";
        return toReturn;
        
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double[] getPercentage() {
        return percentage;
    }

    public void setPercentage(double[] percentage) {
        this.percentage = percentage;
    }

    public double[] getTotal_grade() {
        return total_grade;
    }

    public void setTotal_grade(double[] total_grade) {
        this.total_grade = total_grade;
    }

    public double[] getEarned_grade() {
        return earned_grade;
    }

    public void setEarned_grade(double[] earned_grade) {
        this.earned_grade = earned_grade;
    }
    

}