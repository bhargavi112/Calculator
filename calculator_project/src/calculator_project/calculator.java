package calculator_project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
public class calculator implements ActionListener{

	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JTextArea textarea=new JTextArea(2,10);

	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	JButton button4=new JButton();
	JButton button5=new JButton();
	JButton button6=new JButton();
	JButton button7=new JButton();
	JButton button8=new JButton();
	JButton button9=new JButton();
	JButton button0=new JButton();

	JButton buttonadd=new JButton();
	JButton buttonsub=new JButton();
	JButton buttonmul=new JButton();
	JButton buttondiv=new JButton();
	JButton buttonclear=new JButton();
	JButton buttondot=new JButton();
	JButton buttonequal=new JButton();

	double num1,num2,result;
	int a=0,s=0,m=0,d=0;

	public calculator() {
	frame.setSize(340,450);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setVisible(true);
	frame.setTitle("Calculator");
	
	frame.add(panel);
	panel.setBackground(Color.LIGHT_GRAY);
	
	panel.add(textarea);
	textarea.setBackground(Color.BLACK);
	Border tborder=BorderFactory.createLineBorder(Color.BLUE,3);
	textarea.setBorder(tborder);
	Font font=new Font("arial",Font.BOLD,33);
	textarea.setFont(font);
	textarea.setForeground(Color.WHITE);

	textarea.setPreferredSize(new Dimension(2,10));
	textarea.setLineWrap(true);

	button0.setPreferredSize(new Dimension(100,40));
	button0.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\zero.png"));

	button1.setPreferredSize(new Dimension(100,40));
	button1.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\one.png"));

	button2.setPreferredSize(new Dimension(100,40));
	button2.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\two.png"));

	button3.setPreferredSize(new Dimension(100,40));
	button3.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\three.png"));

	button4.setPreferredSize(new Dimension(100,40));
	button4.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\four.png"));

	button5.setPreferredSize(new Dimension(100,40));
	button5.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\five.png"));

	button6.setPreferredSize(new Dimension(100,40));
	button6.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\six.png"));

	button7.setPreferredSize(new Dimension(100,40));
	button7.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\seven.png"));

	button8.setPreferredSize(new Dimension(100,40));
	button8.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\eight.png"));

	button9.setPreferredSize(new Dimension(100,40));
	button9.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\nine.png"));

	buttonadd.setPreferredSize(new Dimension(100,40));
	buttonadd.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\add.png"));

	buttonsub.setPreferredSize(new Dimension(100,40));
	buttonsub.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\sub.png"));

	buttonmul.setPreferredSize(new Dimension(100,40));
	buttonmul.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\mul.png"));

	buttondiv.setPreferredSize(new Dimension(100,40));
	buttondiv.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\div.png"));

	buttondot.setPreferredSize(new Dimension(100,40));
	buttondot.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\dot.png"));

	buttonclear.setPreferredSize(new Dimension(100,40));
	buttonclear.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\clear.png"));

	buttonequal.setPreferredSize(new Dimension(100,40));
	buttonequal.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\equal.png"));

	panel.add(button0);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	panel.add(button6);
	panel.add(button7);
	panel.add(button8);
	panel.add(button9);
	panel.add(buttonadd);
	panel.add(buttonsub);
	panel.add(buttonmul);
	panel.add(buttondiv);
	panel.add(buttondot);
	panel.add(buttonequal);
	panel.add(buttonclear);

	button0.addActionListener((ActionListener) this);
	frame.setVisible(true);
	button1.addActionListener((ActionListener) this);
	button2.addActionListener((ActionListener) this);
	button3.addActionListener((ActionListener) this);
	button4.addActionListener((ActionListener) this);
	button5.addActionListener((ActionListener) this);
	button6.addActionListener((ActionListener) this);
	button7.addActionListener((ActionListener) this);
	button8.addActionListener((ActionListener) this);
	button9.addActionListener((ActionListener) this);
	buttonadd.addActionListener((ActionListener) this);
	buttonsub.addActionListener((ActionListener) this);
	buttonmul.addActionListener((ActionListener) this);
	buttondiv.addActionListener((ActionListener) this);
	buttondot.addActionListener((ActionListener) this);
	buttonequal.addActionListener((ActionListener) this);
	buttonclear.addActionListener((ActionListener) this);


}
	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==buttonclear) {
			num1=0.0;
			num2=0.0;
			textarea.setText("");
		}
		if(source==button1) {
			textarea.append("1");
		}
		if(source==button2) {
			textarea.append("2");
		}
		if(source==button3) {
			textarea.append("3");
		}
		if(source==button4) {
			textarea.append("4");
		}
		if(source==button5) {
			textarea.append("5");
		}
		if(source==button6) {
			textarea.append("6");
		}
		if(source==button7) {
			textarea.append("7");
		}
		if(source==button8) {
			textarea.append("8");
		}
		if(source==button9) {
			textarea.append("9");
		}
		if(source==buttondot) {
			textarea.append(".");
		}
		if(source==buttonadd) {
			num1=number_reader();
			textarea.setText("+");
			a=1;
			s=0;
			m=0;
			d=0;
		}
		if(source==buttonsub) {
			num1=number_reader();
			textarea.setText("");
			a=0;
			s=1;
			m=0;
			d=0;
		}
		if(source==buttonmul) {
			num1=number_reader();
			textarea.setText("");
			a=0;
			s=0;
			m=1;
			d=0;
		}
		if(source==buttondiv) {
			num1=number_reader();
			textarea.setText("");
			a=0;
			s=0;
			m=0;
			d=1;
		}
		if(source==buttonequal) {
			num2=number_reader();
			if(a>0) {
				result=num1+num2;
				textarea.setText(Double.toString(result));
			}
			if(s>0) {
				result=num1-num2;
				textarea.setText(Double.toString(result));
			}
			if(m>0) {
				result=num1*num2;
				textarea.setText(Double.toString(result));
			}
			if(d>0) {
				result=num1/num2;
				textarea.setText(Double.toString(result));
			}
			}
		}
		public double number_reader() {
			double n1;
			String s;
			s=textarea.getText();
			n1=Double.valueOf(s);
			return n1;
			}
}	
