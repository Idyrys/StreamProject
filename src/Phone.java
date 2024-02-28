public class Phone  {
   private double display;
   private String color;
   private String mark;

   public Phone(double display, String color, String mark) {
      this.display = display;
      this.color = color;
      this.mark = mark;
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
