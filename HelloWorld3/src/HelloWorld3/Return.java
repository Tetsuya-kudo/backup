package HelloWorld3;

public class Return {

	//戻り値の例
	public static int add(int X, int Y){
		int ans = X + Y;
		return ans;
	}

	public static void main(String[] args){
		int ans = add(10, 100);
		System.out.println("10 + 100 =" + ans);
	}

}
