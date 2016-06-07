/**
 * @(#)Crossroads.java
 *
 *
 * @author 
 * @version 1.00 2016/6/7
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Crossroads extends JFrame implements ActionListener{

    private JButton h,z;
    private Panel p1,p2;
    private Label[] l=new Label[47];
    String str;
    public Crossroads() {
    	super("交通灯示例");
    	setLocation(300,200);
    	setSize(400,300);
    	p1=new Panel();
    	h=new JButton("横向通行");
    	z=new JButton("纵向通行");
    	p1.add(h);
    	p1.add(z);
    	p1.setLayout(new FlowLayout(FlowLayout.LEFT));
    	add(p1,BorderLayout.NORTH);
    	p2=new Panel();
    	p2.setLayout(new GridLayout(8,6));
    	for(int i=0;i<l.length;i++){
    		l[i]=new Label("");
    		p2.add(l[i]);
    	}
    	add(p2,BorderLayout.CENTER);
    	h.addActionListener(this);
    	z.addActionListener(this);
    	this.addWindowListener(new A());
    	this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource() == h){
    		l[24].setBackground(Color.green);
    		l[25].setBackground(Color.green);
    		l[26].setBackground(Color.green);
    		l[27].setBackground(Color.green);
    		l[28].setBackground(Color.green);
    		l[29].setBackground(Color.green);
    		l[3].setBackground(Color.red);
    		l[9].setBackground(Color.red);
    		l[15].setBackground(Color.red);
    		l[21].setBackground(Color.red);
    		l[33].setBackground(Color.red);
    		l[39].setBackground(Color.red);
    		l[45].setBackground(Color.red);
    		h.setEnabled(false);
    		z.setEnabled(true);
    		}else if(e.getSource() == z){
    		l[24].setBackground(Color.red);
    		l[25].setBackground(Color.red);
    		l[26].setBackground(Color.red);
    		l[27].setBackground(Color.green);
    		l[28].setBackground(Color.red);
    		l[29].setBackground(Color.red);
    		l[3].setBackground(Color.green);
    		l[9].setBackground(Color.green);
    		l[15].setBackground(Color.green);
    		l[21].setBackground(Color.green);
    		l[33].setBackground(Color.green);
    		l[39].setBackground(Color.green);
    		l[45].setBackground(Color.green);
    		z.setEnabled(false);
    		h.setEnabled(true);
    		}
    }
    class A extends WindowAdapter{
 	 	public void windowClosing(WindowEvent e)
 	 	{
 	 		System.exit(0);
 	 	}
 	 }	
    
}
class Test{
	public static void main(String args[]){
		new Crossroads();
	}
}