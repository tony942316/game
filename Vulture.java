
/**
 * Write a description of class Vulture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vulture extends Enemy
{
    public Vulture(int health, int minDamage, int maxDamage)
    {
        super(health, minDamage, maxDamage);
    }
    public boolean special()
    {
        int chance = (int)((100 - 1 + 1) * Math.random()) + 1;
        if(chance > 75)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public int drop()
    {
        int coins = (int)((200 - 150 + 1) * Math.random()) + 150;
        return coins;
    }
    public String getName(){return "Vulture";}
    public String getSPS()
    {
        return "VULTURE SPECIAL ATTACK FIRST PICKS!!!";
    }
    public int getSF()
    {
        return (int)2;
    }
}
