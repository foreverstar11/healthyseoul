package test3;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DAO {
	@Autowired
    private SqlSession session;
	//보건소 얻어오는 메소드
	public List<Facilities> getBougun(){
		List<Facilities> list = session.selectList("Healthy_Seoul.selectBogun");
		return list;
	}
	//보건소 얻어오는 메소드 (좋아요+즐겨찾기 높은 순으로 3개)
	public List<Facilities> getBougunTop(){
		List<Facilities> list = session.selectList("Healthy_Seoul.selectBogunTop");
		return list;
	}
	//보건소 얻어오는 메소드 (거리 순으로 3개)
	public List<Facilities> getBougunDistance(Latlng latlng){
		List<Facilities> list = session.selectList("Healthy_Seoul.selectBogunDistance",latlng);
		return list;
	}
	//스포츠 센터 얻어 오는 메소드(카테고리별로)
	public List<Facilities> getSportsCenter(String e_Category){
		String h_Category = SportsCategory.chageOnCategory(e_Category);
		List<Facilities> list = null;
		if(h_Category.equals("전체"))
			list = session.selectList("Healthy_Seoul.selectSportCenter_All");
		else
			list = session.selectList("Healthy_Seoul.selectSportCenter_Category",h_Category);
		return list;
	}
	//스포츠 센터 얻어 오는 메소드 (좋아요+즐겨찾기 높은 순으로 3개)
	public List<Facilities> getSportsCenterTop(){
		List<Facilities> list = null;
		list = session.selectList("Healthy_Seoul.selectSportCenterTop");
		return list;
	}
	//스포츠 센터 얻어 오는 메소드 (거리 순으로 3개)
	public List<Facilities> getSportsCenterDistance(Latlng latlng){
		List<Facilities> list = null;
		list = session.selectList("Healthy_Seoul.selectSportCenterDistance",latlng);
		return list;
	}
	//보건소 게시판 정보 얻어오는 메소드(보건소 번호를 주고)
	public List<BoardVO> getBougun_Board(int serial){
		List<BoardVO> list = session.selectList("Healthy_Seoul.selectBogun_Board",serial);
		return list;
	}
	//스포츠 프로그램 정보 얻어오는 메소드(스포츠 센터 번호를 주고)
	public List<Sports_ProgramVO> getSportsCenter_Program(int serial){
		List<Sports_ProgramVO> list = session.selectList("Healthy_Seoul.selectSportCenter_Program",serial);
		return list;
	}
	//포인트 정보를 얻어오는 메소드(카테고리별로)
	public List<PointVO> getPoint(String e_Category){
		String h_Category = PointCategory.chageOnCategory(e_Category);
		String[] array = h_Category.split("/");
		List<PointVO> list = null;
		if(array.length == 1)
			list = session.selectList("Healthy_Seoul.selectPoint",array[0]);
		else{
			
		}
		return list;
	}
	//포인트정보를 얻어오는 메소드(좋아요+즐겨찾기 높은 순으로 3개)
	public List<PointVO> getPointTop(){
		List<PointVO> list = null;
		list = session.selectList("Healthy_Seoul.selectPointTop");
		return list;
	}
	//포인트 정보를 얻어오는 메소드(거리순으로 3개)
	public List<PointVO> getPointDistance(Latlng latlng){
		List<PointVO> list = null;
		list = session.selectList("Healthy_Seoul.selectPointDistance",latlng);
		return list;
	}
	//식당 정보 얻어오는 메소드(카테고리 별로)
	public List<Restaurant> getRestaurant(String e_Category){
		String h_Category = ResturantCategory.chageOnCategory(e_Category);
		List<Restaurant> list = session.selectList("Healthy_Seoul.selectRestaurant",h_Category);
		return list;
	}
	//식당 정보 얻어오는 메소드(좋아요+즐겨찾기 높은 순으로)
	public List<Restaurant> getRestaurantTop(){
		List<Restaurant> list = session.selectList("Healthy_Seoul.selectRestaurantTop");
		return list;
	}
	public List<Restaurant> getRestaurantDistance(Latlng latlng){
		List<Restaurant> list = session.selectList("Healthy_Seoul.selectRestaurantDistance",latlng);
		return list;
	}
	//시설 테이블 좋아요 + 또는  -
	public int pf_GoodUpdate(Good good){
		return session.update("Healthy_Seoul.updatepf_good",good);
	}
	//시설 테이블 즐겨찾기 + 또는 -
	public int pf_BookmarkUpdate(Good good){
		return session.update("Healthy_Seoul.updatepf_bookmark",good);
	}
	//포인트 테이블 좋아요 + 또는  -
	public int point_GoodUpdate(Good good){
		return session.update("Healthy_Seoul.updatepoint_good",good);
	}
	//포인트 테이블 즐겨찾기 + 또는 -
	public int point_BookmarkUpdate(Good good){
		return session.update("Healthy_Seoul.updatepoint_bookmark",good);
	}
	//로드 정보 얻어오는 메소드(포인트가 가진 키값을 이용해서)
	public RoadVO getRoad(int serial){
		return session.selectOne("Healthy_Seoul.selectRoad",serial);
	}
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	
}
