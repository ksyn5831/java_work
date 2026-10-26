package com.test;

public class StringFormatTest {
    static void main(String[] args) {
//        클래스(오브젝트)는 기능을 갖고 있는 아이다.
        String name = "Yujin";
        int age = 20;
        int nameLengh = name.length();
        System.out.println("이름 길이 : " + nameLengh);
        String lowerCase = name.toLowerCase();
        System.out.println("이름 소문자 : " + lowerCase);
        String schoolName = "휴머 IT";
        String song = "학교종이 땡떙떙" + schoolName + "어서모이자";
        System.out.println(song);
//        x=x+1;
//        \n : 개행문자, \t : 탭(4칸 띄어쓰기)
        song = song + "\n선생님이 우리를 기다리신다.";
        song = song + "\n\t 노래 끝";
        System.out.println(song);

        String textBlock = """
                동해물과 백두산이 마르고 닳도록
                하나님이 보우하사
                우리나라 만세
                """;
        System.out.println(textBlock);
//      자바 공부할 때만 사용(나중에 안씀)
        String memberInfo = """
                이름 : %s
                나이 : %d세
                """.formatted(name, age);
        System.out.println(memberInfo);

    }
}
