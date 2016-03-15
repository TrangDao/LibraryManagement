package com.lib.domain; /***********************************************************************
 * Module:  ReturnBook.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class ReturnBook
 ***********************************************************************/

import java.util.*;

/** @pdOid 5d3f7679-4991-49d8-a010-144c58c29b76 */
public class ReturnBook {
   /** @pdOid 494778ff-56d8-4f39-8513-608be6d5d795 */
   private int rId;
   /** @pdOid b68b0c55-a188-41e5-aa10-77a5ce43946e */
   private Date rCreateAt;
   /** @pdOid a5869a71-1d04-4394-98fc-997afc653588 */
   private Date rReturnDate;
   
   /** @pdRoleInfo migr=no name=Admin assc=adminReturn mult=0..1 side=A */
   public Admin admin;
   
   /** @pdOid 5a86b9d8-ce7c-4540-b03d-b3cb8a86bdfc */
   public int getRId() {
      return rId;
   }
   
   /** @param newRId
    * @pdOid 77f62497-1274-4b3a-995f-87d61f6b17e6 */
   public void setRId(int newRId) {
      rId = newRId;
   }
   
   /** @pdOid 7def984b-421a-4f74-868a-036d29ca20e3 */
   public Date getRCreateAt() {
      return rCreateAt;
   }
   
   /** @param newRCreateAt
    * @pdOid 65d52b7c-6fa7-48fd-869a-50b484ff7c67 */
   public void setRCreateAt(Date newRCreateAt) {
      rCreateAt = newRCreateAt;
   }
   
   /** @pdOid 738e9bf7-5efa-48e8-a736-ec68fe851ad4 */
   public Date getRReturnDate() {
      return rReturnDate;
   }
   
   /** @param newRReturnDate
    * @pdOid 5da36d42-e623-4640-abe5-d4097e0a7c45 */
   public void setRReturnDate(Date newRReturnDate) {
      rReturnDate = newRReturnDate;
   }

}