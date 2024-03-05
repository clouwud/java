public class Rectangle {
    float width;
    float length;
    float area;
    float perimeter;

    void Info(float w, float l) {
        width = w;
        length = l;
    }

    void area() {
        area = width * length;
        System.out.println("area of rectangle :" + area);
    }

    void perimeter() {
        perimeter = 2 * (width + length);
        System.out.println("perimeter of rectangle :" + perimeter);
    }
}

class FindArea {
    public static void main(String[] args) {
        Rectangle h = new Rectangle();
        h.Info(20, 30);
        h.area();
        h.perimeter();
    }
}
