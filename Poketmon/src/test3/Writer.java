package test3;

import java.util.List;

public class Writer {
	public static StringBuffer BogunList(List<Facilities> list){
		StringBuffer buffer = new StringBuffer();
		buffer.append("{\"count\" : \"");
		buffer.append(list.size());
		buffer.append("\",");
		buffer.append("\"row\" : [");
		for (int i = 0; i < list.size(); i++) {
			Facilities vo = list.get(i);
			if (i != 0)
				buffer.append(",{\"serial\" : \"");
			else
				buffer.append("{\"serial\" : \"");
			buffer.append(vo.getSerial());
			buffer.append("\" , \"pname\" : \"");
			buffer.append(vo.getName());
			buffer.append("\" , \"phone\" : \"");
			buffer.append(vo.getPhone());
			buffer.append("\" , \"region\" : \"");
			buffer.append(vo.getRegion());
			buffer.append("\" , \"homepage\" : \"");
			buffer.append(vo.getHomepage());
			buffer.append("\" , \"latitude\" : \"");
			buffer.append(vo.getLatitude());
			buffer.append("\" , \"longitude\" : \"");
			buffer.append(vo.getLongitude());
			buffer.append("\" , \"good\" : \"");
			buffer.append(vo.getGood());
			buffer.append("\" , \"bookmark\" : \"");
			buffer.append(vo.getBookmark());
			buffer.append("\"}");
		}
		buffer.append("]}");
		return buffer;
	}

	public static StringBuffer SportsCenterList(List<Facilities> list){
		StringBuffer buffer = new StringBuffer();
		buffer.append("{\"count\" : \"");
		buffer.append(list.size());
		buffer.append("\",");
		buffer.append("\"row\" : [");
		for (int i = 0; i < list.size(); i++) {
			Facilities vo = list.get(i);
			if (i != 0)
				buffer.append(",{\"serial\" : \"");
			else
				buffer.append("{\"serial\" : \"");
			buffer.append(vo.getSerial());
			buffer.append("\" , \"pname\" : \"");
			buffer.append(vo.getName());
			buffer.append("\" , \"phone\" : \"");
			buffer.append(vo.getPhone());
			buffer.append("\" , \"region\" : \"");
			buffer.append(vo.getRegion());
			buffer.append("\" , \"homepage\" : \"");
			buffer.append(vo.getHomepage());
			buffer.append("\" , \"latitude\" : \"");
			buffer.append(vo.getLatitude());
			buffer.append("\" , \"longitude\" : \"");
			buffer.append(vo.getLongitude());
			buffer.append("\" , \"good\" : \"");
			buffer.append(vo.getGood());
			buffer.append("\" , \"bookmark\" : \"");
			buffer.append(vo.getBookmark());
			buffer.append("\"}");
		}
		buffer.append("]}");
		return buffer;
	}
	
	public static StringBuffer SportsProgramList(List<Sports_ProgramVO> list){
		StringBuffer buffer = new StringBuffer();
		buffer.append("{\"count\" : \"");
		buffer.append(list.size());
		buffer.append("\",");
		buffer.append("\"row\" : [");
		for (int i = 0; i < list.size(); i++) {
			Sports_ProgramVO vo = list.get(i);
			if (i != 0)
				buffer.append(",{\"name\" : \"");
			else
				buffer.append("{\"name\" : \"");
			buffer.append(vo.getProgram_Name());
			buffer.append("\" , \"target\" : \"");
			buffer.append(vo.getTarget());
			buffer.append("\" , \"week\" : \"");
			buffer.append(vo.getWeek());
			buffer.append("\" , \"class_time\" : \"");
			buffer.append(vo.getClass_time());
			buffer.append("\" , \"fee\" : \"");
			buffer.append(vo.getFee());
			buffer.append("\" , \"term\" : \"");
			buffer.append(vo.getTerm());
			buffer.append("\" , \"class_name\" : \"");
			buffer.append(vo.getClass_name());
			buffer.append("\"}");
		}
		buffer.append("]}");
		return buffer;
	}
	
