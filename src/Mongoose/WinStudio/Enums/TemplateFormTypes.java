package Mongoose.WinStudio.Enums;

public enum TemplateFormTypes {
  MultiView(0L),
  GridOnly(1L),
  Query(2L),
  BuildFromScratch(3L),
  ;
  private long numVal;

  TemplateFormTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
