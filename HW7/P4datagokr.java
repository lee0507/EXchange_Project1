package HW7;

public class P4datagokr {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub

		String[] k30_OneRec = {//�迭 k30_OneRec�� �����ϰ� ���� ������ ���������� �����ؼ� �����Ѵ�.
				"����,�����,������,���,��û�Ⱓ,1���±���(5��/��),�����,�о����(����:��),�����ͱ�������" ,
				"1,���칰����,����õ,��⵵ ������ ������ ��� 191,����,8��/12����,100,8,2021-01-29" ,
				"2,�����ָ�����,�̱���,��⵵ ������ ������ ��� ��6-1,����,5��/5����,100,5,2021-01-29" ,
				"3,�����ָ�����,������,��⵵ ������ ������ ���ﵿ 166-1,����,5��/10����,200,5,2021-01-29" ,
				"4,���� �ູ �ָ�����,�谩��,��⵵ ������ �д籸 ������ 113����,����,5��/10����,200,5,2021-01-29" ,
				"5,�����ָ�����,������,��⵵ ������ ������ ���ﵿ 4-1,����,5��/13����,200,5,2021-01-29" ,
				"6,�д��ڿ����,���Ѽ�,��⵵ ������ �д籸 ���� 23,����,1��/1����,100,1,2021-01-29" ,
				"7,�����ָ�����,�Ѹ���,��⵵ ������ �д籸 ������ 73,����,5��/12����,250,5,2021-01-29" ,
				"8,������ �ָ�����,����ȯ,��⵵ ������ �߿��� ������ 1����,����,6��/11����,200,6,2021-01-29" ,
				"9,���� �ָ�����,�赵��,��⵵ ������ �߿��� ������ 415-4����,����,5��/15����,200,5,2021-01-29" ,
				"10,�д� �ָ� ����,�̺���,��⵵ ������ �д籸 �д絿 11����,����,10��/14����,100,10,2021-01-29"

		};
		int k30_iNumVal;//������ ���� k30_iNumVal�� �����Ѵ�.
		
		String[] k30_field_name = k30_OneRec[0].split(",");//���ڿ� �迭 k30_field_name�� �����ϰ� k30_OneRec �ε��� 0���� , �������� ������ �����Ѵ�.
		
		for (int k30_i = 1; k30_i < k30_OneRec.length - 1; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� OneRec������ - 1���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			//k30_i�� 1�����̰� OneRec���̺��� ���̳ʽ� 1�� ������ ��ó���� ����κ��� �����Ͽ��� �����̴�.
			String[] k30_field = k30_OneRec[k30_i].split(",");//���ڿ� �迭 k30_field�� �����ϰ� k30_OneRec �ε��� k30_i���� , �������� ������ �����Ѵ�.
			k30_iNumVal = Integer.parseInt(k30_field[6]);//���� k30_iNumVal�� ���������� ����ȯ�� k30_field�� �ε��� 6���� �����Ѵ�.
			String k30_sNumVal = String.valueOf(k30_iNumVal);// ���ڿ��� ���� k30_sNumVal�� �����ϰ� ���� ���ڿ��� ����ȯ�� k30_iNumVal���� �ʱ�ȭ�Ѵ�.
		    String k30_sNumVoice = "";//���ڿ��� ���� k30_sNumVoice�� �����ϰ� ""�� ���� �ʱ�ȭ�Ѵ�.
		    int k30_num1, k30_num2;//������ ���� k30_i�� k30_j�� �����Ѵ�.
		      
		      String [] k30_units = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};//���ڿ��� �迭 k30_units�� �����ϰ� ���� ������� �����Ѵ�.
		      String [] k30_unitX = {"", "��", "��", "õ", "��", "��", "��", "õ", "��", "��"};//���ڿ��� �迭 k30_unitX�� �����ϰ� ���� ������� �����Ѵ�.
		      
		      k30_num1 = 0;//���� k30_i�� ���� 0���� �ʱ�ȭ�Ѵ�.
		      k30_num2 = k30_sNumVal.length() - 1;//���� k30_j�� ���� k30_sNumVal�� ���� - 1 �� �ʱ�ȭ�Ѵ�.
		      
