package RecursionProblems;

public class Triangle {
    static void triP(int row, int column) {
        if (row == 0) {
            return;
        }
        if (column < row) {
            System.out.print("*");
            triP(row, column + 1);
            System.out.print("*");
        } else {
            System.out.println();
            triP(row - 1, 0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triP(4, 0);
    }
}
