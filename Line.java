import java.awt.*;

public class Line {
    Circle c1;
    Circle c2;

    Color penColor;
    Line next;

    public Line (Circle c1, Circle c2, Color color) {
        this.c1 = c1;
        this.c2 = c2;
        penColor = color;
        next=null;
    }

    public void draw(){
        StdDraw.setPenColor(penColor);
        StdDraw.line(c1.x,c1.y,c2.x,c2.y);
    }
}
