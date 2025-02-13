package setinterface.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagementSystem {
    private HashSet<InsurancePolicy> policySet = new HashSet<>(); // Fast lookup
    private LinkedHashSet<InsurancePolicy> orderedPolicySet = new LinkedHashSet<>(); // Insertion order
    private TreeSet<InsurancePolicy> sortedPolicySet = new TreeSet<>(); // Sorted by expiry

    // Add a new policy
    public void addPolicy(InsurancePolicy policy) {
        policySet.add(policy);
        orderedPolicySet.add(policy);
        sortedPolicySet.add(policy);
    }

    // Retrieve all unique policies
    public void displayAllPolicies() {
        System.out.println("\nAll Unique Policies:");
        for (InsurancePolicy policy : orderedPolicySet) {
            System.out.println(policy);
        }
    }

    // Retrieve policies expiring within the next 30 days
    public List<InsurancePolicy> getExpiringPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        List<InsurancePolicy> expiringPolicies = new ArrayList<>();

        for (InsurancePolicy policy : sortedPolicySet) {
            if (!policy.getExpiryDate().isAfter(next30Days)) {
                expiringPolicies.add(policy);
            }
        }
        return expiringPolicies;
    }

    // Retrieve policies based on coverage type
    public List<InsurancePolicy> getPoliciesByCoverage(String coverageType) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (InsurancePolicy policy : policySet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Find duplicate policies (same policy number)
    public Set<String> findDuplicatePolicies() {
        Set<String> uniquePolicyNumbers = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (InsurancePolicy policy : orderedPolicySet) {
            if (!uniquePolicyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy.getPolicyNumber());
            }
        }
        return duplicates;
    }

    // Performance Test
    public void comparePerformance() {
        int n = 100000;
        System.out.println("\nPerformance Comparison for " + n + " operations:");

        List<InsurancePolicy> testPolicies = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            testPolicies.add(new InsurancePolicy("P" + i, "Holder" + i, LocalDate.now().plusDays(i % 365), "Auto", 1000 + i));
        }

        long start, end;

        // HashSet Performance
        start = System.nanoTime();
        HashSet<InsurancePolicy> hashSet = new HashSet<>(testPolicies);
        end = System.nanoTime();
        System.out.println("HashSet Insertion: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        hashSet.contains(testPolicies.get(n / 2));
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start) / 1e6 + " ms");

        // LinkedHashSet Performance
        start = System.nanoTime();
        LinkedHashSet<InsurancePolicy> linkedHashSet = new LinkedHashSet<>(testPolicies);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Insertion: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        linkedHashSet.contains(testPolicies.get(n / 2));
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search: " + (end - start) / 1e6 + " ms");

        // TreeSet Performance
        start = System.nanoTime();
        TreeSet<InsurancePolicy> treeSet = new TreeSet<>(testPolicies);
        end = System.nanoTime();
        System.out.println("TreeSet Insertion: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        treeSet.contains(testPolicies.get(n / 2));
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start) / 1e6 + " ms");
    }
}
