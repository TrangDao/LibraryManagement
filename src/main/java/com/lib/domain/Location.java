package com.lib.domain; /***********************************************************************
 * Module:  Location.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Location
 ***********************************************************************/

import java.util.*;

/** @pdOid 22879f1d-4127-44a7-b389-22dc4e6dc5e7 */
public class Location {
   /** @pdOid 141bfba2-a066-4671-95d8-c1292a8f1b81 */
   public long lId;
   /** @pdOid d32c019e-b0ad-4e5d-975d-379c1ea89f87 */
   public String lPosition;
   /** @pdOid 65a28629-a14d-4b73-abdc-e399f8bdcca9 */
   public int lStock;
   
   /** @pdRoleInfo migr=no name=Copy assc=copyLocation coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public Collection<Copy> copy;
   
   
   /** @pdGenerated default getter */
   public Collection<Copy> getCopy() {
      if (copy == null)
         copy = new HashSet<Copy>();
      return copy;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorCopy() {
      if (copy == null)
         copy = new HashSet<Copy>();
      return copy.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCopy */
   public void setCopy(Collection<Copy> newCopy) {
      removeAllCopy();
      for (Iterator iter = newCopy.iterator(); iter.hasNext();)
         addCopy((Copy)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCopy */
   public void addCopy(Copy newCopy) {
      if (newCopy == null)
         return;
      if (this.copy == null)
         this.copy = new HashSet<Copy>();
      if (!this.copy.contains(newCopy))
      {
         this.copy.add(newCopy);
         newCopy.setLocation(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCopy */
   public void removeCopy(Copy oldCopy) {
      if (oldCopy == null)
         return;
      if (this.copy != null)
         if (this.copy.contains(oldCopy))
         {
            this.copy.remove(oldCopy);
            oldCopy.setLocation((Location)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCopy() {
      if (copy != null)
      {
         Copy oldCopy;
         for (Iterator iter = getIteratorCopy(); iter.hasNext();)
         {
            oldCopy = (Copy)iter.next();
            iter.remove();
            oldCopy.setLocation((Location)null);
         }
      }
   }

}