/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author Admin
 */
public class NhanVienDM {

    private String id;
    private String maNv;
    private String tenNv;
    private String tenDem;
    private String ho;
    private String gioiTinh;
    private String ngaySinh;
    private String diachi;
    private String sdt;
    private String matkhau;
    private String idcuahang;
    private String idchucvu;
    private String idguibc;
    private int trangthai;

    public NhanVienDM() {
    }

    public NhanVienDM(String id, String maNv, String tenNv, String tenDem, String ho, String gioiTinh, String ngaySinh, String diachi, String sdt, String matkhau, String idcuahang, String idchucvu, String idguibc, int trangthai) {
        this.id = id;
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.tenDem = tenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.matkhau = matkhau;
        this.idcuahang = idcuahang;
        this.idchucvu = idchucvu;
        this.idguibc = idguibc;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getIdcuahang() {
        return idcuahang;
    }

    public void setIdcuahang(String idcuahang) {
        this.idcuahang = idcuahang;
    }

    public String getIdchucvu() {
        return idchucvu;
    }

    public void setIdchucvu(String idchucvu) {
        this.idchucvu = idchucvu;
    }

    public String getIdguibc() {
        return idguibc;
    }

    public void setIdguibc(String idguibc) {
        this.idguibc = idguibc;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
}
