package practice_questions;

public class NQueensProblem {
  private final int[] boardPositions;
  private final int numCols;

  public NQueensProblem(int n) {
    boardPositions = new int[n];
    numCols = boardPositions.length;
  }

  private boolean isQueenSafe(int rowNumber, int colNumber) {
    for (int i = 0; i < rowNumber; i++) {
      if (boardPositions[i] == colNumber ||
          (i - rowNumber) == (boardPositions[i] - colNumber) ||
           (i - rowNumber) == (colNumber - boardPositions[i])) {
                return false;
      }
    }
    return true;
  }

  private void placeNQueens(int rowNumber) {
    for (int colNumber = 0; colNumber < numCols; colNumber++) {
      if (isQueenSafe(rowNumber, colNumber)) {
        boardPositions[rowNumber] = colNumber;
        if (colNumber == numCols - 1) {
          printBoard();
        } else {
          placeNQueens(rowNumber + 1);
        }
      }
    }
  }

  private void printBoard() {
    for (int i = 0; i < numCols; i++) {
      for (int j = 0; j < numCols; j++) {
        if (boardPositions[i] == j) {
          System.out.print("Q ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  public void findSafeQueenPlacementPositions() {
    placeNQueens(0);
  }

  public static void main(String args[]) {
    NQueensProblem workerClass = new NQueensProblem(8);
    workerClass.findSafeQueenPlacementPositions(); 
  }
}
