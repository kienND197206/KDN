/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.CuaHangDM;
import Repository.ICuaHangRepository;
import Utilities.DBContext;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class CuaHangRepository implements ICuaHangRepository {

    @Override
    public List<CuaHangDM> getAll() {
        ArrayList<CuaHangDM> list = new ArrayList<>();
        try {
            Connection cnn = DBContext.getConnection();
            String sql = "select* from CuaHang";
            PreparedStatement ps = cnn.prepareCall(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String dc = rs.getString("DiaChi");
                String tp = rs.getString("ThanhPho");
                String qg = rs.getString("QuocGia");
                CuaHangDM ch = new CuaHangDM(id, ma, ten, dc, tp, qg);
                list.add(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean add(CuaHangDM ch) {
        try {
            Connection cnn = DBContext.getConnection();
            String sql = "insert into CuaHang(Ma,Ten,DiaChi,ThanhPho,QuocGia) values(?,?,?,?,?)";
            PreparedStatement ps = cnn.prepareCall(sql);
            ps.setString(1, ch.getMa());
            ps.setString(2, ch.getTen());
            ps.setString(3, ch.getDiaChi());
            ps.setString(4, ch.getThanhPho());
            ps.setString(5, ch.getQuocGia());

            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(CuaHangDM ch, String ma) {
        try {
            Connection cnn = DBContext.getConnection();
            String sql = "update CuaHang set Ma=?, Ten=?,DiaChi=?,ThanhPho=? where Ma=?";
            PreparedStatement ps = cnn.prepareCall(sql);
            ps.setString(1, ch.getMa());
            ps.setString(2, ch.getTen());
            ps.setString(3, ch.getDiaChi());
            ps.setString(4, ch.getThanhPho());
            ps.setString(5, ch.getMa());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(String ma) {
        try {
            Connection cnn = DBContext.getConnection();
            String sql = " delete from CuaHang where Ma =?";
            PreparedStatement ps = cnn.prepareCall(sql);
            ps.setString(1, ma);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}


