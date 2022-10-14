
import java.util.LinkedList;

public class Grade{
    // initialize the variable in the class
    private double grade; //total weight grade

    //getter for weighted grade
    public double getGrade() {
        return grade;
    }

    private int size; // initit 
    

    private LinkedList<Double> percentage = new LinkedList<>();
    private LinkedList<Double> total_grade = new LinkedList<>();;
    private LinkedList<Double> earned_grade = new LinkedList<>();;

    // default constructor
    public Grade(){
    }

    // quick constructor that set percentage[], total_grade[], earned_grade[]
    public Grade(int length, double[] percentage, double[] total_grade, double[] earned_grade){
        setSize(length);
        setPercentage(percentage);
        setTotal_grade(total_grade);
        setEarned_grade(earned_grade);
    }

    //calculate the grade in one assignment and add to the total grade
    public void calculateGrade(){
        double temp = 0;
        for(int i=0; i< this.size; i++ ){
            temp +=  this.earned_grade.get(i) / this.total_grade.get(i) * this.percentage.get(i);
        }
        setGrade(temp);
    }

    /* toString method print out the data Grade class stored,
     and calculate the total weight grade.*/ 
    public String toString(){
        String toReturn = "";
        toReturn += "Total weight grad now: " + grade + "\n";
        toReturn += "Grade_level:" + grade_level() + "\n";
        return toReturn;
        
    }

    // calculate the letter grade base on grade
    public String grade_level(){
        if (grade >= 90){
            return "A";
        }else if (grade>=80){
            return "B";
        }else if (grade>=70){
            return "C";
        }else if (grade >= 60){
            return "D";
        }else{
            return "F";
        }
    }



    //setter for grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    //getter for percentage
    public LinkedList<Double> getPercentage() {
        return percentage;
    }

    //setter for percentage
    public void setPercentage(double[] percentage) {
        this.percentage.clear();
        for( double d: percentage){
            this.percentage.add(Double.valueOf(d));
        }
    }

    //getter for total_grade
    public LinkedList<Double> getTotal_grade() {
        return total_grade;
    }

    //setter for total_grade 
    public void setTotal_grade(double[] total_grade) {
        this.total_grade.clear();
        for( double d: total_grade){
            this.total_grade.add(Double.valueOf(d));
        }
    }

    // getter for earned_grade
    public LinkedList<Double> getEarned_grade() {
        return earned_grade;
    }

    //setter for earn_grade
    public void setEarned_grade(double[] earned_grade) {
        this.earned_grade.clear();
        for( double d: earned_grade){
            this.earned_grade.add(Double.valueOf(d));
        }
    }

    //getter for array size
    public int getSize() {
        return size;
    }

    //setter for array size
    public void setSize(int size) {
        this.size = size;
    }

}