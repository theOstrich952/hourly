package projects.ostrich952.hourly.Model;

import java.util.Date;

public class Day {
    private Date start_time;
    private Date end_time;
    private boolean lunch, tea;
    private double pay;

    public Day(Date start_time, Date end_time, boolean lunch, boolean tea){
        this.start_time = start_time;
        this.end_time = end_time;
        this.lunch = lunch;
        this.tea = tea;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public boolean isLunch() {
        return lunch;
    }

    public void setLunch(boolean lunch) {
        this.lunch = lunch;
    }

    public boolean isTea() {
        return tea;
    }

    public void setTea(boolean tea) {
        this.tea = tea;
    }

    public double getPay() {
        return getStart_time().getTime() - getEnd_time().getTime();
    }
}
