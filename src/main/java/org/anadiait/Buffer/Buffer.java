package org.anadiait.Buffer;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
  private Queue<Object> queueBuffer; // rename buffer to queueBuffer
  private int capacity;
  int numberPutOperation = 0; // number of put operations numberPutOperations = np (old)
  int numberGetOperations = 0; //number of get operations numberGetOperations = ng (old)

  /**
   * Constructor
   * 
   * @param bufferSize
   */
  public Buffer(int bufferSize) { // bufferSize = bsize (old)
    capacity = bufferSize;
    queueBuffer = new LinkedList<Object>();
  }

  public void put(Object element) {
    if (queueBuffer.size() == capacity)
      System.exit(-1);;

    System.out.println("Element inserted");

    queueBuffer.add(element);
    numberPutOperation++;
  }

  public Object get() throws Exception {
    if (queueBuffer.isEmpty())
      throw new Exception();

    Object value = queueBuffer.remove();
    System.out.println("Element extracted");

    numberGetOperations++;
    return value;
  }

  public int GetNumberOfElements() {
    return queueBuffer.size();
  }

  public int get_number_of_holes() {
    return capacity - queueBuffer.size();
  }

  public int getCapacity() { // getCapacity = gc (old)
    return capacity;
  }

  public double getNumberOfOperations() {
    return numberPutOperation + numberGetOperations;
  }
}
