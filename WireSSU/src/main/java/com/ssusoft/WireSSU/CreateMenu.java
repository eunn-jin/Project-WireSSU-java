package com.ssusoft.WireSSU;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CreateMenu {
	JMenuBar mb = new JMenuBar();
	
	public CreateMenu() {
		JMenu mn = new JMenu("System");
		mb.setBackground(new Color(240, 240, 240));
		Font f = new Font("Dialog", Font.PLAIN, 18);
		mn.setFont(f);
		
		JMenuItem[] mni = new JMenuItem[3];
		String[] title = {"Start", "Stop", "Exit"};
		Font ff = new Font("Dialog", Font.PLAIN, 16);
		
		MenuActionListener listener = new MenuActionListener();
		for(int i = 0; i < mni.length; i++) {
			mni[i] = new JMenuItem(title[i]);
			mni[i].setFont(ff);
			mni[i].addActionListener(listener);
			mn.add(mni[i]);
			if(i < 2) mn.addSeparator();
		}
		
		mb.add(mn);
		
//	      JMenu fileMenu=new JMenu("시스템");      
//	      JMenu saveMenu=new JMenu("동작");      
//	      JMenu programMenu =new JMenu("프로그램");
//	      mb.setBackground(new Color(255, 178, 217));
//	      
//	      JMenuItem [] menuItem=new JMenuItem [7];
//	      String [] itemTitle = {"시작하기", "정지하기", "다시 시작하기", "초기화", "적용", "변경", "닫기"};
//	      
//	      MenuActionListener listener = new MenuActionListener();
//	      
//	      for (int i=0;i<menuItem.length;i++) {
//	         menuItem[i]=new JMenuItem(itemTitle[i]);
//	         menuItem[i].addActionListener(listener);
//	      }
//	      
//	      //menuItem[4].addActionListener(new MyActionListener());
//	      //menuItem[5].addActionListener(new AttributeActionListener());
//
//	      fileMenu.add(menuItem[0]);      fileMenu.add(menuItem[1]);
//	      mb.add(fileMenu);
//	      
//	      saveMenu.add(menuItem[2]);      saveMenu.add(menuItem[3]);
//	      mb.add(saveMenu);
//	      
//	      programMenu.add(menuItem[4]);      programMenu.add(menuItem[5]);      programMenu.add(menuItem[6]);
//	      mb.add(programMenu);
	}
}