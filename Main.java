import java.util.Scanner;
// tạo một lớp main để chạy.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai: ");
        double width = scanner.nextDouble();
        System.out.println("Nhap vao chieu rong: ");
        double height = scanner.nextDouble();
        // khởi tạo đối tượng có tham số truyền vào là chiều dài và chiều rộng;
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Kich thuoc cua hinh chu nhat la: " + rectangle.display());
        System.out.println("Dien tich hinh chư nhat la:  " + rectangle.getArea());
        System.out.println("Chu vi hinh chu nhat la: " + rectangle.getPerimeter());
    }
}
