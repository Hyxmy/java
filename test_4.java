import java.io.*; 
import java.util.Scanner; 
class LinkedList implements Serializable {  
    public LinkedList(){ 
    	//�������봴���������貹��; 
    	}  
    public void showInfo(){
    	//��ͷ��β��ӡ��������ֵ�����貹��;
    	} 
} 
class App{  
    public static void main (String[] args) throws Exception{   
    	LinkedList L,newL; L=new LinkedList();
    	//��������1 2 3 4 -1   
    	System.out.print("���л�ǰ������Ϊ��"); 
    	L.showInfo();   
    	System.out.print("\n���л�����");       
    	/* �뽫����L�������л�����д���ļ�L.dat */ 
    	FileOutputStream fo=new FileOutputStream("L.dat");
        ObjectOutputStream obj_o=new ObjectOutputStream(fo);
        obj_o.writeObject(L); 
        obj_o.close();
	   
    	/* ����������л����ƽ��ļ�L.dat�е�����ԭ����ͷ����ΪnewL */
    	FileInputStream fi=new FileInputStream("L.dat");
        ObjectInputStream obj_i=new ObjectInputStream(fi); 
        LinkedList new_L=(LinkedList)obj_i.readObject();
        obj_i.close();
  
    	System.out.print("�����л�������Ϊ��"); 
    	new_L.showInfo();  
    } 
} 