package com.lib.domain; /***********************************************************************
 * Module:  Copy.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Copy
 ***********************************************************************/

import java.util.*;

/** @pdOid ddaddda9-b173-491f-9709-c5e22221c488 */
public class Copy {
   /** @pdOid c7249bcc-bf2f-467b-8e6d-44e047012d1d */
   public long copyId;
   /** @pdOid 7f3c343d-da3c-4834-9ab0-7b6427e5e353 */
   public Date cDate;
   /** @pdOid 7f8deae7-ecfc-42db-a7ed-d8ac92c1a4dd */
   public boolean cStatus;
   
   /** @pdRoleInfo migr=no name=Book assc=copyBook coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<Book> book;
   /** @pdRoleInfo migr=no name=Borrow assc=borrowCopy mult=0..1 side=A */
   public Borrow borrow;
   /** @pdRoleInfo migr=no name=Location assc=copyLocation mult=1..1 side=A */
   public Location location;
   
   
   /** @pdGenerated default getter */
   public Collection<Book> getBook() {
      if (book == null)
         book = new HashSet<Book>();
      return book;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorBook() {
      if (book == null)
         book = new HashSet<Book>();
      return book.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBook */
   public void setBook(Collection<Book> newBook) {
      removeAllBook();
      for (Iterator iter = newBook.iterator(); iter.hasNext();)
         addBook((Book)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBook */
   public void addBook(Book newBook) {
      if (newBook == null)
         return;
      if (this.book == null)
         this.book = new HashSet<Book>();
      if (!this.book.contains(newBook))
      {
         this.book.add(newBook);
         newBook.setCopy(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBook */
   public void removeBook(Book oldBook) {
      if (oldBook == null)
         return;
      if (this.book != null)
         if (this.book.contains(oldBook))
         {
            this.book.remove(oldBook);
            oldBook.setCopy((Copy)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBook() {
      if (book != null)
      {
         Book oldBook;
         for (Iterator iter = getIteratorBook(); iter.hasNext();)
         {
            oldBook = (Book)iter.next();
            iter.remove();
            oldBook.setCopy((Copy)null);
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