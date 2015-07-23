
import java.util.*;

public class InputWeather {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("강수확률을 입력하세요 :");
		int number = scanner.nextInt();

		if (number > 50) {
			System.out.println("우산을 챙기세요.");
		} else {
			System.out.println("우산을 챙기지 않아도 됩니다.");
		}
	}
}
