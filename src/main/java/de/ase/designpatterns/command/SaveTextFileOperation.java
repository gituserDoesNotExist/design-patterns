package de.ase.designpatterns.command;

public class SaveTextFileOperation implements TextFileOperation {

	private TextFile textFile;

	public SaveTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	public String execute() {
		return textFile.save();
	}
}