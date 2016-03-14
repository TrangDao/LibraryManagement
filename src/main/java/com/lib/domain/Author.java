package com.lib.domain; /***********************************************************************
 * Module:  com.lib.domain.Author.java
 * com.lib.domain.Author:  lanhnguyen
 * Purpose: Defines the Class com.lib.domain.Author
 ***********************************************************************/

/** @pdOid 0d493aa4-fe36-452d-ab82-f6c1eaeef720 */
public class Author {
   /** @pdOid cd6357e1-0564-4ed0-9a21-11c171bb7388 */
   public long aId;
   /** @pdOid 3a8fb1a9-7d37-4634-af23-bd1f72c1f451 */
   public java.lang.String aFistName;
   /** @pdOid e25b5990-e348-4bcb-b76f-261645fa1a8b */
   public java.lang.String aMidName;
   /** @pdOid b617b74e-4375-4a5c-b743-dd860a0acc08 */
   public java.lang.String aLastName;
   /** @pdOid 5a82a6db-13e7-4e24-887b-646b2b14592b */
   public boolean aIsActive;
   
   /** @pdRoleInfo migr=no name=com.lib.domain.Book assc=bookAuthor coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public java.util.Collection<Book> Book_Author;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Book> getBook_Author() {
      if (Book_Author == null)
         Book_Author = new java.util.HashSet<Book>();
      return Book_Author;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBook_Author() {
      if (Book_Author == null)
         Book_Author = new java.util.HashSet<Book>();
      return Book_Author.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBook_Author */
   public void setBook_Author(java.util.Collection<Book> newBook_Author) {
      removeAllBook_Author();
      for (java.util.Iterator iter = newBook_Author.iterator(); iter.hasNext();)
         addBook_Author((Book)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBook */
   public void addBook_Author(Book newBook) {
      if (newBook == null)
         return;
      if (this.Book_Author == null)
         this.Book_Author = new java.util.HashSet<Book>();
      if (!this.Book_Author.contains(newBook))
      {
         this.Book_Author.add(newBook);
         newBook.addBook_Author(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBook */
   public void removeBook_Author(Book oldBook) {
      if (oldBook == null)
         return;
      if (this.Book_Author != null)
         if (this.Book_Author.contains(oldBook))
         {
            this.Book_Author.remove(oldBook);
            oldBook.removeBook_Author(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBook_Author() {
      if (Book_Author != null)
      {
         Book oldBook;
         for (java.util.Iterator iter = getIteratorBook_Author(); iter.hasNext();)
         {
            oldBook = (Book)iter.next();
            iter.remove();
            oldBook.removeBook_Author(this);
         }
      }
   }

}