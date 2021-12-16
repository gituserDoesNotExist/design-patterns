package de.ase.designpatterns.decorator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import de.ase.designpatterns.decorator.BubbleLights;
import de.ase.designpatterns.decorator.ChristmasTree;
import de.ase.designpatterns.decorator.ChristmasTreeImpl;
import de.ase.designpatterns.decorator.Tinsel;

public class ChristmasTreeTest {

	@Test
	public void testDecorate() throws Exception {
		ChristmasTree decoratedTree = new Tinsel(new BubbleLights(new ChristmasTreeImpl()));

		assertThat(decoratedTree.decorate()).isEqualTo("Christmas tree with Bubble Lights with Tinsel");
	}

}
