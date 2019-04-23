package Mongoose.WinStudio.Enums;

public enum ScopeTypes {
  SYMIX_DEFAULT(0L),
  SITE_DEFAULT(1L),
  GROUP(2L),
  USER(3L),
  ;
  private long numVal;

  ScopeTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
