package owner.singleton;

import org.aeonbits.owner.ConfigCache;

public class OwnerSingletonService {

    public static void main(String[] args) {
        OwnerSingleton.configuration();

        var list = ConfigCache.list();

        var item = ConfigCache.get("conf1");
    }

}
