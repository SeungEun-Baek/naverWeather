
import java.util.*;

public class InputWeather {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("����Ȯ���� �Է��ϼ��� :");
		int number = scanner.nextInt();

		if (number > 50) {
			System.out.println("����� ì�⼼��.");
		} else {
			System.out.println("����� ì���� �ʾƵ� �˴ϴ�.");
		}
	}
}
