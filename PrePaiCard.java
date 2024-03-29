public class PrePaiCard {

    // Assignment {4}

    // Written by: { Hamed Vasheghani farahani 40246686}

    // For COMP 248 Section {COMP 248 R 2232} – Fall 2023

    // --------------------------------------------------------

    // Class PrePaiCard

    // this class contains methods to support the PoS class

    // it does this by containing the cards in the PoS object

    // it contains the students ID, expiry day, expiry month and card type

    // the expiry day and month can be modified with a method it also can return a string of its contents

    // constructors exist to set the values of the instance variables and to duplicate the object

    // there are also getters and setters to modify the object or retrieve information from it

    private int studentID,expiryDay,expiryMonth;
    private String cardType;
    public PrePaiCard(){ // default constructor

studentID=0;

expiryDay=0;

expiryMonth=0;

cardType=null;

    }
   public PrePaiCard(int studentID, int expiryDay, int expiryMonth, String cardType){ // constructor to set all the instance variable

        this.studentID=studentID;

        this.expiryDay=expiryDay;

        this.expiryMonth=expiryMonth;

        this.cardType=cardType;

        if (expiryDay>31||expiryDay<1){ // if an impossible day is inputted it day will be set to 0

            this.expiryDay=0;

        }

        if (expiryMonth>12||expiryMonth<1){ // if an impossible month is inputted it will be set to 0

            this.expiryMonth=0;
        }
    }
    public PrePaiCard(PrePaiCard card){ // copy constructor to duplicate object

    this.studentID=card.studentID;

    this.expiryDay=card.expiryDay;

    this.expiryMonth=card.expiryMonth;

    this.cardType=card.cardType;
    }

    // the following are getters for the classes' attributes
public int getStudentID() { // gets the student ID
    return studentID;
}

public int getExpiryDay() { // gets the expiry day
    return expiryDay;
}
public int getExpiryMonth() { // gets the expiry month
    return expiryMonth;
}
public String getCardType() { // gets the card type
    return cardType;
}

    // the following are setters for the classes' attributes
public void setStudentID(int studentID) { // sets the student ID
    this.studentID = studentID;
}
public void setExpiryDay(int expiryDay) { // sets the expiry day
    this.expiryDay = expiryDay;
}
public void setExpiryMonth(int expiryMonth) { // sets the expiry month
    this.expiryMonth = expiryMonth;
}
public void setCardType(String cardType) { // sets the card type
    this.cardType = cardType;
}

    /**
     * method to return a string of the contents of the object
     * @return gives the contents of the prepaidcard as a string object in the format card type - student ID - dd/mm
     */

public String toString(){ // returns a string of the attributes in the format: cardtype - StudentID- dd/mm
        if (expiryDay<10&&expiryMonth<10) { // if both expiry month and day have a 0, add a 0 behind both
            return cardType+" - "+studentID+" - 0"+expiryDay+"/0"+expiryMonth+".";
        }
    if (expiryMonth<10) { // if only expiry month has a 0, add a 0 behind it
        return cardType+" - "+studentID+" - "+expiryDay+"/0"+expiryMonth+".";
    }
    if (expiryDay<10) { // if only expiry day has a 0, add a 0 behind it
        return cardType+" - "+studentID+" - 0"+expiryDay+"/"+expiryMonth+".";
    }
        return cardType+" - "+studentID+" - "+expiryDay+"/"+expiryMonth+"."; // if neither have a 0, return the string without any 0s added behind them

         }
         public boolean equals(PrePaiCard card) {// checks if the contents of the cards are the same

             return this.studentID==card.studentID&&this.expiryDay==card.expiryDay&&this.expiryMonth==card.expiryMonth&&this.cardType.equals(card.cardType);

         }
}
