/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.NhanVienView;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INhanVienService {
    List<NhanVienView> getAll();
    boolean add(NhanVienView nv);
    boolean update(NhanVienView nv);
    boolean delete(NhanVienView nv);
}
