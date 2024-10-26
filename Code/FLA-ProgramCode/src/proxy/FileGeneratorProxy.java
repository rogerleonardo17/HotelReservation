package proxy;

import model.File;

public class FileGeneratorProxy implements Generator {

	private FileGenerator fg;

	public FileGeneratorProxy() {

	}

	@Override
	public void generate(File file) {
		// TODO Auto-generated method stub
		if (fg == null) {
			fg = new FileGenerator();
		}
		fg.generate(file);
	}

}
