package org.sample;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ImplementationClass {
public static void main(String[] args) throws IOException {
	
	POJOClass p=new POJOClass();
	p.readDataFromTextFile();
	p.setUserName("devi@123");
	p.setPassword("devi@111");
	p.setBalance(1);
	
	POJOClass p1=new POJOClass();
	p1.readDataFromTextFile();
	p1.setUserName("agil@123");
	p1.setPassword("agil@111");
	p1.setBalance(2);
	
	POJOClass p2=new POJOClass();
	p2.readDataFromTextFile();
	p2.setUserName("sanji@123");
	p2.setPassword("sanji@111");
	p2.setBalance(3);
	
	POJOClass p3=new POJOClass();
	p3.readDataFromTextFile();
	p3.setUserName("devi@123");
	p3.setPassword("agil@111");
	p3.setBalance(4);
	
	List<POJOClass> li=new LinkedList();
	li.add(p);
	li.add(p1);
	li.add(p2);
	li.add(p3);
	for(POJOClass li1:li) {
		System.out.println(li1.getBalance());
	}
	Set<POJOClass> s=new LinkedHashSet();
	s.addAll(li);
	for(POJOClass li1:s) {
		System.out.println(li1.getBalance());
	}
	
	Map<Integer,POJOClass> m=new LinkedHashMap();
	m.put(10, p);
	m.put(20, p1);
	m.put(30, p2);
	m.put(40, p3);
	
	Set<Entry<Integer, POJOClass>> entrySet = m.entrySet();
	for(Entry<Integer, POJOClass> e:entrySet) {
		POJOClass value = e.getValue();
		System.out.println(value.getBalance());
	}
	Collection<POJOClass> values = m.values();
	for(POJOClass v1:values) {
		System.out.println(v1.getBalance());
	}
	
	
	
	
	
	
	
	
}
}
