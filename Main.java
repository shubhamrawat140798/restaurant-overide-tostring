/*
Java program as per the below-given specification:

i) Design a Dish class having dishID, dishName, creationTime as the attributes. 
To initialize the attributes of the class and create a parameterized constructor. 
Also override the toString() method to print the object's details on the console.

ii) Design a Menu class having menuList as an attribute which is a static ArrayList. 
Load the menuList with a Dish object comprising some sample dishes using a static block.

iii) Design a Restaurant class comprising the main method. It should give a menu driven 
interface to a user as follows:
Press 1 to display Dishes.
Press 2 to search Dish.

iv) On the click of 1 all the dishes offered by the restaurant should be displayed to a user.

v) On the click of 2 it prompts the user to enter the dishID, if the ID entered matches 
with the dish, its details should be printed on the console.
*/
import java.util.ArrayList;
import java.util.Scanner;
class Dish{
    int dishID;
    String dishName;
    String creationTime;

     Dish(int id,String name,String time ){
        dishID = id;
        dishName = name;
        creationTime = time;
        
    }
    @Override
    public String toString()
    {
        return "\n dishID: " + dishID 
                + "\n dishName: " + dishName 
                + "\n creationTime: " + creationTime;
    }

}
class menu{
    static ArrayList<Dish> MenuList = new ArrayList<Dish>();
    static{
        MenuList.add(new Dish(1,"Chole Bhature","5:30 PM"));
        MenuList.add(new Dish(2,"Hawaiian Pizza","2:00 PM"));
        MenuList.add(new Dish(3,"Doodh Peda","1:10 PM"));
        for( Dish d: MenuList)
        {
            System.out.println(d.dishName);
        }
    }
}
 class restaurant{
    public static void main(String[] args) {
        //Part i
       //Dish d1 = new Dish(1,"Dahi Bhalle","6:00 AM");
       //System.out.println(d1.toString());
       Scanner sc= null;
       try{
       
        sc= new Scanner(System.in);
        System.out.print("\nPress 1 to display Dishes ");
        System.out.print("\nPress 2 to search Dish");
        System.out.print("\n\nEnter your choice: ");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.print("\nHere is the list of dishes:\n");
             new menu();
        }
        if(ch==2)
        {
           int val;
           System.out.print("\n\nEnter Dish ID: ");
           val=sc.nextInt();
            ArrayList<Dish> menuList=new ArrayList<Dish>();
            menuList.add(new Dish(1,"Chole Bhature","5:30 PM"));
            menuList.add(new Dish(2,"Hawaiian Pizza","2:00 PM"));
            menuList.add(new Dish(3,"Doodh Peda","1:10 PM"));
            for( Dish d: menuList)
            {
                if(val==d.dishID)
                {
                   System.out.println(d);
                   break;
                }
            }
                
        }
        
       }
       catch(Exception e){
           System.out.println(e);
       }
       finally{
           if(sc!=null)
            sc.close();
       }
       
    }
}
