public class Main {

    public static void main(String[] args) {
        int[][] sudokuBoard = {
                {8, 0, 0, 9, 3, 0, 0, 0, 2},
                {0, 0, 9, 0, 0, 0, 0, 4, 0},
                {7, 0, 2, 1, 0, 0, 9, 6, 0},
                {2, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 6, 0, 0, 0, 0, 0, 7, 0},
                {0, 7, 0, 0, 0, 6, 0, 0, 5},
                {0, 2, 7, 0, 0, 8, 4, 0, 6},
                {0, 3, 0, 0, 0, 0, 5, 0, 0},
                {5, 0, 0, 0, 6, 2, 0, 0, 8}
        };

        printUnsolvedBoard(sudokuBoard, sudokuBoard.length);
        printSolvedBoard(sudokuBoard, sudokuBoard.length);
    }

    public static void printUnsolvedBoard(int[][] SudokuBoard, int sudokuBoardLength) {
        for (int i = 0; i < sudokuBoardLength; i++) {
            if ((i % 3 == 0) && (i != 0)) {
                System.out.println("----------|unsolved|----------");
            }
            for (int j = 0; j < sudokuBoardLength; j++) {
                if (j % 3 == 0) {
                    System.out.print("|");
                }
                if(SudokuBoard[i][j] == 0){
                    System.out.print(" " + "-" + " ");
                }
                else {
                    System.out.print(" " + SudokuBoard[i][j] + " ");
                }
            }
            System.out.println("@"); // Returns to the next line
        }
        System.out.println();
    }

    public static void printSolvedBoard(int[][] SudokuBoard, int sudokuBoardLength) {
        for (int i = 0; i < sudokuBoardLength; i++) {
            if ((i % 3 == 0) && (i != 0)) {
                System.out.println("----------|solved|----------");
            }
            for (int j = 0; j < sudokuBoardLength; j++) {
                if (j % 3 == 0) {
                    System.out.print("|");
                }
                System.out.print(" " + SudokuBoard[i][j] + " ");
            }
            System.out.println("#"); // Returns to the next line
        }
    }
}
