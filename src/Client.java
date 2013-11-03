/**
 * User: Vlad
 * Date: 03.11.13
 * Time: 14:19
 */
public class Client extends Thread{
    private String clientId;
    private Cassier cassier;
    private Meal meal;

    public Client(String clientId, Cassier cassier) {
        this.clientId = clientId;
        this.cassier = cassier;
    }

    @Override
    public void run() {
        meal = cassier.giveMeal();
        System.out.println("client #"+clientId+" buy meal #"+meal.getId());
    }
}
