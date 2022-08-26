import java.io.File;

public class Ex8_10 {
	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage()+" �ٽ� �Է����ּ���");
		}
	}

	private static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}


	static void createNewFile (File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}