import java.util.Scanner;
public class PoSDemo {

    public static void main(String[] args) {

        // Class PoSDemo is the driver class for  this project

        // this class executes the programs from the class PoS

        // premade PoS objects are created to demonstrate the functionality of the PoS class

        // the program has 10 functions, and will loop until the user inputs 0 to quit

        //1. See the content of all PoSs

        // where the user can see the sales of each of the PoSs and their prepaid cards

        //2. See the content of one PoS

        // where the user can see the sales of one of the PoSs and their prepaid cards

        //3. List PoSs with same $ amount of sales

        // where the user can see the PoSs with the same sales total

        //4. List PoS with same number of Sales categories

        // where the user can see pairs of PoSs with the same number of sales categories example: if they both have 3 juniors only for example then they're a pair

        //5. List PoSs with same $ amount of Sales and same number of Prepaid cards

        // where the user can see pairs of PoSs with the same sales total and same number of prepaid cards

        //6. Add a Prepaid card to an existing PoS

        // where the user can add a prepaid card to an existing PoS that they select and enter the information for that card

        //7. Remove an existing Prepaid card from a PoS

        // where the user can remove a prepaid card from an existing PoS that they select and enter the index of the card they want to remove

        //8. Update the expiry date of an existing Prepaid card

        // where the user must input information for the new expiry date of the card they want to update

        //9. Add sales to a PoS

        // where the user can add sales to a PoS that they select and enter the number of each meal they want to add, they recieve the new total after

        //0. To quit

        // where the program loop terminates and the program ends with a farewall message

        Sales salesForPos1and2 = new Sales(1, 2, 3, 4, 5); // creates a sales object with the sales categories for PoS 1 and 2

        PrePaiCard card1 = new PrePaiCard(1, 2, 3, "vegetarian"); // creates a prepaid card object

        PrePaiCard card2 = new PrePaiCard(2, 11, 3, "carnivore");  // creates a prepaid card object

        PrePaiCard[] cardForPos1 = new PrePaiCard[2]; // creates an array of prepaid cards

        cardForPos1[0] = card1; // adds the prepaid cards to the array

        cardForPos1[1] = card2; // adds the prepaid cards to the array

        PoS pos1 = new PoS(salesForPos1and2, cardForPos1); // creates a PoS object with the sales categories and prepaid cards

        PrePaiCard card3 = new PrePaiCard(3, 2, 3, "Omnivore"); // creates a prepaid card object

        PrePaiCard card4 = new PrePaiCard(4, 3, 11, "Keto"); // creates a prepaid card object

        PrePaiCard[] cardForPoS2 = new PrePaiCard[2]; // creates an array of prepaid cards

        cardForPoS2[0] = card3; // adds the prepaid cards to the array

        cardForPoS2[1] = card4; // adds the prepaid cards to the array

        PoS pos2 = new PoS(salesForPos1and2, cardForPoS2); // creates a PoS object with the sales categories and prepaid cards

        // the following code is used to create an object PoS with different sales categories but same total sales price and has 3 prepaid cards

        Sales salesForPoS3 = new Sales(1, 0, 18, 0, 0); // creates a sales object with the sales categories for PoS 3 which has the same sales total as PoS 1 and 2

        PrePaiCard card5 = new PrePaiCard(5, 2, 3, "vegetarian"); // creates a prepaid card object

        PrePaiCard card6 = new PrePaiCard(6, 3, 11, "Keto"); // creates a prepaid card object

        PrePaiCard card7 = new PrePaiCard(7, 2, 3, "vegetarian"); // creates a prepaid card object

        PrePaiCard[] cardForPoS3 = new PrePaiCard[3]; //creates an array of prepaid cards for PoS3

        cardForPoS3[0] = card5; // adds the prepaid cards to the array

        cardForPoS3[1] = card6; // adds the prepaid cards to the array

        cardForPoS3[2] = card7; // adds the prepaid cards to the array

        PoS pos3 = new PoS(salesForPoS3, cardForPoS3); // creates a PoS object with the sales categorgies different from PoS 1 and 2 but same sales total and has 3 prepaid cards

        // the following code is used to create PoS 4 and 5 which have the same breakdown of sales but different from other 3 PoS object and have no prepaid cards

        Sales salesForPoS4and5 = new Sales(6, 7, 8, 9, 10); // creates a sales object with sales different from PoS 1,2 and 3

        PrePaiCard[] cardForPoS4and5 = new PrePaiCard[0]; // creates an array of prepaid cards

        PoS pos4 = new PoS(salesForPoS4and5, cardForPoS4and5);// creates a PoS object with the sales categories different from PoS 1,2 and 3 and has no prepaid cards

        PoS pos5 = new PoS(salesForPoS4and5, cardForPoS4and5);// creates a PoS object with the sales categories different from PoS 1,2 and 3 and has no prepaid cards

        PoS[] posArray = new PoS[5]; // creates an array to store all the PoS objects
        posArray[0] = pos1;
        posArray[1] = pos2;
        posArray[2] = pos3;
        posArray[3] = pos4;
        posArray[4] = pos5;

        Scanner scan = new Scanner(System.in); // creates a scanner object to read user input

        System.out.println("Hello, welcome to the Concordia CostLessBites Catering Sales Counter Program!");

        //the following prints the welcome statement

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("| Welcome to Concordia CostLessBites Catering Sales Counter Application |");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // the following code is used to print the menu and the read input responds to the user's choice

        int response; // response is declared out here inorder to be used in the do while loop

        do {
            System.out.println("| What would you like to do? |");

            System.out.println("| 1 >> See the content of all PoSs |");

            System.out.println("| 2 >> See the content of one PoS |");

            System.out.println("| 3 >> List PoSs with same $ amount of sales |");

            System.out.println("| 4 >> List PoSs with same number of Sales categories |");

            System.out.println("| 5 >> List PoSs with same $ amount of Sales and same number of prepaid cards |");

            System.out.println("| 6 >> Add a PrePaiCard to an existing PoS |");

            System.out.println("| 7 >> Remove an existing prepaid card from a PoS |");

            System.out.println("| 8 >> Update the expiry date of an existing Prepaid card |");

            System.out.println("| 9 >> Add Sales to a PoS |");

            System.out.println("| 0 >> To quit |");

            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

            System.out.println("Please enter your choice and press <Enter>:");

            response = scan.nextInt();

            if (response == 1) {//if the user inputs 1, prints the content of all PoSs

                System.out.println("Content of each PoS:"); // prints the content in ""

                System.out.println("---------------------"); // prints the content in ""

                for (int i = 0; i < posArray.length; i++) { // loops through the array of PoS objects and prints the content of each PoS object and labels each one based on their index

                    System.out.println("PoS #" + i + ":");

                    System.out.print(posArray[i].toString());

                    System.out.println(); // adds an extra line between each PoS object printing
                }

            }

            if (response == 2) {//if the user inputs 2, prints the content of the selected PoSs

                System.out.println("Which PoS you want to see the content of? (Enter number 0 to " + (posArray.length - 1) + "):"); // prompt asking which PoS to see the content of

                int responseFor2 = scan.nextInt(); // records the user's response

                while (responseFor2 < 0 || responseFor2 > posArray.length - 1) { // if the user's response is not within the range of the array, prompts the user to enter a valid response

                    System.out.println("Sorry but there is no PoS number " + responseFor2);

                    System.out.println("--> Try again: (Enter number 0 to " + (posArray.length - 1) + "):");

                    responseFor2 = scan.nextInt();

                }

                System.out.println(posArray[responseFor2].toString());// prints the contents of the selected PoS

            }

            if (response == 3) {//if the user inputs 3, prints the 3. Compare all PoSs and display those pairs that have the same total $ amount of sales along with the $ amount.

                System.out.println("List of PoSs with same total $ Sales:\n"); // prints the content in "

                for (int i = 0; i < posArray.length; i += 1) { // loops through the array of PoS objects

                    for (int j = i + 1; j < posArray.length; j += 1) { // loops through the array of PoS objects+1 to avoid comparing the same PoS object and comparing  the same pair again

                        if (posArray[j].equalsSalesTotal(posArray[i])) { // if the pairs are the same prints the total sales of the PoS objects and the pair

                            System.out.println("PoS # " + (i) + " and PoS # " + (j) + " have the same total sales of $" + posArray[i].totalSalesOfPos());

                        }

                    }

                }

            }

            if (response == 4) { // lists the PoS with the same number of sale categories as pairs with no overlap

                System.out.println("List of PoSs with same Sales categories:\n"); // prints the content in "

                for (int i = 0; i < posArray.length; i++) {

                    for (int j = i + 1; j < posArray.length; j++) {

                        if (posArray[i].equalsSalesSame(posArray[j])) {

                            System.out.println("PoSs " + i + " and " + j + " both have " + posArray[i].salesBreakdown());
                        }

                    }

                }

                System.out.println(); // creates a space between the output and the menu

            }

            if (response == 5) { //  Lists all PoSs pairs that are equal based on the definition of equal in the class PoS. Avoids repetitive displays.

                System.out.println("List of PoSs with same $ amount of sales and same number of PrePaiCards :\n");

                for (int i = 0; i < posArray.length; i++) {

                    for (int j = i + 1; j < posArray.length; j++) {

                        if (posArray[i].equals(posArray[j])) {

                            System.out.println(" PoSs " + i + " and " + j);
                        }

                    }

                }

            }

            if (response == 6) { // adds a prePaiCard to an existing PoS

                System.out.println("Which PoS to you want to add an PrePaiCard to? (Enter number 0 to " + (posArray.length - 1) + "):"); // prompt asking which PoS to add card to

                int responseFor6 = scan.nextInt(); // records the user's response

                while (responseFor6 < 0 || responseFor6 > posArray.length - 1) { // if the user's response is not within the range of the array, prompts the user to enter a valid response

                    System.out.println("Sorry but there is no PoS number " + responseFor6);

                    System.out.println("--> Try again: (Enter number 0 to " + (posArray.length - 1) + "):");

                    responseFor6 = scan.nextInt();

                }
                System.out.println("Please enter the following information so that we may complete the PrePaiCard-");

                System.out.println("--> Type of PrePaiCard (Carnivore, Halal, Kosher, Pescatarian, Vegetarian, Vigan): ");

                String typeOfCard = scan.next();

                System.out.println("--> Id of the prepaid card owner: ");

                int idOfCard = scan.nextInt();

                System.out.println("--> Expiry day number and month (seperate by a space):");

                int dayOfCard = scan.nextInt();

                int monthOfCard = scan.nextInt();

                PrePaiCard cardToAdd = new PrePaiCard(idOfCard, dayOfCard, monthOfCard, typeOfCard);

                posArray[responseFor6].addCard(cardToAdd);

                System.out.println("You now have " + posArray[responseFor6].numberOfCards() + " PrePaiCard(s)");

            }

            if (response == 7) { //removes Remove an existing prepaid card from a PoS

                System.out.println("Which PoS you want to remove an PrePaiCard from? (Enter number 0 to " + (posArray.length - 1) + "):"); // prompt asking which PoS to add card to

                int responseFor7 = scan.nextInt(); // records the user's response

                while (responseFor7 < 0 || responseFor7 > posArray.length - 1) { // if the user's response is not within the range of the array, prompts the user to enter a valid response

                    System.out.println("Sorry but there is no PoS number " + responseFor7);

                    System.out.println("--> Try again: (Enter number 0 to " + (posArray.length - 1) + "):");

                    responseFor7 = scan.nextInt();

                }

                if(posArray[responseFor7].numberOfCards()==0){ // if the PoS has no prepaid cards, prints that it has no prepaid cards

                    System.out.println("Sorry that PoS has no PrePaiCards");


                }

                else{



                System.out.println("Which PrePaiCard do you want to remove? (Enter number 0 to " + (posArray[responseFor7].numberOfCards() - 1) + "):"); // prompt asking which PoS to remove card to

                    int responseFor7_1 = scan.nextInt();

                if (posArray[responseFor7].removeCard(responseFor7_1) ) { // attempts to remove the card, if the card removal fails, returns false and indicates to user and if its succesful says so

                    System.out.println("PrePaiCard was removed successfully");

                }

                }

            }

            if (response == 8) {  // Update the expiry date of an existing Prepaid card

                System.out.println("Which PoS do you want to update an PrePaiCard from? (Enter number 0 to " + (posArray.length - 1) + "):"); // prompt asking which PoS to add card to

                int responseFor8 = scan.nextInt(); // records the user's response

                while (responseFor8 < 0 || responseFor8 > posArray.length - 1) { // if the user's response is not within the range of the array, prompts the user to enter a valid response

                    System.out.println("Sorry but there is no PoS number " + responseFor8);

                    System.out.println("--> Try again: (Enter number 0 to (Enter number 0 to " + (posArray.length - 1) + "):");

                     responseFor8 = scan.nextInt();

                }
                if(posArray[responseFor8].numberOfCards()==0){ // if the PoS has no prepaid cards, prints that it has no prepaid cards

                    System.out.println("Sorry that PoS has no PrePaiCards");

                }

                else {
                    System.out.println("Which PrePaiCard do you want to update? (Enter number 0 to " + (posArray[responseFor8].numberOfCards() - 1) + "):"); // prompt asking which PoS to remove card to

                    int whichPrePaiCard = scan.nextInt();

                    System.out.println("--> Enter new expiry date day number and month (seperate by a space):");

                    int newDay = scan.nextInt();

                    int newMonth = scan.nextInt();

                    posArray[responseFor8].updatePrePaiCard(whichPrePaiCard, newDay, newMonth);

                }

            }

            if (response == 9){

                System.out.print("Which PoS do you want to add Sales to? (Enter number 0 to "+ (posArray.length- 1) + "):"); // promp asking which PoS user wants to add sales to

                int responsefor9=  scan.nextInt(); // records the user's response

                while (responsefor9 < 0 || responsefor9 > posArray.length - 1) { // if the user's response is not within the range of the array, prompts the user to enter a valid response

                    System.out.println("Sorry but there is no PoS number " + responsefor9);

                    System.out.println("--> Try again: (Enter number 0 to (Enter number 0 to " + (posArray.length - 1) + "):");

                    responsefor9 = scan.nextInt();

                }

                System.out.println("How many junior, teen ,medium,big and family meal menu do you want to add?"); // ask user how many of each meal they want to add

                System.out.println("Enter 5 numbers seperated by a space):");

                // the following code is used to record the user's response for each meal
        int junior=scan.nextInt();

        int teen=scan.nextInt();

        int medium=scan.nextInt();

        int big=scan.nextInt();

        int family=scan.nextInt();

        System.out.println("You now have $"+posArray[responsefor9].salesAfterAddMeals(junior,teen,medium,big,family));

            }
if(response<0||response>9) // if the user inputs a number that is not in the menu, prompts the user to enter a valid response

    System.out.println("Sorry that is not a valid choice. Try again.");

        } while (response != 0); // if the user inputs 0, the program ends

        System.out.println("Thank you for using Concordia CostLessBites Catering Sales Counter Application!"); // thanks user for using the

    }

}