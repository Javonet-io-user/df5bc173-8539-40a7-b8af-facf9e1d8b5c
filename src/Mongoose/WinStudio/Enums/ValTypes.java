package Mongoose.WinStudio.Enums;

public enum ValTypes {
  ALPHANUM(0L),
  ALPHA(1L),
  NUMERIC(2L),
  DATE(3L),
  TIME(4L),
  DATETIME(5L),
  CURRENCY(6L),
  OLE(7L),
  DLL(8L),
  IN_COLLECTION(9L),
  IN_LISTCACHE(10L),
  SCRIPT(11L),
  IN_INLINELIST(12L),
  LISTCACHE_ONLY(13L),
  INLINE_SCRIPT(14L),
  GEN_APP_EVENT(15L),
  NONE(-1L),
  ;
  private long numVal;

  ValTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
