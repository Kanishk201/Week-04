package setinterface.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicy implements Comparable<InsurancePolicy> {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof InsurancePolicy)) return false;
        InsurancePolicy other = (InsurancePolicy) obj;
        return this.policyNumber.equals(other.policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber +
                ", Holder: " + policyholderName +
                ", Expiry: " + expiryDate +
                ", Coverage: " + coverageType +
                ", Premium: $" + premiumAmount;
    }
}
