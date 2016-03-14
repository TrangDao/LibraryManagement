package com.lib.domain; /***********************************************************************
 * Module:  Category.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Category
 ***********************************************************************/

import java.util.*;

/** @pdOid 04fb2540-2c27-4832-b54b-aa7bbc8162b2 */
public class Category {
   /** @pdOid e9f235b3-772f-472b-aaa5-54b37c7a14af */
   public float(8,2) cId;
   /** @pdOid a10ef9b9-767b-41d5-af2f-a0ec54667721 */
   public String cName;
   /** @pdOid 36ce5add-389b-4303-9826-0ddbb1049fd9 */
   public String cDescription;
   /** @pdOid bf4d701b-7d0c-43da-96ea-20063df4c5fe */
   public boolean cIsActive;
   
   /** @pdRoleInfo migr=no name=Book assc=bookCategory coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public Collection<Book> Book_Category;
   
   
   /** @pdGenerated default getter */
   public Collection<Book> getBook_Category() {
      if (Book_Category == null)
         Book_Category = new HashSet<Book>();
      return Book_Category;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorBook_Category() {
      if (Book_Category == null)
         Book_Category = new HashSet<Book>();
      return Book_Category.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBook_Category */
   public void setBook_Category(Collection<Book> newBook_Category) {
      removeAllBook_Category();
      for (Iterator iter = newBook_Category.iterator(); iter.hasNext();)
         addBook_Category((Book)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBook */
   public void addBook_Category(Book newBook) {
      if (newBook == null)
         return;
      if (this.Book_Category == null)
         this.Book_Category = new HashSet<Book>();
      if (!this.Book_Category.contains(newBook))
      {
         this.Book_Category.add(newBook);
         newBook.addBook_Category(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBook */
   public void removeBook_Category(Book oldBook) {
      if (oldBook == null)
         return;
      if (this.Book_Category != null)
         if (this.Book_Category.contains(oldBook))
         {
            this.Book_Category.remove(oldBook);
            oldBook.removeBook_Category(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBook_Category() {
      if (Book_Category != null)
      {
         Book oldBook;
         for (Iterator iter = getIteratorBook_Category(); iter.hasNext();)
         {
            oldBook = (Book)iter.next();
            iter.remove();
            oldBook.removeBook_Category(this);
         }
      }
   }

}