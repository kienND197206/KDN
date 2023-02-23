/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.CuaHangDM;
import Repository.impl.CuaHangRepository;
import ViewModels.CuaHangView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CuaHangService implements Services.ICuaHangService{
    CuaHangRepository rs = new CuaHangRepository();
    List<CuaHangView> list = new ArrayList<>();
    @Override
    public List<CuaHangView> getAll() {
        List<CuaHangDM> listDM = rs.getAll();
        for (CuaHangDM ch : listDM) {
            list.add( new CuaHangView(ch.getId(), ch.getTen(),ch.getMa(), ch.getDiaChi(),ch.getThanhPho(),ch.getQuocGia()));
            
        }
        return list;
    }

    @Override
    public boolean add(CuaHangView ch) {
        boolean add = rs.add(new CuaHangDM(ch.getId(), ch.getMa(), ch.getTen(), ch.getDiaChi(),ch.getThanhPho() , ch.getQuocGia()));
        if(add == true){
            System.out.println("Them thanh cong");
        }else{
            System.out.println("Them that bai");
        }
        return add;
    }
    
    

    @Override
    public boolean update(CuaHangView ch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean detele(CuaHangView ch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
