import com.cocheInterface.CocheCRUD;
import com.coches.Coche;
import com.coches.CocheCRUDImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save(new Coche(4, "Verde", 5));
        cocheCRUD.delete(6);
        List<Coche> coches = cocheCRUD.findAll();
        
    }
}