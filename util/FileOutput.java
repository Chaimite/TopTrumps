package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Card;

public class FileOutput
{
   // Method to retrieve the field names
   public static String[] getFieldNames(String filePath)
   {
      File file = new File(filePath);
      String[] values = null;
      try
      {
         Scanner inputStream = new Scanner(file);
         String line = inputStream.nextLine();
         values = line.split(";");
         inputStream.close();
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      return values;
   }

   // Method to retrieve the data from a .txt file and create an array list with
   // objects of type Card
   public static ArrayList<Card> getCards(String filePath)
   {
      File file = new File(filePath);
      ArrayList<Card> cards = new ArrayList<Card>();
      try
      {
         Scanner inputStream = new Scanner(file);
         inputStream.nextLine();
         while (inputStream.hasNextLine())
         {
            String data = inputStream.nextLine();
            String[] values = data.split(" ");

            Card a = new Card(values[0], values[1], values[2], values[3], values[4], values[5]);
            cards.add(a);

         }
         inputStream.close();
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      return cards;
   }
   public static void main(String[] args) {
      String filePath = "C:\\Users\\Adriano\\eclipse-workspace\\TopTrumps\\src\\StarCitizenDeck.txt";
      ArrayList<Card> cards = getCards(filePath);
      for (Card card : cards)
      {
         System.out.println(card.getDescription() + " " +card.getCategory1());
      }
   }

}
