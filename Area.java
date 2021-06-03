package average;
import java.util.*;
public class Area {
static double pi=3.14;
	public void areaa(int l,int b){
	int x,y;
	int area;
	x=l;
	y=b;
	area=x*y;
	System.out.println("Area of rectangle "+area);
	
	}
	public void areaa(double r){
		double rd;
		double area;
		rd=r;
		area=pi*rd*rd;
		System.out.println("Area of circle  "+area);
	}
	
	public void areaa(int sqr){
		int sqq;
		
		int area;
		sqq=sqr;
		area=sqq*sqq;
		System.out.println("Area of square "+area);
		
	}
		
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		Area a=new Area();
		int l,b;
		double rf;
		int sq;
	System.out.println("Enter length and breadth");
	l=sc.nextInt();
	b=sc.nextInt();
	a.areaa(l, b);
	System.out.println("Enter radius");
	rf=sc.nextDouble();
	a.areaa(rf);
	
	System.out.println("Enter side of square");
	sq=sc.nextInt();
	a.areaa(sq);

	}

}
