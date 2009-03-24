/*
    jaiml - java AIML library
    Copyright (C) 2004-2008  Kim Sullivan

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    You should have received a copy of the GNU General Public License
    along with this program; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package aiml.text;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A very simple "sentence" splitter that just separates the input according to
 * punctuation.
 * 
 * @author Kim Sullivan
 * 
 */
public class SimpleSentenceSplitter implements SentenceSplitter {
  
  HashSet<String> splitters;
  
  
  @Override
  public List<String> split(String text) {
    Pattern p = Pattern.compile("(\\.|\\?|;|!)", Pattern.UNICODE_CASE
        | Pattern.CASE_INSENSITIVE);
    ArrayList<String> result = new ArrayList<String>();
    Matcher m = p.matcher(text);
    int index = 0;
    while (m.find()) {
      result.add(text.substring(index, m.end()));
      index = m.end();
    }
    if (index != text.length()) {
      result.add(text.substring(index));
    }
    return result;
  }

}