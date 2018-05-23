package fooddemo;

import org.springframework.context.support.AbstractApplicationContext;

import com.example.demo.Fruit;

public class HelloFood {

	public static void main(String[] args) {
		 
		//Fruit f= new Fruit();
		//Vegetable v= new Vegetable();
		
		AbstractApplicationContext appContext= new org.springframework.context.support.FileSystemXmlApplicationContext("appContext.xml");
		
		Fruit myFruit= appContext.getBean("fruit", Fruit.class);
		
		System.out.println(f.talkAboutYourself());
		System.out.println(v.talkAboutYourself());

	}

}
