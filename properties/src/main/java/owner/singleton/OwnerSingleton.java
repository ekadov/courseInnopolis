package owner.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.aeonbits.owner.ConfigCache;
import owner.Configuration;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OwnerSingleton {

    public static Configuration configuration() {

        Configuration configuration =
                ConfigCache.getOrCreate("conf1", Configuration.class);
        Configuration configuration1 =
                ConfigCache.getOrCreate("conf2", Configuration.class);



        return configuration;
    }


}
