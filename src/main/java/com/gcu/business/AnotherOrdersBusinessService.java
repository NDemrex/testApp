package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrdersDAOInterface;
import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface {

	private List<OrderModel> orders;
	@Autowired
	OrdersDAOInterface ordersDAO;
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("THIS IS ANOTHER BUSINESS SERVICE");

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("init method from AnotherBusinessService");
		orders = new ArrayList<OrderModel>();
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	System.out.println("Calling the destroy method");	
	}
	
	@Override
	public List<OrderModel> getOrders() {
		return ordersDAO.getOrders();
		/*
		 * // hard code some orders orders.add(new OrderModel(0L, "001", "SKY DIVING",
		 * 300.0f, 1)); orders.add(new OrderModel(0L, "001", "Fake Werewolf Head",
		 * 200.0f, 2)); orders.add(new OrderModel(0L, "001", "Dracula Coffin", 200.0f,
		 * 6)); orders.add(new OrderModel(0L, "001", "Mummy", 200.0f, 7));
		 * orders.add(new OrderModel(0L, "001", "Cups", 200.0f, 8)); orders.add(new
		 * OrderModel(0L, "001", "Stack of coins", 200.0f, 66));
		 */
	}

	@Override
	public OrderModel getById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderModel> searchOrders(String searchTerm) {
		return ordersDAO.searchOrders(searchTerm);
	}

	@Override
	public int addOne(OrderModel newOrder) {
		// TODO Auto-generated method stub
		return ordersDAO.addOne(newOrder);
	}

	@Override
	public boolean deleteOne(long id) {
		// TODO Auto-generated method stub
		return ordersDAO.deleteOne(id);
	}

	@Override
	public OrderModel update(long IdToUpdate, OrderModel updateOrder) {
		// TODO Auto-generated method stub
		return ordersDAO.update(IdToUpdate, updateOrder);
	}
}
