import java.awt.*;
public class Circle {

    int x;
    int y;
    String text;
    int radius = 0;

    Color penColor; // Color of circle outline and text

    Circle next;

    // Sets up a circle centered at given (x,y) coordinate
    // Circle contains given text
    public Circle (int x, int y, String text){
        this.x = x;
        this.y = y;
        this.text = text;
        radius = text.length() * 6;
        next=null;
    }

    // Draws the circle declared by the previous constructor
    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE); 
        StdDraw.filledCircle(x, y, radius); // Area of circle will be a white backdrop for text
        StdDraw.setPenColor(penColor);  // Draw circle outline + text in given color
        StdDraw.circle(x, y, radius);
        StdDraw.text(x,y,text); 
    }

    // Sets parameters needed to construct circle
    public void setText(String t){
        text = t;
    }

    public void setColor(Color color){
        penColor = color;
    }

    public String toString(){
        return text;
    }
    public void setCoords(int x, int y){
        this.x = x;
        this.y = y;
    }
}
