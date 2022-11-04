public class Demo {
    int x = 0;
    int y = 0;
    // khởi tạo constructor
    public Demo (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Demo getDemo = new Demo(15,20);
        System.out.println(getDemo);
    }

}
