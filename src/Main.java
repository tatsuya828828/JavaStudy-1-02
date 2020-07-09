import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		String ans = "x+yは"+ (x+y);
		System.out.println(ans);

		System.out.println("ようこそ占いの館へ");
		System.out.println("名前を入力してください");
		String name = new Scanner(System.in).nextLine();
		System.out.println("年齢を入力してください");
		String ageString = new Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new Random().nextInt(4);
		++fortune;
		System.out.println("占いの結果が出ました");
		System.out.println(age +"歳の"+ name +"さんの運気番号は"+ fortune +"です");
		System.out.println("1: 大吉, 2: 中吉, 3: 吉, 4: 凶");
	}
}
