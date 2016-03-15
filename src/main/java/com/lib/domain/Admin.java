package com.lib.domain; /***********************************************************************
 * Module:  Admin.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Admin
 ***********************************************************************/

import java.util.*;

/** @pdOid 179063cb-6ed6-48fb-bf2a-5870caed61bf */
public class Admin {
   /** @pdOid 4af6efad-fb3d-46a7-9e52-f30238f29763 */
   private String aRole;
   /** @pdOid 0f0bd97f-1e59-4514-a4f6-dd8ccf9da93a */
   private String aFirstname;
   /** @pdOid e2479ab3-7d91-4b83-838e-3a52274346e8 */
   private String aLastname;
   
   /** @pdOid 25dd6eaa-214e-4668-9ce3-deea171d5cd3 */
   public int aId;
   
   /** @pdRoleInfo migr=no name=Borrow assc=adminBorrow coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public Collection<Borrow> borrow;
   /** @pdRoleInfo migr=no name=ReturnBook assc=adminReturn coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public Collection<ReturnBook> returnBook;
   
   /** @pdOid 43828d4c-ebe8-4a80-a98f-f3790dae8189 */
   public int getAId() {
      return aId;
   }
   
   /** @param newAId
    * @pdOid 2ba01c6d-3f0b-4695-85e1-3725c0f997dc */
   public void setAId(int newAId) {
      aId = newAId;
   }
   
   /** @pdOid 83882b20-ad27-4269-917c-b66ed1ab4b9b */
   public String getARole() {
      return aRole;
   }
   
   /** @param newARole
    * @pdOid ff673361-27cb-4723-bcde-50ca060d3035 */
   public void setARole(String newARole) {
      aRole = newARole;
   }
   
   /** @pdOid 70026f32-2800-4969-ba2f-584058655853 */
   public String getAFirstname() {
      return aFirstname;
   }
   
   /** @param newAFirstname
    * @pdOid ed420b14-6c40-4887-9c65-af27fc9aba3b */
   public void setAFirstname(String newAFirstname) {
      aFirstname = newAFirstname;
   }
   
   /** @pdOid e23c8202-2826-4256-950b-98c71a1e5927 */
   public String getALastname() {
      return aLastname;
   }
   
   /** @param newALastname
    * @pdOid 53f86d31-43f7-4c91-9e2b-1c56ed9922ac */
   public void setALastname(String newALastname) {
      aLastname = newALastname;
   }
   
   
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
         this.borrow.add(newBorrow);
   }
   
   /** @pdGenerated default remove
     * @param oldBorrow */
   public void removeBorrow(Borrow oldBorrow) {
      if (oldBorrow == null)
         return;
      if (this.borrow != null)
         if (this.borrow.contains(oldBorrow))
            this.borrow.remove(oldBorrow);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBorrow() {
      if (borrow != null)
         borrow.clear();
   }
   /** @pdGenerated default getter */
   public Collection<ReturnBook> getReturnBook() {
      if (returnBook == null)
         returnBook = new HashSet<ReturnBook>();
      return returnBook;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorReturnBook() {
      if (returnBook == null)
         returnBook = new HashSet<ReturnBook>();
      return returnBook.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReturnBook */
   public void setReturnBook(Collection<ReturnBook> newReturnBook) {
      removeAllReturnBook();
      for (Iterator iter = newReturnBook.iterator(); iter.hasNext();)
         addReturnBook((ReturnBook)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReturnBook */
   public void addReturnBook(ReturnBook newReturnBook) {
      if (newReturnBook == null)
         return;
      if (this.returnBook == null)
         this.returnBook = new HashSet<ReturnBook>();
      if (!this.returnBook.contains(newReturnBook))
         this.returnBook.add(newReturnBook);
   }
   
   /** @pdGenerated default remove
     * @param oldReturnBook */
   public void removeReturnBook(ReturnBook oldReturnBook) {
      if (oldReturnBook == null)
         return;
      if (this.returnBook != null)
         if (this.returnBook.contains(oldReturnBook))
            this.returnBook.remove(oldReturnBook);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReturnBook() {
      if (returnBook != null)
         returnBook.clear();
   }

}