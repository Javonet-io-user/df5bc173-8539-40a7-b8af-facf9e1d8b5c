package Mongoose.WinStudio.Enums;

public enum UndoRedoState {
  Undo(1L),
  Redo(2L),
  ;
  private long numVal;

  UndoRedoState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
