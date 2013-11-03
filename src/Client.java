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
        for (int i=0;i<10;i++){
            meal = cassier.giveMeal();
            if (meal!=null){
                System.out.println("client #"+clientId+" buy meal "+meal.getId());
            }else{
                System.out.println("client#"+clientId+" left hungry! =(");
            }
        }
    }
}
