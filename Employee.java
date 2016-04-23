package Employee;

public abstract class Employee {
	public abstract double earnings();    //抽象方法，不能有方法体
}
class YearWorker extends Employee{
	int year;
	YearWorker(){
		year=1;
	}
	public double earnings(){
		return year*1200;
	}
	
}
class MonthWorker extends Employee{
	int month;
	MonthWorker(){
		month=12;
	}
	public double earnings(){
		return month*100;
	}
}
class WeekWorker extends Employee{
	int week;
	WeekWorker(){
		week=48;
	}
	public double earnings(){
		return week*25;
	}
}
class Company{
	private Employee employee[];
	Company(Employee e[]){
		this.employee=e;
	}
	public double salaryPay(){
		double all=0;
		double count=0;
		for(int j=0;j<employee.length;j++){
			if(employee[j] instanceof WeekWorker){
				count=employee[j].earnings();
			}
			else if(employee[j] instanceof YearWorker){
				count=employee[j].earnings();
			}
			else if(employee[j] instanceof MonthWorker){
				count=employee[j].earnings();
			}
			all=all+count;
		}
		return all;
	}
} 
class Test{
	public static void main(String[] args){
		Employee[] employ=new Employee[20];
      for(int i=0;i<employ.length;i++)
          { if(i%3==0)
             employ[i]=new WeekWorker();
            else if(i%3==1)
             employ[i]=new MonthWorker();
            else if(i%3==2)
             employ[i]=new YearWorker();
           }
      Company comp=new Company(employ);
      System.out.println("公司年工资总额:"+comp.salaryPay());
         }
}
