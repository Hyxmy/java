import java.io.*; 
import java.util.Scanner; 
class LinkedList implements Serializable {  
    public LinkedList(){ 
    	//借助输入创建链表，无需补充; 
    	}  
    public void showInfo(){
    	//从头至尾打印链表各结点值，无需补充;
    	} 
} 
class App{  
    public static void main (String[] args) throws Exception{   
    	LinkedList L,newL; L=new LinkedList();
    	//假设输入1 2 3 4 -1   
    	System.out.print("序列化前，链表为："); 
    	L.showInfo();   
    	System.out.print("\n序列化……");       
    	/* 请将链表L借助序列化机制写入文件L.dat */ 
    	FileOutputStream fo=new FileOutputStream("L.dat");
        ObjectOutputStream obj_o=new ObjectOutputStream(fo);
        obj_o.writeObject(L); 
        obj_o.close();
	   
    	/* 请借助反序列化机制将文件L.dat中的链表复原，表头名称为newL */
    	FileInputStream fi=new FileInputStream("L.dat");
        ObjectInputStream obj_i=new ObjectInputStream(fi); 
        LinkedList new_L=(LinkedList)obj_i.readObject();
        obj_i.close();
  
    	System.out.print("反序列化后，链表为："); 
    	new_L.showInfo();  
    } 
} 