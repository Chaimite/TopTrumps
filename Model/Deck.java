package model;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Deck
{
   private ArrayList<Card> deck = new ArrayList<Card>();
   private Stack<Card> individualDeck = new Stack<Card>();
   private Queue<Card> shuffledDeck = new Queue<Card>;
   private Card cards;

   public ArrayList<Card> initialDeck(Card cards)
   {
      deck.add(cards);
      return deck;
   }
   public Queue<Card> shuffledDeck(){
      return 0;
   }
   
   public Stack<Card> individualDeck(Queue<Card> shuffledDeck){
      individualDeck.add(cards);
      return individualDeck;
   }
}
