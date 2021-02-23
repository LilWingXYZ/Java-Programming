package ch10.part1;

class FactorialThread extends Thread { // �̳�Thread��
	private int num;

	public FactorialThread(int num) {
		super();// �����丸��Ĺ��췽��
		this.num = num;
	}

	public void run() { // ��дrun����
		int i = num;
		int result = 1;
		System.out.println("new thread started");
		while (i > 0) {
			result = result * i;
			i = i - 1;
			try {
				this.sleep((long) Math.random()); // �߳�˯��1�����ڵ����ʱ��
			} catch (InterruptedException e) {
			}
		}
		System.out.println("The factorial of " + num + " is " + result);
		System.out.println("new thread ends"); // �߳�ִ�н���
	}
}

public class ThreadsTest {
	public static void main(String args[]) {
		System.out.println("main thread starts");
		FactorialThread thread = new FactorialThread(10); // �����̵߳�����Ϊthread
		thread.start(); // �����߳�
		System.out.println("main thread ends ");
	}
}
