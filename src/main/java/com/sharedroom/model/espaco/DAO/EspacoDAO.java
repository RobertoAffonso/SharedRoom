/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Espaco.DAO;

import java.util.List;

import com.sharedroom.model.Espaco.EspacoVO;

public interface EspacoDAO {
	
	public List<EspacoVO> getEspacos();
	
	public EspacoVO getEspaco(Integer id);
	
	public boolean createEspaco(EspacoVO espaco);
	
	public boolean updateEspaco(EspacoVO espaco);
	
	public boolean deleteEspaco(EspacoVO espaco);

}