	public static StringBuffer BogunBoardList(List<BoardVO> list){
		StringBuffer buffer = new StringBuffer();
		buffer.append("{\"count\" : \"");
		buffer.append(list.size());
		buffer.append("\",");
		buffer.append("\"row\" : [");
		for (int i = 0; i < list.size(); i++) {
			BoardVO vo = list.get(i);
			if (i != 0)
				buffer.append(",{\"title\" : \"");
			else
				buffer.append("{\"title\" : \"");
			String title = vo.getTitle();
			title = title.replace('\"', '¢¿');
			title = title.replace('\\', '¢Í');
			buffer.append(title);
			buffer.append("\" , \"contents\" : \"");
			String contents = vo.getContents();
			contents = contents.replaceAll("[\r\n]", "¢À");
			contents = contents.replace('\"', '¢¿');
			contents = contents.replace('\\', '¢Í');
			buffer.append(contents);
			buffer.append("\" , \"write_date\" : \"");
			buffer.append(vo.getWrite_Date());
			buffer.append("\" , \"attached_File\" : \"");
			buffer.append(vo.getAttached_File());
			buffer.append("\"}");
		}
		buffer.append("]}");
		return buffer;
	}
	
	public static StringBuffer PointList(List<PointVO> list){
		StringBuffer buffer = new StringBuffer();
		buffer.append("{\"count\" : \"");
		buffer.append(list.size());
		buffer.append("\",");
		buffer.append("\"row\" : [");
		for (int i = 0; i < list.size(); i++) {
			PointVO vo = list.get(i);
			if (i != 0)
				buffer.append(",{\"serial\" : \"");
			else
				buffer.append("{\"serial\" : \"");
			buffer.append(vo.getSerial());
			buffer.append("\" , \"longitude\" : \"");
			buffer.append(vo.getLongitude());
			buffer.append("\" , \"latitude\" : \"");
			buffer.append(vo.getLatitude());
			buffer.append("\" , \"point_name\" : \"");
			buffer.append(vo.getPoint_Name());
			buffer.append("\" , \"point_contents\" : \"");
			buffer.append(vo.getPoint_Contents());
			buffer.append("\" , \"good\" : \"");
			buffer.append(vo.getGood());
			buffer.append("\" , \"bookmark\" : \"");
			buffer.append(vo.getBookmark());
			buffer.append("\"}");
		}
		buffer.append("]}");
		return buffer;
	}
	
	public static StringBuffer RoadList(RoadVO vo){
		StringBuffer buffer = new StringBuffer();
		buffer.append("{\"count\" : \"");
		buffer.append(1);
		buffer.append("\",");
		buffer.append("\"row\" : [");
		buffer.append("{\"course_type\" : \"");
		buffer.append(vo.getCourse_Type());
		buffer.append("\" , \"course_name\" : \"");
		buffer.append(vo.getCourse_Name());
		buffer.append("\" , \"distance\" : \"");
		buffer.append(vo.getDistance());
		buffer.append("\" , \"necessary_period\" : \"");
		buffer.append(vo.getNecessary_period());
		buffer.append("\" , \"course_detail\" : \"");
		buffer.append(vo.getCourse_Detail());
		buffer.append("\" , \"transportation\" : \"");
		buffer.append(vo.getTransportation());
		buffer.append("\"}");
		buffer.append("]}");
		return buffer;
	}
	
	public static StringBuffer RestaurantList(List<Restaurant> list){
		StringBuffer buffer = new StringBuffer();
		buffer.append("{\"count\" : \"");
		buffer.append(list.size());
		buffer.append("\",");
		buffer.append("\"row\" : [");
		for (int i = 0; i < list.size(); i++) {
			Restaurant vo = list.get(i);
			if (i != 0)
				buffer.append(",{\"serial\" : \"");
			else
				buffer.append("{\"serial\" : \"");
			buffer.append(vo.getSerial());
			buffer.append("\" , \"pname\" : \"");
			buffer.append(vo.getName());
			buffer.append("\" , \"phone\" : \"");
			buffer.append(vo.getPhone());
			buffer.append("\" , \"region\" : \"");
			buffer.append(vo.getRegion());
			buffer.append("\" , \"latitude\" : \"");
			buffer.append(vo.getLatitude());
			buffer.append("\" , \"longitude\" : \"");
			buffer.append(vo.getLongitude());
			buffer.append("\" , \"good\" : \"");
			buffer.append(vo.getGood());
			buffer.append("\" , \"bookmark\" : \"");
			buffer.append(vo.getBookmark());
			buffer.append("\" , \"food_menu\" : \"");
			buffer.append(vo.getFood_menu());
			buffer.append("\" , \"food_Type\" : \"");
			buffer.append(vo.getFood_Type());
			buffer.append("\" , \"restaurant_Type\" : \"");
			buffer.append(vo.getRestaurant_Type());
			buffer.append("\"}");
		}
		buffer.append("]}");
		return buffer;
	}
	
	public static StringBuffer Success(int success){
		StringBuffer buffer = new StringBuffer();
		buffer.append("{\"success\" : \"");
		buffer.append(success);
		buffer.append("\"}");
		return buffer;
	}
}
