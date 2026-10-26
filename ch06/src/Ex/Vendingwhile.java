package Ex;

public class Vendingwhile {
    static void main(String[] args) {

        int money = 3000;
        int prince = 1000;
        int count = 0;

        while (money >= prince) {
            money -= prince;
            count++;
            System.out.println(count + "번째 구매 완료, 잔액 : " + money + "원");
        }
        System.out.println("층" + count + "개 구매, 잔돈: " + money + "원");
    }
}
