/**
 * @(#)Student.java
 *
 *
 * @author 
 * @version 1.00 2016/3/30
 */


public class Student {
	int id,age;
    String name,sex;
    int getId(){
    	return id;
    }
    String getName(){
    	return name;
    }
    int getAge(){
    	return age;
    }
    String getaSex(){
    	return sex;
    }
    Student (){
    	id=66;
    	name="XMY";
    	age=20;
    	sex="Ů";
    	}
   public int setAge (int n){
   	age=n;
   	return age;
   }
   public String printInfo(){
   	System.out.println(id+" "+name+" "+sex+" "+age);
    return id+" "+name+" "+sex+" "+age;
  }
  public static void main(String[] args){
    	Student t1=new Student();
    	t1.printInfo();
    	t1.setAge(18);
    	t1.printInfo();
    }



}