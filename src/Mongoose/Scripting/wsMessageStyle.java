package Mongoose.Scripting;

public enum wsMessageStyle {
  wsDefaultButton1(0L),
  wsOKCancel(1L),
  wsAbortRetryIgnore(2L),
  wsYesNoCancel(3L),
  wsYesNo(4L),
  wsRetryCancel(5L),
  wsCritical(16L),
  wsQuestion(32L),
  wsExclamation(48L),
  wsInformation(64L),
  wsDefaultButton2(256L),
  wsDefaultButton3(512L),
  wsDefaultButton4(768L),
  ;
  private long numVal;

  wsMessageStyle(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
