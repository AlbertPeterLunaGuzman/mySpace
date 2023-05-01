package assignment.pkg2;
import java.util.Scanner;
public class Assignment2 {
    
    
    
    public static void main(String[] args) {
        
        System.out.println("Assignment # 2 (Alogorithm, Flowchart, & Program.)");{
        
            Scanner base = new Scanner(System.in);
            System.out.print("Enter the value of Base: ");
            int Bnum = base.nextInt();{
                
                Scanner height = new Scanner(System.in);
                System.out.print("Enter the value of Height: ");
                int Hnum = height.nextInt();{
                    //Step 1: Input of the values of base and height.
                
                    int Divnum = 2;{
                        
                        double Area = Bnum * Hnum / Divnum;{
                            //Step 2: Computation of the given values of base and height.    
                        
                            System.out.println("The Area of the triangle is: "+Area);{
                                //Step 3: The output of the computed area of the triangle.
                                
                               
                            }
                        }
                    }
                }
            }
        }
    }
}