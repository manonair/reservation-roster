package com.mt.rrs.domin.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

/**
 * @author m1015830
 */
@Entity
@Table(name = "order_details")
@Getter
@Setter
public class OrderDetails implements Serializable {

	private static final long serialVersionUID = 5556541763702982435L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "order_uuid")
	private String orderUUID;
	
	@Column(name = "hotel_id")
	private Long hotelId;

	@Column(name = "customer_id")
	private Long customerId;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "tax")
	private Double tax;
	
	@Column(name = "amount_payable")
	private Double amountPayable;
	
	@Column(name = "order_start_time", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderStartTime;

	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "address")
	private String address;

	@Column(name = "status")
	private int status;
	
	@Column(name = "created", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@Column(name = "updated", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;

}
