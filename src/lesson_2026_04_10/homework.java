package lesson_2026_04_10;

public class homework {

    static class Figure {
        protected double dim1;
        protected double dim2;

        public Figure(double d1, double d2) {
            dim1 = d1;
            dim2 = d2;
        }

        public double getDim1() {
            return dim1;
        }

        public void setDim1(double dim1) {
            this.dim1 = dim1;
        }

        public double getDim2() {
            return dim2;
        }

        public void setDim2(double dim2) {
            this.dim2 = dim2;
        }

        public double area() {
            return 0;
        }
    }

    static class Rectangle extends Figure {

        public Rectangle(double d1, double d2) {
            super(d1, d2);
        }

        public double area() {
            return dim1 * dim2;
        }

        public static Rectangle maxArea(Rectangle[] arr) {
            Rectangle max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].area() > max.area()) {
                    max = arr[i];
                }
            }
            return max;
        }
    }

    static class Triangle extends Figure {

        public Triangle(double d1, double d2) {
            super(d1, d2);
        }

        public double area() {
            return (dim1 * dim2) / 2;
        }
    }

    public static void main(String[] args) {

        Figure[] f = new Figure[5];

        f[0] = new Rectangle(4, 5);
        f[1] = new Rectangle(2, 3);
        f[2] = new Triangle(4, 6);
        f[3] = new Triangle(3, 7);
        f[4] = new Triangle(5, 2);

        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i].area());
        }

        Rectangle[] r = new Rectangle[2];
        r[0] = new Rectangle(4, 5);
        r[1] = new Rectangle(10, 2);

        Rectangle biggest = Rectangle.maxArea(r);
        System.out.println(biggest.area());
    }
}
