package Mongoose.WinStudio.Enums;

public enum CollectionOperations {
  None(0L),
  Refresh(1L),
  New(2L),
  Add(4L),
  Save(8L),
  Delete(16L),
  Navigate(32L),
  Copy(64L),
  Filter(128L),
  Notes(256L),
  Graph(512L),
  Validate(1024L),
  SpreadsheetDisabled(2048L),
  ;
  private long numVal;

  CollectionOperations(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
