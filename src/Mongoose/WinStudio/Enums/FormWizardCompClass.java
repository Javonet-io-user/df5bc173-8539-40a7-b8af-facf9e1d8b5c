package Mongoose.WinStudio.Enums;

public enum FormWizardCompClass {
  NONE(0L),
  EDIT(1L),
  CHECKBOX(2L),
  DATECOMBO(3L),
  GRID(7L),
  ;
  private long numVal;

  FormWizardCompClass(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
