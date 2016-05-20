import java.util.Scanner;
/**
 * Write a description of class RatFight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fight
{
    public static void rat(String[]args)
    {
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        Rat evil = Setup.getRat();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Rat! Fight!\n");
        while(evil.getHealth() > 0 && player.getHealth() > 0)
        {
            System.out.println("Action?");
            action = scan.nextLine();
            battle.stBattleSeq(action, evil);
            battle.doEAttack(evil);
            battle.hCheck();
            System.out.println("\n");
        }
        evil.revive();
        battle.getDrop(evil);
        Forest.main(args);
    }
    public static void rabbit(String[]args)
    {
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        Rabbit evil = Setup.getRabbit();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Rabbit! Fight!\n");
        while(evil.getHealth() > 0 && player.getHealth() > 0)
        {
            System.out.println("Action?");
            action = scan.nextLine();
            battle.stBattleSeq(action, evil);
            battle.doEAttack(evil);
            battle.hCheck();
            System.out.println("\n");
        }
        evil.revive();
        battle.getDrop(evil);
        Forest.main(args);
    }
    public static void chicken(String[]args)
    {
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        KillerChicken evil = Setup.getChicken();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Chicken! Fight!\n");
        while(evil.getHealth() > 0 && player.getHealth() > 0)
        {
            System.out.println("Action?");
            action = scan.nextLine();
            battle.stBattleSeq(action, evil);
            battle.doEAttack(evil);
            battle.hCheck();
            System.out.println("\n");
        }
        evil.revive();
        battle.getDrop(evil);
        Forest.main(args);
    }
    public static void kangaroo(String[]args)
    {
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        Kangaroo evil = Setup.getKangaroo();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Kangaroo! Fight!\n");
        while(evil.getHealth() > 0 && player.getHealth() > 0)
        {
            System.out.println("Action?");
            action = scan.nextLine();
            battle.stBattleSeq(action, evil);
            battle.doEAttack(evil);
            battle.hCheck();
            System.out.println("\n");
        }
        evil.revive();
        battle.getDrop(evil);
        Forest.main(args);
    }
    public static void bear(String[]args)
    {
        int times = 0;
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        Bear evil = Setup.getBear();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("OMG ITZ A BEAR! Fight!\n");
        while(evil.getHealth() > 0 && player.getHealth() > 0)
        {
            System.out.println("Action?");
            action = scan.nextLine();
            battle.stBattleSeq(action, evil);
            battle.doEAttack(evil);
            if(evil.special() && evil.getHealth() > 0 && !battle.getMiss())
            {
                int temp = player.getHealth() / 6;
                System.out.println("Bear claws cause bleeding dealing " + temp + " damage!");
                player.changeHealth(-temp);
                times = 3;
            }
            if(times > 0)
            {
                int temp = player.getHealth() / 10;
                System.out.println("Blood loss causes " + temp + " damage!(" + times + ")");
                times--;
                player.changeHealth(-temp);
            }
            battle.hCheck();
            System.out.println("\n");
        }
        evil.revive();
        battle.getDrop(evil);
        Forest.main(args);
    }
    public static void troll(String[]args)
    {
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        Troll evil = Setup.getTroll();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("Troll Spotted! Fight!\n");
        while(evil.getHealth() > 0 && player.getHealth() > 0)
        {
            System.out.println("Action?");
            action = scan.nextLine();
            battle.stBattleSeq(action, evil);
            battle.doEAttack(evil);
            battle.hCheck();
            System.out.println("\n");
        }
        evil.revive();
        battle.getDrop(evil);
        Forest.main(args);
    }
}
