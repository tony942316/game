import java.util.Scanner;
/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop
{
    public static void main(String[]args)
    {
        Player player = Setup.getPlayer();
        ShopRes shop = Setup.getShopRes();
        String[] items = {"*Sword*: 150 coins", "*Health* Potion: 250 coins", "*Heart* Amulet: 300 coins", "Rabbit's *Foot*: " + shop.getHCost() + " coins"};
        if(shop.getSword())
        {
            items[0] = "Sharpen *Sword*: 200 coins";
        }
        if(shop.getSwordLvl() >= 3)
        {
            items[0] = "Your sword is sharp as can be!";
        }
        Scanner scan = new Scanner(System.in);
        String action = "Standard";
        System.out.println("Welcome to the shop you have " + player.getCoins() + " coins. What do you want to buy?");
        System.out.println("Type *leave* to go back to map.\n");               
        while(!action.equalsIgnoreCase("leave"))
        {
            items[3] = "Rabbit's *Foot*: " + shop.getHCost() + " coins";
            if(player.getHitChance() >= 100)
            {
                items[3] = "You have a 100% chance to hit!";
            }
            if(shop.getSwordLvl() >= 3)
            {
                items[0] = "Your sword is sharp as can be!";
            }
            for(int i = 0; i < items.length; i++)
            {
                System.out.println(items[i]);
            } 
            action = scan.nextLine();
            if(action.equalsIgnoreCase("sword"))
            {
                if(shop.getSwordLvl() >= 3)
                {
                    System.out.println("Your sword can't be sharpened anymore!");
                }
                else if(player.getCoins() >= 200 && shop.getSword())
                {
                    player.changeCoins(-200);
                    player.changeDamage(2);
                    System.out.println("Your attack range is now: " + player.getMinDamage() + "-" + player.getMaxDamage());
                    shop.changeSwordLvl();
                }
                else if(player.getCoins() >= 150 && !shop.getSword())
                {
                    player.changeCoins(-150);
                    player.changeDamage(3);
                    System.out.println("Your attack range is now: " + player.getMinDamage() + "-" + player.getMaxDamage());
                    shop.changeSword();
                    items[0] = "Sharpen *Sword*: 200 coins";
                }
                else
                System.out.println("Not enough money");
            }
            else if(action.equalsIgnoreCase("Foot"))
            {
                if(player.getHitChance() >= 100)
                {
                    System.out.println("You have max chance to hit!");
                }
                else if(player.getCoins() >= shop.getHCost())
                {
                    player.changeCoins(-shop.getHCost());
                    player.changeHitChance(10);
                    System.out.println("Your hit chance is now: " + player.getHitChance() + "%");
                    shop.changeHCost();
                }
            }
            else if(action.equalsIgnoreCase("Health"))
            {
                if(player.getCoins() >= 250)
                {
                    player.changeCoins(-250);
                    player.changeHPotions(-1);
                    if(player.getHPotions() > 1)
                    System.out.println("You now have " + player.getHPotions() + " health potions.");
                    else
                    System.out.println("You now have " + player.getHPotions() + " health potion.");
                }
                else
                System.out.println("Not enough money");
            }
            else if(action.equalsIgnoreCase("Heart"))
            {
                if(player.getCoins() >= 300)
                {
                    player.changeCoins(-300);
                    player.changeMaxHealth(10);
                    player.changeHealth(10);
                    System.out.println("You max health has been increased to " + player.getMaxHealth() + " hitpoints");
                    System.out.println("Your currently have " + player.getHealth() + " hitpoints");
                }
                else
                System.out.println("Not enough money");
            }
            else if(!action.equalsIgnoreCase("leave"))
            System.out.println("Invalid Input!");
            System.out.println("You now have " + player.getCoins() + " coins.\n");
        }
        System.out.println();
        Map.main(args);
    }
}
