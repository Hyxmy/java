/**
 * @(#)bank.java
 *
 *
 * @author ʹ��synchronized��ǣ�ģ���û���ȡ�����
 * @version 1.00 2016/5/31
 */

class Account{
	private String name;
	private double m;
	public Account(String s,double d){
		name=s;
		m=d;
	}
	public String getName(){
		return name;
	}
	public double getMoney(){
		return m;
	}
	public void put(double c){
		m=m+c;
	}
	public void get(double c){
		m=m-c;
	}
}
class Saver extends Thread{
	private Account a;
	private double c;
	public Saver(Account a1,double v){
		a=a1;
		c=v;
	}
	public void run(){
		synchronized(a){
			System.out.print("\n"+a.getName()+"�˻�������"+a.getMoney()+"Ԫ������"+c+"Ԫ��");
			try{ sleep(1); } catch(InterruptedException e){;} //ּ��ǿ�Ʒ����߳��л�
			a.put(c);
			try{ sleep(1); } catch(InterruptedException e){;}
			System.out.print("�������"+a.getMoney()+"Ԫ��");
		}
	}
}
class Fetcher extends Thread{
	private Account a;
	private double q;
	public Fetcher(Account a1,double v){
		a=a1;
		q=v;
	}
	public void run(){
		synchronized(a){
			System.out.print("\n"+a.getName()+"�˻�������"+a.getMoney()+"Ԫ��ȡ��"+q+"Ԫ��");
			try{sleep(1);}catch(InterruptedException e){;}
			a.get(q);
			try{sleep(1);}catch(InterruptedException e){;}
			System.out.print("������"+a.getMoney()+"Ԫ");
		}
	}
}
class bank {
    public static void main(String args[]){
    	Account a=new Account("Amy",200);
    		(new Saver(a,500)).start();
    		(new Fetcher(a,200)).start();
    		(new Fetcher(a,100)).start();
    }
}
