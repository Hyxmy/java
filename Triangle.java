package text1;

public class Triangle {
	int a,b,c,ah,bh,ch;
	private Triangle(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	private Triangle(int w,int h){
		this.a=w;
		this.ah=h;
	}
	private Triangle(){
		this.a=0;
		this.b=0;
		this.c=0;
	}
	private double getArea(int a,int b,int c){
		double area,s;
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
		return area;
	}
	private double getArea(int a,int b){
		double area;
		area=a*b*1/2;
		System.out.println(area);
		return area;
	}
	public static Triangle creatTriangle(int a,int b,int c){
		if(a+b>c && b+c>a && a+c>b && a!=0 && b!=0 && c!=0)
			return new Triangle(a,b,c);
		else{
			System.out.println("非法输入！");
			return null;
		} 
	}
	public static Triangle creatTriangle(int a,int b){
		if(a>0 && b>0){
			return new Triangle(a,b);}
		else{
			System.out.println("非法输入！");
			return null;
		} 
	}
	public static void main(String[] args){
		Triangle m=Triangle.creatTriangle(2,3);
		Triangle n=Triangle.creatTriangle(0,1);
		m.getArea(2,3);
		System.out.println(m.a);
		System.out.println(m.ah);
	}
}
