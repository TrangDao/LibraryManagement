package com.lib.domain; /***********************************************************************
 * Module:  Author.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Author
 ***********************************************************************/

import java.util.*;

/** @pdOid a5018399-f984-47d6-94a3-9c00a6a8e9a6 */
public class Author {
   /** @pdOid 5cb87e73-b31c-465a-a82c-57cd6cb62120 */
   public long aId;
   /** @pdOid feacfd29-aab1-4733-be17-6427d798a416 */
   public String aFistName;
   /** @pdOid 8847e692-e5f6-4872-aada-d9126101e703 */
   public String aMidName;
   /** @pdOid 25d4336e-34cd-4a5a-9813-3f8eb9139583 */
   public String aLastName;
   /** @pdOid c40d99bb-e505-4ea4-864f-7f7f2157efd7 */
   public boolean aIsActive;
   
   /** @pdRoleInfo migr=no name=Book assc=bookAuthor coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A */
   public Collection<Book> Book_Author;
   
   
   /** @pdGenerated default getter */
   public Collection<Book> getBook_Author() {
      if (Book_Author == null)
         Book_Author = new HashSet<Book>();
      return Book_Author;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorBook_Author() {
      if (Book_Author == null)
         Book_Author = new HashSet<Book>();
      return Book_Author.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBook_Author */
   public void setBook_Author(Collection<Book> newBook_Author) {
      removeAllBook_Author();
      for (Iterator iter = newBook_Author.iterator(); iter.hasNext();)
         addBook_Author((Book)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBook */
   public void addBook_Author(Book newBook) {
      if (newBook == null)
         return;
      if (this.Book_Author == null)
         this.Book_Author = new HashSet<Book>();
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
         for (Iterator iter = getIteratorBook_Author(); iter.hasNext();)
         {
            oldBook = (Book)iter.next();
            iter.remove();
            oldBook.removeBook_Author(this);
         }
      }
   }

}