import java.util.Scanner;
public class MyMain{

    public static void main(String[] args) {
        // create scanner obj
        Scanner sc = new Scanner(System.in);

        //create grade obj
        Grade myGrade = new Grade();

        //loop 8 times to input 8 assignment from user
        for (int i=0; i<8; i++){
            // print out the prompts for user input
            System.out.println("Please enter total point: ");
            double total = sc.nextDouble();


            System.out.println("Please enter earned point: ");
            double earned = sc.nextDouble();
    
            System.out.println("Please enter assignment percentage(in float): ");
            double percent = sc.nextDouble();


             
            myGrade.calculateGrade(total,earned,percent);
            System.out.println(myGrade.toString());
            
        }
        // System.out.println("Please enter total point: ");
        // double grade = sc.nextDouble();
        sc.close();// close scanner
        System.out.println(myGrade.toString());
    }
}