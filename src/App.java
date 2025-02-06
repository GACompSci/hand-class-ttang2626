import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {

        ArrayList nums = new ArrayList<>();
        nums.add(10);
        nums.set(0,2);
        nums.remove(0);
        System.out. println(nums);
        // Use nested loops to create a full deck (plus two Jokers)
        // printing each card as you create it. 


        // for(int i = 1; i <= 6; i++){
        //     for(int n = 1; n <= 13; n++){
        //         if(i <= 4){
        //             Card card = new Card(n, i);
        //             System.out.println(card.toString());
        //             // System.out.println(card.getNumCards());
        //         }
        //     }
        //     if (i > 4){
        //         Card joker = new Card();
        //         System.out.println(joker.toString());
        //     }

        // }
        Deck deck = new Deck(); 
        
        // System.out.println(deck.drawCard());
        // System.out.println(deck.drawCard());
        // System.out.println(deck);

        Hand hand = new Hand(deck, 4);
        hand.addCard(2,2);
        System.out.println(hand.playCard(2,2));
        System.out.println(hand.cardPresent(5,1));

        
        hand.printHand();
        // System.out.println(hand.isSorted());
        // hand.sortHand();
        
        // hand.printHand();

        
        
        // System.out.println(Card.getNumCards());
    }
}
