package mapinterface.insurancepolicymanagementsystem;

import java.time.LocalDate;


public class InsurancePolicy {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber +
                ", Policyholder: " + policyholderName +
                ", ExpiryDate: " + expiryDate +
                ", Premium: $" + premiumAmount;
    }

}
