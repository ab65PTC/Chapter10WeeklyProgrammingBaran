import java.util.*;
public class DemoCandles 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String color, scent;
        int height;
        double price;
        Candle candle1 = new Candle();
        ScentedCandle candle2 = new ScentedCandle();

        System.out.print("Enter the desired candle color >> ");
        color = keyboard.nextLine();
        System.out.print("Enter the desired candle height in inches >> ");
        height = keyboard.nextInt();
        keyboard.nextLine();
        candle1.setColor(color);
        candle1.setHeight(height);

        System.out.print("Enter the desired scented candle color >> ");
        color = keyboard.nextLine();
        System.out.print("Enter the desired scented candle scent >> ");
        scent = keyboard.nextLine();
        System.out.print("Enter the desired scented candle height in inches >> ");
        height = keyboard.nextInt();
        keyboard.nextLine();
        candle2.setColor(color);
        candle2.setScent(scent);
        candle2.setHeight(height);

        System.out.println(candle1.getColor() + "    " + candle2.getColor());
        System.out.println(candle1.getHeight() + "in      " + candle2.getHeight() + "in");
        System.out.println("         " + candle2.getScent());
        System.out.println("$" + candle1.getPrice() + "    $" + candle2.getPrice());
    }
}
