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
			h_Category = "건강음식점";
			break;
		case lowSalt1:
			h_Category = "저염실천음식점";
			break;
		case lowSalt2:
			h_Category = "저염참여음식점 ";
			break;
		case vegetarian:
			h_Category = "채식전문음식점 ";
			break;
		case noTransFats:
			h_Category = "트랜스지방 안심제과점";
			break;
		}
		return h_Category;
	}
}
