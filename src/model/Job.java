package model;
/**
 *
 * @author prabhashana
 */
public class Job {
    
    private int jobId;
    private int customerId;
    private String status;

    public Job(int customerId, String status) {
        this.customerId = customerId;
        this.status = status;
    }

    public Job(int jobId, int customerId, String status) {
        this.jobId = jobId;
        this.customerId = customerId;
        this.status = status;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomer(int customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
