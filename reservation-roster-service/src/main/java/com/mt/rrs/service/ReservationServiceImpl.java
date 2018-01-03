package com.mt.rrs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.management.client.HotelManagementRestClient;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private HotelManagementRestClient restClient;

	@Override
	public void getAllReservations(Long hotelId) {
		restClient.getSubscription(hotelId);
	}


}
