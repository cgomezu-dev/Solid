package dev.cgomezu.designprinciples.solid.srp;

import dev.cgomezu.designprinciples.solid.srp.good.File;
import dev.cgomezu.designprinciples.solid.srp.good.FileLoader;
import dev.cgomezu.designprinciples.solid.srp.good.FileSaver;

public class MainSRP {
  
    public static void runSample() {
        // Bad example for SRP
		dev.cgomezu.designprinciples.solid.srp.bad.File file1 = new dev.cgomezu.designprinciples.solid.srp.bad.File("file1", 100, "txt");

		file1.save();
		file1.load();

		// Good example for SRP
		File file = new File("file1", 100, "txt");

		FileSaver fileSaver = new FileSaver();
		fileSaver.save(file);

		FileLoader fileLoader = new FileLoader();
		fileLoader.load(file);
    }
}
