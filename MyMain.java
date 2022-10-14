import java.util.Scanner;
import java.util.stream.Stream;
public class MyMain{

    public static void main(String[] args) {
        // create scanner obj
        Scanner sc = new Scanner(System.in);

        double[] percentage;
        System.out.println("Please enter the number of assignment: ");
        int size = sc.nextInt(); // get next int
        sc.nextLine(); // get new line
        String line;

        //init grade obj
        Grade myGrade = new Grade();
        myGrade.setSize(size);

        while(true){
            // READ PERCENTAGE
            System.out.println("Please enter the percentage of each assignments(as array): ");
            System.out.println("Format Example: [1,2,3,4]");
            // get new line
            line = sc.nextLine();
            // replace [ and ] by ""
            line = line.replaceAll("\\[|\\]", "");
            // parse the string to double and store them in array
            percentage = Stream.of(line.split(","))
                                        .mapToDouble(s -> Double.parseDouble(s))
                                        .toArray();
            if(myGrade.setPercentage(percentage)){//if not add up to 100 do it again
                break;
            }
        }
        


        //READ TOTAL POINTS
        System.out.println("Please enter the total possible points of each assignments(as array): ");
        System.out.println("Format Example: [1,2,3,4]");

        //read next line
        line = sc.nextLine();
        // replace [ and ] by ""
        line = line.replaceAll("\\[|\\]", "");
        // parse the string to double and store them in array
        double[] total_point = Stream.of(line.split(","))
                                    .mapToDouble(s -> Double.parseDouble(s))
                                    .toArray();

        //READ EARNED POINTS
        System.out.println("Please enter the earn points of each assignments(as array): ");
        System.out.println("Format Example: [1,2,3,4]");

        //read next line
        line = sc.nextLine();
        // replace [ and ] by ""
        line = line.replaceAll("\\[|\\]", "");
        // parse the string to double and store them in array
        double[] earn_point = Stream.of(line.split(","))
                                    .mapToDouble(s -> Double.parseDouble(s))
                                    .toArray();
        
        sc.close();// close scanner

        // test case
        // double[] total_point = {20,30,40,50,60,100,200,300};
        // double[] earn_point = {20,30,40,50,60,100,100,300};
        // double[] percentage = {10, 10, 10, 10, 10, 10, 15, 25};
        
        

        
        
        
        //set all the variable in order to calculate the grade
        myGrade.setEarned_grade(earn_point);
        myGrade.setTotal_grade(total_point);

        // calculate the grade
        myGrade.calculateGrade();
        System.out.println(myGrade.toString());

        // //test_code printout 3 arrays
        // System.out.println(myGrade.getPercentage());
        // System.out.println(myGrade.getTotal_grade());
        // System.out.println(myGrade.getEarned_grade());

    }
}