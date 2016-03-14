package com.lib.domain; /***********************************************************************
 * Module:  Publisher.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Publisher
 ***********************************************************************/

import java.util.*;

/** @pdOid 56e3bed1-4d6f-4004-ae00-9c7f665b89ff */
public class Publisher {
   /** @pdOid 49372a31-23cb-4e88-b175-03a6926027cf */
   public long pId;
   /** @pdOid 98b8996c-cea4-4f7d-8ae3-02123537f94a */
   public String pName;
   /** @pdOid 65adbb70-f070-4a2b-980d-7cbc4c7ec52b */
   public String pDescription;
   /** @pdOid 198484af-e178-4a9a-ae3e-cf84e269dffb */
   public boolean pIsActive;
   
   /** @pdRoleInfo migr=no name=Book assc=bookPub coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public Collection<Book> book;
   
   
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
         for (Iterator iter = getIteratorBook(); iter.hasNext();)
         {
            oldBook = (Book)iter.next();
            iter.remove();
            oldBook.setPublisher((Publisher)null);
         }
      }
   }

}