
public class Tablet {
    private double display;
    private String color;
    private String mark;

    public Tablet(double display, String mark) {
        this.display = display;
        this.mark = mark;
        this.color = "green";
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
