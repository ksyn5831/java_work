import cafe.Cafe;

public class main {
    static void main(String[] args) {

        String name = "김자바";
        int age = 20;
        boolean isVIP = true;
        String grade = "s";
        int wallet = 20000;
        int freinds = 0;

        System.out.println("=====" + "자바카페" + "=====");
        System.out.println("고객: " + name + " / " + "나이: " + age + " / " + "회원: " + isVIP + " / " + "등급: " + grade);

        int myticketNumber = 200;
        int ticketNumber = myticketNumber + 1;
        System.out.println("내 주문번호: " + myticketNumber + ", 다음 주문번호 : " + ticketNumber);
        System.out.println(myticketNumber % 2 == 0 ? "안내: 픽업대 A에서 받아가세요" : "안내 : 픽업대 B에서 받아가세요");

        int americano = 4500;
        int cake = 6800;
        int price = (americano * 2) + cake;

        System.out.println("주문 금액: " + price);

        double discount = isVIP ? price * 0.1 : 0;
        System.out.println("할인 금액: " + (int) discount);
        System.out.println("결제 금액: " + (int) (price - discount));

        System.out.println("거스름돈: " + (int) (wallet - (price - discount)));

        int thousand = 10000;
        int fivehundred = price % 1000 / 500;
        int hundred = price % 1000 / 100;
        int ten = price % 100 / 10;
//        출력 결과 만들기
//        String result = "만원권" +

        System.out.println("천원권 " + thousand + "장, " + "오백원 " + fivehundred + "개, " + "백원  " + hundred + "개, " + "십원 " + ten + "개, " + "남은 금액 " + price % 100 + "원");
        int stamp = +1;

        System.out.println("스탬프: " + stamp + "개");
        System.out.println("무료 음료 쿠폰: ");
        System.out.println("더치페이 대상: ");
        System.out.println("오늘의 주문: " + "건" + "판매 잔 수: " + "잔");

    }

}
