package annotationsproblems.exerciseproblems.useoverride;

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}
