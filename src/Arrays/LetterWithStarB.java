package Arrays;

public class LetterWithStarB {
    public static void main(String[] args) {
        int height = 7;
        int width = 5;

        char[][] letterB = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || (i == 0 || i == height / 2 || i == height - 1) && j < width - 1
                        || j == width - 1 && (i != 0 && i != height / 2 && i != height - 1)) {
                    letterB[i][j] = '*';
                } else {
                    letterB[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(letterB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
