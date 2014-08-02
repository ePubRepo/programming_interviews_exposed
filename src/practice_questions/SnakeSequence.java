package practice_questions;

import java.util.ArrayList;

public class SnakeSequence {
  private final int maxX = 3;
  private final int maxY = 3;
  private final int[][] board = new int[][]{
      {1, 3, 0, 4},
      {2, 1, -1, 4},
      {3, 0, -1, 0},
      {6, 2, 1, -1}
  };

  private ArrayList<Integer> findSequence(int xPos,
      int yPos, ArrayList<Integer> currentPath) {
    currentPath.add(board[yPos][xPos]);

    ArrayList<Integer> pathRight = new ArrayList<Integer>(currentPath);
    ArrayList<Integer> pathDown = new ArrayList<Integer>(currentPath);

    if (xPos < maxX || yPos < maxY) {
      if (yPos < maxY &&
          (board[yPos + 1][xPos] + 1 == board[yPos][xPos] ||
          board[yPos + 1][xPos] - 1 == board[yPos][xPos])) {
        pathDown = findSequence(xPos, yPos + 1, currentPath);
      }
      if (xPos < maxX &&
          (board[yPos][xPos + 1] + 1 == board[yPos][xPos] ||
          board[yPos][xPos + 1] - 1 == board[yPos][xPos])) {
        pathRight = findSequence(xPos + 1, yPos, currentPath);
      }

      if (pathDown.size() > pathRight.size()) {
        return pathDown;
      } else {
        return pathRight;
      }
    }
    return currentPath;
  }

  private void getSequence() {
    ArrayList<Integer> currentPath = new ArrayList<Integer>();
    ArrayList<Integer> result;
    result = findSequence(0, 0, currentPath);

    for (int i = 0; i < result.size(); i++) {
      System.out.println(result.get(i));
    }
  }

  public static void main(String[] args) {
    SnakeSequence sequence = new SnakeSequence();
    sequence.getSequence();
  }
}