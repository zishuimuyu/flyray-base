package me.flyray.pay.dao;

import java.util.List;
import java.util.Map;

import me.flyray.pay.model.RefundOrder;

/** 
* @author: bolei
* @date：2017年4月8日 下午10:42:49 
* @description：退款订单
*/

public interface RefundOrderDao {

	List<RefundOrder> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(RefundOrder refundOrder);
	
	void update(RefundOrder refundOrder);
	
}