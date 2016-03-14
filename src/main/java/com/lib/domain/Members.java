package com.lib.domain; /***********************************************************************
 * Module:  Members.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Members
 ***********************************************************************/

import java.util.*;

/** @pdOid 2bc16eb4-449f-4efa-a00f-9c5eee4c7135 */
public class Members {
   /** @pdOid ffbcad7c-4545-4eb8-9e61-13a2d4b96b52 */
   public long mId;
   /** @pdOid 246b2d42-c3d4-4d73-ab5b-6f65e2c82c85 */
   public String mName;
   /** @pdOid caf678f2-2056-4f29-99aa-26827820b15a */
   public String mAddress;
   /** @pdOid 04944126-ae0f-4079-b965-8d0caafc888f */
   public String mTel;
   /** @pdOid 5b66b46f-d19b-421d-a81f-cd9732c6e5d1 */
   public String mGender;
   /** @pdOid 022b3d40-41ba-40eb-b8e2-a30b19dc1d55 */
   public String mEmail;
   /** @pdOid 8affc249-3495-4f68-932c-ae40d2565d75 */
   public boolean mIsActive;
   
   /** @pdRoleInfo migr=no name=Borrow assc=memberBrrow coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public Collection<Borrow> borrow;
   
   
   /** @pdGenerated default getter */
   public Collection<Borrow> getBorrow() {
      if (borrow == null)
         borrow = new HashSet<Borrow>();
      return borrow;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorBorrow() {
      if (borrow == null)
         borrow = new HashSet<Borrow>();
      return borrow.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBorrow */
   public void setBorrow(Collection<Borrow> newBorrow) {
      removeAllBorrow();
      for (Iterator iter = newBorrow.iterator(); iter.hasNext();)
         addBorrow((Borrow)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBorrow */
   public void addBorrow(Borrow newBorrow) {
      if (newBorrow == null)
         return;
      if (this.borrow == null)
         this.borrow = new HashSet<Borrow>();
      if (!this.borrow.contains(newBorrow))
      {
         this.borrow.add(newBorrow);
         newBorrow.setMembers(this);      
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
            oldBorrow.setMembers((Members)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBorrow() {
      if (borrow != null)
      {
         Borrow oldBorrow;
         for (Iterator iter = getIteratorBorrow(); iter.hasNext();)
         {
            oldBorrow = (Borrow)iter.next();
            iter.remove();
            oldBorrow.setMembers((Members)null);
         }
      }
   }

}