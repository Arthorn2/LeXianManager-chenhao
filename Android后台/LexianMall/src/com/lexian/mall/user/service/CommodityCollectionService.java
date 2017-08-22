/**
*  Copyright 2017  Chinasofti , Inc. All rights reserved.
*/
package com.lexian.mall.user.service;

import com.lexian.mall.user.bean.CommodityCollection;
import com.lexian.web.ResultHelper;
/**
 * <p>Title: 乐鲜生活</p>
 * <p>Description: 乐鲜生活购物系统</p>
 * <p>Copyright: Copyright (c) 200x</p>
 * <p>Company: 中软国际</p>
 * @author 郝伟
 * @version 1.0
 */
public interface CommodityCollectionService {

	ResultHelper getCommodityCollection(Integer pageNo, String userId);

	ResultHelper addCommodityCollection(CommodityCollection cc);

	ResultHelper deleteCommodityCollection(CommodityCollection cc);

	ResultHelper hasCommodityInCommodityCollection(CommodityCollection cc);
	
}
