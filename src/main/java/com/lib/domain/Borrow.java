package com.lib.domain; /***********************************************************************
 * Module:  com.lib.domain.Borrow.java
 * com.lib.domain.Author:  lanhnguyen
 * Purpose: Defines the Class com.lib.domain.Borrow
 ***********************************************************************/

/** @pdOid ed64c994-6e0a-4b72-a21a-f404df2e18d6 */
public class Borrow {
   /** @pdOid 1693a967-b0e2-4a50-81ee-e7f8df19735e */
   public long bId;
   /** @pdOid 1863eca1-bb00-43c8-8bdd-079b2ada035e */
   public java.util.Date bDate;
   
   /** @pdRoleInfo migr=no name=com.lib.domain.Copy assc=borrowCopy coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Copy> copy;
   /** @pdRoleInfo migr=no name=com.lib.domain.BorrowDetail assc=borrowDetail coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<BorrowDetail> borrowDetail;
   /** @pdRoleInfo migr=no name=com.lib.domain.Member assc=memberBrrow mult=0..1 side=A */
   public Member member;
   /** @pdRoleInfo migr=no name=com.lib.domain.Staff assc=userBorrow mult=0..1 side=A */
   public Staff staff;
   
   
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
         for (java.util.Iterator iter = getIteratorCopy(); iter.hasNext();)
         {
            oldCopy = (Copy)iter.next();
            iter.remove();
            oldCopy.setBorrow((Borrow)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<BorrowDetail> getBorrowDetail() {
      if (borrowDetail == null)
         borrowDetail = new java.util.HashSet<BorrowDetail>();
      return borrowDetail;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBorrowDetail() {
      if (borrowDetail == null)
         borrowDetail = new java.util.HashSet<BorrowDetail>();
      return borrowDetail.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBorrowDetail */
   public void setBorrowDetail(java.util.Collection<BorrowDetail> newBorrowDetail) {
      removeAllBorrowDetail();
      for (java.util.Iterator iter = newBorrowDetail.iterator(); iter.hasNext();)
         addBorrowDetail((BorrowDetail)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBorrowDetail */
   public void addBorrowDetail(BorrowDetail newBorrowDetail) {
      if (newBorrowDetail == null)
         return;
      if (this.borrowDetail == null)
         this.borrowDetail = new java.util.HashSet<BorrowDetail>();
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
         for (java.util.Iterator iter = getIteratorBorrowDetail(); iter.hasNext();)
         {
            oldBorrowDetail = (BorrowDetail)iter.next();
            iter.remove();
            oldBorrowDetail.setBorrow((Borrow)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Member getMember() {
      return member;
   }
   
   /** @pdGenerated default parent setter
     * @param newMember */
   public void setMember(Member newMember) {
      if (this.member == null || !this.member.equals(newMember))
      {
         if (this.member != null)
         {
            Member oldMember = this.member;
            this.member = null;
            oldMember.removeBorrow(this);
         }
         if (newMember != null)
         {
            this.member = newMember;
            this.member.addBorrow(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Staff getStaff() {
      return staff;
   }
   
   /** @pdGenerated default parent setter
     * @param newStaff */
   public void setStaff(Staff newStaff) {
      if (this.staff == null || !this.staff.equals(newStaff))
      {
         if (this.staff != null)
         {
            Staff oldStaff = this.staff;
            this.staff = null;
            oldStaff.removeBorrow(this);
         }
         if (newStaff != null)
         {
            this.staff = newStaff;
            this.staff.addBorrow(this);
         }
      }
   }

}