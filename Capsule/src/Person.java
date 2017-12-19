/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Person {
	private String name = null;
	private int age = 0;

	public Person(){}

	public Person (String name, int age){
		this.name = name;
		this.age = age;
	}

	public Person (String name){
		this.name = name;
		this.age = 0;
	}

	public Person(int age){
		this.name = "名前なし";
		this.age = age;
	}

	public Person(int age, String name){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getage(){
		return this.age;
	}

	public void setage(int age){
		this.age = age;
	}



}

