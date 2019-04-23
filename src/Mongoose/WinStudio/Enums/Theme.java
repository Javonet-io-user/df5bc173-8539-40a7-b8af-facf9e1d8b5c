package Mongoose.WinStudio.Enums;

public enum Theme {
  CLASSIC(0L),
  CLEAR(1L),
  ;
  private long numVal;

  Theme(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
