/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.CuaHangView;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ICuaHangService {
    List<CuaHangView> getAll();
    boolean add(CuaHangView ch);
    boolean update (CuaHangView ch);
    boolean detele(CuaHangView ch);
}
