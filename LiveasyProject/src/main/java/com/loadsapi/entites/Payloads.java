package com.loadsapi.entites;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Payloads {

	
	public String loadingPoint;
	
	public String UnloadingPoint;
	
	public String ProductTypr;
	
	public String TruckType;
	
	public int NoOfTruck;
	
	public int Weight;
	
	public String Comment;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int ShipperId ;
	
	@JsonFormat(pattern = "yyyy-MM-dd",shape = Shape.STRING)
	public String date;

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return UnloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		UnloadingPoint = unloadingPoint;
	}

	public String getProductTypr() {
		return ProductTypr;
	}

	public void setProductTypr(String productTypr) {
		ProductTypr = productTypr;
	}

	public String getTruckType() {
		return TruckType;
	}

	public void setTruckType(String truckType) {
		TruckType = truckType;
	}

	public int getNoOfTruck() {
		return NoOfTruck;
	}

	public void setNoOfTruck(int noOfTruck) {
		NoOfTruck = noOfTruck;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public int getShipperId() {
		return ShipperId;
	}

	public void setShipperId(int shipperId) {
		ShipperId = shipperId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Payloads [loadingPoint=" + loadingPoint + ", UnloadingPoint=" + UnloadingPoint + ", ProductTypr="
				+ ProductTypr + ", TruckType=" + TruckType + ", NoOfTruck=" + NoOfTruck + ", Weight=" + Weight
				+ ", Comment=" + Comment + ", ShipperId=" + ShipperId + ", date=" + date + "]";
	}

	public Payloads(String loadingPoint, String unloadingPoint, String productTypr, String truckType, int noOfTruck,
			int weight, String comment, int shipperId, String date) {
		super();
		this.loadingPoint = loadingPoint;
		UnloadingPoint = unloadingPoint;
		ProductTypr = productTypr;
		TruckType = truckType;
		NoOfTruck = noOfTruck;
		Weight = weight;
		Comment = comment;
		ShipperId = shipperId;
		this.date = date;
	}

	public Payloads() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
