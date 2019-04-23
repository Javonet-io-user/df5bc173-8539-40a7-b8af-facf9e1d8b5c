package Mongoose.WinStudio.Enums;

public enum ComponentBindings {
  NONE(0L),
  STANDARD_OBJECT(1L),
  OTHER_OBJECT(2L),
  FORM_COLLECTION(3L),
  SUB_COLLECTION(4L),
  OBJECT_ERROR(5L),
  VARIABLE(6L),
  FILTER(7L),
  SECONDARY_COLLECTION(8L),
  COLLECTION_ID(9L),
  GRAPH(10L),
  GRAPH_XLIMIT(11L),
  GRAPH_NEXT(12L),
  GRAPH_PREVIOUS(13L),
  GRAPH_REDRAW(14L),
  GRAPH_PROPERTIES(15L),
  TREE(16L),
  DIAGRAM(17L),
  ;
  private long numVal;

  ComponentBindings(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
