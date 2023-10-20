file://<WORKSPACE>/src/main/java/dev/cgomezu/designprinciples/solid/SolidApplication.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
offset: 725
uri: file://<WORKSPACE>/src/main/java/dev/cgomezu/designprinciples/solid/SolidApplication.java
text:
```scala
package dev.cgomezu.designprinciples.solid;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.cgomezu.designprinciples.solid.good.File;
import dev.cgomezu.designprinciples.solid.good.FileLoader;
import dev.cgomezu.designprinciples.solid.good.FileSaver;

@SpringBootApplication
public class SolidApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SolidApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Bad example for SRP
		dev.cgomezu.designprinciples.solid.bad.File file1 = new de@@v.cgomezu.designprinciples.solid.bad.File("file1", 100, "txt");

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

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:329)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator