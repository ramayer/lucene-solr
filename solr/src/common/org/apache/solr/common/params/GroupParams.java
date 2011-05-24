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

package org.apache.solr.common.params;

/**
 * Group parameters
 */
public interface GroupParams {
  public static final String GROUP = "group";

  public static final String GROUP_QUERY = GROUP + ".query";
  public static final String GROUP_FIELD = GROUP + ".field";
  public static final String GROUP_FUNC = GROUP + ".func";
  public static final String GROUP_SORT = GROUP + ".sort";

  /** the limit for the number of documents in each group */
  public static final String GROUP_LIMIT = GROUP + ".limit";
  /** the offset for the doclist of each group */
  public static final String GROUP_OFFSET = GROUP + ".offset";

  /** treat the first group result as the main result.  true/false */
  public static final String GROUP_MAIN = GROUP + ".main";

  /** treat the first group result as the main result.  true/false */
  public static final String GROUP_FORMAT = GROUP + ".format";
}

