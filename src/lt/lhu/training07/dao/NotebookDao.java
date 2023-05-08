package lt.lhu.training07.dao;

import java.util.List;

import lt.lhu.training07.entity.Note;
import lt.lhu.training07.entity.Notebook;
import lt.lhu.training07.sourse.NotebookProvider;

public class NotebookDao {

	private final NotebookProvider provider = NotebookProvider.getInstance();
	private final Notebook nb = provider.getNotebook();

	public void save(Note n) {
		nb.setNotes(n);
	}

	public List<Note> allNotes() {
		return nb.getNotes();
	}
}
