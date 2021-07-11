package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.HotelDetails;
import com.example.demo.entities.ReservationDetails;

@RestController
public class HotelController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		
		return "hi";
	}
	
	@RequestMapping("/hotelsList")
	public List<HotelDetails> getHotelsList() {
		return getListofHotels();
	}
	
	@RequestMapping(value= "/reservation",method=RequestMethod.POST,consumes="application/json")
	public String reserveHotel(@RequestBody ReservationDetails reservationDetails) {
		return "Booking Confirmation Number is 11111 for the hotel:" +reservationDetails.getHotel_name();
	}
	
	
	
	
	public List<HotelDetails> getListofHotels(){
		List<HotelDetails> hotelsList = new ArrayList<HotelDetails>();
		List<String> hotelNames = Arrays.asList("Seasons Inn", "Comfort Inn", "Marriott", "Crown Plaza", "Holiday Inn");
		Random random = new Random();
		for(int i=0;i<hotelNames.size();i++) {
			HotelDetails hoteldetails = new HotelDetails();
			hoteldetails.setHotel_name(hotelNames.get(i));
			hoteldetails.setAvailability(true);
			
			int randomPrice = random.nextInt(300 - 50 + 1)	+ 50;
			hoteldetails.setPrice(randomPrice);
			hotelsList.add(hoteldetails);
			hoteldetails = null;
		}
		
		return hotelsList;
	}
}
