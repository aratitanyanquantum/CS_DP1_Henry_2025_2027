package lesson_2026_04_03;

class Point {
    double x;
    double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    void printPoint(){
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    boolean printEqual(Point p){
        if(x == p.x && y == p.y){
            System.out.println("Points are equal");
            return true;
        }
        else{
            System.out.println("Points are not equal");
            return false;
        }
    }

    void quarterPrint(){
        if(x > 0 && y > 0)
            System.out.println("First quarter");
        else if(x < 0 && y > 0)
            System.out.println("Second quarter");
        else if(x < 0 && y < 0)
            System.out.println("Third quarter");
        else if(x > 0 && y < 0)
            System.out.println("Fourth quarter");
        else
            System.out.println("On axis");
    }

    double distancePoint(Point p){
        return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
    }

    Point bigPoint(){
        Point p = new Point(x*4, y*4);
        return p;
    }

    static Point minDistance(Point[] arr){
        double min = Math.sqrt(arr[0].x*arr[0].x + arr[0].y*arr[0].y);
        int index = 0;
        for(int i=1;i<arr.length;i++){
            double d = Math.sqrt(arr[i].x*arr[i].x + arr[i].y*arr[i].y);
            if(d < min){
                min = d;
                index = i;
            }
        }
        return arr[index];
    }

    boolean sameLine(Point p){
        if(x * p.y == y * p.x)
            return true;
        else
            return false;
    }

    static boolean isTriangle(Point a, Point b, Point c){
        double area = a.x*(b.y-c.y) + b.x*(c.y-a.y) + c.x*(a.y-b.y);
        if(area == 0)
            return false;
        else
            return true;
    }

    static double triangleArea(Point a, Point b, Point c){
        double area = Math.abs(a.x*(b.y-c.y) + b.x*(c.y-a.y) + c.x*(a.y-b.y)) / 2;
        return area;
    }

    Point midPoint(Point other){
        return new Point((x+other.x)/2 , (y+other.y)/2);
    }

    boolean isInsideCircle(Point center, double radius){
        double d = Math.sqrt((x-center.x)*(x-center.x) + (y-center.y)*(y-center.y));
        if(d < radius)
            return true;
        else
            return false;
    }

    static int maxPointsSameLine(Point[] arr){
        int max = 1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int count = 2;
                for(int k=0;k<arr.length;k++){
                    if(k!=i && k!=j){
                        if((arr[j].x-arr[i].x)*(arr[k].y-arr[i].y) == (arr[j].y-arr[i].y)*(arr[k].x-arr[i].x))
                            count++;
                    }
                }
                if(count > max)
                    max = count;
            }
        }
        return max;
    }
}

class Vector {
    Point start;
    Point end;

    Vector(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    void printVector(){
        System.out.println("Start: (" + start.x + ", " + start.y + ")");
        System.out.println("End: (" + end.x + ", " + end.y + ")");
    }

    double length(){
        return Math.sqrt((end.x-start.x)*(end.x-start.x) + (end.y-start.y)*(end.y-start.y));
    }

    boolean isParallel(Vector v){
        double x1 = end.x-start.x;
        double y1 = end.y-start.y;
        double x2 = v.end.x-v.start.x;
        double y2 = v.end.y-v.start.y;

        if(x1*y2 == y1*x2)
            return true;
        else
            return false;
    }

    double dotProduct(Vector v){
        double x1 = end.x-start.x;
        double y1 = end.y-start.y;
        double x2 = v.end.x-v.start.x;
        double y2 = v.end.y-v.start.y;

        return x1*x2 + y1*y2;
    }

    double angle(Vector v){
        double dot = dotProduct(v);
        double len = length()*v.length();
        return Math.acos(dot/len);
    }

    Vector sum(Vector v){
        double x1 = end.x-start.x;
        double y1 = end.y-start.y;
        double x2 = v.end.x-v.start.x;
        double y2 = v.end.y-v.start.y;

        Point s = new Point(0,0);
        Point e = new Point(x1+x2 , y1+y2);

        return new Vector(s,e);
    }

    static void longestVector(Vector[] arr){
        double max = arr[0].length();
        int index = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i].length() > max){
                max = arr[i].length();
                index = i;
            }
        }

        arr[index].printVector();
    }
}
