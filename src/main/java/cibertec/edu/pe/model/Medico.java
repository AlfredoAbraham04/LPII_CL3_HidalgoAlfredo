package cibertec.edu.pe.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "TBL_MEDICOCL3")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedicoCL3;

    @Column(name = "nombrecl3", nullable = false, length = 255)
    private String nombreCL3;

    @Column(name = "apellidocl3", nullable = false, length = 255)
    private String apellidoCL3;

    @Column(nullable = false, length = 255)
    private String email;

    @Column(name = "dnicl3", nullable = false, length = 255)
    private String dniCL3;

    @Column(name = "estadocivilcl3", length = 255)
    private String estadoCivilCL3;

    @Column(name = "fechanacimcl3")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimCL3;


    public Long getIdMedicoCL3() {
        return idMedicoCL3;
    }

    public void setIdMedicoCL3(Long idMedicoCL3) {
        this.idMedicoCL3 = idMedicoCL3;
    }

    public String getNombreCL3() {
        return nombreCL3;
    }

    public void setNombreCL3(String nombreCL3) {
        this.nombreCL3 = nombreCL3;
    }

    public String getApellidoCL3() {
        return apellidoCL3;
    }

    public void setApellidoCL3(String apellidoCL3) {
        this.apellidoCL3 = apellidoCL3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDniCL3() {
        return dniCL3;
    }

    public void setDniCL3(String dniCL3) {
        this.dniCL3 = dniCL3;
    }

    public String getEstadoCivilCL3() {
        return estadoCivilCL3;
    }

    public void setEstadoCivilCL3(String estadoCivilCL3) {
        this.estadoCivilCL3 = estadoCivilCL3;
    }

    public Date getFechaNacimCL3() {
        return fechaNacimCL3;
    }

    public void setFechaNacimCL3(Date fechaNacimCL3) {
        this.fechaNacimCL3 = fechaNacimCL3;
    }
}
