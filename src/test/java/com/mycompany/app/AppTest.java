package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;
/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
  //  public void testApp()
   // {
    //    assertTrue( true );
   // }

    /*public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals(new App().reverseArray(array,reverse,array.size(),result).charAt(0),array.get(array.size()-1));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals(new App().reverseArray(array,reverse,array.size(),result).charAt(result.length()-1),array.get(0));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array,reverse,array.size(),result));
    }

    public void testNull() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals(new App().reverseArray(array,reverse,array.size(),result).replaceAll(" ","").length(),array.size());
    }

    public void testResult(){
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertEquals(new App().reverseArray(array,reverse,array.size(),result).length(),2*array.size());
    }*/



}
