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

		Menu mFile = new Menu("파일(F)");
		MenuItem miNew = new MenuItem("새로 만들기");
		MenuItem miNewdoc = new MenuItem("새창");
		MenuItem miOpen = new MenuItem("열기");
		MenuItem miSave = new MenuItem("저장");
		MenuItem miOtherSave = new MenuItem("다른 이름으로 저장");
		MenuItem miPage = new MenuItem("페이지 설정");
		MenuItem miPrint = new MenuItem("인쇄");
		MenuItem miExit = new MenuItem("끝내기");

		mFile.add(miNew);
		mFile.add(miNewdoc);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miOtherSave);
		mFile.addSeparator();
		mFile.add(miPage);
		mFile.add(miPrint);
		mFile.add(miExit);

		Menu mEdit = new Menu("편집(E)");
		MenuItem mE1 = new MenuItem("실행 취소(U)");
		MenuItem mE2 = new MenuItem("잘라내기(T)");
		MenuItem mE3 = new MenuItem("복사(C)");
		MenuItem mE4 = new MenuItem("붙여넣기(P)");
		MenuItem mE5 = new MenuItem("삭제(L)");
		MenuItem mE6 = new MenuItem("Bing으로 검색(S)");
		MenuItem mE7 = new MenuItem("찾기(F)");
		MenuItem mE8 = new MenuItem("다음 찾기(N)");
		MenuItem mE9 = new MenuItem("이전 찾기(V)");
		MenuItem mE10 = new MenuItem("바꾸기(R)");
		MenuItem mE11 = new MenuItem("이동(G)");
		MenuItem mE12 = new MenuItem("모두 선택(A)");
		MenuItem mE13 = new MenuItem("시간/날짜(D)");

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

		Menu mO = new Menu("서식(O)");
		CheckboxMenuItem mo1 = new CheckboxMenuItem("자동 줄 바꿈(W)");
		MenuItem mo2 = new MenuItem("글꼴(F)");

		mO.add(mo1);
		mO.add(mo2);

		Menu mView = new Menu("보기(V)");
		Menu mv1 = new Menu("확대하기/축소하기");
		CheckboxMenuItem mv2 = new CheckboxMenuItem("상태 표시줄(S)");
		MenuItem mv3 = new MenuItem("확대(I)");
		MenuItem mv4 = new MenuItem("축소(O)");
		MenuItem mv5 = new MenuItem("확대하기/축소하기 기본값 복원");

		mView.add(mv1);
		mView.add(mv2);
		mv1.add(mv3);
		mv1.add(mv4);
		mv1.add(mv5);

		Menu mHelp = new Menu("도움말(H)");
		MenuItem mh1 = new MenuItem("도움말 보기(H)");
		MenuItem mh2 = new MenuItem("피드백 보내기(F)");
		MenuItem mh3 = new MenuItem("메모장 정보(A)");

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
