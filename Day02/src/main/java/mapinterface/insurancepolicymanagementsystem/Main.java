package mapinterface.insurancepolicymanagementsystem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem();

        // Adding some policies
        system.addPolicy(new InsurancePolicy("P101", "John Doe", LocalDate.now().plusDays(10), 1200.00));
        system.addPolicy(new InsurancePolicy("P102", "Alice Brown", LocalDate.now().plusDays(40), 800.00));
        system.addPolicy(new InsurancePolicy("P103", "John Doe", LocalDate.now().plusDays(5), 1500.00));
        system.addPolicy(new InsurancePolicy("P104", "Emma White", LocalDate.now().minusDays(2), 1000.00));

        // Display policies
        system.displayAllPolicies();

        // Retrieve a policy
        System.out.println("\nRetrieved Policy: " + system.getPolicyByNumber("P101"));

        // List policies expiring in next 30 days
        System.out.println("\nPolicies Expiring in Next 30 Days:");
        for (InsurancePolicy policy : system.getExpiringPolicies()) {
            System.out.println(policy);
        }

        // List policies for a specific policyholder
        System.out.println("\nPolicies for John Doe:");
        for (InsurancePolicy policy : system.getPoliciesByHolder("John Doe")) {
            System.out.println(policy);
        }

        // Remove expired policies
        system.removeExpiredPolicies();
        System.out.println("\nAfter Removing Expired Policies:");
        system.displayAllPolicies();
    }

}
