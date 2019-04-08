package bankv2;

public class HomeScreen {
    private void loginPage() {

        System.out.println("Welcome to Selina's Banking Solutions.\nPlease enter your userID:");
        String userTyped = fromConsole.nextLine();

        int counter = 1;

        while(notLoggedIn) {

            if (userTyped.equals(userID)) {

                System.out.println("UserID: " + userID + "\nPassword:");
                String c = fromConsole.nextLine();

                if (c.equals(password) && counter <= 3) {
                    getAccountInfo(userID, password);
                } else if (counter>3){
                    System.out.println("AccountLockout");
                    notLoggedIn = false;
                }
                else {
                    System.out.println("Agents of SHIELD are on their way!!!\nBetter pack up & ship out.\n");
                    System.out.println("Number of attempts " + counter);
                    counter++;
                }
            }
            else {
                System.out.println("INCORRECT!\nTry again.\n");
            }
        }

    }

    public static void main (String[] args){


    }

}
