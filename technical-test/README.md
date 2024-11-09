# PROBLEM STATEMENT
Suppose a seating reservation system for an amphitheater. The theater has 10 rows with 10 seats each. It is necessary to develop a system (without using databases, only logical data handling) that allows for the following:

## 1. Load the "row and seat map"
Indicate occupied seats with an "X" and free seats with an "L". When starting the program, all seats should be free.
## 2. Handle seat reservations
A seat can ONLY BE RESERVED if it is in the "L" state. If it is in the "X" state, the buyer should be allowed to choose another seat. If the seat is "L," it should automatically change to "X" once reserved.
## 3. Program termination
The program should end when a specific value is entered. Consider that there is no fixed limit on how many times the program can run.
## 4. Validate seat range
Ensure there are ONLY 10 ROWS and 10 SEATS. No seats can be sold outside these numbers, and "overselling" is not allowed.

Considerations: No GUI or database implementation is needed. Logical management of the application's development will be fully evaluated.

Extra: If a client requests to view available seats, the system should allow a graphical display of the seat map. NO GUI should be used in this case; use ONLY logic and console output.





