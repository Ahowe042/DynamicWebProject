package csc363;

import java.io.Serializable;

public class usedcar implements Serializable {

	private int ID;
	private String ImgPath;
	private String MakeModelName;
	private int Price;
	private int TotalMileage;
	private String IntColor;
	private String ExtColor;
	private String MPG;
	
	public int getID () {
		return ID;
	}
	
	public void setID (int pID) {
		ID = pID;
	}
	
	public String getImgPath () {
		return ImgPath;
	}
	
	public void setImgPath(String imgPath) {
		ImgPath = imgPath;
	}
	
	public String getMakeModelName() {
		return MakeModelName;
	}
	
	public void setMakeModelName(String makeModelName) {
		MakeModelName = makeModelName;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public void setPrice (int price) {
		Price = price;
	}
	
	public double getTotalMileage() {
		return TotalMileage;
	}
	
	public void setTotalMileage (int totalMileage) {
		TotalMileage = totalMileage;
	}
	
	public String getIntColor() {
		return IntColor;
	}
	
	public void setIntColor(String intColor) {
		IntColor = intColor;
	}
	
	public String getExtColor() {
		return ExtColor;
	}
	
	public void setExtColor(String extColor) {
		ExtColor = extColor;
	}
	
	public String getMPG() {
		return MPG;
	}
	
	public void setMPG (String mpg) {
		MPG = mpg;
	}
}
