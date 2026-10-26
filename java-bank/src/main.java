import bank.Bank;

public class main {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 25;
        boolean isVIP = false;
        char grade = 'B'; //등급
        int money = 0; //잔액
        int salary = 0; //월급

        Bank.customerCount++;
        int customerNumber = Bank.customerCount;

        System.out.println("====="+"자바은행"+"=====");
        System.out.println("고객번호 : " + customerNumber + "/ " + "이름 : " + name + "/ " + "나이 : " + age + "/ " + "등급 : " + grade);


        int ticketNumber = 100;
        int myticketNumber = ticketNumber + 1;
        System.out.println("출력 : 내 번호표 : " + ticketNumber + ", 다음 대기 번호 : " + myticketNumber);
        System.out.println(ticketNumber % 2 == 0 ? "안내 : 1번 창구로 오세요" : "안내 : 2번 창구로 오세요");

       int inmoney = money+ 50000;
        System.out.println("입금 후 잔액 : " + inmoney);

        int Fee = isVIP ? 0 : 500; //vip 맞음? 맞으면 0원
        System.out.println("출금 수수료 : " + Fee);

        int outmoney = inmoney - 12500 - Fee;
        System.out.println("출금 후 잔액 : " + outmoney);
        Bank.workcount++;

        double bonus = outmoney * Bank.BONUS_RATE;
        int bonusMoney = (int) bonus;

        System.out.println("이자 : " + bonusMoney);
//        boolean isSpecial =(pay != 0) && (money / pay)
        money = outmoney + bonusMoney;
        System.out.println("이자 지급 후 잔액 : " + money);

        System.out.println("대출 가능 : " + (age >= 19 && money >= 30000));

        System.out.println("우대 대상 : " + (salary != 0 && money >= (salary * 2)));
//        월급이 0이면 나눗셈을 하면 안 되므로 먼저 확인한다.

        int tenThousand = money / 10000;
        int thousand = money % 10000 / 1000;
        int hundred = money % 1000 / 100;
//        출력 결과 만들기
//        String result = "만원권" +

        System.out.println("만원권 " + tenThousand + "장, " + "천원권 " + thousand + "장, " + "백원 동전 " + hundred + "개, " + "남은 금액 " + money % 100 + "원");

        Bank.guestCount++;
        String output = "오늘의 총 고객 수 : ";
        output = output + Bank.guestCount + "명, ";
        output = output + "거래 건수 :" + Bank.workcount + "건";
        System.out.println(output);

    }
}
