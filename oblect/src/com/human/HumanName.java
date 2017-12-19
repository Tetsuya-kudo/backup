package com.human;

public class HumanName {

	//フィールド変数：sei
	//どこからでもアクセスできます
	public String sei;

	//フィールド変数：mei
	//取得するメソッド経由で取得可能
	private String mei;

	//コンストラクタ：インスタンス化後に実行されるメソッド
	public HumanName(){
		sei = "Kudo";
		mei = "Tetsuya";
	}

	//引数付きコンストラクタ
	public HumanName(String sei, String mei){
		// this:このクラスに宣言されている
		this.sei = sei;
		this.mei = mei;
	}

	// String型を呼び出し元に戻すメソッド
	public String getName(){
		return sei + mei;


	}



	public String getMei(){
		return mei;
	}









}
