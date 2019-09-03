package com.manicibi.vehicle.VehicleSimulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VehicleSimulationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleSimulationApplication.class, args);
	}

	@RequestMapping(value="/firstapp")
	public String firstApp() {
		return "My Google service is working fine in GCP environment";
	}
}
