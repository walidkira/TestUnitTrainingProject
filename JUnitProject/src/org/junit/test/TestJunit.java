package org.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	/*
	 * 
	 * ss
	 */
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}