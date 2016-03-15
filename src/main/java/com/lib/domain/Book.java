package com.lib.domain; /***********************************************************************
 * Module:  Book.java
 * Author:  lanhnguyen
 * Purpose: Defines the Class Book
 ***********************************************************************/

import java.util.*;

/** @pdOid 67e2b470-e58d-45d0-9ed7-8ee728168040 */
public class Book {
   /** @pdOid d74e95f0-595b-4b74-8f9e-63fdde79281d */
   private String bName;
   /** @pdOid e21bd25d-5abc-470e-940b-1e54eb997540 */
   private String bAuthor;
   /** @pdOid fa73c052-5e75-4c44-b78d-f82a09920335 */
   private String bCategory;
   
   /** @pdOid d2ee3b11-67d0-4e84-925a-5eca4a16fba7 */
   public int bId;
   
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
   
   /** @pdOid fc979cf3-0a33-48cb-81fa-3488983a1d61 */
   public String getBCategory() {
      return bCategory;
   }
   
   /** @param newBCategory
    * @pdOid 40dd9820-b646-428b-8840-3e8501322842 */
   public void setBCategory(String newBCategory) {
      bCategory = newBCategory;
   }

}