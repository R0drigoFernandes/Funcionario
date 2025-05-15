package entities;

import java.sql.Date;

public class HourContract {
    private Integer hours;
    private Double valuePerHour;
    private Date date;
    

    public HourContract() {
    }
    public HourContract(Integer hours, Double valuePerHour, Date date) {
        this.hours = hours;
        this.valuePerHour = valuePerHour;
        this.date = date;
    }
    public Integer getHours() {
        return hours;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public Double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Double totalValue() {
        return hours * valuePerHour;
    }
   

}
