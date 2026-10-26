package cafe;

public class Cafe {
    public static int orderCount = 0;
    public static int cupCount = 0;

    public static final String CAFE_NAME = "자바카페";
    public static final double SALE_RATE = 0.1;

    static void main(String[] args) {
        System.out.println("카페 이름 : " + CAFE_NAME);
        System.out.println("회원 할인율 : " + SALE_RATE);
        System.out.println("오늘의 주문 수 : " + orderCount);
        System.out.println("오늘 판매한 잔 수 : " + cupCount);

    }



}
