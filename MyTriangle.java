/**
 * @(#)MyTriangle.java
 *
 *
 * @author 
 * @version 1.00 2016/4/27
 */

interface ShapeArea{
	double  getArea();
	double  getPerimeter ();
}
public class MyTriangle implements ShapeArea{
    double x,y,z;
    public double getArea(){
    	double s,area;
    	s=(x+y+z)/2;
    	area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
    	return area;
    }
    public double getPerimeter (){
    	return x+y+z;
    }
    MyTriangle(double x,double y,double z) {
    	this.x=x;
    	this.y=y;
    	this.z=z;
    }
    MyTriangle() {
    	this(3,4,5);
    }
    public String toString(){
    	return "three sides:"+x+","+y+","+z+",perimeter="+getPerimeter()+",area="+getArea();
    }
    
}
class Test{
	public static void main(String args[]){
		MyTriangle t=new MyTriangle();
		System.out.print(t.toString());
	}
}