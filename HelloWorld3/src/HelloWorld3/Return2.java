package HelloWorld3;

public class Return2 {

	//戻り値をそのまま使う例
	public static int add(int X, int Y){
		int ans = X + Y;
		return ans;
	}

	public static void main(String[] args){
		System.out.println(add(add(10, 20), add(30,40)));
	}

}
