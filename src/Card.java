public class Card {
    private int cardValue;
    private int cardSuit;
    private String cardName;
    private static int numCards = 0;

    public Card() {
        cardValue = 0;
        cardSuit =0;
        cardName = "Joker";
        numCards++;
   
    }

    public Card(int value, int suit) {
        cardValue = value;
        cardSuit = suit;

        if(cardValue ==0){
            cardName = "Joker";
        } else if(cardValue == 1){
            cardName = "Ace of ";
        } else if(cardValue/11 != 1 && cardValue <= 10){
            cardName = String.valueOf(cardValue) + " of ";
        } else if(cardValue == 11){
            cardName = "Jack of ";
        } else if(cardValue == 12){
            cardName = "Queen of ";
        } else {
            cardName = "King of ";
        }

        if(cardSuit == 0){
            cardName = "Joker";
        } else if(cardSuit == 1){
            cardName = cardName + "Spades";
        } else if(cardSuit == 2){
            cardName = cardName + "Clubs";
        } else if(cardSuit == 3){
            cardName = cardName + "Diamonds";
        } else if(cardSuit == 4){
            cardName = cardName + "Hearts";
        } else {
            cardName = "invalid card";
        }
        numCards++;
      

    
    }

    public int getValue(){
        return this.cardValue;
    }

    public int getSuit(){
        return this.cardSuit;
    }

    public void setVal(int num){
        cardValue = num;
    }

    public void setSuit(int num){
        cardSuit = num;
    }

    public String toString(){
        return cardName;
    }

    public static int getNumCards(){
        return numCards;
    }


}
