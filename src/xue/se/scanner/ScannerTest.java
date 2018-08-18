package xue.se.scanner;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("scanner learn  start!!1");
		Scanner scanner = new Scanner(System.in);
		System.out.println("input a number:");
		System.out.println("you have input:" + scanner.nextInt());

		System.out.println("input a string :");
		System.out.println("you have input: " + scanner.next());

		/**
		 * 吃掉回车键。。。。解决next()带来的干扰 nextLine()方法将回车视为结束字符，当遇见回车时，会读取回车键之前这一行所有的字符
		 */

		/**
		 * next()方法当遇见第一个有效字符（非空格、非回车、非Tab键）时开始扫描，
		 * 当遇见第一个分隔符（空格、Tab键）或结束字符（回车）时，停止扫描。 当没有遇见有效字符时，输入的空格、回车、Tab不看作结束字符。
		 */

		/**
		 * 解决方法就是，在next()，nextInt()，nextDouble()方法后
		 * 单独用一次nextLine()方法来“吃掉”之前他们的结束符， 这样下面的nextLine()方法就可以正常读取了。
		 */
		System.out.println("吃掉回车键。。。。解决next()带来的干扰" + scanner.nextLine());

		System.out.println("input a line  string:" + ".. this is line which can stick to space and \n");
		System.out.println("you have input line: " + scanner.nextLine());
	}

}
