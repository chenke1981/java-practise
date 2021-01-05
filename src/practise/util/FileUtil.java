package practise.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * �ļ�������
 * 
 * @author chenke
 *
 */
public class FileUtil {
	/**
	 * ���ı��ļ����ݶ�ȡ���ַ���List��
	 * 
	 * @param filePath : �ı��ļ�·��
	 * @return �ı��ļ�����
	 */
	public static List<String> readTxtFile(String filePath) {
		try {
			List<String> content = new ArrayList<>();
			FileReader reader = new FileReader(filePath);
			BufferedReader br = new BufferedReader(reader);
			String line;
			while ((line = br.readLine()) != null) {
				content.add(line);
			}
			br.close();
			return content;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
