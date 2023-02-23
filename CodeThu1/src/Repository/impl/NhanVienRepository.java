/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.NhanVienDM;
import Repository.INhanVienRepository;
import Utilities.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienRepository implements INhanVienRepository {

    @Override
    public List<NhanVienDM> getAll() {
        ArrayList<NhanVienDM> list = new ArrayList<>();
        try {
            Connection cnn = DBContext.getConnection();
            String sql = "select* from NhanVien";
            PreparedStatement ps = cnn.prepareCall(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String dem = rs.getString("TenDem");
                String ho = rs.getString("Ho");
                String gt = rs.getString("GioiTinh");
                String ns = rs.getString("NgaySinh");
                String DiaChi = rs.getString("DiaChi");
                String sdt = rs.getString("Sdt");
                String Mk = rs.getString("MatKhau");
                String ch = rs.getString("IdCH");
                String cv = rs.getString("IdCV");
                String bc = rs.getString("IdGuiBC");
                int tt = rs.getInt("TrangThai");
                NhanVienDM nv = new NhanVienDM(id, ma, ten, dem, ho, DiaChi, DiaChi, DiaChi, sdt, Mk, ch, cv, bc, tt);
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean add(NhanVienDM nv) {
        try {
            Connection cnn = DBContext.getConnection();
            String sql = "insert into NhanVien(Ma,Ten,TenDem,Ho,GioiTinh,NgaySinh,DiaChi,Sdt,MatKhau,TrangThai) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cnn.prepareCall(sql);
            ps.setString(1, nv.getMaNv());
            ps.setString(2, nv.getTenNv());
            ps.setString(3, nv.getTenDem());
            ps.setString(4, nv.getHo());
            ps.setString(5, nv.getGioiTinh());
            ps.setString(6, nv.getNgaySinh());
            ps.setString(7, nv.getDiachi());
            ps.setString(8, nv.getSdt());
            ps.setString(9, nv.getMatkhau());
            ps.setInt(10, nv.getTrangthai());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(NhanVienDM nv) {
        try {
            Connection cnn = DBContext.getConnection();
            String sql = "update NhanVien set Ten=?,TenDem=?,Ho=?,GioiTinh=?,NgaySinh=?,DiaChi=?,Sdt=?,MatKhau=?,TrangThai=? where Ma=?";
            PreparedStatement ps = cnn.prepareCall(sql);
            ps.setString(1, nv.getTenNv());
            ps.setString(2, nv.getTenDem());
            ps.setString(3, nv.getHo());
            ps.setString(4, nv.getGioiTinh());
            ps.setString(5, nv.getNgaySinh());
            ps.setString(6, nv.getDiachi());
            ps.setString(7, nv.getSdt());
            ps.setString(8, nv.getMatkhau());
            ps.setInt(9, nv.getTrangthai());
            ps.setString(10, nv.getMaNv());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(NhanVienDM nv) {
        try {
            Connection cnn = DBContext.getConnection();
            String sql = "delete from NhanVien where Ma=?";
            PreparedStatement ps = cnn.prepareCall(sql);
            ps.setString(1, nv.getMaNv());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
