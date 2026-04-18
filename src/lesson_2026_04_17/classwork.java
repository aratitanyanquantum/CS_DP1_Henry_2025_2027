package lesson_2026_04_17;

abstract class Figure {

    private double dim1;
    static final double pi = 3.14;

    Figure(double dim1) {
        setDim1(dim1);
    }

    public double getDim1() { return dim1; }

    public void setDim1(double dim1) {
        if (dim1 <= 0) {
            System.out.println("undefined");
            this.dim1 = 0;
        } else {
            this.dim1 = dim1;
        }
    }

    public abstract double perimeter();

    public abstract double area();
}

class Rectangle extends Figure {

    private double dim2;

    Rectangle(double dim1, double dim2) {
        super(dim1);
        setDim2(dim2);
    }

    public double getDim2() { return dim2; }

    public void setDim2(double dim2) {
        if (dim2 <= 0) {
            System.out.println("undefined");
            this.dim2 = 0;
        } else {
            this.dim2 = dim2;
        }
    }

    @Override
    public double perimeter() {
        return 2 * (getDim1() + dim2);
    }

    @Override
    public double area() {
        return getDim1() * dim2;
    }
}

class Triangle extends Figure {

    private double dim2;
    private double dim3;

    Triangle(double dim1, double dim2, double dim3) {
        super(dim1);
        setDim2(dim2);
        setDim3(dim3);
    }

    public double getDim2() { return dim2; }

    public void setDim2(double dim2) {
        if (dim2 <= 0) {
            System.out.println("undefined");
            this.dim2 = 0;
        } else {
            this.dim2 = dim2;
        }
    }

    public double getDim3() { return dim3; }

    public void setDim3(double dim3) {
        if (dim3 <= 0) {
            System.out.println("undefined");
            this.dim3 = 0;
        } else {
            this.dim3 = dim3;
        }
    }

    @Override
    public double perimeter() {
        return getDim1() + dim2 + dim3;
    }

    @Override
    public double area() {
        double a = getDim1();
        double s = (a + dim2 + dim3) / 2;
        return Math.sqrt(s * (s - a) * (s - dim2) * (s - dim3));
    }
}

public class classwork {
    public static void main(String[] args) {

        Figure[] f = new Figure[4];

        f[0] = new Rectangle(5, 6);
        f[1] = new Rectangle(4, 7);
        f[2] = new Triangle(3, 4, 5);
        f[3] = new Triangle(3, 4, 6);

        System.out.println(f[0].area());
        System.out.println(f[1].area());
        System.out.println(f[2].area());
        System.out.println(f[3].area());

        System.out.println(f[0].perimeter());
        System.out.println(f[1].perimeter());
        System.out.println(f[2].perimeter());
        System.out.println(f[3].perimeter());
    }
}