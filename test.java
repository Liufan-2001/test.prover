package test;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in); 
		System.out.println("����xֵ��");
		int x = aa.nextInt();
		System.out.println ("����bֵ��");
		int k =aa.nextInt();
		int y;
		if(x>0 & x<=30) {
			y=(int)Math.pow(Math.sin(x),k);
			System.out.println("���"+y);
		}
	}
}