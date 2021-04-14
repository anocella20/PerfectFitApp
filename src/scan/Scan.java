package scan;

//Java program to implement
//a Simple Registration Form
//using Java Swingimport javax.swing.*;

import javax.swing.*;
import java.awt.*;
	
public class Scan extends JFrame  {
	
	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel sizeOfArch;
	private JComboBox arch;
	private JLabel sizeofWidth;
	private JComboBox width;
	private JLabel sizeofLength;
	private JComboBox length;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private JRadioButton na;
	private ButtonGroup gengp;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JLabel res;
	private JTextArea resadd;
	  
	private String arches[]
			= { "Normal" , "Flat", "High" };
	
	private String lengths[]
			= { "4", "4.5", "5", "5.5", "6",
	            "6.5", "7", "7.5", "8", "8.5",
	            "9", "9.5", "10", "10.5", "11",
	            "11.5", "12", "12.5", "13" }; 
	 
	private String widths[]
			= { "Slim", "Narrow", "Medium", 
				"Wide", "Extra Wide" };
	
	// constructor, to initialize the components
	// with default values.
	public Scan() {
	        setTitle("Scan Foot Form");
	        setBounds(300, 80, 700, 500);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setResizable(false);
	  
	        c = getContentPane();
	        c.setLayout(null);
	  
	        title = new JLabel("Scan Foot Form");
	        title.setFont(new Font("Arial", Font.PLAIN, 20));
	        title.setSize(300, 30);
	        title.setLocation(300, 30);
	        c.add(title);
	  
	        sizeOfArch = new JLabel("Arch");
	        sizeOfArch.setFont(new Font("Arial", Font.PLAIN, 15));
	        sizeOfArch.setSize(100, 20);
	        sizeOfArch.setLocation(100, 100);
	        c.add(sizeOfArch);
	  
	        arch = new JComboBox(arches);
	        arch.setFont(new Font("Arial", Font.PLAIN, 15));
	        arch.setSize(100, 20);
	        arch.setLocation(200, 100);
	        c.add(arch);
	        
	        sizeofWidth = new JLabel("Width");
	        sizeofWidth.setFont(new Font("Arial", Font.PLAIN, 15));
	        sizeofWidth.setSize(100, 20);
	        sizeofWidth.setLocation(100, 150);
	        c.add(sizeofWidth);
	  
	        width = new JComboBox(widths);
	        width.setFont(new Font("Arial", Font.PLAIN, 15));
	        width.setSize(100, 20);
	        width.setLocation(200, 150);
	        c.add(width);
	  
	        sizeofLength = new JLabel("Length");
	        sizeofLength.setFont(new Font("Arial", Font.PLAIN, 15));
	        sizeofLength.setSize(100, 20);
	        sizeofLength.setLocation(100, 200);
	        c.add(sizeofLength);
	        
	        length = new JComboBox(lengths);
	        length.setFont(new Font("Arial", Font.PLAIN, 15));
	        length.setSize(80, 20);
	        length.setLocation(200, 200);
	        c.add(length);
	        
	        gender = new JLabel("Gender");
	        gender.setFont(new Font("Arial", Font.PLAIN, 15));
	        gender.setSize(100, 20);
	        gender.setLocation(100, 250);
	        c.add(gender);
	  
	        male = new JRadioButton("Male");
	        male.setFont(new Font("Arial", Font.PLAIN, 15));
	        male.setSelected(true);
	        male.setSize(75, 20);
	        male.setLocation(200, 250);
	        c.add(male);
	  
	        female = new JRadioButton("Female");
	        female.setFont(new Font("Arial", Font.PLAIN, 15));
	        female.setSelected(false);
	        female.setSize(80, 20);
	        female.setLocation(275, 250);
	        c.add(female);
	        
	        na = new JRadioButton("Do not want to specify");
	        na.setFont(new Font("Arial", Font.PLAIN, 15));
	        na.setSelected(false);
	        na.setSize(200, 20);
	        na.setLocation(200, 300);
	        c.add(na);
	  
	        gengp = new ButtonGroup();
	        gengp.add(male);
	        gengp.add(female);
	        gengp.add(na);
	        
	        sub = new JButton("Submit");
	        sub.setFont(new Font("Arial", Font.PLAIN, 15));
	        sub.setSize(100, 20);
	        sub.setLocation(150, 400);
	        c.add(sub);
	  
	        reset = new JButton("Reset");
	        reset.setFont(new Font("Arial", Font.PLAIN, 15));
	        reset.setSize(100, 20);
	        reset.setLocation(270, 400);
	        c.add(reset);
	  
	        setVisible(true);
	    }
	    
	}

	class ScanFoot {
	  
		public static void main(String[] args) throws Exception  {
			Scan f = new Scan();
    }
}
