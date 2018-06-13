package projects.ostrich952.hourly.Model;

public class Job {
    private String job_name;
    private String pay_per_hour;

    public Job(String name, String pay) {
        this.job_name = name;
        this.pay_per_hour = pay;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getPay_per_hour() {
        return pay_per_hour;
    }

    public void setPay_per_hour(String pay_per_hour) {
        this.pay_per_hour = pay_per_hour;
    }

    @Override
    public String toString() {
        return "Job{" +
                "job_name='" + job_name + '\'' +
                ", pay_per_hour='" + pay_per_hour + '\'' +
                '}';
    }
}
