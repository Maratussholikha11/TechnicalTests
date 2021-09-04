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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getStatusCutiId() {
        return statusCutiId;
    }

    public void setStatusCutiId(int statusCutiId) {
        this.statusCutiId = statusCutiId;
    }

    public int getPenggantiId() {
        return penggantiId;
    }

    public void setPenggantiId(int penggantiId) {
        this.penggantiId = penggantiId;
    }

    public int getHrdId() {
        return hrdId;
    }

    public void setHrdId(int hrdId) {
        this.hrdId = hrdId;
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

    public int getLamaCuti() {
        return lamaCuti;
    }

    public void setLamaCuti(int lamaCuti) {
        this.lamaCuti = lamaCuti;
    }
}
