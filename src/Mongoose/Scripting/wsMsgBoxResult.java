package Mongoose.Scripting;

public enum wsMsgBoxResult {
  wsNone(0L),
  wsOK(1L),
  wsCancel(2L),
  wsAbort(3L),
  wsRetry(4L),
  wsIgnore(5L),
  wsYes(6L),
  wsNo(7L),
  ;
  private long numVal;

  wsMsgBoxResult(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
