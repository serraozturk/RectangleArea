import java.util.Scanner;
public class RectangleArea {
    double width, height;
    public void getData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();
    }
    public void fieldDisplay() {
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle height: " + height);
        System.out.println("Rectangle area: " + computeField());
    }
    public double computeField() {
        double multiply = width * height;
        return multiply;
    }
}

