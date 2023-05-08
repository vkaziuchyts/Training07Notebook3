package lt.lhu.training07.sourse;

import lt.lhu.training07.entity.Notebook;

public final class NotebookProvider {
	private static NotebookProvider instance = null;

	private Notebook noteBook;

	private NotebookProvider() {
		noteBook = new Notebook();
	}

	public static NotebookProvider getInstance() {
		if (instance == null) {
			instance = new NotebookProvider();
		}

		return instance;
	}

	public Notebook getNotebook() {
		return noteBook;
	}

}
