package Mongoose.WinStudio.Enums;

public enum ComponentBaseFlags {
  NONE(0L),
  READ_ONLY(1L),
  ;
  private long numVal;

  ComponentBaseFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
