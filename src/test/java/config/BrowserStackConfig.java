package config;

import org.aeonbits.owner.Config;
@Config.Sources(
        {"classpath:browserStack.properties"}
)
public interface BrowserStackConfig extends Config {
   @Config.Key("user")
    String getUser();

    @Config.Key("key")
    String getKey();

    @Config.Key("app")
    String getApp();

    @Config.Key("device")
    String getDevice();

    @Config.Key("osVersion")
    String getOsVersion();

    @Config.Key("baseUrl")
    String getBaseUrl();

    @Config.Key("project")
    String getProject();

    @Config.Key("build")
    String getBuild();

    @Config.Key("name")
    String getName();

}
