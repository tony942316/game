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
        Scanner scan = new Scanner(System.in);
        String action = "Standard";
        System.out.println("You arrive at the forest.");
        System.out.println("Do you precede to the *clearing* or venture *deeper*?");
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
            if(action.equalsIgnoreCase("deeper"))
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
        }
        System.out.println();
        Map.main(args);
    }
}
