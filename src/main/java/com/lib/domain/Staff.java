package com.lib.domain; /***********************************************************************
 * Module:  com.lib.domain.Staff.java
 * com.lib.domain.Author:  lanhnguyen
 * Purpose: Defines the Class com.lib.domain.Staff
 ***********************************************************************/

/** @pdOid 14992f78-2951-4dc3-9e17-1bbec498a1a3 */
public class Staff {
   /** @pdOid 784abfdc-36c8-4ac1-a88a-62aceea12d8e */
   public java.lang.String uUser;
   /** @pdOid febd86d7-83c0-4375-9eff-ffb72e29d6ec */
   public java.lang.String uPass;
   /** @pdOid a724ff6f-b9a2-4eb0-bb0c-f3c82bdf8cef */
   public java.lang.String uFullName;
   /** @pdOid d522d833-2917-4e3d-98e4-ee00145536a4 */
   public java.lang.String uAddress;
   /** @pdOid 273d8d07-c45b-43eb-b7d3-eb026c1f203e */
   public java.lang.String uEmail;
   /** @pdOid c8921587-a84e-4149-a03f-08190ad67c1e */
   public java.lang.String uTel;
   /** @pdOid 48910fbb-2d98-455a-bc51-11e43bdb81eb */
   public boolean uIsActive;
   
   /** @pdRoleInfo migr=no name=com.lib.domain.Borrow assc=userBorrow coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Borrow> borrow;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Borrow> getBorrow() {
      if (borrow == null)
         borrow = new java.util.HashSet<Borrow>();
      return borrow;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBorrow() {
      if (borrow == null)
         borrow = new java.util.HashSet<Borrow>();
      return borrow.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBorrow */
   public void setBorrow(java.util.Collection<Borrow> newBorrow) {
      removeAllBorrow();
      for (java.util.Iterator iter = newBorrow.iterator(); iter.hasNext();)
         addBorrow((Borrow)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBorrow */
   public void addBorrow(Borrow newBorrow) {
      if (newBorrow == null)
         return;
      if (this.borrow == null)
         this.borrow = new java.util.HashSet<Borrow>();
      if (!this.borrow.contains(newBorrow))
      {
         this.borrow.add(newBorrow);
         newBorrow.setStaff(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBorrow */
   public void removeBorrow(Borrow oldBorrow) {
      if (oldBorrow == null)
         return;
      if (this.borrow != null)
         if (this.borrow.contains(oldBorrow))
         {
            this.borrow.remove(oldBorrow);
            oldBorrow.setStaff((Staff)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBorrow() {
      if (borrow != null)
      {
         Borrow oldBorrow;
         for (java.util.Iterator iter = getIteratorBorrow(); iter.hasNext();)
         {
            oldBorrow = (Borrow)iter.next();
            iter.remove();
            oldBorrow.setStaff((Staff)null);
         }
      }
   }

}