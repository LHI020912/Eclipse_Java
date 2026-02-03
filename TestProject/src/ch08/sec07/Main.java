package ch08.sec07;

public class Main {

	public static void main(String[] args) {
		DrawingObject l = new Line();
		DrawingObject c = new Circle();
		Rect r = new Rect();
		Poly p = new Poly();
        
        l.draw();
        c.draw();
        r.draw();
        p.draw();
        
	}

}
