import java.awt.*;
public class Circle {

    int x;
    int y;
    String text;
    int radius = 20;

    Color penColor;

    Circle next;

    public Circle (int x, int y, String text){
        this.x = x;
        this.y = y;
        this.text = text;
        radius = text.length() * 6;
        next=null;
    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(x, y, radius);
        StdDraw.setPenColor(penColor);
        StdDraw.circle(x, y, radius);
        StdDraw.text(x,y,text);
    }

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
