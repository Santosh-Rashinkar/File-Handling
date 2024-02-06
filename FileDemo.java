package com.prowings.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("abc.txt");

		if (file.createNewFile())

			System.out.println("File created successfully!!");
		else

			System.out.println("File already present!!");

//			if (file.delete())
//
//				System.out.println("file deleted successfullly");
//
//			else
//
//				System.out.println("File not present");

//			file.mkdir();

		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		System.out.println(file.exists());

//		file.setReadOnly();
		System.out.println(file.canWrite());
		System.out.println(file.lastModified());

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");

		FileReader fr = new FileReader(file);

		int i;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		try {

			FileWriter fw = new FileWriter(file);
			fw.append(" Hello World");
			fw.close();

		} catch (IOException e) {

			System.out.println("Exception Occurd Successfully");
		}
	}
}