		      while (true) {//while �ݺ����� ������ k30_i >=0���� �����Ͽ� k30_i�� 0�� ���ų� ũ�ٸ� �ݺ����� ����ǵ��� �Ѵ�.
		         if(k30_num1 >= k30_sNumVal.length()) break;// ���� k30_i�� k30_sNumVal�� ���̿� ���ų� ũ�ٸ� break���� �����Ѵ�.
		         
		         if(k30_sNumVal.substring(k30_num1, k30_num1 + 1).equals("0")) {//���� k30_sNumVal�� k30_i����, k30_i�� 1�� ���� ������ ���ڿ��� �ڸ� ���� 0�� ���ٸ�
		            if(k30_unitX[k30_num2].equals("��") || k30_unitX[k30_num2].equals("��")) {//���� k30_unitX�� [k30_j]�ε��� ���� ���̰ų� k30_unitX�� [k30_j]�ε��� ���� ���̸�
		               k30_sNumVoice = k30_sNumVoice + k30_unitX[k30_num2];//k30_sNumVoice���� k30_unitX[k30_j]�ε��� ���� �����Ѵ�. (k30_sNumVoice += k30_unitX[k30_j]�� �ٲ㼭 �ۼ��� �� �ִ�)
		            } else {//���� if������ �������� �ʴ´ٸ�
		               //�ƹ��͵� �����ʴ´�.
		            }
		         } else if (k30_sNumVal.substring(k30_num1, k30_num1 + 1).equals("1") && k30_num2 > 5) {//�߰��� �κ����� //���� k30_sNumVal�� k30_i����, k30_i�� 1�� ���� ������ ���ڿ��� �ڸ� ���� 1�� ���ų�
		            k30_sNumVoice = k30_sNumVoice + k30_unitX[k30_num2];// k30_j�� 5���� ũ�ٸ� k30_sNumVoice���� k30_unitX[k30_j]�ε��� ���� �����Ѵ�. 
		            //(k30_sNumVoice += k30_unitX[k30_j]�� �ٲ㼭 �ۼ��� �� �ִ�)
		            
		         } else {//���� k30_sNumVal�� k30_i����, k30_i�� 1�� ���� ������ ���ڿ��� �ڸ� ���� 0�� ���� �ʴٸ�
		            k30_sNumVoice = k30_sNumVoice//k30_sNumVoice�� ���� 
		                  + k30_units[Integer.parseInt(k30_sNumVal.substring(k30_num1, k30_num1 + 1))]//k30_units�� ���������� ����ȯ�� (k30_sNumVal�� k30_i����, k30_i�� 1�� ���� ������ ���ڿ��� �ڸ� ��)�� �ε���]�� ���� ���ϰ�
		                  + k30_unitX[k30_num2];//k30_unitX[k30_j]�� ���� ���Ѵ�.
		         }
		         k30_num1++;//k30_i�� ���� 1 ������Ų��.
		         k30_num2--;//k30_j�� ���� 1 ���ҽ�Ų��.
		      }
		         
			System.out.printf("************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
			
			for(int k30_j = 0; k30_j < k30_field_name.length; k30_j++) {//for�ݺ����� k30_j�� 1���� k30_j�� k30_field_name���̺��� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
				if(k30_j == 6) {//k30_j�� 6�� ���ٸ�
					System.out.printf(" %s : [%s][%s]\n", k30_field_name[k30_j], k30_field[k30_j], k30_sNumVoice);// ���ڸ� �ѱ۷� �ٲپ ������ ���� k30_sNumVoice�� ������ ������ ȭ�鿡 ����Ѵ�.
				} else {//���� if������ �������� �ʴ´ٸ�
					System.out.printf(" %s : %s\n", k30_field_name[k30_j], k30_field[k30_j]);// �������� ȭ�鿡 ����Ѵ�.
				}

			}
			System.out.println("************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
			
		}
	}
}


