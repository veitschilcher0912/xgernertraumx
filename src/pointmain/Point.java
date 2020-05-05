package pointmain;

public class Point {
    public static int pointCounter = 0;
    private int x;
    private int y;
    
    public Point() {
        this(0, 0); // ruft Point(0, 0) Konstruktor auf
        pointCounter++;
    }
     
    public Point(int x, int y) {
        setLocation(x, y);
    }
    
    public static void resetPointCounter() {
        pointCounter = 0;
    }
    
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
       
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
      
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }
}

