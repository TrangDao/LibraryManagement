/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     14/03/2016 10:25:38 AM                       */
/*==============================================================*/


drop table AUTHOR;

drop table BOOK;

drop table BOOK_AUTHOR;

drop table BOOK_CATEGORY;

drop table BORROW;

drop table BORROW_DETAIL;

drop table CATEGORY;

drop table COPY;

drop table HISTORY;

drop table LOCATION;

drop table MEMBERS;

drop table PUBLISHER;

drop table "USER";

/*==============================================================*/
/* Table: AUTHOR                                                */
/*==============================================================*/
create table AUTHOR (
   A_ID                 SERIAL not null,
   A_FISTNAME           CHAR(100)            not null,
   A_MIDNAME            CHAR(100)            not null,
   A_LASTNAME           CHAR(100)            not null,
   A_ISACTIVE           BOOL                 not null,
   constraint PK_AUTHOR primary key (A_ID)
);

/*==============================================================*/
/* Table: BOOK                                                  */
/*==============================================================*/
create table BOOK (
   B_ID                 SERIAL not null,
   P_ID                 INT4                 not null,
   COPY_ID              INT4                 not null,
   B_TITLE              CHAR(255)            not null,
   B_DATE               DATE                 not null,
   B_ISACTIVE           BOOL                 not null,
   B_QUANTITY           INT4                 not null,
   constraint PK_BOOK primary key (B_ID)
);

/*==============================================================*/
/* Table: BOOK_AUTHOR                                           */
/*==============================================================*/
create table BOOK_AUTHOR (
   A_ID                 INT4                 not null,
   B_ID                 INT4                 not null,
   constraint PK_BOOK_AUTHOR primary key (A_ID, B_ID)
);

/*==============================================================*/
/* Table: BOOK_CATEGORY                                         */
/*==============================================================*/
create table BOOK_CATEGORY (
   C_ID                 FLOAT8               not null,
   B_ID                 INT4                 not null,
   constraint PK_BOOK_CATEGORY primary key (C_ID, B_ID)
);

/*==============================================================*/
/* Table: BORROW                                                */
/*==============================================================*/
create table BORROW (
   BORROW_ID            SERIAL not null,
   M_ID                 INT4                 null,
   U_USER               CHAR(55)             null,
   B_DATE               DATE                 not null,
   constraint PK_BORROW primary key (BORROW_ID)
);

/*==============================================================*/
/* Table: BORROW_DETAIL                                         */
/*==============================================================*/
create table BORROW_DETAIL (
   BD_ID                SERIAL not null,
   BORROW_ID            INT4                 null,
   B_DATE               DATE                 not null,
   R_DATE               DATE                 not null,
   constraint PK_BORROW_DETAIL primary key (BD_ID)
);

/*==============================================================*/
/* Table: CATEGORY                                              */
/*==============================================================*/
create table CATEGORY (
   C_ID                 FLOAT8               not null,
   C_NAME               CHAR(100)            not null,
   C_DESCRIPTION        CHAR(255)            null,
   C_ISACTIVE           BOOL                 not null,
   constraint PK_CATEGORY primary key (C_ID)
);

/*==============================================================*/
/* Table: COPY                                                  */
/*==============================================================*/
create table COPY (
   COPY_ID              SERIAL not null,
   BORROW_ID            INT4                 null,
   L_ID                 INT4                 not null,
   C_DATE               DATE                 not null,
   C_STATUS             BOOL                 not null,
   constraint PK_COPY primary key (COPY_ID)
);

/*==============================================================*/
/* Table: HISTORY                                               */
/*==============================================================*/
create table HISTORY (
   H_ID                 SERIAL not null,
   H_BORROW             DATE                 not null,
   H_RETURN             DATE                 not null,
   constraint PK_HISTORY primary key (H_ID)
);

/*==============================================================*/
/* Table: LOCATION                                              */
/*==============================================================*/
create table LOCATION (
   L_ID                 SERIAL not null,
   L_POSITION           CHAR(50)             not null,
   L_STOCK              INT4                 null,
   constraint PK_LOCATION primary key (L_ID)
);

/*==============================================================*/
/* Table: MEMBERS                                               */
/*==============================================================*/
create table MEMBERS (
   M_ID                 SERIAL not null,
   M_NAME               CHAR(255)            not null,
   M_ADDRESS            CHAR(255)            not null,
   M_TEL                CHAR(12)             null,
   M_GENDER             CHAR(5)              null,
   M_EMAIL              CHAR(55)             null,
   M_ISACTIVE           BOOL                 not null,
   constraint PK_MEMBERS primary key (M_ID)
);

/*==============================================================*/
/* Table: PUBLISHER                                             */
/*==============================================================*/
create table PUBLISHER (
   P_ID                 SERIAL not null,
   P_NAME               CHAR(150)            not null,
   P_DESCRIPTION        CHAR(255)            null,
   P_ISACTIVE           BOOL                 not null,
   constraint PK_PUBLISHER primary key (P_ID)
);

/*==============================================================*/
/* Table: "USER"                                                */
/*==============================================================*/
create table "USER" (
   U_USER               CHAR(55)             not null,
   U_PASS               CHAR(100)            not null,
   U_FULLNAME           CHAR(255)            not null,
   U_ADDRESS            CHAR(255)            null,
   U_EMAIL              CHAR(15)             null,
   U_TEL                CHAR(15)             null,
   U_ISACTIVE           BOOL                 not null,
   constraint PK_USER primary key (U_USER)
);

alter table BOOK
   add constraint FK_BOOK_BOOK_PUB_PUBLISHE foreign key (P_ID)
      references PUBLISHER (P_ID)
      on delete restrict on update restrict;

alter table BOOK
   add constraint FK_BOOK_COPY_BOOK_COPY foreign key (COPY_ID)
      references COPY (COPY_ID)
      on delete restrict on update restrict;

alter table BOOK_AUTHOR
   add constraint FK_BOOK_AUT_BOOK_AUTH_AUTHOR foreign key (A_ID)
      references AUTHOR (A_ID)
      on delete restrict on update restrict;

alter table BOOK_AUTHOR
   add constraint FK_BOOK_AUT_BOOK_AUTH_BOOK foreign key (B_ID)
      references BOOK (B_ID)
      on delete restrict on update restrict;

alter table BOOK_CATEGORY
   add constraint FK_BOOK_CAT_BOOK_CATE_CATEGORY foreign key (C_ID)
      references CATEGORY (C_ID)
      on delete restrict on update restrict;

alter table BOOK_CATEGORY
   add constraint FK_BOOK_CAT_BOOK_CATE_BOOK foreign key (B_ID)
      references BOOK (B_ID)
      on delete restrict on update restrict;

alter table BORROW
   add constraint FK_BORROW_MEMBER_BR_MEMBERS foreign key (M_ID)
      references MEMBERS (M_ID)
      on delete restrict on update restrict;

alter table BORROW
   add constraint FK_BORROW_USER_BORR_USER foreign key (U_USER)
      references "USER" (U_USER)
      on delete restrict on update restrict;

alter table BORROW_DETAIL
   add constraint FK_BORROW_D_BORROW_DE_BORROW foreign key (BORROW_ID)
      references BORROW (BORROW_ID)
      on delete restrict on update restrict;

alter table COPY
   add constraint FK_COPY_BORROW_CO_BORROW foreign key (BORROW_ID)
      references BORROW (BORROW_ID)
      on delete restrict on update restrict;

alter table COPY
   add constraint FK_COPY_COPY_LOCA_LOCATION foreign key (L_ID)
      references LOCATION (L_ID)
      on delete restrict on update restrict;

