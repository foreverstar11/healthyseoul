package test3;

public class ResturantCategory {
	public final static String health = "Health";
	public final static String lowSalt1 = "LowSalt1";
	public final static String lowSalt2 = "LowSalt2";
	public final static String vegetarian = "Vegetarian";
	public final static String noTransFats = "NoTransFats";

	public static String chageOnCategory(String e_Category) {
		String h_Category = null;
		switch (e_Category) {
		case health:
			h_Category = "�ǰ�������";
			break;
		case lowSalt1:
			h_Category = "������õ������";
			break;
		case lowSalt2:
			h_Category = "�������������� ";
			break;
		case vegetarian:
			h_Category = "ä������������ ";
			break;
		case noTransFats:
			h_Category = "Ʈ�������� �Ƚ�������";
			break;
		}
		return h_Category;
	}
}
