package com.lib.domain; /***********************************************************************
 * Module:  Copy.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Copy
 ***********************************************************************/

import java.util.*;

/** @pdOid 03bac733-37ee-4d02-a542-6ee0b71c4355 */
public class Copy {
   /** @pdOid 5c2f8d23-94b9-40a6-b5a8-5162e443fc3e */
   public int cId;
   /** @pdOid bda698f0-c164-47fa-811a-6c7167a6842f */
   public int cNumber;
   
   /** @pdRoleInfo migr=no name=Book assc=bookCopy mult=0..1 side=A */
   public Book book;
   
   /** @pdOid 38c36d2d-4e65-4cf7-ae23-f8d2cbd92bad */
   public int getCId() {
      return cId;
   }
   
   /** @param newCId
    * @pdOid 9dd9e027-d395-41aa-b062-cb5a1bea71be */
   public void setCId(int newCId) {
      cId = newCId;
   }
   
   /** @pdOid 5ca37a99-bf14-485f-a315-0407c6cfe5c0 */
   public int getCNumber() {
      return cNumber;
   }
   
   /** @param newCNumber
    * @pdOid 99259670-36c5-47e4-88b7-9b8de439c843 */
   public void setCNumber(int newCNumber) {
      cNumber = newCNumber;
   }

}