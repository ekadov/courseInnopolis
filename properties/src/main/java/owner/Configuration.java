package owner;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config.properties",
        "classpath:custom.properties"
})
public interface Configuration extends Config {

    @Key("website.url")
    String websiteUrl();

    @Key("db.username")
    String dbUsername();

    @Key("db.password")
    String dbPassword();

    @Key("custom.integer")
    Integer customInteger();

    @Key("custom.double")
    Double customDouble();

    @Key("custom.integer")
    Integer custom1();

    @Key("custom.double")
    String custom2();

    @DefaultValue("dev")
    String env();

    @Key("servers.${env}.name")
    String name();

    @Key("servers.${env}.hostname")
    String hostname();

}
