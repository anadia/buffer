package org.anadiait.Buffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Buffer {
  private Queue buffer;
  private int capacity;
  int np = 0; //number of put operations
  int ng = 0; //number of get operations

  /**
   * Constructor
   * 
   * @param bufferSize
   */
  public Buffer(int bsize) {
    capacity = bsize;
    buffer = new LinkedList();
  }

  public void put(Object element) {
    if (buffer.size() == capacity)
      System.exit(-1);;

    System.out.println("Element inserted");

    buffer.add(element);
    np++;
  }

  public Object get() throws Exception {
    if (buffer.isEmpty())
      throw new Exception();

    Object value = buffer.remove();
    System.out.println("Element extracted");

    ng++;
    return value;
  }

  public int GetNumberOfElements() {
    return buffer.size();
  }

  public int get_number_of_holes() {
    return capacity - buffer.size();
  }

  public int getCapacity() { //gc = getCapacity
    return capacity;
  }

  public double getNumberOfOperations() {
    return np + ng;
  }
}
