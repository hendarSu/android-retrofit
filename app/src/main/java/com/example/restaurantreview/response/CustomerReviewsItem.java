package com.example.restaurantreview.response;

import com.google.gson.annotations.SerializedName;

public class CustomerReviewsItem{

	@SerializedName("date")
	private String date;

	@SerializedName("review")
	private String review;

	@SerializedName("name")
	private String name;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setReview(String review){
		this.review = review;
	}

	public String getReview(){
		return review;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}