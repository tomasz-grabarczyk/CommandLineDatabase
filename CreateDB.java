package commandLineDatabase.grabarczykTomasz;

import java.util.ArrayList;

class CreateDB extends Variables {

    void drawDatabase() {

        String[] nameOfColumnsInDB = {"FirstName      ", "LastName       ", "Age            ", "Gender         ", "Nationality    ", "E-mail         ", "Phone Number   "};
        ArrayList<String> recordsInDB = new ArrayList<>();

        System.out.print("Enter how many records it will be: ");
        setNumberOfRecords(getUserInput().nextInt());

        int lengthOfDB = nameOfColumnsInDB.length;

        for (int i = 0; i < getNumberOfRecords(); i++) {
            if (i % lengthOfDB == 0) {
                System.out.print("Enter first name: ");
            } else if (i % lengthOfDB == 1) {
                System.out.print("Enter last name: ");
            } else if (i % lengthOfDB == 2) {
                System.out.print("Enter age: ");
            } else if (i % lengthOfDB == 3) {
                System.out.print("Enter gender: ");
            } else if (i % lengthOfDB == 4) {
                System.out.print("Enter nationality: ");
            } else if (i % lengthOfDB == 5) {
                System.out.print("Enter e-mail: ");
            } else if (i % lengthOfDB == 6) {
                System.out.print("Enter phone number: ");
            }
            recordsInDB.add(getUserInput().next());
        }

        drawLine();

        for (String printColumnsOfDB : nameOfColumnsInDB) {
            System.out.print(printColumnsOfDB + ":");
        }

        for (int modifyLengthOfRecord = 0; modifyLengthOfRecord < recordsInDB.size(); modifyLengthOfRecord++) {
            while (recordsInDB.get(modifyLengthOfRecord).length() != 15) {
                recordsInDB.set(modifyLengthOfRecord, recordsInDB.get(modifyLengthOfRecord) + " ");
            }
        }

        for (int printRecordsOfDB = 0; printRecordsOfDB < recordsInDB.size(); printRecordsOfDB++) {
            if ((printRecordsOfDB % nameOfColumnsInDB.length) == 0) {
                drawLine();
            }
            System.out.print(recordsInDB.get(printRecordsOfDB) + ":");
        }

        drawLineEnding();


    }
}
