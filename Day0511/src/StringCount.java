
public class StringCount {
	String srcString = "";
	int count = 0;
	
	public StringCount(String src) {
		this.srcString = src;
	}

	int stringCount(String s) {
		return stringCount(s, 0);
	}
	
	int stringCount(String s, int pos) {
		int index = 0;
		if(s == null || s.length() == 0) {
			return 0;
		}
		if((index = srcString.indexOf(s, pos)) != -1) {
			count ++;
			stringCount(s, index + s.length());
		}
		return count;
	}
	
	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		StringCount sc = new StringCount(src);
		System.out.println("aa를" + sc.stringCount("aa") + "개 찾았습니다.");
	}
}