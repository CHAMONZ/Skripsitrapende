package riansyah.unikom.skripsitrapende.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Keluarga {
    
    @Id
    @Column(length=14, nullable=false, unique=true)
    private String noReg;
    
    @Column(length=16, nullable=false)
    private String noInduk;
    
    @Column(length=50, nullable=false)
    private String kepalaKeluarga;
    
    @Column(length=50, nullable=false)
    private String alamat;
    
    @Column(length=3, nullable=false)
    private String rt;
    
    @Column(length=3, nullable=false)
    private String rw;
    
    @Column(length=25, nullable=false)
    private String kelurahan;
    
    @Column(length=25, nullable=false)
    private String kecamatan;
    
    @Column(length=25, nullable=false)
    private String kota;
    
    @Column(length=5, nullable=false)
    private String kodePos;
    
    @Column(length=25, nullable=false)
    private String provinsi;

    public String getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    public String getNoReg() {
        return noReg;
    }

    public void setNoReg(String noReg) {
        this.noReg = noReg;
    }

    public String getKepalaKeluarga() {
        return kepalaKeluarga;
    }

    public void setKepalaKeluarga(String kepalaKeluarga) {
        this.kepalaKeluarga = kepalaKeluarga;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRw() {
        return rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
    
    
}
