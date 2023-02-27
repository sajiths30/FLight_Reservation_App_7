package com.Flight_Reservation_app_7.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_Reservation_app_7.entity.Flight;
import com.Flight_Reservation_app_7.repository.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
    private FlightRepository flightRepo; 
    
	@RequestMapping("/findFlight")
	public String findFlight(@RequestParam("from")String from,@RequestParam("to")String to,
			@RequestParam("departureDate")@DateTimeFormat(pattern= "MM-dd-yyyy")Date departureDate,ModelMap modelmap) {
		List<Flight> findFlights = flightRepo.findFlight(from,to,departureDate); 
		modelmap.addAttribute("findFlights", findFlights);  
		return "displayFlight";
	}
}
