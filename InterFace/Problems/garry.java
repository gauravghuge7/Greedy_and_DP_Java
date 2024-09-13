package InterFace.Problems;

public interface garry {


   void printArray();

}


class demo implements garry {

   void printArray() {

      System.out.println("Print Array method");
   }
}



/**
 * Innergarry
 */
class Innergarry {

   public static void main(String[] args) {
      
      demo d = new demo();

      d.printArray();

   }
   
}