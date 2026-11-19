import java.util.Scanner;

public class threedimarray {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     for (int section = 1; section <= 2; section++) {

            System.out.println("\nSECTION " + section);

            System.out.println("--------------------------------");

            double sectionTotal = 0;

            for (int student = 1; student <= 3; student++) {

                System.out.println("\nStudent " + student);

                System.out.print("Java: ");

                double java = input.nextDouble();

                System.out.print("Database: ");

                double database = input.nextDouble();

                System.out.print("Networking: ");

                double networking = input.nextDouble();

                double average = (java + database + networking) / 3;

                sectionTotal += average;

                System.out.printf("Student Average: %.2f%n", average);

            }

            double sectionAverage = sectionTotal / 3;

            System.out.printf("Section Average: %.2f%n", sectionAverage);

        }

        input.close();

    }

}
 