

public class PoS {

    // Assignment {4}

    // Written by: { Hamed Vasheghani farahani 40246686}

    // For COMP 248 Section {COMP 248 R 2232} – Fall 2023

    // --------------------------------------------------------

    // Class PoS

    // this class contains methods that will be used in the driver class, it supported by  the classes' Sales and PrePaiCard

    // the PoS class contains the sales and an array of prepaid cards of the PoS object

    // it contains the students ID, expiry day, expiry month and card type

    // it has the ability to hold the number of each type of sale for junior teen medium big and family

    //  it has all the ability of the previous methods sales and prepaid card

    // it also can return a string of its contents  both or just one component

    // it also has the ability to check if the contents within the card are the same

    // it can remove or add cards to the array


    private Sales sales;
    private PrePaiCard[] prePaiCards;

    public PoS() { // default constructor

        sales = new Sales(); // creates a new sales object and initializes it

        PrePaiCard[] prePaiCards = null;//reference for array becomes null

    }

    public PoS(Sales sales, PrePaiCard[] prePaiCards) { // constructor to set all the instance variables ***********

        if (prePaiCards.length == 0) // if the array has no paid cards then the reference of the array is set to null and initializes the sales
        {
            this.prePaiCards = null;

            this.sales = new Sales(sales);
        }
        else {

            this.sales = new Sales(sales); //changes the contents of sales object

            this.prePaiCards=prePaiCards; // variable is a reference to the argument array
          }


        }

    /**
     * method to check the sales total of two PoS objects returns true if so and false otherwise
     * @param pos the PoS object that will be compared to the current PoS object
     * @return returns true if the sales total of both PoS objects are the same
     */
    public boolean equalsSalesTotal(PoS pos) { // equals method to compare the total sales of two PoS objects

        return this.sales.salesTotal() == pos.sales.salesTotal();

    }

    /**
     * method to check if the contents of the sales objects are the same
     * @param pos the PoS object that will be compared to the current PoS object
     * @return returns true if the contents are the same and false otherwise
     */
    public boolean equalsSalesSame(PoS pos) { // checks if the contents inside the sales objects are the same

        return this.sales.equals(pos.sales);

    }

    /**
     * method to return the total sales of the objecty
     * @return returns the total sales of the object as an integer
     */
public int totalSalesOfPos(){// returns the total sales of the PoS object

        return sales.salesTotal();

    }

    /**
     * method to return the number of prepaid cards in the array
     * @return returns the length of the array and if its null returns 0
     */
    public int numberOfCards() {// returns the number of cards in the array

        if (prePaiCards == null) // if the array is null returns 0

            return 0;

        return prePaiCards.length;

    }

    /**
     * method to add the number of prepaid cards in the array, creates a new array if the array is null and adds the card to the array
     * param card the prepaid card that will be added to the array
     * @return returns length of the array
     */
    public int addCard(PrePaiCard card) { // adds a card to the array an expands the array by 1 and returns the new number of cards

        if (prePaiCards==null){ // if the prepaicards is  null (never created)

            prePaiCards=new PrePaiCard[1];

            prePaiCards[0]=card;

            return numberOfCards();

        }
        PrePaiCard[] temp= new PrePaiCard[prePaiCards.length+1];

        for (int i=0; i<temp.length-1;i++){

            temp[i]=this.prePaiCards[i];

        }

        temp[temp.length-1]=card;

        this.prePaiCards=temp;

        return numberOfCards();

    }

    /**
     * method to remove the prepaid card at a specific index
     * @param indexOfCard the index of the card that will be removed
     * @return returns true if it succeeded and false if failed (if the array is empty)
     */


    public boolean removeCard(int indexOfCard) {// removes a card from the prepaicard array returns false if failed to do so

        if (indexOfCard == 0 ) // if the array is empty returns false

            return false;

        else {

            PrePaiCard[] temp = new PrePaiCard[prePaiCards.length - 1];

            for (int i = 0; i < indexOfCard; i++) {

                temp[i] = prePaiCards[i];
            }

            for (int i = indexOfCard; i < temp.length; i++) {

                temp[i] = prePaiCards[i + 1];

            }

            prePaiCards = temp;

            return true;

        }

    }

    /**
     *  method to update the expiry date of the prepaid card
     * @param indexOfCard the index of the card that will be updated from the PoS array
     * @param day the new day that will be set
     * @param month the new month that will be set
     */
    public void updatePrePaiCard(int indexOfCard, int day, int month) { // changes the expirary date of a card that is selected from index

        prePaiCards[indexOfCard].setExpiryDay(day);

        prePaiCards[indexOfCard].setExpiryMonth(month);

    }

    /**
     * method to add new sales to the PoS object, returns the new sales total
     * @param junior the number of juniors that will be added
     * @param teen the number of teens that will be added
     * @param medium the number of mediums that will be added
     * @param big  the number of bigs that will be added
     * @param family the number of families that will be added
     * @return returns the new sales total after adding the new sales
     */
    public int salesAfterAddMeals(int junior,int teen, int medium, int big, int family){// add sales to the meal categories and returns new sales total

        sales.addSales(junior,teen,medium,big,family);

        return sales.salesTotal();

         }

    /**
     * method to check if the pos objects have the same sales total and number of prepaid cards
     * @param pos the pos object that will be compared to the current pos object
     * @return returns true if the sales total and number of prepaid cards are the same and false otherwise
     */
    public boolean equals(PoS pos){// checks if the two PoS objects have the same amount of sales total and number of prepaid cards, if both true returns true, false otherwise

        if (this.prePaiCards==null&&pos.prePaiCards==null) // if both arrays are null. checks if sales total is the same as they both dont have cards, avoid null error

            return this.sales.salesTotal()==pos.sales.salesTotal(); // returns true if both sales total are the same

        return this.sales.salesTotal()==pos.sales.salesTotal()&&this.prePaiCards.length==pos.prePaiCards.length; // checks if both card contents and sales total are the same

         }

    /**
     * method to return a string of the contents of the pos object ( its sales and the prepaid cards), if there is no prepaid cards it returns sales and states there are no prepaid cards
     * @return returns a string of the contents of the pos object
     */

    public String toString(){ // returns a string version of the sales of the pos and its card contents

String toReturn= sales.toString()+"\n";

if (prePaiCards==null){ // if the card is null returns no prepaid cards with the sales

    return toReturn+"No pre-paid cards\n";

}

for (int i=0;i< prePaiCards.length;i++){ // stores all the prepaid cards in a string

if(prePaiCards[i]==null){

    toReturn+="No pre-paid cards\n";

    continue;

}

    toReturn+=prePaiCards[i].toString()+"\n"; // adds each index of prepaid card and adds a new line

}

return toReturn; // returns the looped string

}

/**
     * method to return a string of the sales breakdown in the format number of juniors x $5 + number of teens x $10 + number of mediums x $12 + number of bigs x $15 + number of families x $20
     * @return returns a string of the sales , the number of each meal sold and their price
     */
public String salesBreakdown(){// returns a string giving the breakdown of the sales

        return sales.toString();

         }

}
