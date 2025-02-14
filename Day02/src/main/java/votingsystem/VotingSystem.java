package votingsystem;

import java.util.*;

public class VotingSystem {
    public final HashMap<String, Integer> voteCounts; // Stores candidate -> vote count
    public final LinkedHashMap<String, Integer> voteOrder; // Stores votes in order received

    public VotingSystem() {
        this.voteCounts = new HashMap<>();
        this.voteOrder = new LinkedHashMap<>();
    }

    // Method to cast a vote
    public void castVote(String candidate) {
        voteCounts.put(candidate, voteCounts.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteCounts.get(candidate));
    }

    // Display votes in sorted order (Highest votes first)
    public void displayResults() {
        TreeMap<Integer, List<String>> sortedResults = new TreeMap<>(Collections.reverseOrder());

        for (Map.Entry<String, Integer> entry : voteCounts.entrySet()) {
            sortedResults.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        System.out.println("Election Results (Sorted by Votes):");
        for (Map.Entry<Integer, List<String>> entry : sortedResults.entrySet()) {
            for (String candidate : entry.getValue()) {
                System.out.println(candidate + " - " + entry.getKey() + " votes");
            }
        }
    }

    // Display votes in the order they were cast
    public void displayVoteOrder() {
        System.out.println("Votes in the order they were cast:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " votes");
        }
    }}