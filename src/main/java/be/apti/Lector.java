package be.apti;

public class Lector {
    private String naam;
    private int id;

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
                '}';
    }
}
