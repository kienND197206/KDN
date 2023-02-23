/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.NhanVienDM;
import Repository.impl.NhanVienRepository;
import Services.INhanVienService;
import ViewModels.NhanVienView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienService implements INhanVienService{
    NhanVienRepository rs = new NhanVienRepository();
    List<NhanVienView> list = new ArrayList<>();
    @Override
    public List<NhanVienView> getAll() {
        List<NhanVienDM> listDM = rs.getAll();
        for (NhanVienDM nv : listDM) {
            list.add(new NhanVienView(nv.getId(), nv.getMaNv(), nv.getTenNv(), nv.getTenDem(), nv.getHo(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getDiachi(), nv.getSdt(), nv.getMatkhau(), nv.getIdcuahang(), nv.getIdchucvu(), nv.getIdguibc(),nv.getTrangthai()));
            
        }
        return list;
    }

    @Override
    public boolean add(NhanVienView nv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(NhanVienView nv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(NhanVienView nv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
