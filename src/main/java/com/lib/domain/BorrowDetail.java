package com.lib.domain; /***********************************************************************
 * Module:  com.lib.domain.BorrowDetail.java
 * com.lib.domain.Author:  lanhnguyen
 * Purpose: Defines the Class com.lib.domain.BorrowDetail
 ***********************************************************************/

/** @pdOid 786946bf-965f-4e32-8971-3b9a31d62d52 */
public class BorrowDetail {
   /** @pdOid bc910482-bb11-48e3-82f4-19df51f64d2f */
   public long bdId;
   /** @pdOid accabb37-4a2c-437d-8b69-94d0f3616f9e */
   public java.util.Date bDate;
   /** @pdOid f76579c6-db85-4fef-867f-940fc16e12dd */
   public java.util.Date rDate;
   
   /** @pdRoleInfo migr=no name=com.lib.domain.Borrow assc=borrowDetail mult=0..1 side=A */
   public Borrow borrow;
   
   
   /** @pdGenerated default parent getter */
   public Borrow getBorrow() {
      return borrow;
   }
   
   /** @pdGenerated default parent setter
     * @param newBorrow */
   public void setBorrow(Borrow newBorrow) {
      if (this.borrow == null || !this.borrow.equals(newBorrow))
      {
         if (this.borrow != null)
         {
            Borrow oldBorrow = this.borrow;
            this.borrow = null;
            oldBorrow.removeBorrowDetail(this);
         }
         if (newBorrow != null)
         {
            this.borrow = newBorrow;
            this.borrow.addBorrowDetail(this);
         }
      }
   }

}