package evidencijaBE.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "proizvod", schema = "evidencija_projekat", catalog = "postgres")
public class ProizvodEntity {
    private int idProizvod;
    private String userId;
    private String naziv;
    private String napomena;
    private String cena;
    private Timestamp timeStamp;

    @Id
    @Column(name = "id_proizvod")
    public int getIdProizvod() {
        return idProizvod;
    }

    public void setIdProizvod(int idProizvod) {
        this.idProizvod = idProizvod;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "naziv")
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Basic
    @Column(name = "napomena")
    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    @Basic
    @Column(name = "cena")
    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    @Basic
    @Column(name = "time_stamp")
    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProizvodEntity that = (ProizvodEntity) o;

        if (idProizvod != that.idProizvod) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (naziv != null ? !naziv.equals(that.naziv) : that.naziv != null) return false;
        if (napomena != null ? !napomena.equals(that.napomena) : that.napomena != null) return false;
        if (cena != null ? !cena.equals(that.cena) : that.cena != null) return false;
        if (timeStamp != null ? !timeStamp.equals(that.timeStamp) : that.timeStamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProizvod;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        result = 31 * result + (napomena != null ? napomena.hashCode() : 0);
        result = 31 * result + (cena != null ? cena.hashCode() : 0);
        result = 31 * result + (timeStamp != null ? timeStamp.hashCode() : 0);
        return result;
    }
}
