import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String name = "菅原";
		String message = name + "さん、こんにちは";
		System.out.print("メッセージ: ");
		System.out.println(message);

		int a = 3;
		int b = 1;
		// 2つの値を比較して大きい方の数値を代入するメソッド
		int m = Math.max(a, b);
		System.out.println(m);

		// ランダムな数を生成するメソッド
		int r = new Random().nextInt(90);
		System.out.println("あなたは、"+ r +"歳ですか？");

		System.out.println("あなたの名前を入力してください");
		String selfName = new Scanner(System.in).nextLine();
		System.out.println("年齢を入力してください");
		int selfAge = new Scanner(System.in).nextInt();
		System.out.println("名前: "+ selfName);
		System.out.println("年齢: "+ selfAge);
		System.out.println("上記の内容でお間違い無いですか？");
	}
}
