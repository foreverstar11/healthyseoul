package test3;

public class Sports_ProgramVO {
	private String program_Name,target,term,week,class_time,fee,class_name;
	public Sports_ProgramVO() {
		super();
	}
	public Sports_ProgramVO(String program_Name, String target, String term, String week, String class_time, String fee,
			String class_name) {
		super();
		this.program_Name = program_Name;
		this.target = target;
		this.term = term;
		this.week = week;
		this.class_time = class_time;
		this.fee = fee;
		this.class_name = class_name;
	}
	public String getProgram_Name() {
		return program_Name;
	}
	public void setProgram_Name(String program_Name) {
		this.program_Name = program_Name;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getClass_time() {
		return class_time;
	}
	public void setClass_time(String class_time) {
		this.class_time = class_time;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	@Override
	public String toString() {
		return "Sports_ProgramVO [program_Name=" + program_Name + ", target=" + target + ", term=" + term + ", week="
				+ week + ", class_time=" + class_time + ", fee=" + fee + ", class_name=" + class_name + "]";
	}
	
}
