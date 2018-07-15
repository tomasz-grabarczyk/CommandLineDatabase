package commandLineDatabase.grabarczykTomasz;

import java.util.ArrayList;
import java.util.List;

class CreateDBTest extends Variables {

    void drawDatabase() {

        String[] nameOfColumnsInDB = {"FirstName      ", "LastName       ", "Age            ", "Gender         ", "Nationality    ", "E-mail         ", "Phone Number   "};
        List<String> addRecordsListOne = List.of(
                "Tadeusz", "Ptak", "42", "Male", "Georgia", "tapt@ex.com", "152 487 062",
                "Tomasz", "Grabarczyk", "27", "Male", "Poland", "tgra@ex.com", "659 548 595",
                "Balladyna", "Zielona", "31", "Female", "Germany", "wezi@ex.com", "595 846 587",
                "Gabriel", "Anioł", "28", "Male", "Canada", "gani@ex.com", "954 862 105",
                "Telimena", "Pasztetowa", "22", "Female", "Greek", "atpa@ex.com", "468 520 124",
                "Wromb", "Xilorin", "19", "Male", "Martinika", "wrlo@ex.com", "655 452 102");

        ArrayList<String> recordsInDB = new ArrayList<>(addRecordsListOne);

        drawLine();

        for (String printColumnsOfDB : nameOfColumnsInDB) {
            System.out.print(printColumnsOfDB + ":");
        }

        for (int printRecord = 0; printRecord < recordsInDB.size(); printRecord++) {
            while (recordsInDB.get(printRecord).length() != 15) {
                recordsInDB.set(printRecord, recordsInDB.get(printRecord) + " ");
            }
        }

        for (int printRecordsOfDB = 0; printRecordsOfDB < recordsInDB.size(); printRecordsOfDB++) {
            if ((printRecordsOfDB % 7) == 0) {
                drawLine();
            }
            System.out.print(recordsInDB.get(printRecordsOfDB) + ":");
        }

        drawLineEnding();

    }
}
