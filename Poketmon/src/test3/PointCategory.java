package test3;

public class PointCategory {
	public final static String hanRiver = "HanRiver";
	public final static String hanyang  = "Hanyang";
	public final static String mountainsNear = "MountainsNear";
	public final static String seoul = "Seoul";
	public final static String cultural = "Cultural";
	
	public static String chageOnCategory(String e_Category) {
		String h_Category = null;
		switch (e_Category) {
		case hanRiver:
			h_Category = "한강지철길/계절길";
			break;
		case hanyang:
			h_Category = "한양도성길";
			break;
		case mountainsNear:
			h_Category = "근교산자락길";
			break;
		case seoul:
			h_Category = "서울둘레길";
			break;
		case cultural:
			h_Category = "생태문화길";
			break;
		}
		return h_Category;
	}
}
