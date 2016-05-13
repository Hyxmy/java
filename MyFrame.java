/**
 * @(#)MyFrame.java
 *
 *一个简单登录界面，已监听窗体事件
 * @author 
 * @version 1.00 2016/5/4
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class aFrame extends JFrame implements ActionListener,WindowListener{
	private Label name,password,a;
	private JTextField name1;
	private JPasswordField password1;
	private JButton ok,cancel;
    public aFrame() {
    super("登录界面");
    setLayout(new FlowLayout());
    setSize(400,100);
    setLocation(300,300);
    setBackground(Color.lightGray);
    name = new Label("用户名：");
    add(name);
    name1 = new JTextField("123");
    add(name1);
    password = new Label("密码：");
    add(password);
    password1 = new JPasswordField("123123");
    add(password1);
    ok = new JButton("确定");
    add(ok);
    cancel = new JButton("取消");
    add(cancel);
    add(new Label(" "));
    a = new Label(" ");
    add(a);
    setVisible(true);
    ok.addActionListener(this);
    cancel.addActionListener(this); 
    addWindowListener(this);
    }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==cancel)System.exit(0);
    	if(e.getActionCommand().equals("确定")){
    		String keyText= new String(password1.getPassword());
    		if(name1.getText().equals("123") && keyText.equals("123123"))
    			a.setText("欢迎你，123");
    		else
    			a.setText("用户名或密码错误！");
    		setVisible(true);
    	}
    }
    public void windowClosing(WindowEvent e){System.exit(0);
    }
    public void windowOpened(WindowEvent e){;}
    public void windowActivated(WindowEvent e){;}
    public void windowDeactivated(WindowEvent e){;}
    public void windowClosed(WindowEvent e){;}
    public void windowIconified(WindowEvent e){;}
    public void windowDeiconified(WindowEvent e){;}
    public static void main(String[] args){
    	aFrame A=new aFrame();
    	
    }
    
}
