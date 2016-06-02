import java.util.Scanner;
/**
 * Write a description of class MainGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Progression prog = Setup.getProg();
        String[] places = new String[9];
        places[0] = "If you wish to close the game type *exit*";
        places[1] = "The places you can go are listed below.";
        places[2] = "You will unlock more once you \"complete\" an area.";
        places[3] = "Just type where you want to go.\n";
        places[4] = "Places:";
        places[5] = "Home";
        places[6] = "Shop";
        places[7] = "Forest";
        places[8] = "Locked";
        if(prog.getFDeeper())
        {
            places[8] = "Desert";
        }
        for(int i = 0; i < places.length; i++)
        {
            System.out.println(places[i]);
        }
        String action = "Standard";
        while(!action.equalsIgnoreCase("exit"))
        {
            action = scan.nextLine();
            if(action.equalsIgnoreCase("forest"))
            {
                System.out.println();
                Forest.main(args);
            }
            else if(action.equalsIgnoreCase("desert") && prog.getFDeeper())
            {
                System.out.println();
                Desert.main(args);
            }
            else if(action.equalsIgnoreCase("shop"))
            {
                System.out.println();
                Shop.main(args);
            }
            else if(action.equalsIgnoreCase("home"))
            {
                System.out.println();
                Home.main(args);
            }
            else if(action.equalsIgnoreCase("exit"))
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid Input Try Again!");
            }
        }
    }
}
