package annotationsproblems.exerciseproblems.usedeprecated;

class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Warning: This feature is deprecated. Use newFeature() instead.");
    }

    public void newFeature() {
        System.out.println("This is the new and improved feature!");
    }
}
