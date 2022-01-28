package com.gcu.data;

import java.util.List;

import com.gcu.model.OrderModel;

public interface OrdersDAOInterface {

	
	public OrderModel getById(int Id);
	
	public List<OrderModel> getOrders();
	
	public List<OrderModel> searchOrders(String searchTerm);
	
	public int addOne (OrderModel newOrder);
	
	public boolean deleteOne(long id);
	
	public OrderModel update(long IdToUpdate, OrderModel updateOrder);
	
	public void init();
	
	public void destroy();
}
