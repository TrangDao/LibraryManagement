package com.lib.domain; /***********************************************************************
 * Module:  Borrow.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Borrow
 ***********************************************************************/

import java.util.*;

/** @pdOid 2378f1c1-9fa4-458a-9b6d-0b415ccc0c78 */
public class Borrow {
   /** @pdOid 693de9bf-a8f0-46a5-a175-e505978c29b3 */
   public long bId;
   /** @pdOid 11e183fd-b010-41e8-ac5c-e50a2f78d3d7 */
   public Date bDate;
   
   /** @pdRoleInfo migr=no name=Copy assc=borrowCopy coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<Copy> copy;
   /** @pdRoleInfo migr=no name=BorrowDetail assc=borrowDetail coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<BorrowDetail> borrowDetail;
   /** @pdRoleInfo migr=no name=Members assc=memberBrrow mult=0..1 side=A */
   public Members members;
   /** @pdRoleInfo migr=no name=User assc=userBorrow mult=0..1 side=A */
   public User user;
   
   
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
      {
         this.copy.add(newCopy);
         newCopy.setBorrow(this);      
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
            oldCopy.setBorrow((Borrow)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCopy() {
      if (copy != null)
      {
         Copy oldCopy;
         for (Iterator iter = getIteratorCopy(); iter.hasNext();)
         {
            oldCopy = (Copy)iter.next();
            iter.remove();
            oldCopy.setBorrow((Borrow)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public Collection<BorrowDetail> getBorrowDetail() {
      if (borrowDetail == null)
         borrowDetail = new HashSet<BorrowDetail>();
      return borrowDetail;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorBorrowDetail() {
      if (borrowDetail == null)
         borrowDetail = new HashSet<BorrowDetail>();
      return borrowDetail.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBorrowDetail */
   public void setBorrowDetail(Collection<BorrowDetail> newBorrowDetail) {
      removeAllBorrowDetail();
      for (Iterator iter = newBorrowDetail.iterator(); iter.hasNext();)
         addBorrowDetail((BorrowDetail)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBorrowDetail */
   public void addBorrowDetail(BorrowDetail newBorrowDetail) {
      if (newBorrowDetail == null)
         return;
      if (this.borrowDetail == null)
         this.borrowDetail = new HashSet<BorrowDetail>();
      if (!this.borrowDetail.contains(newBorrowDetail))
      {
         this.borrowDetail.add(newBorrowDetail);
         newBorrowDetail.setBorrow(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBorrowDetail */
   public void removeBorrowDetail(BorrowDetail oldBorrowDetail) {
      if (oldBorrowDetail == null)
         return;
      if (this.borrowDetail != null)
         if (this.borrowDetail.contains(oldBorrowDetail))
         {
            this.borrowDetail.remove(oldBorrowDetail);
            oldBorrowDetail.setBorrow((Borrow)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBorrowDetail() {
      if (borrowDetail != null)
      {
         BorrowDetail oldBorrowDetail;
         for (Iterator iter = getIteratorBorrowDetail(); iter.hasNext();)
         {
            oldBorrowDetail = (BorrowDetail)iter.next();
            iter.remove();
            oldBorrowDetail.setBorrow((Borrow)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Members getMembers() {
      return members;
   }
   
   /** @pdGenerated default parent setter
     * @param newMembers */
   public void setMembers(Members newMembers) {
      if (this.members == null || !this.members.equals(newMembers))
      {
         if (this.members != null)
         {
            Members oldMembers = this.members;
            this.members = null;
            oldMembers.removeBorrow(this);
         }
         if (newMembers != null)
         {
            this.members = newMembers;
            this.members.addBorrow(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public User getUser() {
      return user;
   }
   
   /** @pdGenerated default parent setter
     * @param newUser */
   public void setUser(User newUser) {
      if (this.user == null || !this.user.equals(newUser))
      {
         if (this.user != null)
         {
            User oldUser = this.user;
            this.user = null;
            oldUser.removeBorrow(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            this.user.addBorrow(this);
         }
      }
   }

}