package test3;

public class BoardVO {
	private int serial;
	private String title;
	private String write_Date;
	private String contents;
	private String attached_File;
	public BoardVO() {
		super();
	}
	
	public BoardVO(int serial, String title, String write_Date, String contents, String attached_File) {
		super();
		this.serial = serial;
		this.title = title;
		this.write_Date = write_Date;
		this.contents = contents;
		this.attached_File = attached_File;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWrite_Date() {
		return write_Date;
	}
	public void setWrite_Date(String write_Date) {
		this.write_Date = write_Date;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getAttached_File() {
		return attached_File;
	}
	public void setAttached_File(String attached_File) {
		this.attached_File = attached_File;
	}

	@Override
	public String toString() {
		return "BoardVO [serial=" + serial + ", title=" + title + ", write_Date=" + write_Date + ", contents="
				+ contents + ", attached_File=" + attached_File + "]";
	}
	
}