import java.util.LinkedList;
import java.util.List;

/**
 * User: Vlad
 * Date: 03.11.13
 * Time: 14:19
 */
public class Cassier{
    List<Meal> meals = new LinkedList<Meal>();
    public Cassier() {
        for (int i=0;i<10;i++){
            meals.add(new Meal("Meal#"+i));
        }
    }

    public synchronized Meal giveMeal(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        if (meals.size()>0){
         return meals.remove(0);
        }
     else {
         //System.out.println("ERROR! Casier has no food");
         return null;
     }
    }
}
