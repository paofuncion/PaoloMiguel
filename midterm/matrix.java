import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 3; // fixed value size
 while (true) {
 int[][] matrix = new int[SIZE][SIZE];
  System.out.println("Input 9 elements (0-9):");
  // Input with validation
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    while (true) {
                        if (scanner.hasNextInt()) {
                            int value = scanner.nextInt();
                            if (value >= 0 && value <= 9) {
                                matrix[i][j] = value;
                                break;
                            } else {
                                System.out.println("Invalid range. Enter a number between 0 and 9:");
                            }
                        } else {
                            System.out.println("Invalid input. Enter an integer between 0 and 9:");
                            scanner.next();
                        }
                    }
                }
            }
   // display the numbers and  sum
 System.out.println("\nHere are the Numbers and the required outputs:");
System.out.println("==============================================");
            System.out.println("       Row Sum");
for (int i = 0; i < SIZE; i++) {
                int rowSum = 0;
                for (int j = 0; j < SIZE; j++) {
                    System.out.printf("%4d", matrix[i][j]);
                    rowSum += matrix[i][j];
                }
                System.out.printf("%4d\n", rowSum);
            }
  // column sum
            System.out.print("\nColumn sum:");
            for (int j = 0; j < SIZE; j++) {
                int colSum = 0;
                for (int i = 0; i < SIZE; i++) {
                    colSum += matrix[i][j];
                }
                System.out.printf("%4d", colSum);
            }
            System.out.println();
            System.out.println("==============================================");
            // Diagonal sum
            int diag1 = 0, diag2 = 0;
            for (int i = 0; i < SIZE; i++) {
                diag1 += matrix[i][i]; // main diagonal
                diag2 += matrix[i][SIZE - 1 - i]; // secondary diagonal
            }
            System.out.printf("Diagonal sum 1:%4d\n", diag1);
            System.out.printf("Diagonal sum 2:%4d\n", diag2);
            System.out.println("==============================================");
 // retry again
            System.out.print("Try Again [y|n]: ");
            String choice = scanner.next();
            if (!choice.equals("y")) {
               System.out.println("Try again Anytime!!");
               break;
            }
        }
 scanner.close();
    }
}

