/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ALahoz
 */
@Embeddable
public class AutorPremioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_autor")
    private int codAutor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_premio")
    private int codPremio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio")
    private int anio;

    public AutorPremioPK() {
    }

    public AutorPremioPK(int codAutor, int codPremio, int anio) {
        this.codAutor = codAutor;
        this.codPremio = codPremio;
        this.anio = anio;
    }

    public int getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(int codAutor) {
        this.codAutor = codAutor;
    }

    public int getCodPremio() {
        return codPremio;
    }

    public void setCodPremio(int codPremio) {
        this.codPremio = codPremio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codAutor;
        hash += (int) codPremio;
        hash += (int) anio;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AutorPremioPK)) {
            return false;
        }
        AutorPremioPK other = (AutorPremioPK) object;
        if (this.codAutor != other.codAutor) {
            return false;
        }
        if (this.codPremio != other.codPremio) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libreria.AutorPremioPK[ codAutor=" + codAutor + ", codPremio=" + codPremio + ", anio=" + anio + " ]";
    }
    
}
