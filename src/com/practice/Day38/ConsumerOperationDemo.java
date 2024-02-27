package com.practice.Day38;

import java.util.function.Consumer;

class Movie {
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
}

public class ConsumerOperationDemo {
	public static void main(String[] args) {
		Consumer<Movie> c1 = a -> System.out.println(a.name + " Ready to Release!");
		Consumer<Movie> c2 = a -> System.out.println(a.name + " Release but Flopped..");
		Consumer<Movie> c3 = a -> System.out.println(a.name + " New Movie Will be Released..");
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
	Movie m =  new Movie("Spider");  
		cc.accept(m);
	}
}
