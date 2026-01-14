# hotel-booking-system-ccp.iq
# Hotel Booking System – CCP

## Course Information
- Course: Software Construction
- Program: BS/BE Software Engineering
- Project Type: Individual CCP

## Project Overview
This project implements a Hotel Booking System based on a provided UML class diagram.
The system is developed in Java using object-oriented principles, clean code practices,
defensive programming, and unit testing with JUnit.

## Features
- Hotel and room management
- Guest check-in and check-out
- Reservation creation and cancellation
- Input validation and error handling
- Unit tests for core domain classes

## How to Run the Program
Compile and run the main program using:

```powershell
javac -d out src\edu\university\ccp\hotel\domain\*.java src\Main.java
java -cp out Main
javac -d out src\edu\university\ccp\hotel\domain\*.java
javac -cp "lib\junit-platform-console-standalone-1.10.3.jar;out" -d out test\edu\university\ccp\hotel\domain\*.java
java -jar lib\junit-platform-console-standalone-1.10.3.jar -cp out --scan-class-path
