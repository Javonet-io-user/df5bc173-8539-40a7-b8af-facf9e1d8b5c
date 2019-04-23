package Mongoose.WinStudio.Enums;

public enum FormFlags {
  NONE(0L),
  HORIZONTAL_SPLITTER(1L),
  VERTICAL_SPLITTER(2L),
  MODAL(4L),
  COLLECTION_COMMIT(8L),
  PANE_ZERO_HIDDEN(16L),
  PANE_ONE_HIDDEN(32L),
  NO_SPLITTER_VSCROLL_PANE_0(64L),
  NO_SPLITTER_HSCROLL_PANE_0(128L),
  NO_SPLITTER_VSCROLL_PANE_1(256L),
  NO_SPLITTER_HSCROLL_PANE_1(512L),
  CUSTOM_FORM(1024L),
  NO_CLOSEBOX(2048L),
  NO_MINMAX(4096L),
  NO_WALLPAPER_PANE_0(8192L),
  NO_WALLPAPER_PANE_1(16384L),
  ;
  private long numVal;

  FormFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
