import java.util.Arrays;
import java.util.Scanner;
public class MyMain{

    public static void main(String[] args) {
        // create scanner obj
        Scanner sc = new Scanner(System.in);

        //init variable that use in grade class
        double[] total_point = new double[8];
        double[] earn_point = new double[8];
        double[] percentage= new double[8];
        
        //loop 8 times to input 8 assignment from user
        for (int i=0; i<8; i++){
            // print out the prompts for user input
            // and save the value to 3 array: total_point,earned_point, percentage
            System.out.println("Please enter total point: ");
            double total = sc.nextDouble();
            total_point[i] = total;

            System.out.println("Please enter earned point: ");
            double earned = sc.nextDouble();
            earn_point[i] = earned;
    
            System.out.println("Please enter assignment percentage(in float): ");
            double percent = sc.nextDouble();
            percentage[i] = percent;
        }

        

        sc.close();// close scanner

        // test case
        // double[] total_point = {20,30,40,50,60,100,200,300};
        // double[] earn_point = {20,30,40,50,60,100,100,300};
        // double[] percentage = {10, 10, 10, 10, 10, 10, 15, 25};
        
        //init grade obj
        Grade myGrade = new Grade();

        //set all the variable in order to calculate the grade
        myGrade.setEarned_grade(earn_point);
        myGrade.setPercentage(percentage);
        myGrade.setTotal_grade(total_point);

        // calculate the grade
        myGrade.calculateGrade();
        System.out.println(myGrade.toString());

        // test_code printout 3 arrays
        // System.out.println(Arrays.toString(myGrade.getPercentage()));
        // System.out.println(Arrays.toString(myGrade.getTotal_grade()));
        // System.out.println(Arrays.toString(myGrade.getEarned_grade()));

    }
}