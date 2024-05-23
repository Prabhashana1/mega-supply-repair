package model;

import java.util.Date;

/**
 *
 * @author prabhashana
 */
public class Customer {
    
    private int customerId;
    private String name;
    private String phoneModel;
    private String issueDescription;
    private Date acceptedDate;

    public Customer(String name, String phoneModel, String issueDescription, Date acceptedDate) {
        this.name = name;
        this.phoneModel = phoneModel;
        this.issueDescription = issueDescription;
        this.acceptedDate = acceptedDate;
    }

    public Customer(int customerId, String name, String phoneModel, String issueDescription, Date acceptedDate) {
        this.customerId = customerId;
        this.name = name;
        this.phoneModel = phoneModel;
        this.issueDescription = issueDescription;
        this.acceptedDate = acceptedDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(Date acceptedDate) {
        this.acceptedDate = acceptedDate;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }
    
    
}
