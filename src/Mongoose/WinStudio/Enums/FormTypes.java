package Mongoose.WinStudio.Enums;

public enum FormTypes {
  Detail(0L),
  EditCollection(1L),
  Query(2L),
  EditColSmall(3L),
  EditColRight(4L),
  ;
  private long numVal;

  FormTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
