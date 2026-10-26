package Ex;

import com.sun.source.tree.WhileLoopTree;

public class VoteCount {
    static void main(String[] args) {

        String[] members = {"안유진", "가을", "레이", "장원영", "리즈", "이서"};
        int[] votes = {3200, 1500, 210, 2800, 980, 1750};
        int total = 0;
        int i = 0;

        while (total < 10000) {
            total = votes[i];
            System.out.printf("%s 득표 누적 합산: %,d표%n", members[i], total);
            i++;
        }
        System.out.println("10,000표 돌파!");
    }
}
