package de.ase.designpatterns.command;

public class OpenTextFileOperation implements TextFileOperation {

	private TextFile textFile;

	public OpenTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	public String execute() {
		return textFile.open();
	}
}