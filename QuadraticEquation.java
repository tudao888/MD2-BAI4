public class QuadraticEquation {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    // khởi tạo hàm constructor;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // tạo phương thức tính delta;
    public double getDelta() {
        double delta;
        return delta = b * b - 4 * a * c;
    }


    // tạo phương thức tìm nghiệm;
    public void timNghiem() {
        if (getDelta() >= 0) {
            double x1 = (-b + Math.sqrt(getDelta())) / (2 * a);
            double x2 = (-b - Math.sqrt(getDelta())) / (2 * a);
            System.out.println("Nghiem thu nhat la: " + x1 + " Nghiem thu hai la: " + x2);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }

    public static void main(String[] args) {
        QuadraticEquation a = new QuadraticEquation(1, 2, 1);
        a.timNghiem();
    }
}
