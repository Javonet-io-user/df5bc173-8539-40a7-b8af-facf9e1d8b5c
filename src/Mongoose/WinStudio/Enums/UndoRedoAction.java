package Mongoose.WinStudio.Enums;

public enum UndoRedoAction {
  SetProperty(0L),
  Resize(1L),
  Move(2L),
  Cut(3L),
  Paste(4L),
  Create(5L),
  Delete(6L),
  Format(7L),
  ;
  private long numVal;

  UndoRedoAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
