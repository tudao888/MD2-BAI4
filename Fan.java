public class Fan {
    private int Slow = 1;
    private int Medium = 2;
    private int Fast = 3;
    private int Speed = Slow;
    private boolean On = false;
    private double R = 5;
    private String Color = "Blue";

    // các getter and setter của các thuộc tính

    public int getSlow() {
        return Slow;
    }

    public void setSlow(int slow) {
        Slow = slow;
    }

    public int getMedium() {
        return Medium;
    }

    public void setMedium(int medium) {
        Medium = medium;
    }

    public int getFast() {
        return Fast;
    }

    public void setFast(int fast) {
        Fast = fast;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }


    public Fan(int Speed, boolean On, double R, String Color) {

        this.Speed = Speed;
        this.On = On;
        this.R = R;
        this.Color = Color;
    }

    public String toString() {
        if (isOn()) {
            return ("Tốc độ speed là: " + getSpeed() + "Màu của quạt là: " + getColor() + "Bán kính của quạt là:  " + getR() + "fan is on");
        } else {
            return ("Màu của quạt là: " + getColor() + "Bán kính của quạt là: " + getR() + "fan is off");
        }
    }
}
