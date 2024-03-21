public class ListOfCircles {
    Circle anchor;

    public ListOfCircles(){
        anchor = null;
    }
    public void prepend(Circle circle) {
        anchor = circle;
    }

    public void append(Circle circle) {
        if (anchor == null) {
            anchor = circle;
            return;
        }
        assert anchor != null;
        Circle insert = anchor;
        while (insert.next != null) {
            insert = insert.next;
        }
        assert insert != null && insert.next == null;
        insert.next = circle;
    }

    public void clear(){
        anchor = null;
    }

    public String toString(){
        String s ="";
        for(Circle c = anchor; c != null; c=c.next){
            s += c;
        }
        return s;
    }

    public void remove(Circle c){
        if(c==anchor){
            anchor=c.next;
        }
        else {
            Circle insert = anchor;
            while (insert.next != null && insert.next!=c) {
                insert = insert.next;
            }
            if(insert.next!=null) {
                insert.next = insert.next.next;
            }
        }

    }

    public Circle isInList(int x, int y){
        for(Circle c = anchor; c != null; c=c.next){
            if(c.x + c.radius >= x && c.x - c.radius <= x && c.y + c.radius >= y && c.y - c.radius <= y){
                return c;
            }
        }
        return null;
    }

    public int length(){
        int count = 0;
        for(Circle c = anchor; c != null; c=c.next){
            count++;
        }
        return count;
    }

    public void draw(){
        for(Circle c = anchor; c != null; c=c.next){
            c.draw();
        }
    }

}
