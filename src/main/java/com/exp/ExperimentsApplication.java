package com.exp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exp.dto.User;
import com.exp.patterns.singleton.EagerSingleton;
import com.exp.patterns.singleton.EnumSingleton;

@SpringBootApplication
public class ExperimentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperimentsApplication.class, args);
		
		EagerSingleton es1 = EagerSingleton.getInstance();
		EagerSingleton es2 = EagerSingleton.getInstance();
		boolean escheck = es1==es2;
		EagerSingleton es3 = null;
		
		try {
			Constructor<EagerSingleton> constructor = EagerSingleton.class.getDeclaredConstructor(new Class[0]);
			constructor.setAccessible(true);
			es3 = (EagerSingleton) constructor.newInstance();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean escheckRef = es1==es3;
		System.out.println("eager check :" + escheck);
		System.out.println("eager check ref :" + escheckRef);
		
		EnumSingleton.INATANCE.set("charith", 12);;
		EnumSingleton.INATANCE.process();
		
		User u1 = User.builder().age(30).name("Charith").postalCode("23").build();
		User u2 = User.builder().age(24).name("Amara").postalCode("24").build();
		User u3 = User.builder().age(25).name("Tharindu").postalCode("34").build();
		User u4 = User.builder().age(25).name("Thameera").postalCode("34").build();
		List<User> userList = new ArrayList();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		
		Collections.sort(userList, (x1 ,x2)-> x1.getName().compareTo( x2.getName()));
		
	}
	
	interface Condition {
		
		boolean condition(User user);
	}

}
