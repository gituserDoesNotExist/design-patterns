package de.ase.designpatterns.decorator;

public abstract class TreeDecorator implements ChristmasTree {
	private ChristmasTree tree;

	public TreeDecorator(ChristmasTree tree) {
		this.tree = tree;
	}

	public String decorate() {
		return tree.decorate();
	}
}