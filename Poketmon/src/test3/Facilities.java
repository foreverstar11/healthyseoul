package test3;

public class Facilities {
	int serial,good,bookmark;
	private String name, phone,homepage,region;
	private double latitude, longitude;
	int type;
	public Facilities() {
		super();
	}
	public Facilities(int serial, int good, int bookmark, String name, String phone, String homepage, String region,
			double latitude, double longitude, int type) {
		super();
		this.serial = serial;
		this.good = good;
		this.bookmark = bookmark;
		this.name = name;
		this.phone = phone;
		this.homepage = homepage;
		this.region = region;
		this.latitude = latitude;
		this.longitude = longitude;
		this.type = type;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getBookmark() {
		return bookmark;
	}
	public void setBookmark(int bookmark) {
		this.bookmark = bookmark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Facilities [serial=" + serial + ", good=" + good + ", bookmark=" + bookmark + ", name=" + name
				+ ", phone=" + phone + ", homepage=" + homepage + ", region=" + region + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", type=" + type + "]";
	}
	
	

}
