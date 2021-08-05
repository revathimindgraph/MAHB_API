package com.mahb.viewModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "single_token1")
public class SingleToken {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name = "id", nullable = false)
	    private String id;

	    @Column(name = "action", nullable = false)
	    private String action;

	   
	    @Column(name="json_result")
	    private String jsonResult;


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getAction() {
			return action;
		}


		public void setAction(String action) {
			this.action = action;
		}


		public String getJsonResult() {
			return jsonResult;
		}


		public void setJsonResult(String jsonResult) {
			this.jsonResult = jsonResult;
		}


}
