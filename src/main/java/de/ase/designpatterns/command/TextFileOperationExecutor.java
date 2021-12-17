package de.ase.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

	private final List<TextFileOperation> textFileOperations = new ArrayList<TextFileOperation>();

	public String executeOperation(TextFileOperation textFileOperation) {
		textFileOperations.add(textFileOperation);
		return textFileOperation.execute();
	}
}