package registration;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2;
	JRadioButton male,female,transgender;
	JComboBox day,month,year;
	JTextArea ta1;
	JCheckBox cb;
	JButton submit;
	JLabel msg;
	JTextArea screen;
	
	Myframe(){
		setTitle("REGISTRATION FORM");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(850,500);
		Container c =getContentPane();
		c.setLayout(null);
		c.setBackground(Color.magenta);
		
		l6=new JLabel("WELCOEME , FILL YOUR DEATILS DOWN");
		l6.setBounds(300,10,400,30);
		c.add(l6);
		
		l1 =new JLabel("Name");
	    l1.setBounds(30, 50, 100, 30);
	    c.add(l1);
	    
	    t1=new JTextField();
	    t1.setBounds(150, 50, 300, 30);
	    c.add(t1);
	    
	    l2 =new JLabel("Mobile Number");
	    l2.setBounds(30, 90, 300, 30);
	    c.add(l2);
	    
	    t2=new JTextField();
	    t2.setBounds(150, 85, 300, 30);
	    c.add(t2);
	    
	    
	    l3 =new JLabel("Gender");
	    l3.setBounds(30, 150, 300, 30);
	    c.add(l3);
	    
	    male=new JRadioButton("Male");
	    female=new JRadioButton("Female");
	    transgender =new JRadioButton("Transgender");
	    male.setBounds(150, 150, 100, 30);
	    c.add(male);
	    female.setBounds(260, 150, 100, 30);
	    c.add(female);	    
	    transgender.setBounds(370, 150, 100, 30);
	    c.add(transgender);
	    male.setSelected(true);
	    ButtonGroup bg=new ButtonGroup();
	    bg.add(male);
	    bg.add(female);
	    bg.add(transgender);
	
	    
	   
	    l4 =new JLabel("Date Of Birth");
	    l4.setBounds(30, 200, 300, 30);
	    c.add(l4);
	    
	    String days[]={"1","2","3","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18"};
	    String months[]={"1","2","3","3","4","5","6","7","8","9","10","11","12"};
	    String years[]={"2021","2020","2019","2018","2017","2016","2015","2014","2013","2001"};
	    day= new JComboBox(days);
	    month= new JComboBox(months);
	    year= new JComboBox(years);
	    
	    day.setBounds(150, 205, 60, 20);
	    c.add(day);
	    
	    month.setBounds(220, 205, 60, 20);
	    c.add(month);
	    
	    year.setBounds(300, 205, 60, 20);
	    c.add(year);

	    
	    l5 =new JLabel("Address");
	    l5.setBounds(30, 250, 300, 30);
	    c.add(l5);
	    
	    ta1=new JTextArea();
	    ta1.setBounds(150,240,300,70);
	    c.add(ta1);
	    
	    cb=new JCheckBox("i agree the terms and conditions");
	    cb.setBounds(30,350, 300, 30);
	    c.add(cb);
	    
	    submit =new JButton("Submit");
	    submit.setBounds(100,400,100,30);
	    c.add(submit);
	    
	    submit.addActionListener(this);
	    
	    screen=new JTextArea();
	    screen.setBounds(500,50,250,400);
	    c.add(screen);
	
	    msg=new JLabel("");
	    msg.setBounds(30,440,300,20);
	    c.add(msg);
	    
	    
	    
		setVisible(true);	
		
	}
	public void actionPerformed(ActionEvent e) {
		if(cb.isSelected()) {
			msg.setText("registration successful!!");
			
			String Name =t1.getText();
			String MobileNumber =t2.getText();
			String Gender ="male";
			if(female.isSelected()) {
				Gender="female";
				
			}else Gender="transgander";
			String DateOfBirth=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
			String Address=ta1.getText();
			
			screen.setText("Name         : "+Name+"\n\n"+
			               "MobileNumber : "+MobileNumber+"\n\n"+
			               "Gender       : "+Gender+"\n\n"+
			               "DateOFBirth  : "+DateOfBirth+"\n\n"+
			               "Address      : "+Address);
			               
			
		}
		
	}
}


public class reg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Myframe f=new Myframe();
	}

}
