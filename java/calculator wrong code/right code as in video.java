package calc;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class project implements ActionListener {
	JFrame f =new JFrame(); 
	
	JPanel p =new JPanel();
	JTextArea t=new JTextArea(2,10);
  JButton b1=new   JButton("1");
  JButton b2=new   JButton("2");
  JButton b3=new   JButton("3");
  JButton b4 =new   JButton("4");
  JButton b5=new   JButton("5");
  JButton b6=new   JButton("6");
  JButton b7=new   JButton("7");
  JButton b8=new   JButton("8");
  JButton b9=new   JButton("9");
  JButton b0=new   JButton("0");


  JButton badd=new   JButton("+");
  JButton bmul=new   JButton("*");
  JButton bdiv=new   JButton("/");
  JButton bsub=new   JButton("-");
  JButton bclear=new   JButton("C");
  JButton bdot=new   JButton(".");
  JButton bequal=new   JButton("=");
  
  
  
  double number2,number1,result;
  double add=0,mul=0,sub=0,div=0;
	project(){
f.setSize(340, 540);
//helps to close window on click close like windows
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
f.setTitle(" Harshit Calculator ");
//helps to make your farme resizeable maximize and minimise
f.setResizable(true);
//panel adding
Border b =BorderFactory.createLineBorder(Color.RED,4);
Border br =BorderFactory.createLineBorder(Color.RED,2);
//set border of frame blue(color,intesity)
b1.setBorder(br);
b2.setBorder(br);
b3.setBorder(br);
b4.setBorder(br);
b5.setBorder(br);
b6.setBorder(br);
b7.setBorder(br);
b8.setBorder(br);
b9.setBorder(br);
b0.setBorder(br);

badd.setBorder(br);
 bmul.setBorder(br);
 bdiv.setBorder(br);
 bsub.setBorder(br);
 bclear.setBorder(br);
 bdot.setBorder(br);
 bequal.setBorder(br);


p.setBorder(b);
f.add(p);
p.setBackground(Color.ORANGE);
p.add(t);
t.setBackground(Color.black);
//create boarder to add it frame to red 
//Border bk =BorderFactory.createLineBorder(Color.red,3);
//setting border to textarea
//t.setBorder(bk);
//setting border to textArea
Font f1 =new Font("arial",Font.BOLD,33);
//setting font text (type,length//this length decrease or increase size of textarea )
t.setFont(f1);
//setting font to textarea 
t.setForeground(Color.white);
//setting forground color of textarea (means font color which youtype on claculator
t.setPreferredSize(new Dimension(2,10));
//setting size of textarea dimension
b1.setPreferredSize(new Dimension(80,40));
p.add(b1);
b1.setBackground(Color.RED);
b2.setPreferredSize(new Dimension(80,40));
p.add(b2);
b2.setBackground(Color.RED);
b3.setPreferredSize(new Dimension(80,40));
p.add(b3);
b3.setBackground(Color.RED);
b4.setPreferredSize(new Dimension(80,40));
p.add(b4);
b4.setBackground(Color.RED);
b5.setPreferredSize(new Dimension(80,40));
p.add(b5);
b5.setBackground(Color.RED);
b6.setPreferredSize(new Dimension(80,40));
p.add(b6);
b6.setBackground(Color.RED);
b7.setPreferredSize(new Dimension(80,40));
p.add(b7);
b7.setBackground(Color.RED);
b8.setPreferredSize(new Dimension(80,40));
p.add(b8);
b8.setBackground(Color.RED);
b9.setPreferredSize(new Dimension(80,40));
p.add(b9);
b9.setBackground(Color.RED);
b0.setPreferredSize(new Dimension(80,40));
p.add(b0);
b0.setBackground(Color.RED);
p.add(bdot);
bdot.setBackground(Color.RED);
bdot.setPreferredSize(new Dimension(80,40));

p.add(bmul);
bmul.setPreferredSize(new Dimension(80,40));
bmul.setBackground(Color.RED);

p.add(badd);
badd.setPreferredSize(new Dimension(80,40));
badd.setBackground(Color.RED);

p.add(bdiv);
bdiv.setPreferredSize(new Dimension(80,40));
bdiv.setBackground(Color.RED);



p.add(bsub);
bsub.setPreferredSize(new Dimension(80,40));
bsub.setBackground(Color.RED);


p.add(bequal);
bequal.setPreferredSize(new Dimension(165,40));
bequal.setBackground(Color.RED);
p.add(bclear);
bclear.setPreferredSize(new Dimension(80,40));
bclear.setBackground(Color.RED);
b1.addActionListener((ActionListener) this);
b2.addActionListener((ActionListener) this);
b3.addActionListener((ActionListener) this);
b4.addActionListener((ActionListener) this);
b5.addActionListener((ActionListener) this);
b6.addActionListener((ActionListener) this);
b7.addActionListener((ActionListener) this);
b8.addActionListener((ActionListener) this);
b9.addActionListener((ActionListener) this);
b0.addActionListener((ActionListener) this);
bdot.addActionListener((ActionListener) this);
bdiv.addActionListener((ActionListener) this);
badd.addActionListener((ActionListener) this);
bmul.addActionListener((ActionListener) this);
bsub.addActionListener((ActionListener) this);	
bequal.addActionListener((ActionListener) this);
bclear.addActionListener((ActionListener) this);	
	}  
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source==bclear) {
		number1=0.0;
		number2=0.0;
		t.setText(" ");
		}
		if(source==b1) {
		t.append("1");
		}
		if(source==b2) {
		t.append("2");
		}
		if(source==b3) {
		t.append("3");
		}
		if(source==b4) {
		t.append("4");
		}
		if(source==b5) {
		t.append("5");
		}
		if(source==b6) {
		t.append("6");
		}
		if(source==b7) {
		t.append("7");
		}
		if(source==b8) {
		t.append("8");
		}
		if(source==b9) {
		t.append("9");
		}
		if(source==b0) {
		t.append("0");
		}
		if(source==bdot) {
		t.append(".");
		}
		if(source==badd) {
		number1=number_reader();
		t.setText("");
		add = 1;
		div = 0;
		mul = 0;
		sub = 0;
		}
		if(source==bdiv) {
		number1=number_reader();
		t.setText("");
		add = 0;
		div = 1;
		mul = 0;
		sub = 0;
		}
		if(source==bsub) {
		number1=number_reader();
		t.setText("");
		add = 0;
		div= 0;
		mul = 0;
		sub = 1;
		}
		if(source==bmul) {
		number1=number_reader();
		t.setText("");
		add = 0;
		div = 0;
		mul = 1;
		sub = 0;
		}
		if(source==bequal) {
		number2=number_reader();
		if(add>0) {
		result = number1+number2;
		t.setText(Double.toString(result));
		}
		if(div>0) {
		result = number1/number2;
		t.setText(Double.toString(result));
		}
		if(mul>0) {
		result = number1*number2;
		t.setText(Double.toString(result));
		}
		if(sub>0) {
		result = number1-number2;
		t.setText(Double.toString(result));
		}
		}
		}
		public double number_reader(){
		double num1;
		String s;
		s=t.getText();
		num1=Double.valueOf(s);
		return num1;

		}
		}