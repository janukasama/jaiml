/*
    jaiml - java AIML library
    Copyright (C) 2009  Kim Sullivan
    
    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.
    
    You should have received a copy of the GNU General Public License
    along with this program; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package aiml.context.data;

import java.util.EmptyStackException;

import aiml.environment.Environment;

/**
 * An InputDataSource is a special DataSource that provides additional
 * capabilities to a normal DataSource, to facilitate recursive calls.
 * 
 * @author Kim Sullivan
 * 
 * @param <T>
 */
public interface InputDataSource<T> extends DataSource<T> {
  /**
   * Pushes a new input on the stack.
   * 
   * @param input
   *          The value of the input.
   */
  public void push(String input, Environment e);

  /**
   * Pops a value from the stack.
   * 
   * @throws EmptyStackException
   *           - if the stack is empty
   */
  public void pop(Environment e) throws EmptyStackException;
}
