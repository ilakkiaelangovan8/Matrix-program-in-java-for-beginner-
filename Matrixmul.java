import java.util.Scanner;

public class Matrixmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of rows for matrix a
        int m = sc.nextInt(); // number of columns for matrix a and rows for matrix b
        int p = sc.nextInt(); // number of columns for matrix b

        // Initialize matrices a, b, and c
        int[][] a = new int[n][m];
        int[][] b = new int[m][p];
        int[][] c = new int[n][p];

        // Input matrix a
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input matrix b
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication a * b and store result in matrix c
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                c[i][j] = 0; // Initialize c[i][j] to zero before accumulation
                for (int k = 0; k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Output matrix c
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
