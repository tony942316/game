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
        String action = "Standard";
        System.out.println("If you wish to close the game type *exit*");
        System.out.println("The places you can go are listed below.");
        System.out.println("You will unlock more once you \"complete\" an area.");
        System.out.println("Just type where you want to go.\n");
        System.out.println("Places:\nHome\nShop\nForest ");
        while(!action.equalsIgnoreCase("bananaMuffinMan"))
        {
            action = scan.nextLine();
            if(action.equalsIgnoreCase("forest"))
            {
                System.out.println();
                Forest.main(args);
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
