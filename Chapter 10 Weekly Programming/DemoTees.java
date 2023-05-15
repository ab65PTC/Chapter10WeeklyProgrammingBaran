import java.util.*;
public class DemoTees 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String color, slogan;
        int orderNumber;
        TeeShirt.Size orderSize;
        TeeShirt shirt1 = new TeeShirt();
        TeeShirt shirt2 = new TeeShirt();
        CustomTee shirt3 = new CustomTee();
        CustomTee shirt4 = new CustomTee();
        
        System.out.print("Enter color of first shirt >> ");
        color = keyboard.nextLine();
        System.out.print("Enter number of shirts >> ");
        orderNumber = keyboard.nextInt();
        System.out.print("Enter size of shirts from among these chioces: ");
        System.out.println("S, M, L, XL, XXL, XXXL");
        orderSize = TeeShirt.Size.valueOf(keyboard.next());
        keyboard.nextLine();
        shirt1.setColor(color);
        shirt1.setOrderNumber(orderNumber);
        shirt1.setSize(orderSize);

        System.out.print("Enter color of next shirt >> ");
        color = keyboard.nextLine();
        System.out.print("Enter number of shirts >> ");
        orderNumber = keyboard.nextInt();
        System.out.print("Enter size of shirts from among these choices: ");
        System.out.println("S, M, L, XL, XXL, XXXL");
        orderSize = TeeShirt.Size.valueOf(keyboard.next());
        keyboard.nextLine();
        shirt2.setColor(color);
        shirt2.setOrderNumber(orderNumber);
        shirt2.setSize(orderSize);

        System.out.print("Enter color of next shirt >> ");
        color = keyboard.nextLine();
        System.out.print("Enter slogan for shirts >> ");
        slogan = keyboard.nextLine();
        System.out.print("Enter number of shirts >> ");
        orderNumber = keyboard.nextInt();
        System.out.print("Enter size of shirts from among these choices: ");
        System.out.println("S, M, L, XL, XXL, XXXL");
        orderSize = TeeShirt.Size.valueOf(keyboard.next());
        keyboard.nextLine();
        shirt3.setColor(color);
        shirt3.setOrderNumber(orderNumber);
        shirt3.setSlogan(slogan);
        shirt3.setSize(orderSize);

        System.out.print("Enter color of next shirt >> ");
        color = keyboard.nextLine();
        System.out.print("Enter slogan for shirts >> ");
        slogan = keyboard.nextLine();
        System.out.print("Enter number of shirts >> ");
        orderNumber = keyboard.nextInt();
        System.out.print("Enter size of shirts from among these choices: ");
        System.out.println("S, M, L, XL, XXL, XXXL");
        orderSize = TeeShirt.Size.valueOf(keyboard.next());
        keyboard.nextLine();
        shirt4.setColor(color);
        shirt4.setOrderNumber(orderNumber);
        shirt4.setSlogan(slogan);
        shirt4.setSize(orderSize);

        System.out.println("Shirt 1: " + shirt1.getColor() + " " + shirt1.getOrderNumber() + " shirts " + shirt1.getSize() + " " + shirt1.getPrice());
        System.out.println("Shirt 2: " + shirt2.getColor() + " " + shirt2.getOrderNumber() + " shirts " + shirt2.getSize() + " " + shirt2.getPrice());
        System.out.println("Shirt 3: " + shirt3.getColor() + " " + shirt3.getSlogan() + " " + shirt3.getOrderNumber() + " shirts " + shirt3.getSize() + " " + shirt3.getPrice());
        System.out.println("Shirt 4: " + shirt4.getColor() + " " + shirt4.getSlogan() + " " + shirt4.getOrderNumber() + " shirts " + shirt4.getSize() + " " + shirt4.getPrice());


    }
}
