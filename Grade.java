public class Grade{
    // initialize the variable in the class
    private double grade = 0; //total weight grade
    private int size = 8;
    private double[] percentage = new double[8];
    private double[] total_grade = new double[8];
    private double[] earned_grade = new double[8];

    // default constructor
    public Grade(){

    }

    // quick constructor that set percentage[], total_grade[], earned_grade[]
    public Grade(double[] percentage, double[] total_grade, double[] earned_grade){
        setPercentage(percentage);
        setTotal_grade(total_grade);
        setEarned_grade(earned_grade);
    }

    //calculate the grade in one assignment and add to the total grade
    public void calculateGrade(){
        int temp = 0;
        for(int i=0; i< this.size; i++ ){
            temp +=  earned_grade[i] / total_grade[i] * percentage[i];
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

    //setter for grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    //getter for percentage
    public double[] getPercentage() {
        return percentage;
    }

    //setter for percentage
    public void setPercentage(double[] percentage) {
        this.percentage = percentage;
    }

    //getter for total_grade
    public double[] getTotal_grade() {
        return total_grade;
    }

    //setter for total_grade 
    public void setTotal_grade(double[] total_grade) {
        this.total_grade = total_grade;
    }

    // getter for earned_grade
    public double[] getEarned_grade() {
        return earned_grade;
    }

    //setter for earn_grade
    public void setEarned_grade(double[] earned_grade) {
        this.earned_grade = earned_grade;
    }
    

}