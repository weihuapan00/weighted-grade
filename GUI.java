import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI {
    public static final String percentage = "Percentage";
    public static final String total_points = "Total Points";
    public static final String earned_points = "Earned Points";
    public static final String[] columns = {"Percentage","Total Points","Earned Points"};

    public GUI() {

    }

    public static void addARow(JPanel jp){
        jp.add(new JLabel("Percentage"));
        jp.add(new JLabel("Total Points"));
    }

    public static void main(String[] args) {

        JFrame f=new JFrame("Grade Application");//creating instance of JFrame
        f.setSize(800,1000); //800*800 frame

        

        // creating input panel and set the size 
        JPanel input_p = new JPanel();
        input_p.setPreferredSize(new Dimension(400,400));
        input_p.setBorder(BorderFactory.createLineBorder(Color.black));
        input_p.add(new JLabel("Percentage:"));
        input_p.add(new JTextField());
        input_p.add(new JLabel("Total Points:"));
        input_p.add(new JTextField());
        input_p.add(new JLabel("Earned Points:"));
        input_p.add(new JTextField());
        input_p.setLayout(new GridLayout(1,4));
        JButton add = new JButton("Add");
        input_p.add(add);

        //creating view panel and set the size
        JPanel view_p = new JPanel();
        view_p.setLayout(new BorderLayout());
        view_p.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
        view_p.setPreferredSize(new Dimension(400,400));
        JLabel l1 = new JLabel("Percentage:");
        l1.setPreferredSize(new Dimension(40,200));
        JTextField t1 = new JTextField();
        JLabel l2 = new JLabel("Percentage:");
        JTextField t2 = new JTextField(); 
        JLabel l3 = new JLabel("Percentage:");
        JTextField t3 = new JTextField();
        view_p.add(l1);


        //add panel in frame
        f.add(view_p,BorderLayout.NORTH);
        f.add(input_p,BorderLayout.SOUTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        

        }  
} 
