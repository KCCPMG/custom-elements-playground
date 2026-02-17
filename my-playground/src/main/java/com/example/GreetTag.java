// Java Tag Handler
package com.example;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class GreetTag extends SimpleTagSupport {
  private String user;

  // Setter for the attribute 'user'
  public void setUser(String user) {
    this.user = user;
  }

  @Override
  public void doTag() throws JspException, IOException {
    getJspContext().getOut().write("Hello, " + user + "! This is a custom tag.");
  }
}