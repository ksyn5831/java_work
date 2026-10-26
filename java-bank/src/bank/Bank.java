package bank;

public class Bank {
    public static int customerCount = 0;
    public static int workcount = 0;

    public static final double BONUS_RATE = 0.03;
    public static final int FEE = 500;
    public static final String BANK_NAME = "자바은행";
    public static int guestCount = 0;


   public static void main(String[] args) {

        System.out.println("이자율 : " + BONUS_RATE);
        System.out.println("출금 수수료 : " + FEE);
        System.out.println("오늘의 고개 수 : " + guestCount);
        System.out.println("오늘의 거래 건수 : " + workcount);
   }
}
