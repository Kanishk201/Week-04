package reflectionproblems.intermediatereflectionproblems.accessandmodifystatickey;

class Configuration {
    private static String API_KEY = "initial_key";

    public static String getApiKey() {
        return API_KEY;
    }
}
