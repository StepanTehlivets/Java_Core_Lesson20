package ua.academy.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Methods {
	public static void annotatedFields(Class<?> someClass, File file) throws IOException {
		OutputStream outStream = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(outStream);
		Field[] fields = someClass.getDeclaredFields();
		ArrayList<String> fieldsWithAnnotation = new ArrayList<>();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getAnnotation(FirstAnnotation.class) instanceof FirstAnnotation) {
				fieldsWithAnnotation
						.add(field.getAnnotatedType().toString() + field.getAnnotation(FirstAnnotation.class));

			}

		}
		oos.writeObject(fieldsWithAnnotation);
		oos.close();
		outStream.close();
	}

	public static Serializable deserialize(File file) throws IOException, ClassNotFoundException {
		InputStream inStream = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(inStream);
		Serializable object = (Serializable) ois.readObject();
		ois.close();
		inStream.close();

		return object;
	}

}
