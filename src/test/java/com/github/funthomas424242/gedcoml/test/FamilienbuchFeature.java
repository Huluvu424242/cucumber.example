package com.github.funthomas424242.gedcoml.test;

import cuke4duke.annotation.I18n.DE.Gegebensei;
import cuke4duke.annotation.I18n.DE.Dann;
import cuke4duke.annotation.I18n.DE.Wenn;
import cuke4duke.annotation.I18n.DE.Und;
import static junit.framework.Assert.assertEquals;

@SuppressWarnings({ "UnusedDeclaration" })
public class FamilienbuchFeature {

	private String fileName;
	private String name;

	@Gegebensei("^die Datei ([A-z]*)$")
	public void theActionIs(String fileName) {
		this.fileName = fileName;
	}

	@Wenn("^ein Abschnitt beginnt mit Person \\{ ([A-z]*)$")
	@Und("endet mit \\}")
	public void theSubjectIs(String name) {
		this.name = name;
	}

	@Dann("^soll eine Person ([^\\.]*).$ ins Familienbuch aufgenommen werden. ")
	public void theGreetingIs(String name) {
		assertEquals(String.format("%s, %s", fileName, this.name), name);
	}
}