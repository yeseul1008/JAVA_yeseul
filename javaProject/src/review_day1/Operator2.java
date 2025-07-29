package review_day1;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		a++; 
//		int b = a++;
//		System.out.println(b);
//		System.out.println(a);
		
		int a = 10;
		int b = ++a;
		int c = b++;
		int d = c++;
		a = b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
//		b 11
//		c 12
//		d 11
//		a 12
	}

}
