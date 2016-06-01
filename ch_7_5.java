/**
 * @(#)ch_7_5.java
 *
 *
 * @author 
 * @version 1.00 2016/5/31
 */

class D{
	int x;
}
class A extends Thread{
	D d;
	public A(D d1){
		d=d1;
	}
	public void run(){
		synchronized (d){
			for(int i=1;i<5;i++){
				d.x=i;try{
					sleep(1);
				}catch(InterruptedException e){
					;
				}
			}
		}
	}
}
class B extends Thread{
	D d;
	public B(D d1){
		d=d1;
	}
	public void run(){
			synchronized (d){
		for(int i=1;i<5;i++){
		 System.out.print(d.x+"=");
		 try{
					sleep(1);
				}catch(InterruptedException e){
					;
				}
		}}
	}
}
class ch_7_5 {
	public static void main (String[] args){
		D d=new D();
		new A(d).start();
		new B(d).start();
	}
    
    
}