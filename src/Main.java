public class Main {

    public static void main(String[] args) {
        int[][] sudokuBoard = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        printUnsolvedBoard(sudokuBoard, sudokuBoard.length);
        printSolvedBoard(sudokuBoard, sudokuBoard.length);
    }

    public static void printUnsolvedBoard(int[][] blah, int moreBlah) {
        for (int i = 0; i < moreBlah; i++) {
            if ((i % 3 == 0) && (i != 0)) {
                System.out.println("----------|unsolved|----------");
            }
            for (int j = 0; j < moreBlah; j++) {
                if (j % 3 == 0) {
                    System.out.print("|");
                }
                if(blah[i][j] == 0){
                    System.out.print(" " + "-" + " ");
                }
                else {
                    System.out.print(" " + blah[i][j] + " ");
                }
            }
            System.out.println("@"); // Returns to the next line
        }
        System.out.println();
    }

    public static void printSolvedBoard(int[][] blah, int moreBlah) {
        for (int i = 0; i < moreBlah; i++) {
            if ((i % 3 == 0) && (i != 0)) {
                System.out.println("----------|solved|----------");
            }
            for (int j = 0; j < moreBlah; j++) {
                if (j % 3 == 0) {
                    System.out.print("|");
                }
                System.out.print(" " + blah[i][j] + " ");
            }
            System.out.println("#");
        }
    }
}
