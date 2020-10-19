package evidencijaBE.model;

import javax.persistence.*;

@Entity
@Table(name = "roles", schema = "evidencija_projekat", catalog = "postgres")
public class RolesEntity {
    private int idRoles;
    private String erole;

    @Id
    @Column(name = "id_roles")
    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    @Basic
    @Column(name = "erole")
    public String getErole() {
        return erole;
    }

    public void setErole(String erole) {
        this.erole = erole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RolesEntity that = (RolesEntity) o;

        if (idRoles != that.idRoles) return false;
        if (erole != null ? !erole.equals(that.erole) : that.erole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRoles;
        result = 31 * result + (erole != null ? erole.hashCode() : 0);
        return result;
    }
}
