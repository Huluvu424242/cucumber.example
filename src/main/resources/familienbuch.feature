Feature: Erstellen eines Familienbuches
		Um ein Familienbuch erstellen zu können
		als Genealoge
		Möchte ich meine Vorfahren erfassen
		und ein Familienbuch generieren können.

		@german @deutsch
        Scenario: Ahnen erfassen
                Gegeben ist die Datei family.gedcoml
                Wenn ein Abschnitt beginnt mit Person { und endet mit }
                Dann soll eine Person ins Familienbuch aufgenommen werden.