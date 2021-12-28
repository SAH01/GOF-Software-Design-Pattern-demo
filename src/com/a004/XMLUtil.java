package com.a004;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.File;
public class XMLUtil {
	public static Object getBean() {
		try {
				//创建DOM文档对象
				DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = dFactory.newDocumentBuilder();
				Document doc;
				doc = builder.parse(new File("config.xml"));
				//获取包含类名的文本节点
				NodeList nl = doc.getElementsByTagName("className");
				Node classNode = nl.item(0).getFirstChild();
				String cName = classNode.getNodeValue();
				System.out.println("类名:  "+ cName); //输出类名
				//通过类名生成实例对象返回

			Object obj = null;
			try {
				Class c =Class.forName("com.a004."+cName);
				obj = c.newInstance();
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException");
				e.printStackTrace();
			} catch (InstantiationException e) {
				System.out.println("InstantiationException");
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				System.out.println("IllegalAccessException");
				e.printStackTrace();
			}
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
