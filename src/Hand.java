import java.util.ArrayList;
public class Hand {
    private ArrayList<Card> hand = new ArrayList<Card>();

    public Hand(Deck deck, int number){
        for(int i = 0; i < number; i++){
            hand.add(deck.drawCard());
        }
    }

    public int cardPresent(int value, int suit){
        int exists = -1;
        for(int i = 0; i < hand.size(); i++){
            if(hand.get(i).getSuit() == suit && hand.get(i).getValue() == value){
                exists = i;
        }
        }
        return exists;
    }

    public Card playCard(int value, int suit){
        Card specific = null; 
        for(int i = 0; i < hand.size(); i++){
            if(hand.get(i).getSuit() == suit && hand.get(i).getValue() == value){
                specific = hand.get(i);
                hand.remove(i);
        }
        }
        return specific;
    }

    public void addCard(int value, int suit){
        hand.add(new Card(value, suit));
    }

    public void printHand(){
        
        for(int i = 0; i < hand.size(); i++){
            System.out.println(hand.get(i));
        }
    }

    public boolean isSorted(){
        boolean state = true;
        for(int i = 0; i < hand.size()-1; i++){
            if(hand.get(i).getValue() > hand.get(i + 1).getValue()){
                state = false;
            }
            // System.out.println(hand.get(i).getValue());
        }
        return state;
    }
    

    public void sortHand(){
        while(isSorted() == false){
            
            for(int i = hand.size() - 1; i > 0; i--){
                
                while(hand.get(i).getValue() < hand.get(i - 1).getValue()){
                    Card temp = hand.get(i - 1);
                    hand.set(i-1, hand.get(i));
                    hand.set(i, temp );
                }
            }
            
            isSorted();
            // System.out.println("im here");
        }

    }




}
