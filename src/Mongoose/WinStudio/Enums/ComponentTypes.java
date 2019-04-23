package Mongoose.WinStudio.Enums;

public enum ComponentTypes {
  Static(0L),
  Edit(1L),
  Combobox(2L),
  DropList(3L),
  List(4L),
  Checkbox(5L),
  Groupbox(6L),
  RadioButton(7L),
  Button(8L),
  DefButton(9L),
  MenuItem(10L),
  ToolbarButton(11L),
  Notebook(12L),
  NotebookTab(13L),
  Grid(14L),
  GridColumn(15L),
  Graph(16L),
  GraphSeries(17L),
  MultilineEdit(18L),
  Tree(19L),
  TreeBranch(20L),
  TreeLeaf(21L),
  Slider(22L),
  SpinButton(23L),
  FormPage(24L),
  ActivexControl(25L),
  DateCombo(26L),
  EnhancedCombo(27L),
  HyperlinkButton(38L),
  Browser(39L),
  CancelButton(40L),
  Diagram(41L),
  VerticalGrid(42L),
  VerticalGridElement(43L),
  None(-1L),
  ;
  private long numVal;

  ComponentTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
