package evidencijaBE.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "korisnik", schema = "evidencija_projekat", catalog = "postgres")
public class KorisnikEntity {
    private int idKorisnik;
    private String korisnickoIme;
    private String email;
    private String ime;
    private String prezime;
    private String sifra;
    private Timestamp timeStamp;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "korisnik_id"),
            inverseJoinColumns = @JoinColumn(name = "roles_id"))
    private Set<RolesEntity> roles = new HashSet<>();

    public Set<RolesEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RolesEntity> roles) {
        this.roles = roles;
    }


    @Id
    @Column(name = "id_korisnik")
    public int getIdKorisnik() {
        return idKorisnik;
    }

    public void setIdKorisnik(int idKorisnik) {
        this.idKorisnik = idKorisnik;
    }

    @Basic
    @Column(name = "korisnicko_ime")
    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ime")
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Basic
    @Column(name = "prezime")
    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Basic
    @Column(name = "sifra")
    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
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

        KorisnikEntity that = (KorisnikEntity) o;

        if (idKorisnik != that.idKorisnik) return false;
        if (korisnickoIme != null ? !korisnickoIme.equals(that.korisnickoIme) : that.korisnickoIme != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (ime != null ? !ime.equals(that.ime) : that.ime != null) return false;
        if (prezime != null ? !prezime.equals(that.prezime) : that.prezime != null) return false;
        if (sifra != null ? !sifra.equals(that.sifra) : that.sifra != null) return false;
        if (timeStamp != null ? !timeStamp.equals(that.timeStamp) : that.timeStamp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idKorisnik;
        result = 31 * result + (korisnickoIme != null ? korisnickoIme.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (ime != null ? ime.hashCode() : 0);
        result = 31 * result + (prezime != null ? prezime.hashCode() : 0);
        result = 31 * result + (sifra != null ? sifra.hashCode() : 0);
        result = 31 * result + (timeStamp != null ? timeStamp.hashCode() : 0);
        return result;
    }
}
