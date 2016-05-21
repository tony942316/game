import java.util.Scanner;
/**
 * Write a description of class Setup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Setup
{
    private static Player player = new Player(10000, 100, 100, 10000, 80, "DeBug");
    private static ShopRes shop = new ShopRes();
    private static Progression prog = new Progression();
    private static Rat rat = new Rat(10, 2, 3);
    private static Rabbit rabbit = new Rabbit(15, 2, 4);
    private static KillerChicken chicken = new KillerChicken(20, 3, 4);
    private static Eagle eagle = new Eagle(50, 2, 7);
    private static Kangaroo kangaroo = new Kangaroo(30, 4, 5);
    private static Bear bear = new Bear(40, 6, 9);
    private static Troll troll = new Troll(50, 7, 11);
    private static Gorilla gorilla = new Gorilla(75, 13, 19);
    public Setup(String name)
    {
        this.player = new Player(50, 4, 6, 0, 50, name);
    }
    public static void main(String[]args)
    {
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        Setup set = new Setup(name);
        System.out.println("Good your character has been set up now.");
        System.out.println("The *  * around a word indicate a key word used to continue.");
        System.out.println("CaPZ DoNT maTtEr.");
        System.out.println("You will fight monsters and gain money used to buy things.");
        System.out.println("This is permadeath so be careful!!!");
        System.out.println();
        Map.main(args);
    } 
    public static Player getPlayer(){return player;}
    public static Rat getRat(){return rat;}
    public static Bear getBear(){return bear;}
    public static Troll getTroll(){return troll;}
    public static KillerChicken getChicken(){return chicken;}
    public static Kangaroo getKangaroo(){return kangaroo;}
    public static Rabbit getRabbit(){return rabbit;}
    public static ShopRes getShopRes(){return shop;}
    public static Progression getProg(){return prog;}
    public static Eagle getEagle(){return eagle;}
    public static Gorilla getGorilla(){return gorilla;}
}
