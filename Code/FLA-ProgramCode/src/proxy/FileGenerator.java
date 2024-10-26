package proxy;

import model.File;

public class FileGenerator implements Generator {

	public FileGenerator() {
		start();
	}

	private void start() {
		System.out.println("Get ready to begin the file generating process...");
	}

	@Override
	public void generate(File file) {
		// TODO Auto-generated method stub
		System.out.println("Generating file: " + file.getPathName());
	}

}
