package test;

public class test5 {
	public int test51(int x,int k,int y){
		if(x>0 & x<=30) {
		y=(int)Math.pow(Math.sin(x), k);
			System.out.println(+y);
		}
		
	if(x>30 & x<=60) {
			y=(int)Math.cos(x^(1/k));
			return y;
		}
		if(x>60) {
			y=(int)Math.tan(x/k);
			return y;
		}
		return y;	
	}}