
public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 45;
		int b = 35;
		int c = 5;
		if(a==b && b==c && a==c) {
			System.out.println("all are same");
		}
		if(a>=b && a>=c) {
			System.out.println("a is greater:"+a);
		}
		if(b>=a && b>=c) {
			System.out.println("b is greater:"+b);
		}
			if(c<=a && c<=b) {
				System.out.println("c is smaller:"+c);
			}

	}

}
