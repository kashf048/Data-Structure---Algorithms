package com.kashfabbas;

public class TextBox {    // this class are 3 member field, setText, clear
  public String text = "";   // field

  public void setText(String text) {
    this.text = text;   // this is a reference of current object
  }

  public void clear() {
    text = "";
//    this.text = "";   // don't use this keyword
  }
}
