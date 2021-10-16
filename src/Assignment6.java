import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        int n = 4;
        int a[][] = {{1, 2, 3, 4},
                {4, 3, 2, 1},
                {7, 8, 9, 6},
                {6, 5, 4, 3}};
        printPrincipalDiagonal(a, n);
        printSecondaryDiagonal(a, n);
    }

    public static void printSecondaryDiagonal(int mat[][], int n) {
        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1))
                    System.out.print(mat[i][j] + ", ");
            }
        }
        System.out.println("");
    }

    public static void printPrincipalDiagonal(int mat[][], int n) {
        System.out.print("Principal Diagonal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + ", ");
                }

            }
        }
        System.out.println("");
    }
}
