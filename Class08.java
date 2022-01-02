package Java12.pack6.subpack1.subsubpack;
public class CStyle {
	public int style;
	public CStyle(int n) {
		style = n;
		System.out.println("style" + style);
	}
}


package Java12.pack6.subpack1;
public class CCircle {
	public void show() {
		System.out.println("show() method of class CCircle called");
	}
}


package Java12.pack6.subpack2;
public class CRectangle {
	public void show() {
		System.out.println("show() method of class CRectangle called");
	}
}


package Java12.pack6;
import Java12.pack6.subpack1.CCircle;
import Java12.pack6.subpack2.CRectangle;
import Java12.pack6.subpack1.subsubpack.CStyle;
public class Class08 {
	public static void main(String args[]) {
		CCircle cir = new CCircle();
		CRectangle rect = new CRectangle();
		CStyle sty = new CStyle(1);
		cir.show();
		rect.show();
	}
}
