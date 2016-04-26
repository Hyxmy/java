/**
 * @(#)yanghui.java
 *
 *
 * @author 
 * @version 1.00 2016/3/16
 */


public class yanghui {

    public static void main(String[] args) {
    	int triangle[][]=new int[6][];
    	for(int i=0;i<triangle.length;i++){
    		triangle[i]=new int[i+1];
    		for(int j=0;j<i+1;j++){
    			if(i==0||j==0||j==i){
    				triangle[i][j]=1;
    			}else{
    				triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
    			}
    			System.out.print(triangle[i][j]+"\t");
    		}
    		System.out.println();
    	}
    }
    
    
}