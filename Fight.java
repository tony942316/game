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
        ShopRes shop = Setup.getShopRes();
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
        int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
        if(chance <= 20 && player.getHitChance() < 100)
        {
            player.changeHitChance(20);
            if(player.getHitChance() > 100)
            {
                 player.fixHitChance();
            }
            System.out.println("You got a real rabbit foot! Your hit chance is now " + player.getHitChance() + "%!");
            shop.changeHCost();
        }
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
    public static void eagle(String[]args)
    {
        Progression prog = Setup.getProg();
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        Eagle evil = Setup.getEagle();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("An Eagle! Fight!\n");
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
        prog.changeFClearing();
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
    public static void gorilla(String[]args)
    {
        Progression prog = Setup.getProg();
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        Gorilla evil = Setup.getGorilla();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Gorilla! Fight!\n");
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
        prog.changeFDeeper();
        Forest.main(args);
    }
    public static void SandSnake(String[]args)
    {
        Progression prog = Setup.getProg();
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        SandSnake evil = Setup.getSandSnake();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Sand Snake! Fight!\n");
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
        Desert.main(args);
    }
    public static void Salamander(String[]args)
    {
        Progression prog = Setup.getProg();
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        Salamander evil = Setup.getSalamander();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Salamander! Fight!\n");
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
        Desert.main(args);
    }
    public static void Vulture(String[]args)
    {
        Progression prog = Setup.getProg();
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        Vulture evil = Setup.getVulture();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Vulture! Fight!\n");
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
        Desert.main(args);
    }
    public static void Griffin(String[]args)
    {
        Progression prog = Setup.getProg();
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        Griffin evil = Setup.getGriffin();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Griffin! Fight!\n");
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
        prog.changeDDunes();
        Desert.main(args);
    }
    public static void TuskCanRaider(String[]args)
    {
        Progression prog = Setup.getProg();
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        TuskCanRaider evil = Setup.getTuskCanRaider();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Tusk Can Raider! Fight!\n");
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
        Desert.main(args);
    }
    public static void SandWorm(String[]args)
    {
        Progression prog = Setup.getProg();
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        SandWorm evil = Setup.getSandWorm();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Sand Worm! Fight!\n");
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
        Desert.main(args);
    }
    public static void ArmorDillo(String[]args)
    {
        Progression prog = Setup.getProg();
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        ArmorDillo evil = Setup.getArmorDillo();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("An Armor Dillo! Fight!\n");
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
        Desert.main(args);
    }
    public static void KomodoDragonPair(String[]args)
    {
        Progression prog = Setup.getProg();
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        KomodoDragonPair evil = Setup.getKomodoDragonPair();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("Two Komodo Dragons! Fight!\n");
        while(evil.getHealth() > 0 && player.getHealth() > 0)
        {
            System.out.println("Action?");
            action = scan.nextLine();
            battle.stBattleSeq(action, evil);
            battle.doEAttack(evil);
            battle.doEAttack(evil);
            battle.hCheck();
            System.out.println("\n");
        }
        evil.revive();
        battle.getDrop(evil);
        prog.changeDOasis();
        Desert.main(args);
    }
    public static void SandKraken(String[]args)
    {
        Progression prog = Setup.getProg();
        FightRes battle = new FightRes();
        Player player = Setup.getPlayer();
        SandKraken evil = Setup.getSandKraken();
        String action;
        Scanner scan = new Scanner(System.in);
        System.out.println("A Sand Kraken! Fight!\n");
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
        prog.changeFinal1();
        Desert.main(args);
    }
}
