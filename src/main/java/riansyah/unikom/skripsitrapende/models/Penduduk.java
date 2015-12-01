package riansyah.unikom.skripsitrapende.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Penduduk {
    @Id
    @Column(length=16, nullable=false, unique = true)
    private String nik;
    
    @Column(length=50, nullable=false)
    private String nama;
    
    @Column(length=1, nullable=false)
    private String jkelamin;
    
    @Column(length=25, nullable=false)
    private String tempatlahir;
    
    @Temporal(TemporalType.DATE)
    @Column(length=10, nullable=false)
    private Date tanggallahir;
    
    @Column(length=10, nullable=false)
    private String agama;
    
    @Column(length=25, nullable=false)
    private String pendidikan;
    
    @Column(length=25, nullable=false)
    private String pekerjaan;
    
    @Column(length=15, nullable=false)
    private String statusnikah;
    
    @Column(length=15, nullable=false)
    private String statuskel;
    
    @Column(length=3, nullable=false)
    private String kwn;
    
    @Column(length=20, nullable=false)
    private String nopassport;
    
    @Column(length=20, nullable=false)
    private String nokitas;
    
    @Column(length=50, nullable=false)
    private String ayah;
    
    @Column(length=50, nullable=false)
    private String ibu;
    
    public String getNik() {
        return nik;
    }
    
    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJkelamin() {
        return jkelamin;
    }

    public void setJkelamin(String jkelamin) {
        this.jkelamin = jkelamin;
    }

    public String getTempatlahir() {
        return tempatlahir;
    }

    public void setTempatlahir(String tempatlahir) {
        this.tempatlahir = tempatlahir;
    }

    public Date getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(Date tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getStatusnikah() {
        return statusnikah;
    }

    public void setStatusnikah(String statusnikah) {
        this.statusnikah = statusnikah;
    }

    public String getStatuskel() {
        return statuskel;
    }

    public void setStatuskel(String statuskel) {
        this.statuskel = statuskel;
    }

    public String getKwn() {
        return kwn;
    }

    public void setKwn(String kwn) {
        this.kwn = kwn;
    }

    public String getNopassport() {
        return nopassport;
    }

    public void setNopassport(String nopassport) {
        this.nopassport = nopassport;
    }

    public String getNokitas() {
        return nokitas;
    }

    public void setNokitas(String nokitas) {
        this.nokitas = nokitas;
    }

    public String getAyah() {
        return ayah;
    }

    public void setAyah(String ayah) {
        this.ayah = ayah;
    }

    public String getIbu() {
        return ibu;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
    }
    
    
}

