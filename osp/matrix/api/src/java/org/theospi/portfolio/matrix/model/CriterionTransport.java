/**********************************************************************************
* $URL: https://source.sakaiproject.org/svn/osp/tags/sakai-2.9.1/matrix/api/src/java/org/theospi/portfolio/matrix/model/CriterionTransport.java $
* $Id: CriterionTransport.java 59678 2009-04-03 23:20:50Z arwhyte@umich.edu $
***********************************************************************************
*
 * Copyright (c) 2005, 2006, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*
**********************************************************************************/
package org.theospi.portfolio.matrix.model;

/**
 * @author rpembry
 */
public class CriterionTransport extends AbstractLabel implements Label {
   
   public CriterionTransport() {}
   
   public CriterionTransport(Criterion criterion) {
      this.id = criterion.getId();
      this.description = criterion.getDescription();
      this.color = criterion.getColor();
      this.textColor = criterion.getTextColor();
   }

   /* (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   public boolean equals(Object other) {
      if (other == this) return true;
      if (other == null || !(other instanceof CriterionTransport)) return false;
      CriterionTransport otherCriterion = (CriterionTransport) other;
      return otherCriterion.getDescription().equals(this.getDescription());
   }

   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
      String hashString = this.getDescription();
      return hashString.hashCode();
   }
}
