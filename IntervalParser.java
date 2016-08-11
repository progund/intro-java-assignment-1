public class IntervalParser{
  private int low;
  private int high;
  private int errorCode;
  private String error;

  /* Constructor 
   * This is where you do all the checks.
   *
   * If a check fails, set the error to an appropriate message
   * and the errorCode to a unique number. You may use the
   * following error codes:
   * 1: Wrong number of arguments test fails
   * 2: Integer.parseInt fails
   * 3: low < high check fails
   *
   * If nothing fails, then save the
   * parsed value from args[0] in low,
   * and the parsed value from args[1]
   * in high.
   */
  public IntervalParser(String[] args){
    /* Pseudo code:
       if lenght is 2{
         try{
           parse args and assign low and high
           if(high is less than or equal to low){
             set error code to 3
             set error about low must be < high 
           }
         }catch number format exception
           set error code to 2
           set error about numerical arguments
         }
       }else{
         set error code to 1
         set error about two arguments
       }
     */
  }

  public int getErrorCode(){
    return errorCode;
  }
  
  public boolean couldParse(){
    return error==null;
  }
  
  public String getErrorMessage(){
    return error;
  }
  
  public int low(){
    return this.low;
  }
  
  public int high(){
    return this.high;
  }
}
