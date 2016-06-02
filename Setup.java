import java.util.Scanner;
/**
 * Write a description of class Setup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Setup
{
    private static Player player = new Player(10000, 100, 100, 23457, 80, 2000, "DeBug");
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
    private static SandSnake sandSnake = new SandSnake(60, 8, 12);
    private static Salamander salamander = new Salamander(75, 10, 13);
    private static Vulture vulture = new Vulture(90, 12, 15);
    private static Griffin griffin = new Griffin(120, 20, 25);
    private static TuskCanRaider tuskCanRaider = new TuskCanRaider(100, 16, 17);
    private static SandWorm sandWorm = new SandWorm(120, 18, 20);
    private static ArmorDillo armorDillo = new ArmorDillo(250, 17, 18);
    private static KomodoDragonPair komodoDragonPair = new KomodoDragonPair(500, 22, 28);
    private static SandKraken sandKraken = new SandKraken(1000, 40, 50);
    public Setup(String name)
    {
        this.player = new Player(50, 4, 6, 0, 50, 0, name);
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
    public static SandSnake getSandSnake(){return sandSnake;}
    public static Salamander getSalamander(){return salamander;}
    public static Vulture getVulture(){return vulture;}
    public static Griffin getGriffin(){return griffin;}
    public static TuskCanRaider getTuskCanRaider(){return tuskCanRaider;}
    public static SandWorm getSandWorm(){return sandWorm;}
    public static ArmorDillo getArmorDillo(){return armorDillo;}
    public static KomodoDragonPair getKomodoDragonPair(){return komodoDragonPair;}
    public static SandKraken getSandKraken(){return sandKraken;}
}
