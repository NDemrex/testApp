package com.gcu.testApp;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.model.OrderModel;

// changed this from 
// @Controller
// @RequestMapping("/orders") 

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {

	// import the interface
	@Autowired
	private OrdersBusinessServiceInterface ordersService;

	@GetMapping("/")
	public List<OrderModel>showAllOrders(){
		return ordersService.getOrders();
	}
	
	@GetMapping("/{id}")
	public OrderModel getById(@PathVariable(name="id") int id) {
		return ordersService.getById(id);
	}
	
	@GetMapping("/search/{searchTerm}")
	public List<OrderModel> searchOrders(@PathVariable(name="searchTerm")String searchTerm){
		return ordersService.searchOrders(searchTerm);
	}
	
	
	@PostMapping("/")
	public OrderModel addOne(@RequestBody OrderModel newOrder) {
		ordersService.addOne(newOrder);
		return newOrder;
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteOne(@PathVariable(value="id") int id) {
		return ordersService.deleteOne(id);
	}
	
	@PutMapping("/")
	public OrderModel update(@RequestBody OrderModel updateOrder) {
		return ordersService.update(updateOrder.getId(), updateOrder);
	}
}
