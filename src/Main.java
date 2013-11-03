import java.util.LinkedList;
import java.util.List;

/**
 * User: Vlad
 * Date: 03.11.13
 * Time: 14:19
 */
public class Main {
    public static void main(String[] args) {
        Cassier cassier = new Cassier();
        List<Client> clients = new LinkedList<Client>();
        int n = 10;
        for (int i = 0; i<n; i++){
            clients.add(new Client(""+i,cassier));
        }


    }
}
