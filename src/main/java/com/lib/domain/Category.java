package com.lib.domain; /***********************************************************************
 * Module:  com.lib.domain.Category.java
 * com.lib.domain.Author:  lanhnguyen
 * Purpose: Defines the Class com.lib.domain.Category
 ***********************************************************************/

/** @pdOid 1998f33c-26b1-4603-9402-e0bcdbd90de7 */
public class Category {
   /** @pdOid 9cf81758-d139-4fab-9850-b433980385dd */
   public long cId;
   /** @pdOid 1eb6df07-7a13-466d-ab96-d7e5ca67b5b0 */
   public java.lang.String cName;
   /** @pdOid 10564992-9f51-474e-bcaf-69c766db7bd7 */
   public java.lang.String cDescription;
   /** @pdOid b7e35822-9ed5-4fb1-be14-bd38251a16ce */
   public boolean cIsActive;
   
   /** @pdRoleInfo migr=no name=com.lib.domain.Book assc=bookCategory coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Book> Book_Category;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Book> getBook_Category() {
      if (Book_Category == null)
         Book_Category = new java.util.HashSet<Book>();
      return Book_Category;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBook_Category() {
      if (Book_Category == null)
         Book_Category = new java.util.HashSet<Book>();
      return Book_Category.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBook_Category */
   public void setBook_Category(java.util.Collection<Book> newBook_Category) {
      removeAllBook_Category();
      for (java.util.Iterator iter = newBook_Category.iterator(); iter.hasNext();)
         addBook_Category((Book)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBook */
   public void addBook_Category(Book newBook) {
      if (newBook == null)
         return;
      if (this.Book_Category == null)
         this.Book_Category = new java.util.HashSet<Book>();
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
         for (java.util.Iterator iter = getIteratorBook_Category(); iter.hasNext();)
         {
            oldBook = (Book)iter.next();
            iter.remove();
            oldBook.removeBook_Category(this);
         }
      }
   }

}