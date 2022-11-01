package com.qac.corejava.oops.relations;

import com.qac.corejava.oops.relations.HasA.IsA.MythicSoc;
import com.qac.corejava.oops.relations.HasA.IsA.Library;
public class Testlabrary {

	public static void main(String []ak) {
		
		MythicSoc lib = new MythicSoc();
		lib.readingBook();
		
		Library l = new Library();
		l.readingBook("invisible man");
	}
}
