package com.lib.domain; /***********************************************************************
 * Module:  Location.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Location
 ***********************************************************************/

import java.util.*;

/** @pdOid e09ed91f-1178-4ea4-85d9-1d44787ceb24 */
public class Location {
   /** @pdOid 8a0b217b-fed5-4c68-beaf-c7dc351cf814 */
   private String lName;
   /** @pdOid 9f7f2431-2971-4ad8-bd7d-900eb595edbe */
   private String lAddress;
   
   /** @pdOid 83329ca4-ce77-4d01-b806-de1342156bb3 */
   public int lId;
   
   /** @pdRoleInfo migr=no name=Admin assc=locationAdmin coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<Admin> admin;
   /** @pdRoleInfo migr=no name=Copy assc=locationCopy coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<Copy> copy;
   
   /** @pdOid 49e63b24-d8b3-49af-b1f3-9836e72acdde */
   public int getLId() {
      return lId;
   }
   
   /** @param newLId
    * @pdOid 6e030627-534f-4108-8d1e-7bfc1473a3f3 */
   public void setLId(int newLId) {
      lId = newLId;
   }
   
   /** @pdOid 86d23cb6-5935-452f-83db-2bdb396e26ec */
   public String getLName() {
      return lName;
   }
   
   /** @param newLName
    * @pdOid 0e5ca945-a790-43ac-a8db-4534678c5408 */
   public void setLName(String newLName) {
      lName = newLName;
   }
   
   /** @pdOid a8fea27e-eee3-4f20-a36e-ec3ff8269c9c */
   public String getLAddress() {
      return lAddress;
   }
   
   /** @param newLAddress
    * @pdOid 33ade5f6-0f21-4526-80ff-ec4efd82846f */
   public void setLAddress(String newLAddress) {
      lAddress = newLAddress;
   }
   
   
   /** @pdGenerated default getter */
   public Collection<Admin> getAdmin() {
      if (admin == null)
         admin = new HashSet<Admin>();
      return admin;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorAdmin() {
      if (admin == null)
         admin = new HashSet<Admin>();
      return admin.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAdmin */
   public void setAdmin(Collection<Admin> newAdmin) {
      removeAllAdmin();
      for (Iterator iter = newAdmin.iterator(); iter.hasNext();)
         addAdmin((Admin)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAdmin */
   public void addAdmin(Admin newAdmin) {
      if (newAdmin == null)
         return;
      if (this.admin == null)
         this.admin = new HashSet<Admin>();
      if (!this.admin.contains(newAdmin))
         this.admin.add(newAdmin);
   }
   
   /** @pdGenerated default remove
     * @param oldAdmin */
   public void removeAdmin(Admin oldAdmin) {
      if (oldAdmin == null)
         return;
      if (this.admin != null)
         if (this.admin.contains(oldAdmin))
            this.admin.remove(oldAdmin);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAdmin() {
      if (admin != null)
         admin.clear();
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