package com.manicibi.vehicle.VehicleSimulation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manicibi.vehicle.model.CustomerInfo;
import com.manicibi.vehicle.service.ICustomerInfoService;

@SpringBootApplication
@RestController
@ComponentScan({"com.manicibi.vehicle"})
@EntityScan("com.manicibi.vehicle.model")
public class VehicleSimulationApplication {
	
	@Autowired
	private ICustomerInfoService customerInfoService;

	public static void main(String[] args) {
		SpringApplication.run(VehicleSimulationApplication.class, args);
	}

	@RequestMapping(value="/firstapp")
	public String firstApp() {
		return "My Google service is working fine in GCP environment";
	}
	
	@RequestMapping("/customers")
    public List<CustomerInfo> findCustomers() {
        
        return customerInfoService.findAll();
    }

    @RequestMapping("/customers/{userId}")
    public CustomerInfo findCustomerById(@PathVariable Integer userId) {
        
        return customerInfoService.findById(userId);
    }
}
