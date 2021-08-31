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

}
