package assignment.pkg2sandboxlooped;
import java.util.Scanner;
public class Assignment2SandboxLooped {
    public static void main(String[] args) {
System.out.println("Assignment # 2 (Alogorithm, Flowchart, & Program.)");{

// Ask the user  to nput "Yes or No".
// After the user Inputs "Yes or No", Decide which action will happen.
Scanner DECBOT = new Scanner(System.in);
        System.out.println("Please Enter Yes or No");
            String DECISION = DECBOT.next();
               
                // These are the possible outcomes of Code block that are going to be executed.
                switch (DECISION){
                    case "Yes":
                        Scanner DECBOT1 = new Scanner(System.in);
                            System.out.println("Would you like to Choose again?");
                                String DECISIONA = DECBOT1.next();
                            break;
                    case "yes":
                        Scanner DECBOT2 = new Scanner(System.in);
                            System.out.println("Would you like to Choose again?");
                                String DECISIONB = DECBOT2.next();
                                        String UserInput = DECISIONB;
                            break;
                    case "No":
                        String DECBOTA = "Yes";
                        String DECBOTB = "No";
                        
                        if (UserInput == DECBOTA)
                            System.out.println("Sorry, Please run it again if you want to get asked to choose.");
                            break;
                        else if (UserInput != DECBOTB) 
                        else
                            System.out.println("I don't really care to be honest, bye User.");
                
                


                }
}
}
}

