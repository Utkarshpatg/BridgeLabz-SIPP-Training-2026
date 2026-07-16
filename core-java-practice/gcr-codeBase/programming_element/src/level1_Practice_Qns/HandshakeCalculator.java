package level1_Practice_Qns;

import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int handshakes =
                (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum possible handshakes are "
                + handshakes);
    }
}