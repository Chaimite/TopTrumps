package test;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import util.FileOutput;


public class testMain
{

   public static void main(String[] args)
   {
      
      testReader();
   }

   public static void testReader() {
      Path path = FileSystems.getDefault().getPath(".").toAbsolutePath();
      String filePath = path.toString() + "\\src\\StarCitizenDeck.txt";
      
      FileOutput.getCards(filePath);
      FileOutput.getFieldNames(filePath);
   }
}
