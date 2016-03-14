package com.lib.domain; /***********************************************************************
 * Module:  Book.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Book
 ***********************************************************************/

import java.util.*;

/** @pdOid d79a15d3-5c20-450f-9027-3c6e6dfada1f */
public class Book {
   /** @pdOid 44038d56-2646-48d6-9694-0d2fd1295566 */
   public long bId;
   /** @pdOid e15e208b-5410-46bf-ba02-0c5f5cd41d63 */
   public String bTitle;
   /** @pdOid 70faa0c1-3633-431e-8381-4db7c28f5ab2 */
   public Date bDate;
   /** @pdOid d331a95e-e80d-44e2-9789-0f2cb99a22c5 */
   public boolean bIsActive;
   /** @pdOid 4c110171-27af-4c12-8cff-d0ac8fd47ec5 */
   public int bQuantity;
   
   /** @pdRoleInfo migr=no name=Author assc=bookAuthor coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public Collection<Author> Book_Author;
   /** @pdRoleInfo migr=no name=Category assc=bookCategory coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public Collection<Category> Book_Category;
   /** @pdRoleInfo migr=no name=Publisher assc=bookPub mult=1..1 side=A */
   public Publisher publisher;
   /** @pdRoleInfo migr=no name=Copy assc=copyBook mult=1..1 side=A */
   public Copy copy;
   
   
   /** @pdGenerated default getter */
   public Collection<Author> getBook_Author() {
      if (Book_Author == null)
         Book_Author = new HashSet<Author>();
      return Book_Author;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorBook_Author() {
      if (Book_Author == null)
         Book_Author = new HashSet<Author>();
      return Book_Author.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBook_Author */
   public void setBook_Author(Collection<Author> newBook_Author) {
      removeAllBook_Author();
      for (Iterator iter = newBook_Author.iterator(); iter.hasNext();)
         addBook_Author((Author)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAuthor */
   public void addBook_Author(Author newAuthor) {
      if (newAuthor == null)
         return;
      if (this.Book_Author == null)
         this.Book_Author = new HashSet<Author>();
      if (!this.Book_Author.contains(newAuthor))
      {
         this.Book_Author.add(newAuthor);
         newAuthor.addBook_Author(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldAuthor */
   public void removeBook_Author(Author oldAuthor) {
      if (oldAuthor == null)
         return;
      if (this.Book_Author != null)
         if (this.Book_Author.contains(oldAuthor))
         {
            this.Book_Author.remove(oldAuthor);
            oldAuthor.removeBook_Author(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBook_Author() {
      if (Book_Author != null)
      {
         Author oldAuthor;
         for (Iterator iter = getIteratorBook_Author(); iter.hasNext();)
         {
            oldAuthor = (Author)iter.next();
            iter.remove();
            oldAuthor.removeBook_Author(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public Collection<Category> getBook_Category() {
      if (Book_Category == null)
         Book_Category = new HashSet<Category>();
      return Book_Category;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorBook_Category() {
      if (Book_Category == null)
         Book_Category = new HashSet<Category>();
      return Book_Category.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBook_Category */
   public void setBook_Category(Collection<Category> newBook_Category) {
      removeAllBook_Category();
      for (Iterator iter = newBook_Category.iterator(); iter.hasNext();)
         addBook_Category((Category)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCategory */
   public void addBook_Category(Category newCategory) {
      if (newCategory == null)
         return;
      if (this.Book_Category == null)
         this.Book_Category = new HashSet<Category>();
      if (!this.Book_Category.contains(newCategory))
      {
         this.Book_Category.add(newCategory);
         newCategory.addBook_Category(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCategory */
   public void removeBook_Category(Category oldCategory) {
      if (oldCategory == null)
         return;
      if (this.Book_Category != null)
         if (this.Book_Category.contains(oldCategory))
         {
            this.Book_Category.remove(oldCategory);
            oldCategory.removeBook_Category(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBook_Category() {
      if (Book_Category != null)
      {
         Category oldCategory;
         for (Iterator iter = getIteratorBook_Category(); iter.hasNext();)
         {
            oldCategory = (Category)iter.next();
            iter.remove();
            oldCategory.removeBook_Category(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Publisher getPublisher() {
      return publisher;
   }
   
   /** @pdGenerated default parent setter
     * @param newPublisher */
   public void setPublisher(Publisher newPublisher) {
      if (this.publisher == null || !this.publisher.equals(newPublisher))
      {
         if (this.publisher != null)
         {
            Publisher oldPublisher = this.publisher;
            this.publisher = null;
            oldPublisher.removeBook(this);
         }
         if (newPublisher != null)
         {
            this.publisher = newPublisher;
            this.publisher.addBook(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Copy getCopy() {
      return copy;
   }
   
   /** @pdGenerated default parent setter
     * @param newCopy */
   public void setCopy(Copy newCopy) {
      if (this.copy == null || !this.copy.equals(newCopy))
      {
         if (this.copy != null)
         {
            Copy oldCopy = this.copy;
            this.copy = null;
            oldCopy.removeBook(this);
         }
         if (newCopy != null)
         {
            this.copy = newCopy;
            this.copy.addBook(this);
         }
      }
   }

}