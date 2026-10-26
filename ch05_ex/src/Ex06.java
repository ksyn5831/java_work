import java.util.Scanner;

public class Ex06 {
    static void main(String[] args) {
        Scanner scanner = (new Scanner(System.in));

        System.out.println("주사위1의 눈을 입력하세요: ");
        int 주사위1 = scanner.nextInt();
        System.out.println("주사위2의 눈을 입력하세요: ");
        int 주사위2 = scanner.nextInt();
        System.out.println("주사위3의 눈을 입력하세요: ");
        int 주사위3 = scanner.nextInt();
        int result;

        if (주사위1 == 주사위2 && 주사위2 == 주사위3) {
            result = 10000 + 주사위1 * 1000;
        } else if (주사위1 == 주사위2 || 주사위1 == 주사위3) {
            result = 1000 + 주사위1 *100;
        } else if (주사위2 == 주사위3) {
            result = 1000 + 주사위2 + 100;
        } else {
            int max = 주사위1;
            if (주사위2 > max) {
                max = 주사위2;
            }
            if (주사위3 > max) {
                max = 주사위3;
            }
            result = max * 100;
        }
        System.out.println("상금: " + result + "원");
    }
    }