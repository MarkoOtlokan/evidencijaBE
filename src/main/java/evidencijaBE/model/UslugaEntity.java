package evidencijaBE.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "usluga", schema = "evidencija_projekat", catalog = "postgres")
public class UslugaEntity {
    private int idUsluga;
    private Float cena;
    private String napomena;
    private Boolean placeno;
    private Timestamp timeStamp;

    @Id
    @Column(name = "id_usluga")
    public int getIdUsluga() {
        return idUsluga;
    }

    public void setIdUsluga(int idUsluga) {
        this.idUsluga = idUsluga;
    }

    @Basic
    @Column(name = "cena")
    public Float getCena() {
        return cena;
    }

    public void setCena(Float cena) {
        this.cena = cena;
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
    @Column(name = "placeno")
    public Boolean getPlaceno() {
        return placeno;
    }

    public void setPlaceno(Boolean placeno) {
        this.placeno = placeno;
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

        UslugaEntity that = (UslugaEntity) o;

        if (idUsluga != that.idUsluga) return false;
        if (cena != null ? !cena.equals(that.cena) : that.cena != null) return false;
        if (napomena != null ? !napomena.equals(that.napomena) : that.napomena != null) return false;
        if (placeno != null ? !placeno.equals(that.placeno) : that.placeno != null) return false;
        if (timeStamp != null ? !timeStamp.equals(that.timeStamp) : that.timeStamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsluga;
        result = 31 * result + (cena != null ? cena.hashCode() : 0);
        result = 31 * result + (napomena != null ? napomena.hashCode() : 0);
        result = 31 * result + (placeno != null ? placeno.hashCode() : 0);
        result = 31 * result + (timeStamp != null ? timeStamp.hashCode() : 0);
        return result;
    }
}
