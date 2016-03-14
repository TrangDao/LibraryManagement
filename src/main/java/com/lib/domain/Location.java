package com.lib.domain; /***********************************************************************
 * Module:  com.lib.domain.Location.java
 * com.lib.domain.Author:  lanhnguyen
 * Purpose: Defines the Class com.lib.domain.Location
 ***********************************************************************/

/** @pdOid ca2df87f-662b-4a44-85b1-e95d56b33e55 */
public class Location {
   /** @pdOid 7cb79104-8870-4997-b10c-ea3184ede23d */
   public long lId;
   /** @pdOid 0b475071-ab97-4882-b1a5-8710477847ad */
   public java.lang.String lPosition;
   /** @pdOid e9602946-69c9-405b-906f-cb6105efdacf */
   public int lStock;
   
   /** @pdRoleInfo migr=no name=com.lib.domain.Copy assc=copyLocation coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Copy> copy;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Copy> getCopy() {
      if (copy == null)
         copy = new java.util.HashSet<Copy>();
      return copy;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCopy() {
      if (copy == null)
         copy = new java.util.HashSet<Copy>();
      return copy.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCopy */
   public void setCopy(java.util.Collection<Copy> newCopy) {
      removeAllCopy();
      for (java.util.Iterator iter = newCopy.iterator(); iter.hasNext();)
         addCopy((Copy)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCopy */
   public void addCopy(Copy newCopy) {
      if (newCopy == null)
         return;
      if (this.copy == null)
         this.copy = new java.util.HashSet<Copy>();
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
         for (java.util.Iterator iter = getIteratorCopy(); iter.hasNext();)
         {
            oldCopy = (Copy)iter.next();
            iter.remove();
            oldCopy.setLocation((Location)null);
         }
      }
   }

}