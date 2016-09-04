public class StringCompareEmp{
   public static void main(String args[]){
      String str = "Hello World";
      String anotherString = "hello world";
      Object objStr = str;

      System.out.println( str.compareTo(anotherString) );
      System.out.println( str.compareToIgnoreCase(anotherString) );
      System.out.println( str.compareTo(objStr.toString()));
   
      System.out.println("------------------------------------------------");
      System.out.println("Test 1");
      
      System.out.println("Test 2");
      
      System.out.println("------------------------------------------------:)");
      
      //Sonar install and config
      //https://www.youtube.com/watch?v=y49luBErHBk
   }
   
}
