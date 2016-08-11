public class TestGuesser{
  private static boolean isToStringOverridden(){
    return ! new Guesser(0,1).toString().startsWith("Guesser@");
  }
  private static boolean testConstructor(int low, int high){
    return new Guesser(low, high).toString().equals("low: " + 
                                                    low + 
                                                    " high: " +
                                                    high);
  }
  private static void printToStringError(){
    System.err.println("You must override toString() in Guesser.");
    System.out.println("public String toString(){");
    System.out.println("  return \"low: \" + low + \" high: \" + high;");
    System.out.println("}");
  }
  
  public static void main(String[] args){

    if(!isToStringOverridden()){
      printToStringError();
      System.exit(1);
    }

    int low=0;
    int high;
    System.out.println("Running tests...");
    for(high=1;high < 1000000; high *=10){
      System.out.print("Guesser("+low+", "+high+"): ");
      System.out.println(testConstructor(low,high)?"Pass!":"Fail!");
    }
    
  }
  
}
