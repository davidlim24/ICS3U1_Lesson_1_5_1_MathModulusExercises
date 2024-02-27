class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblCircumference; 
    int intRadius;
    int intNum2;
    intNum2 = 2;

    intRadius = readInt("what is Radius?");

  System.out.println("radius is:" + intRadius);
  dblCircumference = (intNum2 * intRadius * Math.PI);
  System.out.println("circumference is: " + dblCircumference);



  }
}