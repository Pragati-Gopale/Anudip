
public class NestedIfDemo {

	public static void main(String[] args) {
		// conditional operator- >,<,>=,<=,==,!=
		//if(a>b),if(a>=b),if(a!=b)
		//logical operator - && (and),||(or)
		//if(a>b && a>c), if(a>b || a>c)
if(false) {
	System.out.println("if - true block 1");
	if (false) {
		System.out.println("if - true block 2");
	}
	else {
		System.out.println("else - false block 1");
	}
	}
	else {
		System.out.println("else - false block 2");
		if(true)
			System.out.println("if - true block 3");
	}
}
}