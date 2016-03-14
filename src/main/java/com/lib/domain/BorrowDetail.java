package com.lib.domain; /***********************************************************************
 * Module:  BorrowDetail.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class BorrowDetail
 ***********************************************************************/

import java.util.*;

/** @pdOid 28f79a1c-4ba4-45b8-b04f-dec959d0db30 */
public class BorrowDetail {
   /** @pdOid 0d2b17d5-607e-4d4a-9f7c-a665e82836f9 */
   public long bdId;
   /** @pdOid 2c658197-5901-42e4-84b4-1139ab5c791a */
   public Date bDate;
   /** @pdOid 193e7d8f-f861-4149-8d07-c8509eaf0034 */
   public Date rDate;
   
   /** @pdRoleInfo migr=no name=Borrow assc=borrowDetail mult=0..1 side=A */
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