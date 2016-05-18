
/**
 * Write a description of class Fight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FightRes
{
    Player player = Setup.getPlayer();
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
        }
        if(evil.getHealth() > 0)
        {
            System.out.println("Enemy has " + evil.getHealth() + " hitpoints");
        }
        else
        {
            System.out.println("Enemy is DEAD!");
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
        if(player.getHealth() > 0)
        {
            System.out.println("You have " + player.getHealth() + " hitpoints");
        }
        else
        {
            System.out.println("You are DEAD!");
        }
    }
    public void getDrop(Enemy evil)
    {
        if(player.getHealth() > 0)
        {
            int temp = evil.drop();
            player.changeCoins(temp);
            System.out.println("You gained " + temp + " coins");
            System.out.println("You now have " + player.getCoins() + " coins\n");
        }
    }
    public void doEAttack(Enemy evil)
    {
        if(evil.special() && evil.getHealth() > 0)
        {
            System.out.println(evil.getSPS());
            int temp = evil.doDamage() * evil.getSF();
            System.out.println("Enemy special attack deals " + temp + " damage!");
            player.changeHealth(-temp);
        }
        else if(evil.hit() && evil.getHealth() > 0)
        {
            int temp = evil.doDamage();
            System.out.println("Enemy attacks and deals " + temp + " damage!");
            player.changeHealth(-temp);
        }
        else if(evil.getHealth() > 0)
        {
            System.out.println("Enemy missed!");
        }
    }
}
