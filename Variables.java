package commandLineDatabase.grabarczykTomasz;

import java.util.Scanner;

class Variables {

    private int numberOfRecords = 0;

    private Scanner userInput = new Scanner(System.in);

    int getNumberOfRecords() {
        return numberOfRecords;
    }

    void setNumberOfRecords(int numberOfRecords) {
        this.numberOfRecords = numberOfRecords;
    }

    Scanner getUserInput() {
        return userInput;
    }

    void drawLine() {
        System.out.print("\n----------------------------------------------------------------------------------------------------------------\n");
    }

    void drawLineEnding() {
        System.out.print("\n----------------------------------------------------------------------------------------------------------------\n");
    }
}
