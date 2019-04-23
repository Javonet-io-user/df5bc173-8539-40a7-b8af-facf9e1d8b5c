package Mongoose.WinStudio.Enums;

public enum GlobalObjectState {
  None(0L),
  New(1L),
  Modified(2L),
  Deleted(3L),
  ;
  private long numVal;

  GlobalObjectState(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
