package annotationsproblems.exerciseproblems.usedeprecated;

public class UseDeprecated {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();
        api.newFeature();
    }
}
