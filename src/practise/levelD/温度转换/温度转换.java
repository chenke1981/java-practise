package practise.levelD.温度转换;

public class 温度转换 {

	public static void main(String[] args) {
		double f = 50.0;
		double c = fahrenheitToCelsius(f);
		System.out.println(c);
	}
	
	/**
	 * 华氏温度转化为摄氏温度，公式为：F＝C×9/5＋32
	 * @param f: 华氏温度
	 * @return 转换的摄氏温度
	 */
	private static double fahrenheitToCelsius(double f) {
		double celsiusDegree = (f-32)*5/9;
		return celsiusDegree;
	}

}
