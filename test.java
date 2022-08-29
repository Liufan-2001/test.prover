package test;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in); 
		System.out.println("输入x值：");
		int x = aa.nextInt();
		System.out.println ("输入b值：");
		int k =aa.nextInt();
		int y;
		if(x>0 & x<=30) {
			y=(int)Math.pow(Math.sin(x),k);
			System.out.println("输出"+y);
		}
	}
}