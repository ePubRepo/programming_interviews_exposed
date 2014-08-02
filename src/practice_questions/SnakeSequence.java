package practice_questions;

import java.util.ArrayList;

public class SnakeSequence {
  private final int maxX = 3;
  private final int maxY = 3;
  private final int[][] board = new int[][]{
      {1, 3, 2, 4},
      {2, 1, -1, 4},
      {1, 2, -1, 0},
      {2, 0, 1, -1}
  };

  private ArrayList<Integer> findSequence(int xPos,
      int yPos, ArrayList<Integer> currentPath) {
    currentPath.add(board[xPos][yPos]);

    ArrayList<Integer> pathRight = currentPath;
    ArrayList<Integer> pathDown = currentPath;

    if (xPos < maxX && yPos < maxY) {
      if (board[xPos][yPos + 1] + 1 == board[xPos][yPos] ||
          board[xPos][yPos + 1] - 1 == board[xPos][yPos]) {
        pathDown = findSequence(xPos, yPos + 1, currentPath);
      }
      if (board[xPos + 1][yPos] + 1 == board[xPos][yPos] ||
          board[xPos + 1][yPos] - 1 == board[xPos][yPos]) {
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