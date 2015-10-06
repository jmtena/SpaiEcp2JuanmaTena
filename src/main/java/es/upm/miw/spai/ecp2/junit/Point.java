package es.upm.miw.spai.ecp2.junit;

public class Point {
    
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public double module() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }
    
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Point[" + x + "," + y + "]";
    }
    
    public boolean isEqual(Point p){
    	if (this.x == p.x && this.y == p.y)
    		return true;
    	else return false;
    }

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
    
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
    
}
