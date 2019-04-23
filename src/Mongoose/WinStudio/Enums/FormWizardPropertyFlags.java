package Mongoose.WinStudio.Enums;

public enum FormWizardPropertyFlags {
  NONE(0L),
  DETAIL_GRID(1L),
  QUERY_CRITERIA_ADDITIONAL(2L),
  QUERY_RESULTS(4L),
  ;
  private long numVal;

  FormWizardPropertyFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
