package owner;

import org.aeonbits.owner.ConfigFactory;

import java.util.HashMap;
import java.util.Map;

public class OwnerService {

    public static void main(String[] args) {

        var configuration = ConfigFactory.create(Configuration.class);

        var customInt = configuration.customInteger();

        Map vars = new HashMap();
        vars.put("env", "prod");

        var configuration1 = ConfigFactory.create(Configuration.class, vars);

        /*configuration.list(System.out);

        Map<String, String> map = new HashMap<>();
        configuration.fill(map);*/

        System.out.println();
    }

}
