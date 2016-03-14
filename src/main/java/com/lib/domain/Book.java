package com.lib.domain; /***********************************************************************
 * Module:  com.lib.domain.Book.java
 * com.lib.domain.Author:  lanhnguyen
 * Purpose: Defines the Class com.lib.domain.Book
 ***********************************************************************/

/** @pdOid 56b9b7dc-0895-4fff-b390-40502c310ff7 */
public class Book {
   /** @pdOid ce99b3eb-53b4-47bf-b1d9-bfb215d9dc61 */
   public long bId;
   /** @pdOid 684d5ea4-71f8-4afd-bb06-84b0f2b766c0 */
   public java.lang.String bTitle;
   /** @pdOid 9f7731f1-27bc-47b7-99b4-a509abe9ca43 */
   public java.util.Date bDate;
   /** @pdOid 6d4c3f03-7516-4756-a681-9ff3cda02caf */
   public boolean bIsActive;
   /** @pdOid 22a01f3d-be8e-4ff3-8f2b-49d3390b55f4 */
   public int bQuantity;
   
   /** @pdRoleInfo migr=no name=com.lib.domain.Author assc=bookAuthor coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Author> Book_Author;
   /** @pdRoleInfo migr=no name=com.lib.domain.Category assc=bookCategory coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Category> Book_Category;
   /** @pdRoleInfo migr=no name=com.lib.domain.Copy assc=copyBook coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Copy> copy;
   /** @pdRoleInfo migr=no name=com.lib.domain.Publisher assc=bookPub mult=1..1 side=A */
   public Publisher publisher;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Author> getBook_Author() {
      if (Book_Author == null)
         Book_Author = new java.util.HashSet<Author>();
      return Book_Author;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBook_Author() {
      if (Book_Author == null)
         Book_Author = new java.util.HashSet<Author>();
      return Book_Author.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBook_Author */
   public void setBook_Author(java.util.Collection<Author> newBook_Author) {
      removeAllBook_Author();
      for (java.util.Iterator iter = newBook_Author.iterator(); iter.hasNext();)
         addBook_Author((Author)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAuthor */
   public void addBook_Author(Author newAuthor) {
      if (newAuthor == null)
         return;
      if (this.Book_Author == null)
         this.Book_Author = new java.util.HashSet<Author>();
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
         for (java.util.Iterator iter = getIteratorBook_Author(); iter.hasNext();)
         {
            oldAuthor = (Author)iter.next();
            iter.remove();
            oldAuthor.removeBook_Author(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Category> getBook_Category() {
      if (Book_Category == null)
         Book_Category = new java.util.HashSet<Category>();
      return Book_Category;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBook_Category() {
      if (Book_Category == null)
         Book_Category = new java.util.HashSet<Category>();
      return Book_Category.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBook_Category */
   public void setBook_Category(java.util.Collection<Category> newBook_Category) {
      removeAllBook_Category();
      for (java.util.Iterator iter = newBook_Category.iterator(); iter.hasNext();)
         addBook_Category((Category)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCategory */
   public void addBook_Category(Category newCategory) {
      if (newCategory == null)
         return;
      if (this.Book_Category == null)
         this.Book_Category = new java.util.HashSet<Category>();
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
         for (java.util.Iterator iter = getIteratorBook_Category(); iter.hasNext();)
         {
            oldCategory = (Category)iter.next();
            iter.remove();
            oldCategory.removeBook_Category(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Copy> getCopy() {
      if (copy == null)
         copy = new java.util.HashSet<Copy>();
      return copy;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCopy() {
      if (copy == null)
         copy = new java.util.HashSet<Copy>();
      return copy.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCopy */
   public void setCopy(java.util.Collection<Copy> newCopy) {
      removeAllCopy();
      for (java.util.Iterator iter = newCopy.iterator(); iter.hasNext();)
         addCopy((Copy)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCopy */
   public void addCopy(Copy newCopy) {
      if (newCopy == null)
         return;
      if (this.copy == null)
         this.copy = new java.util.HashSet<Copy>();
      if (!this.copy.contains(newCopy))
      {
         this.copy.add(newCopy);
         newCopy.setBook(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCopy */
   public void removeCopy(Copy oldCopy) {
      if (oldCopy == null)
         return;
      if (this.copy != null)
         if (this.copy.contains(oldCopy))
         {
            this.copy.remove(oldCopy);
            oldCopy.setBook((Book)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCopy() {
      if (copy != null)
      {
         Copy oldCopy;
         for (java.util.Iterator iter = getIteratorCopy(); iter.hasNext();)
         {
            oldCopy = (Copy)iter.next();
            iter.remove();
            oldCopy.setBook((Book)null);
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

}