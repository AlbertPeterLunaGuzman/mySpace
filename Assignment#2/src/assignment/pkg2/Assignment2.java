package assignment.pkg2;
import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        
        System.out.println("Assignment # 2 (Algorith, Flowchart, & Program.)");
            
            String UDEC = "YorN";
                
                do {
            
                    //Step 1: User Inputs the variables for Base and Height.
                        Scanner Base = new Scanner (System.in);
                        System.out.print("Enter The value of base: ");
                        int ValOfB = Base.nextInt();

                            Scanner Height = new Scanner (System.in);
                            System.out.print("Enter the Value of Height: ");
                            int ValOfH = Height.nextInt();

                                //Step 2: Computing the User Input values of Base and Height and dividing it by 2.
                                    int Divisor = 2;  

                                        int Area = ValOfB * ValOfH / Divisor;

                                            //Step 3: Display the Computed value of the Area of Triangle
                                                System.out.println("The Area of Triangle is: " + Area);                   

//A simple addon so that the user can do computations endlessly until they want to stop
    Scanner DECBot = new Scanner (System.in);
    System.out.print("Would you like to do another computation? Yes or No? ^_^: ");
    UDEC = DECBot.next();
                }
                while(UDEC.equalsIgnoreCase("Yes"));
                    
                    
                if (UDEC != "YorN")    
                    System.out.println("Bye, User. ^_^");
                else if (UDEC == "YorN")
                    System.out.println("OK");
                else;
                    System.out.println("Fine");
    }   
}