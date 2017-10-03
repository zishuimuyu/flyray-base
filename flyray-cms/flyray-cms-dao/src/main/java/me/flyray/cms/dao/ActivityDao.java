package me.flyray.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import me.flyray.cms.model.Activity;
import me.flyray.common.dao.BaseDao;

/** 
* @author: bolei
* @date：2017年3月7日 下午8:42:10 
* @description：类说明 
*/

public interface ActivityDao extends BaseDao<Activity>{

	public void insert(Activity activity);
	public List<Activity> selectByBizKeys(Activity activity);
	public List<Activity> selectRecommendActivity(@Param("orgId")Long orgId, @Param("merchantId")Long merchantId);
}
