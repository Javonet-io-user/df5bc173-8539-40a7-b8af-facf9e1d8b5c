package Mongoose.WinStudio.Enums;

public enum WSImeMode {
  Inherit(0L),
  NoControl(1L),
  On(2L),
  Off(3L),
  Disable(4L),
  Hiragana(5L),
  Katakana(6L),
  KatakanaHalf(7L),
  AlphaFull(8L),
  Alpha(9L),
  HangulFull(10L),
  Hangul(11L),
  Close(12L),
  OnHalf(13L),
  ;
  private long numVal;

  WSImeMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
