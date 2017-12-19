package com.human;


//Humanクラス
public class Human {
	//Humanクラスの姓
	public static String sei;
	//Humanクラスの名
	public static String mei;

	//Humanメソッド
	public static void main(String[] args) {

		sei = "Kudo";
		mei = "Tetsuya";
		System.out.println(sei + mei);

		//クラスHumanNameのコピーを作成(インスタンス化)
		HumanName human =  new HumanName();

		//public privateの違い→アクセスできない
			String sei = human.sei;
		//getterでアクセス可能に
			String mei = human.getMei();
		System.out.println(human.getMei());

		//コンストラクタ２が起動している
		HumanName human2 = new HumanName("tanaka","taro");
		System.out.println(human2.getName());



	}

}
