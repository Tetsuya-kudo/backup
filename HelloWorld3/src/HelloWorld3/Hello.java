package HelloWorld3;



public class Hello {

	public static void main(String[] args) {

		add(10, 100);
		add(20, 200);

	}

	public static void add(int X, int Y){
		int ans = X + Y;
		System.out.println(X + "+" + Y + "=" + ans);
	}

}
