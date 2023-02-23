/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.impl;

import DomainModels.ChucVuDM;
import Repository.impl.ChucVuRepository;
import ViewModels.ChucVuView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ChucVuService implements Services.IChucVuService {

    ChucVuRepository rs = new ChucVuRepository();
    List<ChucVuView> list = new ArrayList<>();

    @Override
    public List<ChucVuView> getall() {
        List<ChucVuDM> listDM = rs.getAll();
        for (ChucVuDM cv : listDM) {
            list.add(new ChucVuView(cv.getId(), cv.getMa(), cv.getTen()));
        }
        return list;
    }

    @Override
    public boolean insert(ChucVuView cv) {
        boolean add = rs.add(new ChucVuDM(cv.getId(), cv.getMa(), cv.getTen()));
        if (add == true) {
            System.out.println("Them thanh cong");
        }else{
                    System.out.println("Them that bai");
                    }
        return add;
        }
    

    @Override
    public boolean update(ChucVuView cv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(ChucVuView cv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean them(ChucVuDM chucVuDM) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
