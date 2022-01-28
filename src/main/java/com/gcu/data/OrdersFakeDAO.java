package com.gcu.data;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.gcu.model.OrderModel;

//Building the CRUD method
@Repository
public class OrdersFakeDAO implements OrdersDAOInterface {

	private List<OrderModel> orders = new ArrayList<OrderModel>();

	public OrdersFakeDAO() {
		// create a new list of orders, once the list is made we hard code
		orders = new ArrayList<OrderModel>();
		//Id, order number, name, price, quantity
		orders.add(new OrderModel(0L, "001", "Dog Head Statue", 200.0f, 67));
		orders.add(new OrderModel(1L, "002", "Dracula Coffin", 200.0f, 2));
		orders.add(new OrderModel(2L, "003", "Mummy", 200.0f, 3));
		orders.add(new OrderModel(3L, "004", "Cups", 200.0f, 4));
	}

	@Override
	public List<OrderModel> getOrders() {
		return orders;
	}

	@Override
	public List<OrderModel> searchOrders(String searchTerm) {

		// put the items searched in a list then show it
		List<OrderModel> foundItems = new ArrayList<OrderModel>();

		for (int i = 0; i < orders.size(); i++) {
			foundItems.add(orders.get(i));
		}
		// do a system print
		System.out.println("I searched for" + searchTerm + "and found" + foundItems.size() + "items");
		// show the items found

		return foundItems;
	}

	@Override
	public int addOne(OrderModel newOrder) {

		boolean success = orders.add(newOrder);

		System.out.println("added a new item in " + orders.size() + " added in the list");
		if (success) {
			return 1;
		}
		return 0;
	}
 
	@Override
	public boolean deleteOne(long id) {
		
		orders.removeIf(order -> order.getId() == id);

		System.out.println(" we deleted the item now we have " + orders.size());

		return true;
	}

	@Override
	public OrderModel update(long IdToUpdate, OrderModel updateOrder) {
		orders.stream().forEach(orders -> {
			if (orders.getId() == IdToUpdate) {
				orders.setOrderNo(updateOrder.getOrderNo());
				orders.setPrice(updateOrder.getPrice());
				orders.setProductName(updateOrder.getProductName());
				orders.setQuantity(updateOrder.getQuantity());
				System.out.println("updating order" + updateOrder);
			}
			System.out.println("tried updating the order number" + IdToUpdate + "we updated to" + updateOrder.toString());
		});

		System.out.println("tried updating the order number" + IdToUpdate + "we found nothing");

		return null;
	}

	@Override
	public OrderModel getById(int Id) {
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getId() == Id) {
				return orders.get(i);
			}
		}
		return null;
	}	

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
