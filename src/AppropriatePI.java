import java.util.Random;
import java.util.Scanner;

public class AppropriatePI {
	Random random = new Random();

	public static void main(String args[]) {
	System.out.println(Driver.approximatePII(100000));
	}
}

class Driver{
	//1
	//2
	public static boolean isPositive(int a) {
		boolean positive = false;
		if(a>0) {
			positive = true;
		}
		return positive;
	}
	
	//3
	public static boolean isOdd(int a) {
		boolean odd = false;
		if(a%2 != 0) {
			odd= true;
		}
		return odd;
	}
	
	//4
	public static int getMax(int a, int b) {
		if(a>b) {
			return a;
		}
		return b;
	}
	
	 //5
	
	//6
	static
	Random random = new Random();
	
	public static int rollDice(){
		
		int x =  random.nextInt(7)+1;
		return x;	
	}
	
	//7
	public static int rollDice (int numFaces) {
		int x =  random.nextInt(numFaces)+1;
		return x;	
		
	}
	
	//8
	public static String capitalizeFirst (String name) {
		String first = name.substring(0,1);
		first = first.toUpperCase();
		return first;
	}
	
	
	//9
	public static double circleArea(double radius) {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
		
	}
	
	//10
	public static boolean isMulitple (int a, int b) {
		boolean multiple = false;
		if(b%a ==0) {
			multiple = true;
		}
		return multiple;
	}
	
	//11
	
	//12
	
	public static String convertTime(double time, boolean isMinutes) {
		double x =0;
		if(isMinutes==true) {
			x = time* 60.0;
		}
		else 
		{
			x = time/60.0;
		}
		return "abcd";
	}
	
	//13
	public static void printDiagnol (String s) {
		for(int i =0; i<s.length(); i++) {
			for(int j = 0; j<s.length(); j++) {
				if(j==i) {
					System.out.println(s.substring(i, i+1));
					
				}
				else {
					System.out.println(" ");
				}
			}
		}
	}
	
	//14
	
	//Approximate Pi app
	public static double approximatePI(int nums) {
		double sum = 0.0;
	for (int i=1;i<=nums+1;i=i+2) {
		double myNum = 1/i;
		System.out.print(myNum+"  ");
	    sum = sum+ myNum;
	}
		double ans = 4*sum;
		return ans;
		
	}
	
	
	public static double approximatePII(int nums) {
		double sum = 0.0;
		double myNum =0.0;
		int x = 0;
	for (int i=1;i<=2*nums-1;i=i+2) {
		if( x%2 ==  0) {
			
		 myNum = (1.0/i);
		}
		else 
		 myNum =  -(1.0/i);
	
	//System.out.print(myNum+"  ");
	    sum = sum+ myNum;
	   // System.out.println(x);
	    x++;
	    
	}
		//System.out.println("sum="+sum);
		
		return sum*4;
	}
	}	

