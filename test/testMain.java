package test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;

import util.FileOutput;
import model.Card;
import model.Deck;


public class testMain
{

   public static void main(String[] args)
   {
      
      testReader();
      testCard();
      testDeck();
   }

   public static void testReader() {
      Path path = FileSystems.getDefault().getPath(".").toAbsolutePath();
      String filePath = path.toString() + "\\src\\StarCitizenDeck.txt";
      
      FileOutput.getCards(filePath);
      FileOutput.getFieldNames(filePath);
   }
   public static void testCard() {
      Card card = new Card("Rocky", "10", "8", "6", "7", "5");
      System.out.println("Show the rocky card");
      System.out.println(card.toString());
      
   }
   public static void testDeck() {
      Card card1 = new Card("Rocky", "10", "8", "6", "7", "5");
      Card card2 = new Card("Cluber Lang", "8", "9", "5", "9", "10");
      Card card3 = new Card("Appollo Creed", "9", "8", "5", "10", "5");
      Card card4 = new Card("Ivan Drago", "10", "10", "10", "10", "5");
      ArrayList<Card> deck = new ArrayList<Card>();
      deck.add(card1);
      deck.add(card2);
      deck.add(card3);
      deck.add(card4);
      System.out.println(deck);
      Deck.getShuffledDeck(deck);
      System.out.println(deck);
      
   }
}
