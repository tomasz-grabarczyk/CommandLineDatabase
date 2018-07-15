package commandLineDatabase.grabarczykTomasz;

public class Main {

    public static void main(String[] args) {
        Variables variables = new Variables();

        System.out.print("(N)ormal or (T)est: ");
        if (variables.getUserInput().hasNext("N") || variables.getUserInput().hasNext("n")) {
            CreateDB createDB = new CreateDB();
            createDB.drawDatabase();
        } else if (variables.getUserInput().hasNext("T") || variables.getUserInput().hasNext("t")) {
            CreateDBTest createDBTest = new CreateDBTest();
            createDBTest.drawDatabase();
        }
    }
}
