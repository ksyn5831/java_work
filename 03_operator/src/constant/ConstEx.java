package constant;

//패키지는 클래스의 위치를 나타내는 정보이다.
public class ConstEx {
    public static final String GROUP_NAME = "IVE";
    public static void main(String[] args) {
        final int MAX_MEMBER = 6; //아이브의 멤버 수
//        static final String GROUP_NAME = "IVE";
//        lazy loading (static)같이 올가야되니까 main 밖에 둬야됨.
        String name = "장원영";
        name = "안유진";
        System.out.println("아이브 멤버 수 : " + MAX_MEMBER);
        System.out.println("그룹 이름 : " + GROUP_NAME);
    }
}
