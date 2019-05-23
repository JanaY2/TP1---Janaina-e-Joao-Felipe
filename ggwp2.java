package demo;

import java.util.Scanner;

public class DemoTranslation {
	public static void main(String[] args) {
		int a, b;
		System.out.print("Digite o valor de a: ");
		a = STDIN_SCANNER.nextInt();
		System.out.print("Digite o valor de b: ");
		b = STDIN_SCANNER.nextInt();
		while(a <= b) {
			a = a + 1;
			if(a == 5) {
				break;
			}
			System.out.println(a);
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
