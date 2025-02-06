
public class Deck {
    private Card[] deck = new Card[52];
    
    public Deck(){
        int index = 0;
        for(int i = 1; i <= 6; i++){
            for(int n = 1; n <= 13; n++){
                if(i <= 4){
                    deck[index] = new Card(n, i);
                    index++;
                    // System.out.println(card.getNumCards());
                }
            }
        }
        shuffle();
    }

    public void shuffle(){
        for (int i = 0; i < 52; i++){
            int rand = (int)(Math.random()*52); 
                Card first = deck[i];
                Card second = deck[rand];
                deck[i] = second;
                deck[rand] = first;
        }
    }

    public String toString(){
        
        return "Deck of " + deck.length + " Cards";
    }

    public Card drawCard(){
        Card placeholder = deck[0];
        Card[] tempdeck = new Card[deck.length-1];
        for (int i = 0; i < deck.length-1; i++){
            tempdeck[i] = deck[i+1];
        }
        deck = tempdeck;
        // this.printAllCards();
        return placeholder;
    }

    public void printAllCards(){
        for (Card i : deck){
            System.out.println(i);
        }
    }
}