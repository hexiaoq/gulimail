package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hxq
 * @email 156437734
 * @date 2020-11-26 13:15:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
