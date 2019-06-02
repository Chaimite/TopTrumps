package Model;

      /**
       * @author Adriano 
       * Decks have cards, and a card has a 
       * description and a 5 categories
       */
public class Card
{
   private String description;
   private int category1;
   private int category2;
   private int category3;
   private int category4;
   private int category5;

   public Card(String description, int category1, int category2, int category3,
         int category4, int category5)
   {
      super();
      this.description = description;
      this.category1 = category1;
      this.category2 = category2;
      this.category3 = category3;
      this.category4 = category4;
      this.category5 = category5;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public int getCategory1()
   {
      return category1;
   }

   public void setCategory1(int category1)
   {
      this.category1 = category1;
   }

   public int getCategory2()
   {
      return category2;
   }

   public void setCategory2(int category2)
   {
      this.category2 = category2;
   }

   public int getCategory3()
   {
      return category3;
   }

   public void setCategory3(int category3)
   {
      this.category3 = category3;
   }

   public int getCategory4()
   {
      return category4;
   }

   public void setCategory4(int category4)
   {
      this.category4 = category4;
   }

   public int getCategory5()
   {
      return category5;
   }

   public void setCategory5(int category5)
   {
      this.category5 = category5;
   }

}
