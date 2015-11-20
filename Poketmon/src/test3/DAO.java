package test3;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DAO {
	@Autowired
    private SqlSession session;
	//���Ǽ� ������ �޼ҵ�
	public List<Facilities> getBougun(){
		List<Facilities> list = session.selectList("Healthy_Seoul.selectBogun");
		return list;
	}
	//���Ǽ� ������ �޼ҵ� (���ƿ�+���ã�� ���� ������ 3��)
	public List<Facilities> getBougunTop(){
		List<Facilities> list = session.selectList("Healthy_Seoul.selectBogunTop");
		return list;
	}
	//���Ǽ� ������ �޼ҵ� (�Ÿ� ������ 3��)
	public List<Facilities> getBougunDistance(Latlng latlng){
		List<Facilities> list = session.selectList("Healthy_Seoul.selectBogunDistance",latlng);
		return list;
	}
	//������ ���� ��� ���� �޼ҵ�(ī�װ�����)
	public List<Facilities> getSportsCenter(String e_Category){
		String h_Category = SportsCategory.chageOnCategory(e_Category);
		List<Facilities> list = null;
		if(h_Category.equals("��ü"))
			list = session.selectList("Healthy_Seoul.selectSportCenter_All");
		else
			list = session.selectList("Healthy_Seoul.selectSportCenter_Category",h_Category);
		return list;
	}
	//������ ���� ��� ���� �޼ҵ� (���ƿ�+���ã�� ���� ������ 3��)
	public List<Facilities> getSportsCenterTop(){
		List<Facilities> list = null;
		list = session.selectList("Healthy_Seoul.selectSportCenterTop");
		return list;
	}
	//������ ���� ��� ���� �޼ҵ� (�Ÿ� ������ 3��)
	public List<Facilities> getSportsCenterDistance(Latlng latlng){
		List<Facilities> list = null;
		list = session.selectList("Healthy_Seoul.selectSportCenterDistance",latlng);
		return list;
	}
	//���Ǽ� �Խ��� ���� ������ �޼ҵ�(���Ǽ� ��ȣ�� �ְ�)
	public List<BoardVO> getBougun_Board(int serial){
		List<BoardVO> list = session.selectList("Healthy_Seoul.selectBogun_Board",serial);
		return list;
	}
	//������ ���α׷� ���� ������ �޼ҵ�(������ ���� ��ȣ�� �ְ�)
	public List<Sports_ProgramVO> getSportsCenter_Program(int serial){
		List<Sports_ProgramVO> list = session.selectList("Healthy_Seoul.selectSportCenter_Program",serial);
		return list;
	}
	//����Ʈ ������ ������ �޼ҵ�(ī�װ�����)
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
	//����Ʈ������ ������ �޼ҵ�(���ƿ�+���ã�� ���� ������ 3��)
	public List<PointVO> getPointTop(){
		List<PointVO> list = null;
		list = session.selectList("Healthy_Seoul.selectPointTop");
		return list;
	}
	//����Ʈ ������ ������ �޼ҵ�(�Ÿ������� 3��)
	public List<PointVO> getPointDistance(Latlng latlng){
		List<PointVO> list = null;
		list = session.selectList("Healthy_Seoul.selectPointDistance",latlng);
		return list;
	}
	//�Ĵ� ���� ������ �޼ҵ�(ī�װ� ����)
	public List<Restaurant> getRestaurant(String e_Category){
		String h_Category = ResturantCategory.chageOnCategory(e_Category);
		List<Restaurant> list = session.selectList("Healthy_Seoul.selectRestaurant",h_Category);
		return list;
	}
	//�Ĵ� ���� ������ �޼ҵ�(���ƿ�+���ã�� ���� ������)
	public List<Restaurant> getRestaurantTop(){
		List<Restaurant> list = session.selectList("Healthy_Seoul.selectRestaurantTop");
		return list;
	}
	public List<Restaurant> getRestaurantDistance(Latlng latlng){
		List<Restaurant> list = session.selectList("Healthy_Seoul.selectRestaurantDistance",latlng);
		return list;
	}
	//�ü� ���̺� ���ƿ� + �Ǵ�  -
	public int pf_GoodUpdate(Good good){
		return session.update("Healthy_Seoul.updatepf_good",good);
	}
	//�ü� ���̺� ���ã�� + �Ǵ� -
	public int pf_BookmarkUpdate(Good good){
		return session.update("Healthy_Seoul.updatepf_bookmark",good);
	}
	//����Ʈ ���̺� ���ƿ� + �Ǵ�  -
	public int point_GoodUpdate(Good good){
		return session.update("Healthy_Seoul.updatepoint_good",good);
	}
	//����Ʈ ���̺� ���ã�� + �Ǵ� -
	public int point_BookmarkUpdate(Good good){
		return session.update("Healthy_Seoul.updatepoint_bookmark",good);
	}
	//�ε� ���� ������ �޼ҵ�(����Ʈ�� ���� Ű���� �̿��ؼ�)
	public RoadVO getRoad(int serial){
		return session.selectOne("Healthy_Seoul.selectRoad",serial);
	}
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	
}
