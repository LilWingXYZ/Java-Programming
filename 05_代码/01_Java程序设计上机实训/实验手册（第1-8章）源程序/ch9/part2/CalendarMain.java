package ch9.part2;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class CalendarBean {
	String day[];
	int year = 2010, month = 0;

	public void setYear(int year) {
		this.year = year; // �Գ�Ա����year��ֵ
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		this.month = month; // �Գ�Ա����month��ֵ
	}

	public int getMonth() {
		return month;
	}

	public String[] getCalendar() {
		String a[] = new String[42];
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.set(year, month - 1, 1);
		int week = myCalendar.get(Calendar.DAY_OF_WEEK) - 1;
		int day = 0;
		if (month == 1 || month == 3 || month == 7 || month == 8 || month == 10
				|| month == 12) { // �·�Ϊ1��3��5��7��8��10��12
			day = 31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		}
		if (month == 2) {
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {// �ж��Ƿ�Ϊ����
				day = 29;
			} else {
				day = 28;
			}
		}
		for (int i = week, n = 1; i < week + day; i++) {
			a[i] = String.valueOf(n);
			n++;
		}
		return a;
	}
}

class CalendarFrame extends Frame implements ActionListener {
	Label labelDay[] = new Label[42];
	Button titleName[] = new Button[7];
	String name[] = { "��", "һ", "��", "��", "��", "��", "��" };
	Button nextMonth, previousMonth;
	int year = 2011, month = 10;
	CalendarBean calendar;
	Label showMessage = new Label("", Label.CENTER);

	public CalendarFrame() {
		Panel pCenter = new Panel();
		pCenter.setLayout(new GridLayout(7, 7)); // ��pCenter�Ĳ�������Ϊ7��7�е�GridLayout
		// ���֡�
		for (int i = 0; i < 7; i++) {
			titleName[i] = new Button(name[i]);
			pCenter.add(titleName[i]); // pCenter������titleName[i]��
		}
		for (int i = 0; i < 42; i++) {
			labelDay[i] = new Label("", Label.CENTER);
			pCenter.add(labelDay[i]); // pCenter������labelDay[i]��
		}
		calendar = new CalendarBean();
		calendar.setYear(year);
		calendar.setMonth(month);
		String day[] = calendar.getCalendar();
		for (int i = 0; i < 42; i++) {
			labelDay[i].setText(day[i]);
		}
		nextMonth = new Button("����");
		previousMonth = new Button("����");
		nextMonth.addActionListener(this);
		previousMonth.addActionListener(this);
		Panel pNorth = new Panel(), pSouth = new Panel();
		pNorth.add(previousMonth);
		pNorth.add(nextMonth);
		pSouth.add(showMessage);
		showMessage.setText("������" + calendar.getYear() + "��"
				+ calendar.getMonth() + "��");
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.add(pCenter);
		this.add(scrollPane, BorderLayout.CENTER);// �������scrollPane����������
		this.add(pNorth, BorderLayout.NORTH); // �������pNorth �ڱ�������
		this.add(pSouth, BorderLayout.SOUTH); // �������pSouth ��������
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nextMonth) {// ��ȡ�¼�Դ
			month = month + 1;
			if (month > 12)
				month = 1;
			calendar.setMonth(month);
			String day[] = calendar.getCalendar();
			for (int i = 0; i < 42; i++) {
				labelDay[i].setText(day[i]);
			}
		} else if (e.getSource() == previousMonth) {
			month = month - 1;
			if (month < 1)
				month = 12;
			calendar.setMonth(month);
			String day[] = calendar.getCalendar();
			for (int i = 0; i < 42; i++) {
				labelDay[i].setText(day[i]);
			}
		}
		showMessage.setText("������" + calendar.getYear() + "��"
				+ calendar.getMonth() + "��");
	}
}

public class CalendarMain {
	public static void main(String args[]) {
		CalendarFrame frame = new CalendarFrame();
		frame.setBounds(100, 100, 360, 300);
		frame.setVisible(true);
		frame.validate();
		/*
		 * �˶δ�����ѧ��������� ���ܣ�����������ʵ��frame�����¼��ļ��� ���û��������رա���ťʱ�˳��ó���
		 */
		frame.addWindowListener(new WindowAdapter(){
           	public void windowClosing(WindowEvent e) {
         		System.exit(0);	};
		}
		);
	}
}

		
