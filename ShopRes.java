
/**
 * Write a description of class ShopRes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopRes
{
    private int swordLvl = 0;
    private boolean sword = false;
    private int hCost = 150;
    public ShopRes()
    {
        
    }
    public void changeHCost(){hCost += 50;}
    public void changeSwordLvl(){swordLvl++;}
    public void changeSword(){sword = true;}
    public int getSwordLvl(){return swordLvl;}
    public int getHCost(){return hCost;}
    public boolean getSword(){return sword;}
}
