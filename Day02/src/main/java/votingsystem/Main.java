package votingsystem;
public class Main{
public static void main(String[] args) {
    VotingSystem system = new VotingSystem();

    system.castVote("Alice");
    system.castVote("Bob");
    system.castVote("Alice");
    system.castVote("Charlie");
    system.castVote("Bob");
    system.castVote("Alice");

    system.displayResults();
    System.out.println();
    system.displayVoteOrder();
}
}