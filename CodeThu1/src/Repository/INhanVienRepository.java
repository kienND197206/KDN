/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.NhanVienDM;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface INhanVienRepository {
    List<NhanVienDM> getAll();
    boolean add(NhanVienDM nv);
    boolean update(NhanVienDM nv);
    boolean delete(NhanVienDM nv);
}
