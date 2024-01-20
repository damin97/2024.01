package chap08.exam03;

class Cat implements Soundable{
	public String sound() {
		System.out.println("야옹");
		return "야옹";
	}
}

class Dog implements Soundable{
	public String sound() {
		return "멍멍";
	}
}

public class SoundableEx {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
