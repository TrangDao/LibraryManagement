package com.lib.domain; /***********************************************************************
 * Module:  Users.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Users
 ***********************************************************************/

import java.util.*;

/** @pdOid 89e002ab-6c13-4ccc-be14-1ae8cd27d830 */
public class Users {
   /** @pdOid 1a68bc1b-b538-48c5-a887-f93022b8b71f */
   private int uId;
   /** @pdOid fbdf6816-45c6-47ea-a13d-d070ad12e07d */
   private String uFirstname;
   /** @pdOid 8d3b9c9d-bb35-49a0-a9f3-50ecf77225aa */
   private String uLastname;
   /** @pdOid c74c5cdb-57f4-4e87-b7d6-3daed1745d24 */
   private int uSchool;
   
   /** @pdRoleInfo migr=no name=Borrow assc=borrowUser coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<Borrow> borrow;
   /** @pdRoleInfo migr=no name=ReturnBook assc=userReturn coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<ReturnBook> returnBook;
   
   /** @pdOid cf704184-b672-4f2a-aa86-2c18956b8827 */
   public int getUId() {
      return uId;
   }
   
   /** @param newUId
    * @pdOid 91d8a0a6-b434-471a-91de-de0cba821ead */
   public void setUId(int newUId) {
      uId = newUId;
   }
   
   /** @pdOid db4b6c8f-8e00-4fa2-bb12-47e4bee80205 */
   public String getUFirstname() {
      return uFirstname;
   }
   
   /** @param newUFirstname
    * @pdOid d05d8b26-df73-4d4a-9b49-7f862843c133 */
   public void setUFirstname(String newUFirstname) {
      uFirstname = newUFirstname;
   }
   
   /** @pdOid 85923047-09e4-48cd-8ba9-47877ed4b743 */
   public String getULastname() {
      return uLastname;
   }
   
   /** @param newULastname
    * @pdOid 5e1b3e40-a7b4-4121-806f-06470f597d45 */
   public void setULastname(String newULastname) {
      uLastname = newULastname;
   }
   
   /** @pdOid 3c9104ed-1ce6-4b84-8b27-906d2d02d4f8 */
   public int getUSchool() {
      return uSchool;
   }
   
   /** @param newUSchool
    * @pdOid c49511fb-b814-4e02-b32c-843f9b55f236 */
   public void setUSchool(int newUSchool) {
      uSchool = newUSchool;
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