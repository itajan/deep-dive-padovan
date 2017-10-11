/**
 * 
 */
package edu.cnm.deepdive.implementations;

import java.math.BigInteger;
import java.util.Iterator;

/**
 * @author itajan
 *
 */
public class Padovan implements Iterable<BigInteger> {
  
  @Override
  public Iterator<BigInteger> iterator() {
       
    return new Iterator<BigInteger>() {

      private BigInteger minusTwo = BigInteger.ZERO;
      private BigInteger previous = BigInteger.ONE;
      private BigInteger current = BigInteger.ZERO;
          
      @Override
      public boolean hasNext() {
        return true;
      }

      @Override
      public BigInteger next() {
        BigInteger next = minusTwo.add(previous);
        minusTwo = previous;
        previous = current;
        current = next;
        return current;
      }
    };
  }
}

