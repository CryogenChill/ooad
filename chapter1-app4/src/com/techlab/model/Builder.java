package com.techlab.model;

public enum Builder { 

  FENDER, MARTIN, GIBSON, PRS, ANY;

  public String toString() {
    switch(this) {
      case FENDER:   return "Fender";
      case MARTIN:   return "Martin";
      case GIBSON:   return "Gibson";
      case PRS :     return "PRS";
      default:       return "Unspecified";
    }
  }
}
