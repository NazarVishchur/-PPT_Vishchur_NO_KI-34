package KI34.Vishchur.lab7;

public class Sphere extends Shape {
	public static int maxvalue;
    /**
     * Constructor
     * @param volume
     * @param width
     * @param height
     * @param name
     */
    public Sphere(int volume, int width, int height, String name)
    {
        super(volume, width, height, name);
        if(volume>maxvalue) 
    	{
    	maxvalue = volume;
    	}
    }
    public int getmaxvalue() {return maxvalue;}
}
