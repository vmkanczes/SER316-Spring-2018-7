package main.java.memoranda.interfaces;

import main.java.memoranda.NoteList;

/*$Id: ProjectListener.java,v 1.3 2004/01/30 12:17:41 alexeya Exp $*/
public interface IProjectListener {
  void projectChange(IProject prj, NoteList nl, ITaskList tl, IResourcesList rl);
  void projectWasChanged();
}