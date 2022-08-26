package menutest;

import java.awt.CheckboxMenuItem;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JFrame;

public class MenuTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Parent");
		f.setSize(500, 200);

		MenuBar mb = new MenuBar();

		Menu mFile = new Menu("����(F)");
		MenuItem miNew = new MenuItem("���� �����");
		MenuItem miNewdoc = new MenuItem("��â");
		MenuItem miOpen = new MenuItem("����");
		MenuItem miSave = new MenuItem("����");
		MenuItem miOtherSave = new MenuItem("�ٸ� �̸����� ����");
		MenuItem miPage = new MenuItem("������ ����");
		MenuItem miPrint = new MenuItem("�μ�");
		MenuItem miExit = new MenuItem("������");

		mFile.add(miNew);
		mFile.add(miNewdoc);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miOtherSave);
		mFile.addSeparator();
		mFile.add(miPage);
		mFile.add(miPrint);
		mFile.add(miExit);

		Menu mEdit = new Menu("����(E)");
		MenuItem mE1 = new MenuItem("���� ���(U)");
		MenuItem mE2 = new MenuItem("�߶󳻱�(T)");
		MenuItem mE3 = new MenuItem("����(C)");
		MenuItem mE4 = new MenuItem("�ٿ��ֱ�(P)");
		MenuItem mE5 = new MenuItem("����(L)");
		MenuItem mE6 = new MenuItem("Bing���� �˻�(S)");
		MenuItem mE7 = new MenuItem("ã��(F)");
		MenuItem mE8 = new MenuItem("���� ã��(N)");
		MenuItem mE9 = new MenuItem("���� ã��(V)");
		MenuItem mE10 = new MenuItem("�ٲٱ�(R)");
		MenuItem mE11 = new MenuItem("�̵�(G)");
		MenuItem mE12 = new MenuItem("��� ����(A)");
		MenuItem mE13 = new MenuItem("�ð�/��¥(D)");

		mEdit.add(mE1);
		mEdit.addSeparator();
		mEdit.add(mE2);
		mEdit.add(mE3);
		mEdit.add(mE4);
		mEdit.add(mE5);
		mEdit.addSeparator();
		mEdit.add(mE6);
		mEdit.add(mE7);
		mEdit.add(mE8);
		mEdit.add(mE9);
		mEdit.add(mE10);
		mEdit.add(mE11);
		mEdit.addSeparator();
		mEdit.add(mE12);
		mEdit.add(mE13);

		Menu mO = new Menu("����(O)");
		CheckboxMenuItem mo1 = new CheckboxMenuItem("�ڵ� �� �ٲ�(W)");
		MenuItem mo2 = new MenuItem("�۲�(F)");

		mO.add(mo1);
		mO.add(mo2);

		Menu mView = new Menu("����(V)");
		Menu mv1 = new Menu("Ȯ���ϱ�/����ϱ�");
		CheckboxMenuItem mv2 = new CheckboxMenuItem("���� ǥ����(S)");
		MenuItem mv3 = new MenuItem("Ȯ��(I)");
		MenuItem mv4 = new MenuItem("���(O)");
		MenuItem mv5 = new MenuItem("Ȯ���ϱ�/����ϱ� �⺻�� ����");

		mView.add(mv1);
		mView.add(mv2);
		mv1.add(mv3);
		mv1.add(mv4);
		mv1.add(mv5);

		Menu mHelp = new Menu("����(H)");
		MenuItem mh1 = new MenuItem("���� ����(H)");
		MenuItem mh2 = new MenuItem("�ǵ�� ������(F)");
		MenuItem mh3 = new MenuItem("�޸��� ����(A)");

		mHelp.add(mh1);
		mHelp.add(mh2);
		mHelp.addSeparator();
		mHelp.add(mh3);

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mO);
		mb.add(mView);
		mb.add(mHelp);

		f.setMenuBar(mb);
		f.setVisible(true);
	}

}
