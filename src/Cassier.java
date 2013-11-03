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
            meals.add(new Meal(""+i));
        }
    }

    public Meal giveMeal(){
     if (meals.size()>0){
         return meals.remove(0);
        } else {
         System.out.println("ERROR! Casier has no food");
         return null;
     }
    }
}
