package benj1337.domain;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@OnDelete(action = OnDeleteAction.NO_ACTION)
public class Adresse {
    @Id
    @GeneratedValue
    private int id;
    private String ort;

    public Adresse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "id=" + id +
                ", ort='" + ort + '\'' +
                '}';
    }
}
