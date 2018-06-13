package projects.ostrich952.hourly.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Week {
    private ArrayList<Day> days;
    private double hours_worked;
    private double pay_subtotal;

    public Week(ArrayList<Day> days){
        this.days = days;
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }

    public double getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(double hours_worked) {
        this.hours_worked = hours_worked;
    }

    public double getPay_subtotal() {
        return pay_subtotal;
    }

    public void setPay_subtotal(double pay_subtotal) {
        this.pay_subtotal = pay_subtotal;
    }
}
