package co.inventorsoft.birdietests.utils;

/**
 * Help class to get passed parameters from environment for further usage in the automation project
 */
public class Properties {

    private static final String DEFAULT_BASE_URL = "https://test.advertisingreview.com/login";

    /**
     *
     * @return Website frontend.
     */
    public static String getBaseUrl() {
        return System.getProperty(EnvironmentVariables.BASE_URL.toString(), DEFAULT_BASE_URL);
    }


}

/**
 * All parameters that are passed to automation project
 */
enum EnvironmentVariables {

    BASE_URL("env.url");

    private String value;

    EnvironmentVariables(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
