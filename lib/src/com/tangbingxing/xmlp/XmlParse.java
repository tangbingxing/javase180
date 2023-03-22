package com.tangbingxing.xmlp;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class XmlParse {
    public static void main(String[] args) throws DocumentException {
        //1.获取一个解析器对象
        SAXReader saxReader = new SAXReader();
        //2.利用解析器把 xml 文件加载到内存中，并返回一个文档对象
        //read  抛出异常
        Document document = saxReader.read(new File("lib\\xml\\student.xml"));
        //获取到根标签
        Element rootElement = document.getRootElement();
        //通过根标签来获取子标签
        List<Element> studentElements = rootElement.elements("student");
//        System.out.println(studentElements.size());
        //遍历，得到所有子标签
        for (Element studentElement : studentElements) {
            //获取id属性
            Attribute attribute = studentElement.attribute("id");
            //获取id属性的值


            String id = attribute.getValue();
        }
        //获取里面的所有子标签和属性
    }
}
