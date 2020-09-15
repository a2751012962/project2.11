//----------------------------------------------------------------------------
//robotcasher           author: Zeming Li (Micahel Li)
//determine the fewest number of each bill to give to change from a scaned
//
//max allows 13 digits before the decimal 
//and 3 digits after the decimal at the same time
//(I don't think you will be able to carry this much cash... THEY WILL CRASH YOU
//so I upgrade with a trillion bill, have fun)(never mind, too hard...)
//----------------------------------------------------------------------------
//1.added casting to work without narrowing error,
//2.changed int num to long num so can calculate larger number,
//3.scanned money*100 to work with quater-penny lines 
//4.scanned money/100 at the end to calculate the left [for people who have more 
//  digits after the decimal than 2](leftafterP)
//5.How
//
// user input
//
//----------------------------------------------------------------------------

//Imports
import java.util.Scanner;


public class robotcasher 
{
    public static void main(String[] args)
    {
            Scanner scan = new Scanner (System.in);
            double money;
            
            //variable
            long numTens, numFives, numOnes, numQuaters, numDimes, numNickles, 
                numPennies;
            double leftafterT, leftafterF, leftafterO, leftafterQ, leftafterD, 
                leftafterN;
            float leftafterP;
            
           
            
            
            //prompt the user to input a monetary value
            System.out.print("How much money do you want to pay to me: ");
            
            //Scan for a double value
            money = scan.nextDouble();
            
            money = money * 100;
            
           
            
            
            
            
            
            //figure out how many tens I need to give as change
            numTens = (long)money/1000;
            //figure out how much is left over after tens
            leftafterT = money - numTens*1000;
            //figure out how many fives I need to give as change
            numFives = (long)leftafterT/500;
            //figure out how much is left over after fives
            leftafterF = money - numFives*500 - numTens*1000;
            //figure out how many ones I need to give as change
            numOnes = (long)leftafterF/100;
            //figure out how much is left over after ones
            leftafterO = money - numOnes*100 - numFives*500 - numTens*1000;
            //figure out how many quaters I need to give as change
            numQuaters = (long)leftafterO/25;
            //figure out how much is left over after quaters
            leftafterQ = money - numQuaters*25 - numOnes*100 - numFives*500 
                         - numTens*1000;
            //figure out how many dimes I need to give as change
            numDimes = (long)leftafterQ/10;
            //figure out how much is left over after dimes
            leftafterD = money - numDimes*10 - numQuaters*25 - numOnes*100
                         - numFives*500 - numTens*1000;
            //figure out how many nickles I need to give as change
            numNickles = (long)leftafterD/5;
            //figure out how much is left over after nickles
            leftafterN = money - numNickles*5 - numDimes*10 - numQuaters*25
                         - numOnes*100 - numFives*500 - numTens*1000;
            //figure out how many pennies I need to give as change
            numPennies = (long)leftafterN/1;
            //figure out how much is left over after pennies
            leftafterP = (float)(money - numPennies - numNickles*5 - numDimes*10
                        - numQuaters*25 - numOnes*100 - numFives*500 
                        - numTens*1000)/100;
            
            //show the result
            System.out.println("You are going to pay " + numTens + " tens, " 
                                                + numFives + " fives, " 
                                                + numOnes + " ones, " 
                                                + numQuaters + " quaters, " 
                                                + numDimes + " dimes," 
                                                + numNickles + " nickles and " 
                                                + numPennies + " pennies, "
                                                + "and here is the left "
                                                + leftafterP + " money "
                                                + "(No bargaining!).");
    }
    
}
