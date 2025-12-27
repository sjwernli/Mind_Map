import java.awt.*;

public class Line {
    Circle c1;
    Circle c2;

    Color penColor;
    Line next;

    // Sets up a line between two circles with a given color
    public Line (Circle c1, Circle c2, Color color) {
        this.c1 = c1;
        this.c2 = c2;
        penColor = color;
        next=null;
    }

    // Draws the line declared by the previous constructor
    public void draw(){
        StdDraw.setPenColor(penColor);
        StdDraw.line(c1.x,c1.y,c2.x,c2.y);
    }
}
