package com.mt.rrs.domin.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

/**
 * @author m1015830
 */
@Entity
@Table(name = "table_reservation")
@Getter
@Setter
public class TableReservation implements Serializable {

	private static final long serialVersionUID = 5556541763702982435L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "hotel_table_map_id")
	private Long hotelTableMapId;

	@Column(name = "created_by")
	private Long createdBy;

	@ManyToOne(optional = false)
	@JoinColumn(name = "order_details_id", referencedColumnName = "id")
	private OrderDetails orderDetails;

	@Column(name = "booking_time_from", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date bookingTimeFrom;

	@Column(name = "booking_time_to", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date bookingTimeTo;
	
	@Column(name = "created", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@Column(name = "updated", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;

}
