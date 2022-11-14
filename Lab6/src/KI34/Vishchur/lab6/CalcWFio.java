package KI34.Vishchur.lab6;

import java.io.*;
import java.util.Scanner;


class CalcWFio
{
    /**
     * Method for writing file
     * @param fName file name
     * @throws IOException 
     */
    public void writeResTxt(String fName) throws IOException
    {
        PrintWriter f = new PrintWriter(new FileWriter(fName,true));
        f.printf("%f\n",result);
        f.close();
    }
    /**
     * Method for reading file
     * @param fName file name
     */
    public void readResTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    /**
     * Method for writing binary data into file
     * @param fName file name
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writeResBin(String fName) throws FileNotFoundException, IOException
    {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();

    }
    /**
     * Method for reading binary data from file
     * @param fName file name
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void readResBin(String fName) throws FileNotFoundException, IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }
    /**
     * Method calculating
     * @param x input value
     */
    public void calculate(double x)
    {
        double rad = Math.PI / 180.0;
        result = Math.tan(x*rad);
       
    }
    /**
     * Method returns a result
     */
    public double getResult()
    {
        return result;
    }
    private double result;
    
}
