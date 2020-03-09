package be.apti;

public class Reservatie {
    private int id;
    private int slotId;

    @Override
    public String toString() {
        return "Reservatie{" +
                "id=" + id +
                ", slotId=" + slotId +
                '}';
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
