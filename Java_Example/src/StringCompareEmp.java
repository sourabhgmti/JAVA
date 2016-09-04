public class StringCompareEmp{
   public static void main(String args[]){
      String str = "Hello World";
      String anotherString = "hello world";
      Object objStr = str;

      System.out.println( str.compareTo(anotherString) );
      System.out.println( str.compareToIgnoreCase(anotherString) );
      System.out.println( str.compareTo(objStr.toString()));
   
      System.out.println("Test 1");
      
      System.out.println("Test 2");  
      
      display();
   }
   
   private static void display()
   {
	   
	   System.out.println("Hello how r u??????????????/");
   }
}