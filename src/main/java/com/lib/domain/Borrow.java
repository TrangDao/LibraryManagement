package com.lib.domain; /***********************************************************************
 * Module:  Borrow.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Borrow
 ***********************************************************************/

import java.util.Date;

/** @pdOid e0f4bb8d-b34c-4e5f-bb12-7ad26e026144 */
public class Borrow {
   /** @pdOid 6b627cad-b766-4b64-a213-74ac49a0c69b */
   private int brId;
   /** @pdOid d227b160-d5f0-4c74-928c-b54df80b66e3 */
   private Date brBorrowDate;
   /** @pdOid d03107a1-8dad-494c-9410-d6293486b5ba */
   private Date brCreateAt;
   /** @pdOid 616c943d-856c-4a4d-8dc3-fc24c5187025 */
   private Date brReturnDate;
   private int uId;
   private Integer rId;
   private int cId;
   private int aId;

   /** @pdOid 3a5f9253-e27b-455a-889b-bda4a553c163 */
   public int getBrId() {
      return brId;
   }

   /** @param newBrId
    * @pdOid cf29365d-b65c-48da-8ea0-b5ebfb301a34 */
   public void setBrId(int newBrId) {
      brId = newBrId;
   }

   public int getuId() {
      return uId;
   }

   public void setuId(int uId) {
      this.uId = uId;
   }

   public Integer getrId() {
      return rId;
   }

   public void setrId(Integer rId) {
      this.rId = rId;
   }

   public int getcId() {
      return cId;
   }

   public void setcId(int cId) {
      this.cId = cId;
   }

   public int getaId() {
      return aId;
   }

   public void setaId(int aId) {
      this.aId = aId;
   }
   
   /** @pdOid cc5aeee0-a5a9-4554-a782-9d5c89c63173 */
   public Date getBrBorrowDate() {
      return brBorrowDate;
   }
   
   /** @param newBrBorrowDate
    * @pdOid 7bccb72b-9452-4e68-b480-3be5080c512c */
   public void setBrBorrowDate(Date newBrBorrowDate) {
      brBorrowDate = newBrBorrowDate;
   }
   
   /** @pdOid 0393b71b-fbfc-4f63-8736-97b4f054d20c */
   public Date getBrCreateAt() {
      return brCreateAt;
   }
   
   /** @param newBrCreateAt
    * @pdOid 6692d6e5-fec4-4858-bdb5-e4a4f9b3172d */
   public void setBrCreateAt(Date newBrCreateAt) {
      brCreateAt = newBrCreateAt;
   }
   
   /** @pdOid c5304806-7ad4-4dcc-a783-aaba841e8534 */
   public Date getBrReturnDate() {
      return brReturnDate;
   }
   
   /** @param newBrReturnDate
    * @pdOid 8c898cae-e2ba-41c4-832c-8a7dbec830b5 */
   public void setBrReturnDate(Date newBrReturnDate) {
      brReturnDate = newBrReturnDate;
   }

}