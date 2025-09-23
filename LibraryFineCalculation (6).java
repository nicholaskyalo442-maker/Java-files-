// Program to compute library fine calculation
// Name: Nicholas Kyalo
// Reg No: S08-8425-2024

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LibraryFineCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        System.out.println("Program: Library Fine Calculation\n");

        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();

        System.out.print("Enter Due Date (yyyy-MM-dd): ");
        String dueDateInput = scanner.nextLine();

        System.out.print("Enter Return Date (yyyy-MM-dd): ");
        String returnDateInput = scanner.nextLine();

        LocalDate dueDate = LocalDate.parse(dueDateInput, formatter);
        LocalDate returnDate = LocalDate.parse(returnDateInput, formatter);

        long daysOverdue = ChronoUnit.DAYS.between(dueDate, returnDate);

        int fineRate = 0;
        if (daysOverdue > 0 && daysOverdue <= 7) {
            fineRate = 20;
        } else if (daysOverdue >= 8 && daysOverdue <= 14) {
            fineRate = 50;
        } else if (daysOverdue >= 15) {
            fineRate = 100;
        }

        long fineAmount = (daysOverdue > 0) ? daysOverdue * fineRate : 0;

        System.out.println("\n--- Library Fine Details ---");
        System.out.println("Book ID: " + bookID);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Days Overdue: " + (daysOverdue > 0 ? daysOverdue : 0));
        System.out.println("Fine Rate per Day: Ksh. " + fineRate);
        System.out.println("Total Fine Amount: Ksh. " + fineAmount);

        scanner.close();
    }
}