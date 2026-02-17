package com.example.models;

import java.util.ArrayList;

public class TableColumns {
  private ArrayList<TableColumn> alTableColumns;

  public TableColumns(ArrayList<TableColumn> alTableColumns) {
    this.alTableColumns = alTableColumns;
  }

  public void addTableColumn(TableColumn newColumn) {
    this.alTableColumns.add(newColumn);
  }

  public ArrayList<TableColumn> getTableColumns() {
    return this.alTableColumns;
  }

}