import java.io.*;
import java.util.*;

/**
 * @version 1.0
 * @since version 1.0
 *
 */
public class App {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        int count;

        String filler;
        Scanner in = new Scanner(System.in);

        File dataFile = new File("lab2.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Enter the size of the square matrix: ");
        nRows = in.nextInt();
        in.nextLine();
        char arr[][] = new char[nRows][];
        for(int i = 0; i < nRows; ++i){
           arr[i] = new char[nRows - i];}
        
        
        
        System.out.print("\nEnter the placeholder: ");
        filler = in.nextLine();

        if(filler.length() != 1)
        {
            System.out.println("The placeholder character was entered incorrectly");
            System.exit(1);
        }
         for (int i = 0; i < nRows; i++)
         {
        	 
        	 for (int j = 0; j < arr[i].length; j++)
             {
            	 arr[i][j]= (char) filler.codePointAt(0);
            	 boolean run = true;
                 count =i;
                 if(j == 0 && i != 0){
                     while(run){
                         System.out.print("  ");
                         count--;
                         if(count == 0){
                             run = false;
                         }
                     }
                 }
            	 System.out.print(arr[i][j]+" ");
            	 
         }
         System.out.println();
    }
    }
    }
