package org.javajarvis.SistemCuti_UASJava.dto;

import lombok.Getter;

@Getter
public class PengajuanCutiDto {
    private int id;
    private int employeeId;
    private int statusCutiId;
    private int penggantiId;
    private int hrdId;
    private String alamat;
    private String noTelp;
    private String keterangan;
    private int lamaCuti;
}
