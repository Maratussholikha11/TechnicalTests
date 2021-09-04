package org.javajarvis.SistemCuti_UASJava.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_pengajuan_cuti")
@Data
@Setter @Getter
public class PengajuanCuti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pengajuan_cuti_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "status_cuti_id")
    private StatusCuti statusCuti;

    @ManyToOne
    @JoinColumn(name = "pengganti_id")
    private Employee pengganti;

    @ManyToOne
    @JoinColumn(name = "hrd_id")
    private Employee hrd;

    private String alamat;

    @Column(name = "no_telp")
    private String noTelp;

    private String keterangan;

    @Column(name = "lama_cuti")
    private Integer lamaCuti;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public StatusCuti getStatusCuti() {
        return statusCuti;
    }

    public void setStatusCuti(StatusCuti statusCuti) {
        this.statusCuti = statusCuti;
    }

    public Employee getPengganti() {
        return pengganti;
    }

    public void setPengganti(Employee pengganti) {
        this.pengganti = pengganti;
    }

    public Employee getHrd() {
        return hrd;
    }

    public void setHrd(Employee hrd) {
        this.hrd = hrd;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Integer getLamaCuti() {
        return lamaCuti;
    }

    public void setLamaCuti(Integer lamaCuti) {
        this.lamaCuti = lamaCuti;
    }
}
