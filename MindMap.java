import java.awt.*;
import static java.awt.event.KeyEvent.*;
public class MindMap {
    static ListOfCircles circles = new ListOfCircles();
    static ListOfLines lines = new ListOfLines();
    static Color green = new Color(7, 92, 10);
    static Color purple =new Color(169, 43, 214);
    static Circle c1 = null;
    static Color penColor = StdDraw.BLACK;
    public static void main(String[] args) {
        StdDraw.setCanvasSize(800,800);
        StdDraw.setScale(1,800);
        draw();
        run();
    }
    private static void run(){
        while (true){
            handleMouseClick();
        }
    }

    private static void draw(){
        StdDraw.enableDoubleBuffering();
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(15,15, 10,10);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledRectangle(15,40, 10,10);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledRectangle(15,65, 10,10);
        StdDraw.setPenColor(green);
        StdDraw.filledRectangle(15,90, 10,10);
        StdDraw.setPenColor(purple);
        StdDraw.filledRectangle(15,115, 10,10);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(15,140, 10,10);
        StdDraw.filledRectangle(15,165, 10,10);
        StdDraw.filledRectangle(15,190, 10,10);
        StdDraw.filledRectangle(15,215, 10,10);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.circle(15,140,7);
        StdDraw.line(8,158, 22, 172);
        StdDraw.line(8,183, 22, 197);
        StdDraw.line(22,183, 8, 197);
        StdDraw.line(8,183+25, 22, 197+25);
        StdDraw.line(22,183+25, 8, 197+25);
        StdDraw.circle(15,215,5);
        lines.draw();
        circles.draw();
        StdDraw.show();
    }

    private static void handleMouseClick() {
        StdDraw.clear();
        draw();
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.rectangle(15,140, 12,12);
        StdDraw.show();
        while (!StdDraw.isMousePressed()) {
            // do nothing
        }

        int x = (int) Math.round(StdDraw.mouseX());
        int y = (int) Math.round(StdDraw.mouseY());


        while (StdDraw.isMousePressed()) {
            // do nothing
        }
        if(x<=25&&x>=5){
            if(y<=25&&y>=5) {
                penColor = StdDraw.BLACK;
            } else if (y<=50&&y>=30) {
                penColor = StdDraw.RED;

            } else if (y<=75&&y>=55) {
                penColor=StdDraw.BLUE;

            } else if (y<=100&&y>=80) {
                penColor=green;

            } else if (y<=125&&y>=105) {
                penColor=purple;
            }else if(y<=175&&y>=155){
                while (line()){
                }
            } else if (y<=200&&y>=180) {
                while(delete()){
                }
            }else if (y<=225&&y>=205) {
                while(move()){
            }
        }
        }
        else {
            StdDraw.setPenColor(penColor);
            String text = StdIn.readLine();
            Circle circle = new Circle(x, y, text);
            circle.setColor(penColor);
            //circle.draw();
            circles.append(circle);
            draw();

        }

    }

    private static boolean move(){
        StdDraw.clear();
        draw();
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.rectangle(15,215, 12,12);
        StdDraw.show();
        while (!StdDraw.isMousePressed()) {
            // do nothing
        }

        int x = (int) Math.round(StdDraw.mouseX());
        int y = (int) Math.round(StdDraw.mouseY());


        while (StdDraw.isMousePressed()) {
            // do nothing
        }
        if(x<=25&&x>=5){
            if(y<=150&&y>=130){
                draw();
                run();
            } else if (y<=200&&y>=180) {
                while(delete()){
                }
            }else if(y<=175&&y>=155) {
                draw();
                while (line()) {
                }
            }
        }
        else {
            Circle c = circles.isInList(x, y);
            if(c!=null){
                while (!StdDraw.isMousePressed()) {
                    // do nothing
                }

                int x1 = (int) Math.round(StdDraw.mouseX());
                int y1 = (int) Math.round(StdDraw.mouseY());


                while (StdDraw.isMousePressed()) {
                    // do nothing
                }
                c.setCoords(x1,y1);
                draw();
            }
        }
        return true;
    }
    private static boolean line(){
        StdDraw.clear();
        draw();
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.rectangle(15,165, 12,12);
        StdDraw.show();
        while (!StdDraw.isMousePressed()) {
            // do nothing
        }

        int x = (int) Math.round(StdDraw.mouseX());
        int y = (int) Math.round(StdDraw.mouseY());


        while (StdDraw.isMousePressed()) {
            // do nothing
        }
        if(x<=25&&x>=5){
            if(y<=25&&y>=5) {
                penColor = StdDraw.BLACK;
            } else if (y<=50&&y>=30) {
                penColor = StdDraw.RED;

            } else if (y<=75&&y>=55) {
                penColor=StdDraw.BLUE;

            } else if (y<=100&&y>=80) {
                penColor=green;

            } else if (y<=125&&y>=105) {
                penColor=purple;
            }else if(y<=150&&y>=130){
                c1 = null;
                draw();
                run();
            } else if (y<=200&&y>=180) {
                c1 = null;
                while(delete()) {
                }
            }else if (y<=225&&y>=205) {
                    c1 = null;
                    while(move()){
                    }
        }
        }
        else {
            StdDraw.setPenColor(penColor);
            Circle c = circles.isInList(x, y);
            if (c != null && c1 == null) {
                c1 = c;
            } else if (c != null && c1 != null) {
                Line l = new Line(c, c1, penColor);
                lines.append(l);
                draw();
                c1 = null;
            }
            return true;
        }
        return true;
    }
    private static boolean delete() {
        StdDraw.clear();
        draw();
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.rectangle(15, 190, 12, 12);
        StdDraw.show();
        while (!StdDraw.isMousePressed()) {
            // do nothing
        }

        int x = (int) Math.round(StdDraw.mouseX());
        int y = (int) Math.round(StdDraw.mouseY());


        while (StdDraw.isMousePressed()) {
            // do nothing
        }
        if (x <= 25 && x >= 5) {
            if (y <= 175 && y >= 155) {
                draw();
                while (line()) {
                }
            } else if (y <= 150 && y >= 130) {
                draw();
                run();
            } else if (y <= 225 && y >= 205) {
                while (move()) {
                }
            }
        }
        else {
            Circle c = circles.isInList(x, y);
            if (c != null) {
                Line l = lines.isInList(c);
                while (l != null) {
                    lines.remove(l);
                    l = lines.isInList(c);
                }
                circles.remove(c);
                draw();
            }
        }
        return true;
    }

}

//circle size
//delete circles
//fix lines
// user picks colors
// circle, line, colors, delete
//change word

