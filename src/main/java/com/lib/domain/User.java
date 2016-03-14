package com.lib.domain; /***********************************************************************
 * Module:  User.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class User
 ***********************************************************************/

import java.util.*;

/** @pdOid 15a69f82-f768-4547-8d35-818df9d3c222 */
public class User {
   /** @pdOid 8ccfb8e4-bb5b-4561-880f-368fb92cb5e6 */
   public String uUser;
   /** @pdOid 1da5c4cb-ca7a-45ca-bbe2-68f9e7ac1d14 */
   public String uPass;
   /** @pdOid 4497260e-d782-4593-a8c6-ce4626dfb955 */
   public String uFullName;
   /** @pdOid bebe70de-61c7-45da-a563-f65bb379e6f2 */
   public String uAddress;
   /** @pdOid bac93c2f-2dd9-4403-84d7-4734224f9c31 */
   public String uEmail;
   /** @pdOid 86c68594-589c-4d76-bc07-e33c86248a1a */
   public String uTel;
   /** @pdOid 2a955c1d-6507-493d-8061-888796a683d0 */
   public boolean uIsActive;
   
   /** @pdRoleInfo migr=no name=Borrow assc=userBorrow coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<Borrow> borrow;
   
   
   /** @pdGenerated default getter */
   public Collection<Borrow> getBorrow() {
      if (borrow == null)
         borrow = new HashSet<Borrow>();
      return borrow;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorBorrow() {
      if (borrow == null)
         borrow = new HashSet<Borrow>();
      return borrow.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBorrow */
   public void setBorrow(Collection<Borrow> newBorrow) {
      removeAllBorrow();
      for (Iterator iter = newBorrow.iterator(); iter.hasNext();)
         addBorrow((Borrow)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBorrow */
   public void addBorrow(Borrow newBorrow) {
      if (newBorrow == null)
         return;
      if (this.borrow == null)
         this.borrow = new HashSet<Borrow>();
      if (!this.borrow.contains(newBorrow))
      {
         this.borrow.add(newBorrow);
         newBorrow.setUser(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBorrow */
   public void removeBorrow(Borrow oldBorrow) {
      if (oldBorrow == null)
         return;
      if (this.borrow != null)
         if (this.borrow.contains(oldBorrow))
         {
            this.borrow.remove(oldBorrow);
            oldBorrow.setUser((User)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBorrow() {
      if (borrow != null)
      {
         Borrow oldBorrow;
         for (Iterator iter = getIteratorBorrow(); iter.hasNext();)
         {
            oldBorrow = (Borrow)iter.next();
            iter.remove();
            oldBorrow.setUser((User)null);
         }
      }
   }

}