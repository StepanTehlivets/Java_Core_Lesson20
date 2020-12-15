package ua.academy.lgs;

import java.io.File;
import java.io.IOException;



public class Application {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("SerializedFields");
		Methods.annotatedFields(Book.class, file);
		System.out.println(Methods.deserialize(file));

	}
}
