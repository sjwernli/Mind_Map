public class ListOfLines {
    Line anchor;

    public ListOfLines(){
        anchor = null;
    }
    public void prepend(Line line) {
        anchor = line;
    }

    public void append(Line line) {
        if (anchor == null) {
            anchor = line;
            return;
        }
        assert anchor != null;
        Line insert = anchor;
        while (insert.next != null) {
            insert = insert.next;
        }
        assert insert != null && insert.next == null;
        insert.next = line;
    }

    public void clear(){
        anchor = null;
    }

    public String toString(){
        String s ="";
        for(Line c = anchor; c != null; c=c.next){
            s += c;
        }
        return s;
    }

    public void remove(Line l){
        if(l==anchor){
            anchor=l.next;
        }
        else {
            Line insert = anchor;
            while (insert.next != null && insert.next!=l) {
                insert = insert.next;
            }
            if(insert.next!=null) {
                insert.next = insert.next.next;
            }
        }

    }

    public Line isInList(Circle x){
        for(Line l = anchor; l != null; l=l.next){
            if(l.c1==x || l.c2==x){
                return l;
            }
        }
        return null;
    }

    public int length(){
        int count = 0;
        for(Line c = anchor; c != null; c=c.next){
            count++;
        }
        return count;
    }

    public void draw(){
        for(Line l = anchor; l != null; l=l.next){
            l.draw();
        }
    }
}
