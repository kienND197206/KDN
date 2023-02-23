/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.ChucVuView;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IChucVuService {

    List<ChucVuView> getall();

    boolean insert(ChucVuView cv);

    boolean update(ChucVuView cv);

    boolean delete(ChucVuView cv);
}
