/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.Subespaco.DAO;

import java.util.List;

import javax.sql.DataSource;

import com.sharedroom.model.SubespacoVO.SubespacoVO;

public interface SubespacoDAO {
	
	public void setDatasource(DataSource ds);
	
	public List<SubespacoVO> getSubespacos();
	
	public SubespacoVO getSubespaco(Integer id);
	
	public boolean createSubespaco(SubespacoVO subespaco);
	
	public boolean deleteSubespaco(SubespacoVO subespaco);
	
	public boolean updateSubespaco(SubespacoVO subespaco);
}

