import java.util.*;
public class DemoRocks 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int sampleNum;
        double weight;
        String rockType;

        System.out.println("Please enter rock type from among these options: ");
        System.out.println("U: Unclassified");
        System.out.println("I: Igneous");
        System.out.println("S: Sedimentary");
        System.out.println("M: Metamorphic");
        
        rockType = keyboard.nextLine();

        if (rockType.equals("U"))
        {
            System.out.println("Please enter the sample number of the rock: ");
            sampleNum = keyboard.nextInt();
            System.out.println("Please enter the rock weight in grams: ");
            weight = keyboard.nextDouble();
            Rock rock = new Rock(sampleNum, weight);
            System.out.print('\n' + "You entered:" + '\n');
            displayRock(rock);
        }
        else if (rockType.equals("I"))
        {
            System.out.println("Please enter the sample number of the rock: ");
            sampleNum = keyboard.nextInt();
            System.out.println("Please enter the rock weight in grams: ");
            weight = keyboard.nextDouble();
            IgneousRock rock = new IgneousRock(sampleNum, weight);
            System.out.print('\n' + "You entered:" + '\n' + "Igneous" + '\n');
            displayRock(rock);
        }
        else if (rockType.equals("S"))
        {
            System.out.println("Please enter the sample number of the rock: ");
            sampleNum = keyboard.nextInt();
            System.out.println("Please enter the rock weight in grams: ");
            weight = keyboard.nextDouble();
            SedimentaryRock rock = new SedimentaryRock(sampleNum, weight);
            System.out.print('\n' + "You entered:" + '\n' + "Sedimentary" + '\n');
            displayRock(rock);
        }
        else if (rockType.equals("M"))
        {
            System.out.println("Please enter the sample number of the rock: ");
            sampleNum = keyboard.nextInt();
            System.out.println("Please enter the rock weight in grams: ");
            weight = keyboard.nextDouble();
            MetamorphicRock rock = new MetamorphicRock(sampleNum, weight);
            System.out.print('\n' + "You entered:" + '\n' + "Metamorphic" + '\n');
            displayRock(rock);
        }
        else
        {
            Rock rock = new Rock(0, 0);
            System.out.println("Error: Invalid rock type entered. Null entry created.");
            displayRock(rock);

        }

        

    }

    public static void displayRock(Rock rck)
    {
        if (rck instanceof IgneousRock)
        {
            System.out.println(IgneousRock.desc);
        }
        else if (rck instanceof SedimentaryRock)
        {
            System.out.println(SedimentaryRock.desc);
        }
        else if (rck instanceof MetamorphicRock)
        {
            System.out.println(MetamorphicRock.desc);
        }
        else{System.out.println(rck.desc);}
        System.out.println("Sample number: " + rck.sampleNum);
        System.out.println(rck.weight + "g");
    }
}
