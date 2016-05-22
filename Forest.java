import java.util.Scanner;
/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest
{
    public static void main(String[]args)
    {
        String[] places = new String[5];
        places[0] = "\nYou arrive at the forest, you may:";
        places[1] = "Precede to *clearing*";
        places[2] = "Fight clearing *boss*";
        places[3] = "LOCKED";
        places[4] = "LOCKED";
        Progression prog = Setup.getProg();
        Scanner scan = new Scanner(System.in);
        String action = "Standard";
        if(prog.getFClearing())
        {
            places[2] = "Clearing boss defeated!";
            places[3] = "Venture *deeper*";
            places[4] = "Fight *level* boss";
        } 
        if(prog.getFDeeper())
        {
            places[4] = "Level boss defeated!";
        }
        for(int i = 0; i < places.length; i++)
        {
            System.out.println(places[i]);
        }
        System.out.println("Type *leave* to go back to map.");
        while(!action.equalsIgnoreCase("leave"))
        {
            action = scan.nextLine();
            if(action.equalsIgnoreCase("clearing"))
            {
                System.out.println("You find clear skys and... GASP!!!");
                int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
                if(chance > 50)
                {
                    Fight.rat(args);
                }
                else if(chance > 25)
                {
                    Fight.rabbit(args);
                }
                else
                {
                    Fight.chicken(args);
                }
            }
            else if(action.equalsIgnoreCase("boss") && !prog.getFClearing())
            {
                System.out.println("It's a bird! It's a plane! It's.....");
                Fight.eagle(args);
            }
            else if(action.equalsIgnoreCase("deeper") && prog.getFClearing())
            {
                System.out.println("It's very dark and then.....");
                int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
                if(chance > 40)
                {
                    Fight.kangaroo(args);
                }
                else if(chance > 10)
                {
                    Fight.bear(args);
                }
                else
                {
                    Fight.troll(args);
                }
            }
            else if(action.equalsIgnoreCase("level") && prog.getFClearing() && !prog.getFDeeper())
            {
                System.out.println("You have entered the territory of.....");
                Fight.gorilla(args);
            }
            else
            {
                System.out.println("Invalid Input!");
            }
        }
        System.out.println();
        Map.main(args);
    }
}