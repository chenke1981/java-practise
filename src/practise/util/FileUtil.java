package practise.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件工具类
 * 
 * @author chenke
 *
 */
public class FileUtil {
	/**
	 * 将文本文件内容读取到字符串List中
	 * 
	 * @param filePath : 文本文件路径
	 * @return 文本文件内容
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
