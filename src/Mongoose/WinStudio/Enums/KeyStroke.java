package Mongoose.WinStudio.Enums;

public enum KeyStroke {
  NONE(0L),
  CONTROL(1L),
  SHIFT(2L),
  CONTROL_SHIFT(4L),
  ;
  private long numVal;

  KeyStroke(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
