import java.nio.file.attribute.UserDefinedFileAttributeView;

public class VariableTest {
    static void main(String[] args) {
        int age = 23;
        int weight = 45;
        long myNumber = 1_000_000;
        double height = 171.5;
        boolean isDebut = true;
        String name = "안유진";
        System.out.println("이름 : " +name );
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height + "cm");
        System.out.println("데뷔 : " + isDebut);
        System.out.println("월급 : " + myNumber);

    }
}
