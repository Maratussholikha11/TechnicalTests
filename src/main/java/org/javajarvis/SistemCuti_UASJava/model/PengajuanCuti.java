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
    private Integer id;
    private Employee employee;
    private StatusCuti statusCuti;

    @Column(name = "pengganti_id")
    private  Integer penggantiId;

    @Column(name = "hrd_id")
    private Integer hrdId;

    private String alamat;

    @Column(name = "no_telp")
    private String noTelp;

    private String keterangan;

    @Column(name = "lama_cuti")
    private Integer lamaCuti;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pengajuan_cuti_id")

    public Integer getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "employee_id")
    public Employee getEmployee() {
        return employee;
    }

    @ManyToOne
    @JoinColumn(name = "status_cuti_id")
    public StatusCuti getStatusCuti() {
        return statusCuti;
    }


}
