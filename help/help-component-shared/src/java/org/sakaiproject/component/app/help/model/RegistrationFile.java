/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/help/tags/sakai-2.9.1/help-component-shared/src/java/org/sakaiproject/component/app/help/model/RegistrationFile.java $
 * $Id: RegistrationFile.java 110562 2012-07-19 23:00:20Z ottenhoff@longsight.com $
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.component.app.help.model;

/**
 * registration file
 * @version $Id: RegistrationFile.java 110562 2012-07-19 23:00:20Z ottenhoff@longsight.com $
 */
public class RegistrationFile
{
  private String name;

  /**
   * get name
   * @return Returns the name.
   */
  public String getName()
  {
    return name;
  }

  /**
   * set name
   * @param name The name to set.
   */
  public void setName(String name)
  {
    this.name = name;
  }
}


