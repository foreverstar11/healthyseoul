package test3;

public class SportsCategory {
	public final static String swimming = "Swimming";
	public final static String dance = "Dance";
	public final static String yoga = "Yoga";
	public final static String health = "Health";
	public final static String aerobics = "Aerobics";
	public final static String badminton = "Badminton";
	public final static String all = "All";
	public static String chageOnCategory(String e_Category) {
		String h_Category = null;
		switch (e_Category) {
		case swimming:
			h_Category = "����";
			break;
		case dance:
			h_Category = "��";
			break;
		case yoga:
			h_Category = "�䰡";
			break;
		case health:
			h_Category = "�ｺ";
			break;
		case aerobics:
			h_Category = "����κ�";
			break;
		case badminton:
			h_Category = "������";
			break;
		case all:
			h_Category = "��ü";
			break;
		}
		return h_Category;
	}
}
