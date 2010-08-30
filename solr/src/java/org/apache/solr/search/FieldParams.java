package org.apache.solr.search;
/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A class to hold "phrase slop" and "boost" parameters for pf, pf2, pf3 parameters
 **/
public class FieldParams {
  public int wordGrams;  // make bigrams if 2, trigrams if 3, or all if 0
  public Integer slop;  // null defaults to ps parameter
  public float boost;
  public String field;
  public FieldParams(String field, int wordGrams, Integer slop, float boost) {
    this.wordGrams = wordGrams;
    this.slop      = slop;
    this.boost     = boost;
    this.field     = field;
  }
}
// in SOLR-2058 Yonik suggested "make bigrams if 2, trigrams if 3, or all if MAX_INT"
// but ISTM addShingledPhraseQueries already used a convenstion of 'all if 0'.
