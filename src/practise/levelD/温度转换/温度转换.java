package practise.levelD.�¶�ת��;

public class �¶�ת�� {

	public static void main(String[] args) {
		double f = 50.0;
		double c = fahrenheitToCelsius(f);
		System.out.println(c);
	}
	
	/**
	 * �����¶�ת��Ϊ�����¶ȣ���ʽΪ��F��C��9/5��32
	 * @param f: �����¶�
	 * @return ת���������¶�
	 */
	private static double fahrenheitToCelsius(double f) {
		double celsiusDegree = (f-32)*5/9;
		return celsiusDegree;
	}

}
