package edu.git;

import com.thoughtworks.xstream.XStream;

public class Main {
	
	public static void main(String[] args) {
		
		Pessoa bebado = new Pessoa("Charlie Harper", 44);
		XStream conversor = new XStream();
		String xml = conversor.toXML(bebado);
		
		System.out.println(xml);
		
	}

}
