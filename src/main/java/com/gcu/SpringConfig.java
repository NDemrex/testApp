package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

//import com.gcu.business.AnotherOrdersBusinessService;
import com.gcu.business.OrdersBusinessService;
import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.SecurityServiceInterface;
import com.gcu.business.ValidLogins;

@Configuration
public class SpringConfig {

	/*
	 * This is injecting the orders Business service
	 * You can change this to inject ANOTHER service as well
	 */
	@Bean(name = "ordersBusinessService", initMethod = "init", destroyMethod = "destroy")
	@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		return new OrdersBusinessService();
	}
	
}