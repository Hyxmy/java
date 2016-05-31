/**
 * @(#)bank.java
 *
 *
 * @author 使用synchronized标记，模拟用户存取款操作
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
			System.out.print("\n"+a.getName()+"账户：现有"+a.getMoney()+"元，存入"+c+"元，");
			try{ sleep(1); } catch(InterruptedException e){;} //旨在强制发生线程切换
			a.put(c);
			try{ sleep(1); } catch(InterruptedException e){;}
			System.out.print("现有余额"+a.getMoney()+"元。");
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
			System.out.print("\n"+a.getName()+"账户：现有"+a.getMoney()+"元，取出"+q+"元，");
			try{sleep(1);}catch(InterruptedException e){;}
			a.get(q);
			try{sleep(1);}catch(InterruptedException e){;}
			System.out.print("现有余额："+a.getMoney()+"元");
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
