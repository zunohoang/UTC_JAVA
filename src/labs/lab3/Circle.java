package labs.lab3;

public class Circle {
    private float x, y, r;

    public Circle(float x, float y, float r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void show(){
        System.out.printf("Tam: (%.2f, %.2f), Ban kinh: %.2f\n", x, y, r);
        System.out.printf("Chu vi: %.2f, Dien tich: %.2f", cv(), dt());
    }

    public float cv(){
        return (float) (2 * Math.PI * r);
    }

    public float dt(){
        return (float) (Math.PI * Math.pow(r, 2));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1, 1, 5);
        circle.show();;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getR() {
        return r;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setR(float r) {
        this.r = r;
    }
}
