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
@Table(name = "users")
@Getter
@Setter
public class MenuReservation implements Serializable {

	private static final long serialVersionUID = 5556541763702982435L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "menu_id")
	private Long menuId;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "total")
	private Double total;
	
	@Column(name = "status")
	private int status;

	@Column(name = "created_by")
	private Long createdBy;

	@ManyToOne(optional = true)
	@JoinColumn(name = "order_details_id", referencedColumnName = "id")
	private OrderDetails orderDetails;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "table_reservation_id", referencedColumnName = "id")
	private TableReservation tableReservation;

	@Column(name = "created", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@Column(name = "updated", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;
    
}
