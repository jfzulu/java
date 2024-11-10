//AUTOR: JFZULU- Jose Fernando Zuluaga Ortiz

import java.util.Scanner;

public class Reservation {
    static int MAX_ROWS = 10;
    static int MAX_COLS = 10;

    public static void main(String[] args) throws Exception {
        char seats[][] = new char[10][10];
        boolean flag = false, valid = false;
        Scanner seatScanner = new Scanner(System.in);
        int rowSeat, colSeat;
        String response;

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                seats[row][col] = 'L';
            }
        }

        System.out.println("-------- WELCOME SYSTEM RESERVATION --------");

        while (flag != true) {
            System.out.println("SEATS AVIABLES: ");
            drawSeats(seats);

            do {
                System.out.println("\nEnter row and seat to reserve");
                System.out.print("Row(0-9): ");
                rowSeat = seatScanner.nextInt();
                System.out.print("Seat(0-9): ");
                colSeat = seatScanner.nextInt();
                if (rowSeat >= 0 && rowSeat < MAX_ROWS && colSeat >= 0 && colSeat < MAX_COLS) {
                    valid = true;
                }
                if (!valid) {
                    System.out.println("Invalid input! Please enter a valid row and seat.");
                    valid = false;
                }
            } while (!valid);
            if (seats[rowSeat][colSeat] == 'L') {
                seats[rowSeat][colSeat] = 'X';
                System.out.println("Seat reserved successfully!");

            } else {
                System.out.println("Seat is already reserved! Please choose another seat.");
            }

            System.out.println("Finish reservation? Y:Yes/Another key:No");
            response = seatScanner.next();

            if (response.equalsIgnoreCase("S")) {
                flag = true;
            }
        }

        System.out.println("Exit, goodbye!");

        seatScanner.close();
    }

    static void drawSeats(char seats[][]) {
        for (int i = 0; i < MAX_ROWS; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < MAX_COLS; j++) {
                System.out.print("[" + seats[i][j] + "]");

            }
            System.out.println("");
        }
        System.out.print("  ");
        for (int i = 0; i < MAX_COLS; i++) {
            System.out.print(" " + i + " ");
        }
    }

}
