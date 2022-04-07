package com.example.restaurantreview.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PostReviewResponse{

	@SerializedName("customerReviews")
	private List<CustomerReviewsItem> customerReviews;

	@SerializedName("error")
	private boolean error;

	@SerializedName("message")
	private String message;

	public void setCustomerReviews(List<CustomerReviewsItem> customerReviews){
		this.customerReviews = customerReviews;
	}

	public List<CustomerReviewsItem> getCustomerReviews(){
		return customerReviews;
	}

	public void setError(boolean error){
		this.error = error;
	}

	public boolean isError(){
		return error;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}
}