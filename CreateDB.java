package commandLineDatabase.grabarczykTomasz;

import java.util.ArrayList;

class CreateDB extends Variables {

    void drawDatabase() {

        String[] enterData = {"   FirstName   ", "    LastName   ", "  Age  ", "  Gender  "};
        ArrayList<String> userValues = new ArrayList<>();

        System.out.print("Enter how many records it will be: ");
        setNumberOfRecords(getUserInput().nextInt());

        for (int i = 0; i < getNumberOfRecords(); i++) {
            if (i == 0 || (i % 4) == 0) {
                System.out.print("Enter first name: ");
            } else if (i == 1 || (i % 4) == 1) {
                System.out.print("Enter last name: ");
            } else if (i == 2 || (i % 4) == 2) {
                System.out.print("Enter age: ");
            } else if (i == 3 || (i % 4) == 3) {
                System.out.print("Enter gender: ");
            }
            userValues.add(getUserInput().next());
        }
        drawLine();

        for (String printData : enterData) {
            System.out.print(printData + " : ");
        }

        drawLine();

        for (int printData = 0; printData < userValues.size(); printData++) {
            if (printData == 4) {
                drawLine();
            }
                System.out.print(userValues.get(printData) + "   :    ");
        }

        drawLineEnding();


    }
}
