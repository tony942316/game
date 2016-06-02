import java.util.Scanner;
/**
 * Write a description of class Desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desert
{
    public static void main(String[]args)
    {
        String[] places = new String[6];
        places[0] = "\nYou arrive at the desert, you may:";
        places[1] = "Head to the *dunes*";
        places[2] = "Fight dunes *boss*";
        places[3] = "LOCKED";
        places[4] = "LOCKED";
        places[5] = "UNKNOWN";
        Progression prog = Setup.getProg();
        Scanner scan = new Scanner(System.in);
        String action = "Standard";
        if(prog.getDDunes())
        {
            places[2] = "Dunes boss defeated!";
            places[3] = "Walk towards *oasis*";
            places[4] = "Fight *level* boss";
        } 
        if(prog.getDOasis())
        {
            places[4] = "Level boss defeated!";
            places[5] = "The *final* battle draws near";
        }
        if(prog.getFinal1())
        {
            System.out.println("You have won the game........WOW!");
            System.out.println("Credits:\nTony942316\nNick\nKeygs");
            System.exit(0);
        }
        for(int i = 0; i < places.length; i++)
        {
            System.out.println(places[i]);
        }
        System.out.println("Type *leave* to go back to map.");
        while(!action.equalsIgnoreCase("leave"))
        {
            action = scan.nextLine();
            if(action.equalsIgnoreCase("dunes"))
            {
                System.out.println("Through the wavy air you find...");
                int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
                if(chance > 50)
                {
                    Fight.SandSnake(args);
                }
                else if(chance > 25)
                {
                    Fight.Salamander(args);
                }
                else
                {
                    Fight.Vulture(args);
                }
            }
            else if(action.equalsIgnoreCase("boss") && !prog.getDDunes())
            {
                System.out.println("You hear beating wings in the distance.....");
                Fight.Griffin(args);
            }
            else if(action.equalsIgnoreCase("oasis") && prog.getDDunes())
            {
                System.out.println("By the chilling water you find");
                int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
                if(chance > 40)
                {
                    Fight.TuskCanRaider(args);
                }
                else if(chance > 10)
                {
                    Fight.SandWorm(args);
                }
                else
                {
                    Fight.ArmorDillo(args);
                }
            }
            else if(action.equalsIgnoreCase("level") && prog.getDDunes() && !prog.getDOasis())
            {
                System.out.println("Distant roars draw closer....");
                Fight.KomodoDragonPair(args);
            }
            else if(action.equalsIgnoreCase("final") && prog.getDDunes() && prog.getDOasis())
            {
                System.out.println("Time slows as it bends to reveal....");
                Fight.SandKraken(args);
            }
            else if(!action.equalsIgnoreCase("leave"))
            {
                System.out.println("Invalid Input!");
            }
        }
        System.out.println();
        Map.main(args);
    }
}
