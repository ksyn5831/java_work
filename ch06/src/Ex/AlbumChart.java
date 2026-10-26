package Ex;

public class AlbumChart {
    public static void main(String[] args) {
        String[] albums = {"ELEVEN", "LOVE DIVE", "After LIKE", "I AM", "Baddie"};
        int[] ranks = {1, 2, 3, 4, 5};

        System.out.println("=============================");
        System.out.println("IVE 앨범 차트");
        System.out.println("=============================");

        for (int i = 0; i < albums.length; i++) {
            System.out.printf("%d위, %s%n", ranks[i], albums[i]);
        }
        System.out.println("=============================");
    }
}
