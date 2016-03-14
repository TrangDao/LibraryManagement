package com.lib.domain; /***********************************************************************
 * Module:  com.lib.domain.Publisher.java
 * com.lib.domain.Author:  lanhnguyen
 * Purpose: Defines the Class com.lib.domain.Publisher
 ***********************************************************************/

/** @pdOid aab92ca3-0b47-4870-b89b-c31d5b33b6f0 */
public class Publisher {
   /** @pdOid 6847d3b6-da81-43ba-b2d1-b3d6a74a0eeb */
   public long pId;
   /** @pdOid 63a599ae-4f2a-4679-a278-dd4ad5f0d332 */
   public java.lang.String pName;
   /** @pdOid b66ccbaf-c10c-4d90-878b-da4d71d6c623 */
   public java.lang.String pDescription;
   /** @pdOid 1d3ef2aa-3d95-42b1-a7e5-15dbcdeb8c3b */
   public boolean pIsActive;
   
   /** @pdRoleInfo migr=no name=com.lib.domain.Book assc=bookPub coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Book> book;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Book> getBook() {
      if (book == null)
         book = new java.util.HashSet<Book>();
      return book;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBook() {
      if (book == null)
         book = new java.util.HashSet<Book>();
      return book.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBook */
   public void setBook(java.util.Collection<Book> newBook) {
      removeAllBook();
      for (java.util.Iterator iter = newBook.iterator(); iter.hasNext();)
         addBook((Book)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBook */
   public void addBook(Book newBook) {
      if (newBook == null)
         return;
      if (this.book == null)
         this.book = new java.util.HashSet<Book>();
      if (!this.book.contains(newBook))
      {
         this.book.add(newBook);
         newBook.setPublisher(this);      
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
            oldBook.setPublisher((Publisher)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBook() {
      if (book != null)
      {
         Book oldBook;
         for (java.util.Iterator iter = getIteratorBook(); iter.hasNext();)
         {
            oldBook = (Book)iter.next();
            iter.remove();
            oldBook.setPublisher((Publisher)null);
         }
      }
   }

}