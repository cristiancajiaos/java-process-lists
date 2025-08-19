package com.example.javaprocesslists.entity;

import java.util.List;

public class ListNumber {

  private List<Long> numbersList;
  private int nTimes;

  public ListNumber() {
  }

  public ListNumber(List<Long> numbersList, int nTimes) {
    this.numbersList = numbersList;
    this.nTimes = nTimes;
  }

  public List<Long> getNumbersList() {
    return numbersList;
  }

  public void setNumbersList(List<Long> numbersList) {
    this.numbersList = numbersList;
  }

  public int getnTimes() {
    return nTimes;
  }

  public void setnTimes(int nTimes) {
    this.nTimes = nTimes;
  }
}
