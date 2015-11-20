package test3;

public class RoadVO {
	private String course_name,course_type,distance,necessary_period,course_Detail;
	private String transportation;
	public RoadVO() {
		super();
	}
	public RoadVO(String course_name, String course_type, String distance, String necessary_period,
			String course_Detail, String transportation) {
		super();
		this.course_name = course_name;
		this.course_type = course_type;
		this.distance = distance;
		this.necessary_period = necessary_period;
		this.course_Detail = course_Detail;
		this.transportation = transportation;
	}
	
	public String getCourse_Name() {
		return course_name;
	}
	public void setCourse_Name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_Type() {
		return course_type;
	}
	public void setCourse_Type(String course_type) {
		this.course_type = course_type;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getNecessary_period() {
		return necessary_period;
	}
	public void setNecessary_period(String necessary_period) {
		this.necessary_period = necessary_period;
	}
	public String getCourse_Detail() {
		return course_Detail;
	}
	public void setCourse_Detail(String course_Detail) {
		this.course_Detail = course_Detail;
	}
	public String getTransportation() {
		return transportation;
	}
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	@Override
	public String toString() {
		return "RoadVO [course_name=" + course_name + ", course_type=" + course_type + ", distance=" + distance
				+ ", necessary_period=" + necessary_period + ", course_Detail=" + course_Detail + ", transportation="
				+ transportation + "]";
	}
	
}
