/**
*  Copyright 2017  Chinasofti , Inc. All rights reserved.
*/
package com.lexian.mall.user.service;

import com.lexian.mall.user.bean.Trolley;
import com.lexian.web.ResultHelper;
/**
 * <p>Title: 乐鲜生活</p>
 * <p>Description: 乐鲜生活购物系统</p>
 * <p>Copyright: Copyright (c) 200x</p>
 * <p>Company: 中软国际</p>
 * @author 郝伟
 * @version 1.0
 */
public interface TrolleyService {

	ResultHelper addCommodityToTrolley(Trolley trolley);
	
	ResultHelper updateTrolley(Trolley trolley);
	
	ResultHelper deleteTrolley(Integer id);

	ResultHelper getTrolleys(String userId);
	
	ResultHelper clearTrolley(String userId);

	
}
