
public class Main {
	public static void main(String[] args) {
		float f = 3;
		double d = f;
		System.out.println(f +"+"+ d);

		// int num = 3.2; エラーが出る

		// キャスト演算子を行うことで強制的に型変換を行うことができる
		// 情報に欠損が出るためあまり使うべきではない
		int num = (int) 3.2;
		System.out.println(num);

		// 異なる型で演算を行なった場合は、意味的に大きな型に統一されてから演算が行われる
		// 2(int)を2.0(double)に変換
		double d2 = 8.5/2;
		// 5(int)を5L(long)に変換
		long l = 5 + 2L;
		// 23(int)が"23"(String)に変換されて連結される
		String msg = "私の年齢は"+ 23;
		System.out.println(msg);
	}
}
