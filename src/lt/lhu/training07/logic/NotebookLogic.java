package lt.lhu.training07.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lt.lhu.training07.dao.NotebookDao;
import lt.lhu.training07.entity.Note;

public class NotebookLogic {
	private final NotebookDao dao = new NotebookDao();

	public void add(Note n) {

		dao.save(n);
	}

	public void add(String title, String content) {

		Note n = new Note(title, content);

		dao.save(n);
	}

	public List<Note> find(String text) {
		List<Note> result = new ArrayList<Note>();

		for (Note n : dao.allNotes()) {
			if (isTextInNote(n, text)) {
				result.add(n);
			}
		}

		return result;

	}

	private boolean isTextInNote(Note n, String text) {
		return n.getTitle().contains(text) || n.getContent().contains(text);
	}

	public List<Note> find(Date date) {
		List<Note> result = new ArrayList<Note>();

		for (Note n : dao.allNotes()) {
			if (n.getD().getDay() == date.getDay() && n.getD().getMonth() == date.getMonth()
					&& n.getD().getYear() == date.getYear()) {
				result.add(n);
			}
		}
		return result;

	}

	public List<Note> allNotes() {
		return dao.allNotes();
	}

}
