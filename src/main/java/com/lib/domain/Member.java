package com.lib.domain; /***********************************************************************
 * Module:  com.lib.domain.Member.java
 * com.lib.domain.Author:  lanhnguyen
 * Purpose: Defines the Class com.lib.domain.Member
 ***********************************************************************/

/** @pdOid 5daa7c5f-74cf-4e0a-b38a-43e2f6eebcf5 */
public class Member {
   /** @pdOid 155f446b-a0b6-4a9b-94a1-fcd9c131bf89 */
   public long mId;
   /** @pdOid 5edb7e4d-8f8f-42c0-b1f4-fcab6c717d48 */
   public java.lang.String mName;
   /** @pdOid 1a568792-0e4d-4ce7-b990-eac8b01295ee */
   public java.lang.String mAddress;
   /** @pdOid 04099f63-2f6d-413f-864a-fd0df47beea4 */
   public java.lang.String mTel;
   /** @pdOid c8b12d36-ef71-45ad-8689-a301f656ed09 */
   public java.lang.String mGender;
   /** @pdOid 5024505a-2358-4db5-aa41-e1b6158da45c */
   public java.lang.String mEmail;
   /** @pdOid bc87f325-de9a-418c-babf-62e7f77718bf */
   public boolean mIsActive;
   
   /** @pdRoleInfo migr=no name=com.lib.domain.Borrow assc=memberBrrow coll=java.util.Collection impl=java.util.HashSet mult=1..* */
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
         newBorrow.setMember(this);      
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
            oldBorrow.setMember((Member)null);
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
            oldBorrow.setMember((Member)null);
         }
      }
   }

}