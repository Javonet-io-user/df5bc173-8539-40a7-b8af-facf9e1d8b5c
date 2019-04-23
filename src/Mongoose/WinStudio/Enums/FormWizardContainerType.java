package Mongoose.WinStudio.Enums;

public enum FormWizardContainerType {
  DEFAULT(0L),
  NOTEBOOK(1L),
  FORM_PAGE(2L),
  ;
  private long numVal;

  FormWizardContainerType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
