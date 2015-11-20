package test3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Control {
	DAO dao;

	@RequestMapping(value = "/Bogun_Select", method = RequestMethod.GET)
	public void Bogun_Select(@RequestParam(value="top" ,defaultValue="false") boolean top,
			@RequestParam(value="lat" ,defaultValue="0.0") double lat,
			@RequestParam(value="lng" ,defaultValue="0.0") double lng,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		List<Facilities> list = null;
		
		Latlng latlng = new Latlng(lat,lng);
		if(top)
			list = dao.getBougunTop();
		else if(lat != 0.0 && lng != 0.0)
			list = dao.getBougunDistance(latlng);
		else
			list = dao.getBougun();
		out.println(Writer.BogunList(list).toString());
	}

	@RequestMapping(value = "/SportsCenter_Select", method = RequestMethod.GET)
	public void SportsCenter_Select(@RequestParam(value="top" ,defaultValue="false") boolean top,
			@RequestParam(value="lat" ,defaultValue="0.0") double lat,
			@RequestParam(value="lng" ,defaultValue="0.0") double lng,
			@RequestParam(value="category",defaultValue="All") String category, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		List<Facilities> list = null;
		Latlng latlng = new Latlng(lat,lng);
		if(top)
			list = dao.getSportsCenterTop();
		else if(lat != 0.0 && lng != 0.0)
			list = dao.getSportsCenterDistance(latlng);
		else
			list= dao.getSportsCenter(category);
		out.println(Writer.SportsCenterList(list).toString());

	}

	@RequestMapping(value = "/SportsProgram_Select", method = RequestMethod.GET)
	public void SportsProgram_Select(@RequestParam("serial") int serial, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		List<Sports_ProgramVO> list = dao.getSportsCenter_Program(serial);
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(Writer.SportsProgramList(list).toString());
	}

	@RequestMapping(value = "/BogunBoard_Select", method = RequestMethod.GET)
	public void BogunBoard_Select(@RequestParam("serial") int serial, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		List<BoardVO> list = dao.getBougun_Board(serial);
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(Writer.BogunBoardList(list).toString());
	}

	@RequestMapping(value = "/Point_Select", method = RequestMethod.GET)
	public void Point_Select(@RequestParam(value="top" ,defaultValue="false") boolean top,
			@RequestParam(value="lat" ,defaultValue="0.0") double lat,
			@RequestParam(value="lng" ,defaultValue="0.0") double lng,
			@RequestParam(value="category",defaultValue="HanRiver") String category, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		List<PointVO> list = null;
		Latlng latlng = new Latlng(lat,lng);
		if(top)
			list = dao.getPointTop();
		else if(lat != 0.0 && lng != 0.0)
			list = dao.getPointDistance(latlng);
		else
			list = dao.getPoint(category);
		out.println(Writer.PointList(list).toString());
	}

	@RequestMapping(value = "/Road_Select", method = RequestMethod.GET)
	public void Road_Select(@RequestParam("serial") int serial, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		RoadVO vo = dao.getRoad(serial);
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(Writer.RoadList(vo).toString());
	}
	
	@RequestMapping(value = "/Restaurant_Select", method = RequestMethod.GET)
	public void Restaurant_Select(@RequestParam(value="top" ,defaultValue="false") boolean top,
			@RequestParam(value="lat" ,defaultValue="0.0") double lat,
			@RequestParam(value="lng" ,defaultValue="0.0") double lng,
			@RequestParam(value="category",defaultValue="Health") String category, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		List<Restaurant> list = null;
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		Latlng latlng = new Latlng(lat,lng);
		if(top)
			list = dao.getRestaurantTop();
		else if(lat != 0.0 && lng != 0.0)
			list = dao.getRestaurantDistance(latlng);
		else
			list = dao.getRestaurant(category);
		out.println(Writer.RestaurantList(list).toString());
	}
	@RequestMapping(value = "/pf_GoodUpdate", method = RequestMethod.GET)
	public void pf_GoodUpdate(@ModelAttribute Good good, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(Writer.Success(dao.pf_GoodUpdate(good)));
	}
	@RequestMapping(value = "/pf_BookmarkUpdate", method = RequestMethod.GET)
	public void pf_BookmarkUpdate(@ModelAttribute Good good, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(Writer.Success(dao.pf_BookmarkUpdate(good)));
	}
	@RequestMapping(value = "/point_GoodUpdate", method = RequestMethod.GET)
	public void point_GoodUpdate(@ModelAttribute Good good, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(Writer.Success(dao.point_GoodUpdate(good)));
	}
	@RequestMapping(value = "/point_BookmarkUpdate", method = RequestMethod.GET)
	public void point_BookmarkUpdate(@ModelAttribute Good good, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(Writer.Success(dao.point_BookmarkUpdate(good)));
	}
	public void setDao(DAO dao) {
		this.dao = dao;
	}

}
