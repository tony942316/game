
/**
 * Write a description of class ArmorDillo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArmorDillo extends Enemy
{
    public ArmorDillo(int health, int minDamage, int maxDamage)
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
        int coins = (int)((200 - 160 + 1) * Math.random()) + 160;
        return coins;
    }
    public String getName(){return "ArmorDillo";}
    public String getSPS()
    {
        return "ARMORDILLO SPECIAL ATTACK ROLLING THUNDER!!!";
    }
    public int getSF()
    {
        return (int)4;
    }
}
