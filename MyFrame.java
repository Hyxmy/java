/**
 * @(#)MyFrame.java
 *
 *һ���򵥵�¼���棬δ���������¼�
 * @author 
 * @version 1.00 2016/5/4
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener{
	private Label name,password,a;
	private JTextField name1;
	private JPasswordField password1;
	private JButton ok,cancel;
    public MyFrame() {
    super("��¼����");
    setLayout(new FlowLayout());
    setSize(400,100);
    setLocation(300,300);
    setBackground(Color.lightGray);
    name = new Label("�û�����");
    add(name);
    name1 = new JTextField("123");
    add(name1);
    password = new Label("���룺");
    add(password);
    password1 = new JPasswordField("123123");
    add(password1);
    ok = new JButton("ȷ��");
    add(ok);
    cancel = new JButton("ȡ��");
    add(cancel);
    add(new Label(" "));
    a = new Label(" ");
    add(a);
    setVisible(true);
    ok.addActionListener(this);
    cancel.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==cancel)System.exit(0);
    	if(e.getActionCommand().equals("ȷ��")){
    		String keyText= new String(password1.getPassword());
    		if(name1.getText().equals("123") && keyText.equals("123123"))
    			a.setText("��ӭ�㣬123");
    		else
    			a.setText("�û������������");
    		setVisible(true);
    	}
    }
    public static void main(String[] args){
    	MyFrame A=new MyFrame();
    	
    }
    
}