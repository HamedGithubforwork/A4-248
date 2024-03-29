public class Sales {

    // Assignment {4}

    // Written by: { Hamed Vasheghani farahani 40246686}

    // For COMP 248 Section {COMP 248 R 2232} – Fall 2023

    // --------------------------------------------------------

    // Class sales

    // this class contains methods to support the PoS class

    // it does this by containing the sales that occcur in the PoS object

    // it has the ability to hold the number of each type of sale for junior teen medium big and family

    // it has the ability to also calculate the total sales value, change the number of sales, check if two different sales are the same in contents

    // or it can check if the sales values have the same total value it also can return a string of its contents

    // constructors exist to set the values of the instance variables and to duplicate the object

    // there are also getters and setters to modify the object or retrieve information from it



    // the following constants are the costs of each type of sale
    private final int COST_PER_JUNIOR = 5;
    private final int COST_PER_TEEN = 10;
    private final int COST_PER_MEDIUM = 12;

    private final int COST_PER_BIG = 15;
    private final int COST_PER_FAMILY = 20;

    // the following variables are the declarations of how many sales of each ticket
    private int numberOfJunior, numberOfTeen, numberOfMedium, numberOfBig, numberOfFamily;

    public Sales() { // default constructor, must be added since we have other constructors

        numberOfJunior=0;

        numberOfTeen=0;

        numberOfMedium=0;

        numberOfBig=0;

        numberOfFamily=0;
    }

    public Sales(int junior, int teen, int medium, int big, int family) { // constructor allowing to set number of sales

        this.numberOfJunior = junior;

        this.numberOfTeen = teen;

        this.numberOfMedium = medium;

        this.numberOfBig = big;

        this.numberOfFamily = family;

    }

    public Sales(Sales sales) { // copy constructor for sales if wanting to duplicate object

        numberOfJunior = sales.numberOfJunior;

        numberOfTeen = sales.numberOfTeen;

        numberOfMedium = sales.numberOfMedium;

        numberOfBig = sales.numberOfBig;

        numberOfFamily = sales.numberOfFamily;

    }


    public int getNumberOfJunior() { // gets the number of juniors sold in the object

        return numberOfJunior;

    }

    public int getNumberOfTeen() { // gets the number of teens sold in the object

        return numberOfTeen;

    }

    public int getNumberOfMedium() { // gets the number of mediums sold in the object

        return numberOfMedium;

    }

    public int getNumberOfBig() { // gets the number of bigs sold in the object

        return numberOfBig;

    }

    public int getNumberOfFamily() { // gets the number of families sold in the object

        return numberOfFamily;

    }

    public void setNumberOfJunior(int numberOfJunior) { // sets the number of juniors sold in the object

        this.numberOfJunior = numberOfJunior;

    }

    public void setNumberOfTeen(int numberOfTeen) { // sets the number of teens sold in the object

        this.numberOfTeen = numberOfTeen;

    }

    public void setNumberOfMedium(int numberOfMedium) { // sets the number of mediums sold in the object

        this.numberOfMedium = numberOfMedium;

    }

    public void setNumberOfBig(int numberOfBig) { // sets the number of bigs sold in the object

        this.numberOfBig = numberOfBig;

    }

    public void setNumberOfFamily(int numberOfFamily) { // sets the number of families sold in the object

        this.numberOfFamily = numberOfFamily;

    }

    /**
     * method to add sales to the object
     * @param juniorsToAdd the amount of new juniors to add
     * @param teenToAdd the amount of new teens to add
     * @param mediumToAdd the amount of new mediums to add
     * @param bigToAdd the amount of new bigs to add
     * @param familyToAdd the amount of new families to add
     */
    public void addSales(int juniorsToAdd, int teenToAdd, int mediumToAdd, int bigToAdd, int familyToAdd) { // method to add sales

        numberOfJunior += juniorsToAdd;

        numberOfTeen += teenToAdd;

        numberOfMedium += mediumToAdd;

        numberOfBig += bigToAdd;

        numberOfFamily += familyToAdd;

    }

    /**
     * method to calculate the total sales price
     *return the total sales price
     */
    public int salesTotal() {// method to calculate the total sales price and return in

        return numberOfJunior * COST_PER_JUNIOR + numberOfTeen * COST_PER_TEEN + numberOfMedium * COST_PER_MEDIUM + numberOfBig * COST_PER_BIG + numberOfFamily * COST_PER_FAMILY;

    }

    /**
     * method to return a string of the number of each meal sold in the format number of juniors x $5 + number of teens x $10 + number of mediums x $12 + number of bigs x $15 + number of families x $20
     *
     * @return returns the string of the number of each meal sold
     */
    public String toString() { //method to return a string of the number of each meal sold, overrides to string method

        return   +numberOfJunior + " x $5 + " + numberOfTeen +" x $10 + "+numberOfMedium + " x $12 + " + numberOfBig + " x $15 + " + numberOfFamily+ " x $20 ";

    }

    /**
     * method to check if two sales objects have the same contents
     * @param sales1 the sales object to compare to
     * @return returns true if the contents are the same, false otherwise
     */
    public boolean equals(Sales sales1) { // method checks if the objects have the same contents or not , returns false if not and true if yes

        return this.numberOfJunior == sales1.numberOfJunior && this.numberOfTeen == sales1.numberOfTeen && this.numberOfMedium == sales1.numberOfMedium && this.numberOfBig == sales1.numberOfBig && this.numberOfFamily == sales1.numberOfFamily; // returns true if the contents are the same false otherwise

    }

}
