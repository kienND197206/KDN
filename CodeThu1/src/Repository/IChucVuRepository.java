/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModels.ChucVuDM;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IChucVuRepository {

    List<ChucVuDM> getAll();

    boolean add(ChucVuDM cv);

    boolean update(ChucVuDM cv, String ma);

    boolean delete(ChucVuDM cv);

}
