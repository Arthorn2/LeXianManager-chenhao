/**
*  Copyright 2017  Chinasofti , Inc. All rights reserved.
*/
package com.lexian.mall.user.dao;

import java.util.List;
import java.util.Map;

import com.lexian.mall.user.bean.CommodityCollection;
/**
 * <p>Title: 乐鲜生活</p>
 * <p>Description: 乐鲜生活购物系统</p>
 * <p>Copyright: Copyright (c) 200x</p>
 * <p>Company: 中软国际</p>
 * @author 郝伟
 * @version 1.0
 */
public interface CommodityCollectionDao {
	
	List<CommodityCollection> getCommodityCollectionPage(Map<String,Object> params);

	void addCommodityCollection(CommodityCollection cc);

	void deleteCommodityCollection(CommodityCollection cc);

	Integer hasCommodityInCommodityCollection(CommodityCollection cc);

}
