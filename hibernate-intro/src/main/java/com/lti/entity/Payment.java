package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PAYMENT")

public class Payment {
@Id
@Column(name="pay_id")

		private int id;
		private int amount;
		private String pmt_mode;
		private String pmt_status;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public String getPmt_mode() {
			return pmt_mode;
		}
		public void setPmt_mode(String pmt_mode) {
			this.pmt_mode = pmt_mode;
		}
		public String getPmt_status() {
			return pmt_status;
		}
		public void setPmt_status(String pmt_status) {
			this.pmt_status = pmt_status;
		}
		
				
}
