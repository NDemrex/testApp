package com.gcu.business;

import java.util.List;

import com.gcu.model.OrderModel;

public interface OrdersBusinessServiceInterface {
	
	public OrderModel getById(int Id);
	
	public List<OrderModel> getOrders();
	
	public List<OrderModel> searchOrders(String searchTerm);
	
	public int addOne (OrderModel newOrder);
	
	public boolean deleteOne(long id);
	
	public OrderModel update(long IdToUpdate, OrderModel updateOrder);
	
	public void init();
	
	public void destroy();
	
	public void test();
	/*
	 * public void init(); public List<OrderModel> getOrders(); public void
	 * destroy();
	 */
}
