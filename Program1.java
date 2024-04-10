class Main extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {  
    String combined = combineStr("Hello", "World");
    System.out.println(combined);
  }

  private String combineStr(String string1, String string2){
    return string1+string2;
  }

}