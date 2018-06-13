package projects.ostrich952.hourly.Model;

import java.util.ArrayList;

public class Week {
    private ArrayList<Day> days;
    private double hours_worked;
    private double pay_per_hour;
    private double pay_subtotal;

    public Week(ArrayList<Day> days, double pay_per_hour){
        this.days = days;
        this.pay_per_hour = pay_per_hour;
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }

    public double getHours_worked() {

        for(Day d : days){
             this.hours_worked += d.getHours();
        }
        return hours_worked;
    }

    public void setHours_worked(double hours_worked) {
        this.hours_worked = hours_worked;
    }

    public double getPay_subtotal() {
        return hours_worked * pay_per_hour;
    }

    public void setPay_subtotal(double pay_subtotal) {
        this.pay_subtotal = pay_subtotal;
    }
}
