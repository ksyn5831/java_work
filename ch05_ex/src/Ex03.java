import java.util.Scanner;

public class Ex03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요 .(0~100)");
        int score = scanner.nextInt();
        String result;

        if (score >= 90 && score <= 100) {
            result = "A";
        } else if (score >= 80 && score <= 89) {
             result= "B";
        } else if (score >= 70 && score <= 79) {
            result = "C";
        } else if (score >= 60 && score <= 60) {
            result = "D";
        }else {
            result = "F";
        }
        System.out.println("if 로 구한 성적 : " + result);

//        switch가 jdk 14 버전 이후에 문법 변경(기존 것은 유효)
        int value = score / 10;
        String grade = "";

        switch (value) {
            case 10 -> {grade = "A";}
            case 9 -> {grade = "A";}
            case 8 -> {grade = "B";}
            case 7 -> {grade = "C";}
            case 6 -> {grade = "D";}
            default -> {grade = "F";}

        }
        System.out.println("swirch로 구한 등급 : " + grade);
    }
}