package HW6;

public class P6overloading {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		Calc6 k30_cc = new Calc6();//Calc6 Ŭ������ �޾Ƽ� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		
		System.out.printf("2�� ������ ȣ��� [%d]\n", k30_cc.sum(1, 2));
		//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Calc6Ŭ������ up�޼ҵ� �Ķ���͸� 1, 2�� �ְ� ������ ���� ȭ�鿡 ����Ѵ�.
		System.out.printf("3�� ������ ȣ��� [%d]\n", k30_cc.sum(1, 2, 3));
		//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Calc6Ŭ������ up�޼ҵ� �Ķ���͸� 1, 2, 3�� �ְ� ������ ���� ȭ�鿡 ����Ѵ�.
		System.out.printf("4�� ������ ȣ��� [%d]\n", k30_cc.sum(1, 2, 3, 4));
		//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Calc6Ŭ������ up�޼ҵ� �Ķ���͸� 1, 2, 3, 4�� �ְ� ������ ���� ȭ�鿡 ����Ѵ�.
		System.out.printf("������ ������ ȣ��� [%f]\n", k30_cc.sum(1.3, 2.4));
		//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Calc6Ŭ������ up�޼ҵ� �Ķ���͸� 1.3, 2.4�� �ְ� ������ ���� ȭ�鿡 ����Ѵ�.
	}

}