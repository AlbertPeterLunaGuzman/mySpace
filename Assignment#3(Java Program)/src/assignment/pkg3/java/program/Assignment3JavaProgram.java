package assignment.pkg3.java.program;
import java.util.Scanner;
public class Assignment3JavaProgram {
    public static void main(String[] args) {
        
            System.out.println("Assignment #3 (JavaProgram)");
            
                // Input the first number
                Scanner UInum1 = new Scanner (System.in);
                System.out.print("Please enter the first number: ");
                int Fnum = UInum1.nextInt();
                
                    // Input the second number
                    Scanner UInum2 = new Scanner (System.in);
                    System.out.print("Please enter the second number: ");
                    int Snum = UInum2.nextInt();
                
                        // Conditionals
                    
                        // If the first number is greater than the first number.
                        if(Fnum >= Snum)
                        {
                            System.out.println(Fnum + " is greater than " + Snum);
                        } 
                        
                            // If the first number is less than the second number.
                            else if (Fnum <= Snum)
                            {
                                System.out.println(Fnum + " is less than " + Snum);
                            }
                        
                                // 
                                else if (Fnum >= Snum && Fnum == Snum)
                                {
                                System.out.println(Fnum + " are both equal " + Snum);
                                }
    }
    
}
