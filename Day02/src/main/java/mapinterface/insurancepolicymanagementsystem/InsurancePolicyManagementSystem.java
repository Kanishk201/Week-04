package mapinterface.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.*;

class InsurancePolicyManagementSystem {
    private HashMap<String, InsurancePolicy> policyMap = new HashMap<>();
    private LinkedHashMap<String, InsurancePolicy> insertionOrderPolicies = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<InsurancePolicy>> sortedByExpiry = new TreeMap<>();

    // Add a new policy
    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        insertionOrderPolicies.put(policy.getPolicyNumber(), policy);

        sortedByExpiry.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    // Retrieve a policy by number
    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<InsurancePolicy> getExpiringPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        List<InsurancePolicy> expiringPolicies = new ArrayList<>();

        for (Map.Entry<LocalDate, List<InsurancePolicy>> entry : sortedByExpiry.subMap(today, true, next30Days, true).entrySet()) {
            expiringPolicies.addAll(entry.getValue());
        }
        return expiringPolicies;
    }

    // List policies by policyholder name
    public List<InsurancePolicy> getPoliciesByHolder(String policyholderName) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, List<InsurancePolicy>>> iterator = sortedByExpiry.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<LocalDate, List<InsurancePolicy>> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                for (InsurancePolicy policy : entry.getValue()) {
                    policyMap.remove(policy.getPolicyNumber());
                    insertionOrderPolicies.remove(policy.getPolicyNumber());
                }
                iterator.remove();
            }
        }
    }

    // Display all policies in insertion order
    public void displayAllPolicies() {
        System.out.println("\nAll Policies (Insertion Order):");
        for (InsurancePolicy policy : insertionOrderPolicies.values()) {
            System.out.println(policy);
        }
    }
}
