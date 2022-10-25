import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI extends JFrame{
    
    GUI(){
        // set up the frame default constraint 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800,800));

        //create label and textfield for percentage input
        JLabel l1 = new JLabel("percentage: ");
        l1.setBounds(100,100,100,50);
        JTextField t1 = new JTextField(10);
        t1.setBounds(200,100,100,50);

        //create label and textfield for total_points input
        JLabel l2 = new JLabel("Total Points: ");
        l2.setBounds(400,100,100,50);
        JTextField t2 = new JTextField(10);
        t2.setBounds(500,100,100,50);

        //create label and textfield for earned_points input
        JLabel l3 = new JLabel("Earned Points: ");
        l3.setBounds(100,300,100,50);
        JTextField t3 = new JTextField(10);
        t3.setBounds(200,300,100,50);

        // add all labels and textfield to frame
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(t1);
        this.add(t2);
        this.add(t3);


       // create label and textfield for weighted_grade to frame
        JLabel l4  = new JLabel("Weighted Grade: ");
        l4.setBounds(350,600,100,50);
        JTextField t4 = new JTextField(10);
        t4.setEditable(false);
        t4.setBounds(350,650,100,50);
        this.add(l4);
        this.add(t4);

        // create the button that calculate the grade and add it to frame
        Button b = new Button("Calculate Grade");
        b.setBounds(500,300,100,50);
        b.setBackground(Color.red);
        b.addActionListener( (e) -> {
            String str_t1 = t1.getText();
            String str_t2 = t2.getText();
            String str_t3 = t3.getText();
            double d1  = Double.parseDouble(str_t1);
            double d2  = Double.parseDouble(str_t2);
            double d3  = Double.parseDouble(str_t3);
            Grade1 grade = new Grade1(d2,d3,d1);
            grade.calculateGrade();
            t4.setText(String.valueOf(grade.getGrade()));
        });
        this.add(b);

        this.pack();
        this.setVisible(true);//make the frame visible
    }
    
    public static void main(String[] args){
        new GUI();
    }

        
} 