public class Xe {
    private String mauXe;
    private String tenXe;
    private String bienSoXe;

    public Xe() {
    }

    public Xe(String mauXe, String tenXe, String bienSoXe) {
        this.mauXe = mauXe;
        this.tenXe = tenXe;
        this.bienSoXe = bienSoXe;
    }

    public static void main(String[] args) {
        Xe xeA = new Xe();
        Xe xeB = new Xe("Do", "Honda", "77l-7777");
        System.out.println(xeA);
        System.out.println(xeB.tenXe);
    }
}
