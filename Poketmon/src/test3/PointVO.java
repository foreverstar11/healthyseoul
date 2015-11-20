package test3;

public class PointVO {
	int serial,good,bookmark;
	private String point_Name, point_Contents;
	private double latitude,longitude;
	
	public PointVO() {
		super();
	}

	public PointVO(int serial, int good, int bookmark, String point_Name, String point_Contents, double latitude,
			double longitude) {
		super();
		this.serial = serial;
		this.good = good;
		this.bookmark = bookmark;
		this.point_Name = point_Name;
		this.point_Contents = point_Contents;
		this.latitude = latitude;
		this.longitude = longitude;
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

	public String getPoint_Name() {
		return point_Name;
	}

	public void setPoint_Name(String point_Name) {
		this.point_Name = point_Name;
	}

	public String getPoint_Contents() {
		return point_Contents;
	}

	public void setPoint_Contents(String point_Contents) {
		this.point_Contents = point_Contents;
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

	@Override
	public String toString() {
		return "PointVO [serial=" + serial + ", good=" + good + ", bookmark=" + bookmark + ", point_Name=" + point_Name
				+ ", point_Contents=" + point_Contents + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

}
