package KI34.Vishchur.lab6;
import java.io.*;
import java.util.Scanner;

/**
 * Class App
 * @version 1.0
 */
public class App {
    /**
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        CalcWFio obj = new CalcWFio();
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter data: ");
        //double data = s.nextDouble();
        //obj.calculate(data);
        //obj.writeResTxt("lab6.txt");
        for(double i=20; i<=60; i+=10)
        {
        	obj.calculate(i);
        	obj.writeResTxt("lab6.txt");
        }
        
        //System.out.println("Result is: " + obj.getResult());
        //obj.writeResTxt("lab6.txt");
        //obj.writeResBin("lab6.bin");
        //obj.readResBin("lab6.bin");
        //System.out.println("Result is: " + obj.getResult());
        //obj.readResTxt("lab6.txt");
        //System.out.println("Result is: " + obj.getResult());
        
    }
}

/**
 * Class CalcWFio
 * @version 1.0
 */
