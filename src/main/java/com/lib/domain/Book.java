package com.lib.domain; /***********************************************************************
 * Module:  Book.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Book
 ***********************************************************************/

import java.util.*;

/** @pdOid 67e2b470-e58d-45d0-9ed7-8ee728168040 */
public class Book {
   /** @pdOid d2ee3b11-67d0-4e84-925a-5eca4a16fba7 */
   private int bId;
   /** @pdOid d74e95f0-595b-4b74-8f9e-63fdde79281d */
   private String bName;
   /** @pdOid e21bd25d-5abc-470e-940b-1e54eb997540 */
   private String bAuthor;
   
   /** @pdRoleInfo migr=no name=Copy assc=bookCopy coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public Collection<Copy> copy;
   
   /** @pdOid 06bb7302-7356-4e2d-b560-00c9b8e2788c */
   public int getBId() {
      return bId;
   }
   
   /** @param newBId
    * @pdOid 20bb3143-c47c-431d-aa12-29c586ff8832 */
   public void setBId(int newBId) {
      bId = newBId;
   }
   
   /** @pdOid e3d1bce2-812c-4075-87b8-9f9d91d53c09 */
   public String getBName() {
      return bName;
   }
   
   /** @param newBName
    * @pdOid 5a9dbafd-9e23-431b-aec5-6af10f9e4cf7 */
   public void setBName(String newBName) {
      bName = newBName;
   }
   
   /** @pdOid a4ba374c-c6b0-45fb-ac9c-871cc2ea8228 */
   public String getBAuthor() {
      return bAuthor;
   }
   
   /** @param newBAuthor
    * @pdOid c9cb647a-e0b1-4a7a-9a8f-ad5cd530686a */
   public void setBAuthor(String newBAuthor) {
      bAuthor = newBAuthor;
   }
   
   
   /** @pdGenerated default getter */
   public Collection<Copy> getCopy() {
      if (copy == null)
         copy = new HashSet<Copy>();
      return copy;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorCopy() {
      if (copy == null)
         copy = new HashSet<Copy>();
      return copy.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCopy */
   public void setCopy(Collection<Copy> newCopy) {
      removeAllCopy();
      for (Iterator iter = newCopy.iterator(); iter.hasNext();)
         addCopy((Copy)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCopy */
   public void addCopy(Copy newCopy) {
      if (newCopy == null)
         return;
      if (this.copy == null)
         this.copy = new HashSet<Copy>();
      if (!this.copy.contains(newCopy))
         this.copy.add(newCopy);
   }
   
   /** @pdGenerated default remove
     * @param oldCopy */
   public void removeCopy(Copy oldCopy) {
      if (oldCopy == null)
         return;
      if (this.copy != null)
         if (this.copy.contains(oldCopy))
            this.copy.remove(oldCopy);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCopy() {
      if (copy != null)
         copy.clear();
   }

}