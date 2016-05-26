import java.util.Scanner;
/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home
{
    public static void main(String[]args)
    {
        Player player = Setup.getPlayer();
        Scanner scan = new Scanner(System.in);
        String action = "Standard";
        System.out.println("This is your house!");
        System.out.println("Here you can *rest*, view *stats*, or *level* up.");
        System.out.println("Type *leave* to go back to map.");
        while(!action.equalsIgnoreCase("leave"))
        {
            action = scan.nextLine();
            System.out.println();
            if(action.equalsIgnoreCase("rest"))
            {
                int temp = player.getMaxHealth() - player.getHealth();
                player.changeHealth(temp);
                System.out.println("Your hitpoints have been restored to " + player.getHealth());
            }
            else if(action.equalsIgnoreCase("level"))
            {
                if(player.getExp() > player.getLevelUpVal())
                {
                    player.levelUP();
                }
                else
                {
                    System.out.println("You don't have enough exp.");
                }
            }
            else if(action.equalsIgnoreCase("stats"))
            {
                player.printStats();
                System.out.println();
            }
        }
        System.out.println();
        Map.main(args);
    }
}
