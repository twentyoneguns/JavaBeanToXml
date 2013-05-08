package edu.git;

import com.thoughtworks.xstream.XStream;

public class Main {

	public static void main(String[] args) {

		Pessoa bebado = new Pessoa("Charlie Harper", 44);
		String xml = getXml(bebado);
		printXml(xml);

	}

	private static <T> String getXml(T javaBean) {
		XStream conversor = new XStream();
		conversor.alias(javaBean.getClass().getSimpleName(), javaBean.getClass());
		String xml = conversor.toXML(javaBean);
		return xml;
	}

	private static void printXml(String xml) {
		System.out.println(xml);
	}

}
