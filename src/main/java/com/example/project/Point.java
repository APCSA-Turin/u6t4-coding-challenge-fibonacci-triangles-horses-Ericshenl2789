package com.example.project;

public class Point {
  private int x;
  private int y;
 
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
 
  // Returns distance between this Point object and another Point object
  public double distanceTo(Point other) {
      return Math.sqrt(Math.pow((other.x - x), 2) + Math.pow(other.y - y, 2));
  }

  public int getX() {
      return x;
  }


  public int getY() {
      return y;
  }


  public void setX(int x) {
      this.x = x;
  }
 
  public void setY(int y) {
      this.y = y;
  }


  // Returns a string in the format: (x, y)
  public String pointInfo() {
      return "(" + x + ", " + y + ")";
  }
}
