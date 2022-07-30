package app.lib.counting;

public class Counting{
    private static int count = 0;

    public static int getCount(){
        return count;
    }

    public static synchronized void increment(){
        count++;
    }

    public static void reset(){
        count = 0;
    }
}