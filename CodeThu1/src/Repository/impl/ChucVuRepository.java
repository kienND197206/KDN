/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.impl;

import DomainModels.ChucVuDM;
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
public class ChucVuRepository  implements Repository.IChucVuRepository{

    @Override
    public List<ChucVuDM> getAll() {
          ArrayList<ChucVuDM> cv= new ArrayList<>();
        try {
           Connection cnn= DBContext.getConnection();
           String sql="select * from ChucVu";
           PreparedStatement ps= cnn.prepareCall(sql);
           ps.execute();
           ResultSet rs =ps.getResultSet();
           while(rs.next()){
               String id=rs.getString("Id");
               String ma=rs.getString("Ma");
               String ten=rs.getString("Ten");
               ChucVuDM chucvu= new ChucVuDM(id, ma, ten);
               cv.add(chucvu);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cv;
    }

    @Override
    public boolean add(ChucVuDM cv) {
              try {
            Connection cnn= DBContext.getConnection();
            String sql="insert into ChucVu(Ma,Ten) values(?,?)";
            PreparedStatement ps= cnn.prepareCall(sql);
            ps.setString(1, cv.getMa());
            ps.setString(2,cv.getTen());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(ChucVuDM cv, String ma) {
           try {
            Connection cnn=DBContext.getConnection();
            String sql="update ChucVu set Ma=?,Ten=? where Ma=?";
            PreparedStatement ps= cnn.prepareCall(sql);
            ps.setString(1,cv.getMa());
            ps.setString(2,cv.getTen());
            ps.setString(3,cv.getMa());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public boolean delete(ChucVuDM cv) {

           try {
            Connection cnn=DBContext.getConnection();
            String sql="delete from ChucVu where Ma=?";
            PreparedStatement ps =cnn.prepareCall(sql);
            ps.setString(1,cv.getMa());
            ps.execute();
            return true;
        } catch (Exception e) {
        e.printStackTrace();
        }
        return false;
    }




    
}
