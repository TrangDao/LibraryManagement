package com.lib.domain; /***********************************************************************
 * Module:  com.lib.domain.Copy.java
 * com.lib.domain.Author:  lanhnguyen
 * Purpose: Defines the Class com.lib.domain.Copy
 ***********************************************************************/

/** @pdOid 52bd9580-2d28-4c98-8580-8d00f9f36a02 */
public class Copy {
   /** @pdOid 312ce216-f098-4b11-a754-68bf3246c98a */
   public long copyId;
   /** @pdOid 757b5516-bfe2-4655-a9a7-58cbad3a1c73 */
   public java.util.Date cDate;
   /** @pdOid 5f941f4a-46ea-4b8b-9dee-ff569aced9e4 */
   public boolean cStatus;
   
   /** @pdRoleInfo migr=no name=com.lib.domain.Book assc=copyBook mult=0..1 side=A */
   public Book book;
   /** @pdRoleInfo migr=no name=com.lib.domain.Borrow assc=borrowCopy mult=0..1 side=A */
   public Borrow borrow;
   /** @pdRoleInfo migr=no name=com.lib.domain.Location assc=copyLocation mult=1..1 side=A */
   public Location location;
   
   
   /** @pdGenerated default parent getter */
   public Book getBook() {
      return book;
   }
   
   /** @pdGenerated default parent setter
     * @param newBook */
   public void setBook(Book newBook) {
      if (this.book == null || !this.book.equals(newBook))
      {
         if (this.book != null)
         {
            Book oldBook = this.book;
            this.book = null;
            oldBook.removeCopy(this);
         }
         if (newBook != null)
         {
            this.book = newBook;
            this.book.addCopy(this);
         }
      }
   }
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
            oldBorrow.removeCopy(this);
         }
         if (newBorrow != null)
         {
            this.borrow = newBorrow;
            this.borrow.addCopy(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Location getLocation() {
      return location;
   }
   
   /** @pdGenerated default parent setter
     * @param newLocation */
   public void setLocation(Location newLocation) {
      if (this.location == null || !this.location.equals(newLocation))
      {
         if (this.location != null)
         {
            Location oldLocation = this.location;
            this.location = null;
            oldLocation.removeCopy(this);
         }
         if (newLocation != null)
         {
            this.location = newLocation;
            this.location.addCopy(this);
         }
      }
   }

}