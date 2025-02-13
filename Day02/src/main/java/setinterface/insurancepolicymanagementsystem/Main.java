package setinterface.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem();

        // Adding some policies
        system.addPolicy(new InsurancePolicy("P101", "John", LocalDate.now().plusDays(10), "Health", 1200.00));
        system.addPolicy(new InsurancePolicy("P102", "Alice", LocalDate.now().plusDays(40), "Auto", 800.00));
        system.addPolicy(new InsurancePolicy("P103", "John", LocalDate.now().plusDays(5), "Home", 1500.00));
        system.addPolicy(new InsurancePolicy("P104", "Emma", LocalDate.now().minusDays(2), "Health", 1000.00));

        // Display all policies
        system.displayAllPolicies();

        // List policies expiring in next 30 days
        System.out.println("\nPolicies Expiring in Next 30 Days:");
        for (InsurancePolicy policy : system.getExpiringPolicies()) {
            System.out.println(policy);
        }

        // List policies for a specific coverage type
        System.out.println("\nHealth Policies:");
        for (InsurancePolicy policy : system.getPoliciesByCoverage("Health")) {
            System.out.println(policy);
        }

        // Find duplicate policies
        System.out.println("\nDuplicate Policies:");
        System.out.println(system.findDuplicatePolicies());

        // Performance comparison
        system.comparePerformance();
    }
}
