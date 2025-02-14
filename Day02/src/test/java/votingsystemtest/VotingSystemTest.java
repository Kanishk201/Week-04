package votingsystemtest;

import org.junit.jupiter.api.Test;
import votingsystem.VotingSystem;

import static org.junit.jupiter.api.Assertions.*;

class VotingSystemTest {
    @Test
    void testVotingSystem() {
        VotingSystem system = new VotingSystem();
        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");
        system.castVote("Alice");

        assertEquals(3, system.voteCounts.get("Alice"));
        assertEquals(2, system.voteCounts.get("Bob"));
        assertEquals(1, system.voteCounts.get("Charlie"));
        assertTrue(system.voteOrder.containsKey("Alice"));
        assertTrue(system.voteOrder.containsKey("Bob"));
        assertTrue(system.voteOrder.containsKey("Charlie"));
    }
}
