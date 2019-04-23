package Mongoose.WinStudio.Enums;

public enum ComponentFlags {
  NONE(0L),
  SPLITTER_PANE_1(1L),
  NO_SCROLL_NOTEBOOK(2L),
  LIST_SORT(4L),
  GROUP(8L),
  LIST_MULTISELECT(16L),
  VALIDATE_IMMEDIATELY(32L),
  STATIC_FRAME(64L),
  GLUE_RIGHT(128L),
  GLUE_BOTTOM(256L),
  REQUIRED(512L),
  NO_CLEAR_ON_NEW(1024L),
  UPPERCASE(2048L),
  NO_FILTER_IN_PLACE(4096L),
  READ_ONLY_FOR_EXISTING(8192L),
  READ_ONLY_FOR_NEW(16384L),
  ENABLE_ON_NON_MOD_OBJ(32768L),
  ENABLE_ON_REQ_DATA_ENTERED(65536L),
  TBD(131072L),
  HTML_BLEND(262144L),
  NO_TAB_STOP(524288L),
  COMBO_AUTO_COMPLETE(1048576L),
  VAL_ERR_STATUS_LINE(2097152L),
  GRID_DATE_COMBO(4194304L),
  READ_ONLY_FOR_DELETED(8388608L),
  MOVE_LOCKED(16777216L),
  SIZE_LOCKED(33554432L),
  NO_INTERPRET_CONTENTS(67108864L),
  INTERPRET_BOUND_CONTENTS(134217728L),
  GLUE_LEFT(268435456L),
  GLUE_TOP(536870912L),
  ;
  private long numVal;

  ComponentFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
