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
		 * �Ե��س��������������next()�����ĸ��� nextLine()�������س���Ϊ�����ַ����������س�ʱ�����ȡ�س���֮ǰ��һ�����е��ַ�
		 */

		/**
		 * next()������������һ����Ч�ַ����ǿո񡢷ǻس�����Tab����ʱ��ʼɨ�裬
		 * ��������һ���ָ������ո�Tab����������ַ����س���ʱ��ֹͣɨ�衣 ��û��������Ч�ַ�ʱ������Ŀո񡢻س���Tab�����������ַ���
		 */

		/**
		 * ����������ǣ���next()��nextInt()��nextDouble()������
		 * ������һ��nextLine()���������Ե���֮ǰ���ǵĽ������� ���������nextLine()�����Ϳ���������ȡ�ˡ�
		 */
		System.out.println("�Ե��س��������������next()�����ĸ���" + scanner.nextLine());

		System.out.println("input a line  string:" + ".. this is line which can stick to space and \n");
		System.out.println("you have input line: " + scanner.nextLine());
	}

}
