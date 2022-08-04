package com.example.StoredProcedurePractice.modal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {

	private String CustGuId;
	//private String crew;

	@JsonCreator
	public Request( @JsonProperty("CustGuId, crew") String CustGuId) {
		super();
		this.CustGuId = CustGuId;
		//this.crew=crew;
	}
//	@JsonCreator
//	public Request( @JsonProperty("crew") String crew) {
//		super();
//		this.crew = crew;
//	}



@Override
	public String toString() {
		return "Request [CustGuId=" + CustGuId + "]";
	}

//public String getCrew() {
//	return crew;
//}


//public void setCrew(String crew) {
//	this.crew = crew;
//}


public String getId() {
	return CustGuId;
}

public void setId(String CustGuId) {
	this.CustGuId = CustGuId;
}
}
