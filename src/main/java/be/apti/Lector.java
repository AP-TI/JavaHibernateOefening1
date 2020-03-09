package be.apti;

import java.util.Map;

public class Lector {
    private String naam;
    private int id;
    private Map<Object, Reservatie> reservaties;

    public Map<Object, Reservatie> getReservaties() {
        return reservaties;
    }

    public void setReservaties(Map<Object, Reservatie> reservaties) {
        this.reservaties = reservaties;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Lector{" +
                "naam='" + naam + '\'' +
                ", id=" + id +
                '}' + getReservaties();
    }
}
