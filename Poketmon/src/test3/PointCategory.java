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
			h_Category = "�Ѱ���ö��/������";
			break;
		case hanyang:
			h_Category = "�Ѿ絵����";
			break;
		case mountainsNear:
			h_Category = "�ٱ����ڶ���";
			break;
		case seoul:
			h_Category = "����ѷ���";
			break;
		case cultural:
			h_Category = "���¹�ȭ��";
			break;
		}
		return h_Category;
	}
}
