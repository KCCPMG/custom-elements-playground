package com.example.models;

import org.json.JSONObject;

public class TableColumn {
  private String strHeaderText;
  private String strHeaderClass;
  private String strHeaderStyle;

  private String strDetailJSONKey;
  private String strDetailClass;
  private String strDetailStyle;

  private String strSortType; // change this to enum?


  // need to handle style

  public TableColumn(JSONObject jsonArg) {
    this.strHeaderText = jsonArg.optString("strHeaderText");
    this.strHeaderClass = jsonArg.optString("strHeaderClass");
    this.strDetailJSONKey = jsonArg.optString("strDetailJSONKey");
    this.strHeaderStyle = jsonArg.optString("strHeaderStyle");
    this.strDetailStyle = jsonArg.optString("strDetailStyle");
    this.strDetailClass = jsonArg.optString("strDetailClass");

  }

  public String getStrHeaderText() {
    return this.strHeaderText;
  }
  public String getStrHeaderClass() {
    return this.strHeaderClass;
  }
  public String getStrHeaderStyle() {
    return this.strHeaderStyle;
  }
  public String getStrDetailJSONKey() {
    return this.strDetailJSONKey;
  }
  public String getStrDetailClass() {
    return this.strDetailClass;
  }
  public String getStrDetailStyle() {
    return this.strDetailStyle;
  }
  public String getStrSortType() {
    return this.strSortType;
  }

}