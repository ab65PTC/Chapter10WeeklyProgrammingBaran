import java.util.*;
public class DemoHorses
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name, color;
        int birthYear, races;
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        
        System.out.print("Enter name for horse >> ");
        name = keyboard.nextLine();
        System.out.print("Enter color for " + name + " >> ");
        color = keyboard.nextLine();
        System.out.print("Enter year of Birth >> ");
        birthYear = keyboard.nextInt();
        keyboard.nextLine();
        horse1.setName(name);
        horse1.setColor(color);
        horse1.setBirthYear(birthYear);

        System.out.print("Enter name for race horse >> ");
        name = keyboard.nextLine();
        System.out.print("Enter color for " + name + " >> ");
        color = keyboard.nextLine();
        System.out.print("Enter year of Birth >> ");
        birthYear = keyboard.nextInt();
        System.out.print("Enter number of races won by " + name + " >> ");
        races = keyboard.nextInt();
        keyboard.nextLine();
        horse2.setName(name);
        horse2.setColor(color);
        horse2.setBirthYear(birthYear);
        horse2.setRaces(races);

        System.out.println(horse1.getName() + "    " + horse2.getName());
        System.out.println(horse1.getColor() + "    " + horse2.getColor());
        System.out.println(horse1.getBirthYear() + "     " + horse2.getBirthYear());
        System.out.println("         " + horse2.getRaces());

    }    
}
