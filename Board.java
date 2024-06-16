import java.util.*;

public class Board {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int width = sc.nextInt();

        Board(height, width);

    }

    public static void Board(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("Debo");
                } else if (height % 2 != 0 && width % 2 != 0) {
                    if (i == height / 2 && j == width / 2) {
                        System.out.print("doremon");
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    if ((i == height / 2 && j == width / 2) || (i == height / 2 && j == width / 2 - 1)
                            || (i == height / 2 - 1 && j == width / 2) || (i == height / 2 - 1 && j == width / 2 - 1)) {
                        System.out.print("doremon");
                    } else {
                        System.out.print(" ");
                    }
                }

            }

            System.out.println();
        }
    }

}