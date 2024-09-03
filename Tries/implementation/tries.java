
public class tries {
   
   static class Node {

      Node childrean[];

      boolean isLeaf;

      Node() {
         
         this.isLeaf = false;

         this.childrean = new Node[256];

         for(int i=0; i<childrean.length; i++) {

            this.childrean[i] = null;
         }


      }
      

   }


   static Node root = new Node();

      
   static void insert(String word) {

      Node temp = root;

      for(int i=0;i<word.length(); i++) {

         int idx = word.charAt(i) - 'a';  // create a uniques index from the 1 to 26 characters // we can generate 1 to 256 indexes

         if(temp.childrean[idx] == null) {
            temp.childrean[idx] = new Node();
         }
         if(i == word.length() -1) {
            temp.isLeaf = true;
         }

         temp = temp.childrean[idx];
      }

   }


   static boolean search(String key) {

      Node temp = root;

      for(int i=0; i<key.length(); i++) {

         int index = key.charAt(i) - 'a';

         if(temp.childrean[index] == null) {
            return false;
         }

         if(i == key.length() -1 && temp.isLeaf == false) 
            return false;


         temp = temp.childrean[index];

      }

      return true;



   }


   static void printTries(Node root, int index) {

      if(root == null) return;
      
      for(int i=index; i<root.childrean.length; i++) {

         if(root.childrean[i] != null) {

            System.out.println((char) i);

            printTries(root.childrean[i], i);

         }

      }

   }


   public static void main(String[] args) {
      

      String[] words = {"hello", "world", "this", "is", "a", "test"};

      for(int i=0; i<words.length; i++) {

         insert(words[i]);
         
      }


      // System.out.println(search("hello"));  // true
      // System.out.println(search("world"));  // true
      // System.out.println(search("thiser"));  // false

      
      printTries(root, 0);

   }




}
