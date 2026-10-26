import java.util.Scanner;

public class Ex05 {
    static void main(String[] args) {
        Scanner scanner = (new Scanner(System.in));
        System.out.println("현재 시간(시)를 입력하세요(0~23): ");
        int H = scanner.nextInt();
        System.out.println("현재 시간(분)을 입력하세요(0~59): ");
        int M = scanner.nextInt();
        System.out.println("요리 시간(분)을 입력하세요(0~1000): ");
        int C = scanner.nextInt();
        M = M + C;

        H = H + M / 60;
        M = M % 60;

        H = H % 24;
        System.out.println(H + "시" + M + "분");

}
}
