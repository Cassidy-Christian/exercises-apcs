
public class Example
{  
  public static void main ( String[] args )  
  {
    long   hoursWorked  ; // hoursWorked is declared without an initial value      
    double payRate      ; // hoursWorked is declared without an initial value
    float       taxRate     ; // hoursWorked is declared without an initial value   
    System.out.println("Hours Worked: " + 
        hoursWorked );
    System.out.println("pay Amount  : " + 
        (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + 
        (hoursWorked * payRate * taxRate) );
  }
}