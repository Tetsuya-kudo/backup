
public class Test {

	public static void main(String[] args){

		//Personクラスのインスタンス化
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.talk();
		taro.walk();
		taro.run();


		//Robotクラスのインスタンス化
		Robot aibo = new Robot();
		aibo.name = "アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name = "アシモ";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name = "ペッパー";
		pepper.talk();
		pepper.walk();
		pepper.run();

		Robot doraemon = new Robot();
		doraemon.name = "ドラえもん";
		doraemon.talk();
		doraemon.walk();
		doraemon.run();

	}

}
