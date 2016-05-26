
/**
 * Write a description of class Fight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FightRes
{
    Player player = Setup.getPlayer();
    Progression prog = Setup.getProg();
    boolean miss = true;
    public void stBattleSeq(String action, Enemy evil)
    {
        FightRes battle = new FightRes();
        if(action.equalsIgnoreCase("fight"))
        {
            battle.attack(evil);
        }
        else if(action.equalsIgnoreCase("heal"))
        {
            battle.heal();
        }
        else
        {
            System.out.println("Invalid Input....");
            int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
            if(chance <= 70)
            {
                int temp = (int)((10 - 1 + 1) * Math.random()) + 1;
                System.out.println("You fall on your face and lose " + temp + " hitpoints. :/");
                player.changeHealth(-temp);
            }
            else 
            {
                System.out.println("You regain your balence!");
            }
        }
        if(evil.getHealth() > 0)
        {
            System.out.println(evil.getName() + " has " + evil.getHealth() + " hitpoints");
        }
        else
        {
            System.out.println(evil.getName() + " is DEAD!");
        }
    }
    public void attack(Enemy evil)
    {
        if(player.hit())
        {
            int temp = player.doDamage();
            System.out.println("You attack and deal " + temp + " damage!");
            evil.changeHealth(-temp);
        }
        else
        System.out.println("You missed!");
    }
    public void heal()
    {
        if(player.getHPotions() > 0)
        {                   
            player.changeHPotions(1);
            player.changeHealth(player.heal());
            System.out.println("You heal " + player.getHFactor() +  " hitpoints to a total of " + player.getHealth() + " hitpoints.");
            if(player.getHPotions() > 1)
            System.out.println("You now have " + player.getHPotions() + " health potions.");
            else
            System.out.println("You now have " + player.getHPotions() + " health potion.");
        }
        else
        {
            if(player.getHPotions() > 1)
            System.out.println("You now have " + player.getHPotions() + " health potions.");
            else
            System.out.println("You now have " + player.getHPotions() + " health potion.");
        }
    }
    public void hCheck()
    {
        String[]args = null;
        if(player.getHealth() > 0)
        {
            System.out.println("You have " + player.getHealth() + " hitpoints");
        }
        else
        {
            int temp;
            System.out.println("You are DEAD! You lost " + player.getCoins()*(int).7 + " coins\n");
            player.changeCoins(-player.getCoins()*(int).7);
            player.changeHealth(player.getMaxHealth());
            Home.main(args);
        }
    }
    public void getDrop(Enemy evil)
    {
        if(player.getHealth() > 0)
        {
            int temp = evil.drop();
            player.changeCoins(temp);
            System.out.println("You gained " + temp + " coins.");
            System.out.println("You now have " + player.getCoins() + " coins.");
            int exp = evil.drop();
            System.out.println("You have gained " + exp + " exp.");
            player.changeExp(exp);
            System.out.println("You now have " + player.getExp() + " exp.");
            int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
            if(chance <= 35)
            {
                int chance2 = (int)((100 - 1 + 1) * Math.random()) + 1;
                if(chance2 <= 100)
                {
                    player.changeHPotions(-1);
                    System.out.println("You got a health potion!");
                }
            }
        }
    }
    public void doEAttack(Enemy evil)
    {
        if(evil.special() && evil.getHealth() > 0)
        {
            System.out.println(evil.getSPS());
            int temp = evil.doDamage() * evil.getSF();
            System.out.println(evil.getName() + " special attack deals " + temp + " damage!");
            player.changeHealth(-temp);
            miss = false;
        }
        else if(evil.hit() && evil.getHealth() > 0)
        {
            int temp = evil.doDamage();
            System.out.println(evil.getName() + " attacks and deals " + temp + " damage!");
            player.changeHealth(-temp);
            miss = false;
        }
        else if(evil.getHealth() > 0)
        {
            System.out.println(evil.getName() + " missed!");
            miss = true;
        }
    }
    public boolean getMiss(){return miss;}
}
