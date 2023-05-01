package assignment.pkg3ccprgg1l;
import java.util.Scanner;
public class Assignment3Ccprgg1l {
 
        public static void main(String[] args) {

            System.out.println("Assignment # 3");
            //Step 1: User Inputs 2 numbers 
            {
                //Step 1.1: User inputs the first number.
                    Scanner UINum1 = new Scanner (System.in);
                    System.out.print("Enter the First number: ");
                    int FNum = UINum1.nextInt();

                //Step 1.2: User inputs the first number.
                    Scanner UINum2 = new Scanner (System.in);
                    System.out.print("Enter the Second number: ");
                    int SNum = UINum2.nextInt();
            
                    
                    //Step 2: Conditionals

                        //Step 2.1: If the First number is equal to Second number
                        if((FNum - SNum) == 0)
                        {
                        System.out.println(FNum + " is equal to " + SNum);
                        }

                            //Step 2.2: If the First number is less than the Second number
                            else if(FNum <= SNum)
                            {
                                System.out.println(FNum + " is less than " + SNum);
                            }

                                //Step 2.3: If the First number is greater than the Second number
                                else if(FNum >= SNum)
                                {
                                    System.out.println(FNum + " is greater than " + SNum);
                                }

                                 
        }
    }  
}
































