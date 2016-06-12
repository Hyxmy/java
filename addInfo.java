package text1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class addInfo extends JFrame implements ActionListener,ItemListener{

    private JTextArea t_info;
    private JTextField t_name;
    private Label l_id,l_f,l_m;
    private JButton add;
    private JComboBox ps,pc;
    private ButtonGroup sex;
    private JRadioButton f,m;
    private Panel p,p1;
    public addInfo() {
    	super("输入用户信息");
    	setLocation(300,200);
    	setSize(400,250);
    	setLayout(new GridLayout(1,2));
    	t_info=new JTextArea("");
    	add(t_info);
    	p=new Panel();
    	p.setLayout(new GridLayout(6,1));
    	int i=1;
    	String s = "" + i;
    	l_id=new Label(s);
    	p.add(l_id);
    	t_name=new JTextField("姓名");
    	p.add(t_name);
    	p1=new Panel();
    	sex=new ButtonGroup();
    	m=new JRadioButton("男",true);
    	f=new JRadioButton("女");
    	sex.add(f);
    	sex.add(m);
    	p1.add(m);
    	p1.add(f);
    	p.add(p1);
    	String provinces[]={"江西省","湖南省","湖北省","浙江省"};
    	ps=new JComboBox(provinces);
    	p.add(ps);
    	String city1[]={"南昌市","宜春市","九江市","新余市"};
    	pc=new JComboBox(city1);
    	p.add(pc);
    	add=new JButton("添加");
    	p.add(add);
    	add(p);
    	ps.addItemListener(this);
    	add.addActionListener(this);
    	this.addWindowListener(new A());
    	setVisible(true);
    	
    }
    public void itemStateChanged(ItemEvent e){
    	String city1[]={"南昌市","宜春市","九江市","新余市"};
    	String city2[]={"长沙市","株洲市","湘潭市","衡阳市"};
    	String city3[]={"武汉市","黄石市","宜昌市","荆门市"};
    	String city4[]={"温州市","嘉兴市","金华市","绍兴市"};
    	if(e.getStateChange()==1){
    		pc.removeAllItems();
    		if(ps.getSelectedItem().equals("江西省")){
    			for(int i=0;i<city1.length;i++){
    				pc.addItem(city1[i]);
    			}
    			
    		}
    		if(ps.getSelectedItem().equals("湖南省")){
    			for(int i=0;i<city2.length;i++){
    				pc.addItem(city2[i]);
    			}
    			
    		}
    		if(ps.getSelectedItem().equals("湖北省")){
    			for(int i=0;i<city3.length;i++){
    				pc.addItem(city3[i]);
    			}
    			
    		}
    		if(ps.getSelectedItem().equals("浙江省")){
    			for(int i=0;i<city4.length;i++){
    				pc.addItem(city4[i]);
    			}
    			
    		}
    	}
    }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==add){
    		if(f.isSelected()){
    			String info=t_info.getText();
    			t_info.setText(info+""+l_id.getText()+","+t_name.getText()+",女,"+ps.getSelectedItem()+","+pc.getSelectedItem()+"\n");
    			
    		}else{
    			String info=t_info.getText();
    			t_info.setText(info+""+l_id.getText()+","+t_name.getText()+",男,"+ps.getSelectedItem()+","+pc.getSelectedItem()+"\n");
    			
    		}
    		
    		String n=l_id.getText();
    		int m = Integer.parseInt(n);
    		m++;
    		String id = "" + m;
    		l_id.setText(id);
    		t_name.setText("");
    	}
    }
    class A extends WindowAdapter{
 	 	public void windowClosing(WindowEvent e)
 	 	{
 	 		System.exit(0);
 	 	}
 	 }	
    
}

class T{
	public static void main (String args[]){
		new addInfo();
	}
}
