package com.techlab.model;

public enum Wood { 

  MAHOGANY, MAPLE, ADIRONDACK, ALDER;

  public String toString() {
    switch(this) {
      case MAHOGANY:           return "Mahogany";
      case MAPLE:              return "Maple";
      case ADIRONDACK:         return "Adirondack";
      case ALDER:              return "Alder";
      default:  return "unspecified";
    }
  }
}
