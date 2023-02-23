/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.CuaHangDM;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ICuaHangRepository {
    List<CuaHangDM> getAll();
    boolean add(CuaHangDM ch);
    boolean update(CuaHangDM ch, String ma);
    boolean delete(String ma);
    
}
