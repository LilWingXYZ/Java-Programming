package ch9.part1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Exe3 extends Applet implements KeyListener {
	char ch;

	public void init() {
		addKeyListener(this);
		requestFocus();// ��ȡ����
	}

	public void paint(Graphics g) {
		if (ch == 'r' | ch == 'R')
			this.setBackground(Color.red);
		else if(ch=='b'||ch=='B')
			this.setBackground(Color.BLUE);
		else if(ch=='g' || ch=='G')
			this.setBackground(Color.green);
		else
			this.setBackground(Color.black);
	}

	public void keyPressed(KeyEvent e)// ��ѹ��ʱִ��
	{
	}

	public void keyReleased(KeyEvent e)// ���ͷ�ʱִ��
	{
	}

	public void keyTyped(KeyEvent e)// //���û�ʱִ��
	{
		ch = e.getKeyChar();
		repaint();
	}
}
