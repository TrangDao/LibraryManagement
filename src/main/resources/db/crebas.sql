/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     15/03/2016 1:56:10 PM                        */
/*==============================================================*/


drop index LOCATION_ADMIN_FK;

drop index ADMIN_PK;

drop table ADMIN;

drop index BOOK_PK;

drop table BOOK;

drop index ADMIN_BORROW_FK;

drop index BORROW_COPY_FK;

drop index BORROW_USER_FK;

drop index BORROW_PK;

drop table BORROW;

drop index LOCATION_COPY_FK;

drop index BORROW_COPY2_FK;

drop index BOOK_COPY_FK;

drop index COPY_PK;

drop table COPY;

drop index LOCATION_PK;

drop table LOCATION;

drop index BORROW_RETURN_BOOK2_FK;

drop index ADMIN_RETURN_FK;

drop index USER_RETURN_FK;

drop index RETURN_BOOK_PK;

drop table RETURN_BOOK;

drop index USERS_PK;

drop table USERS;

/*==============================================================*/
/* Table: ADMIN                                                 */
/*==============================================================*/
create table ADMIN (
   A_ID                 INT4                 not null,
   L_ID                 INT4                 null,
   A_ROLE               VARCHAR(100)         null,
   A_FIRSTNAME          VARCHAR(200)         null,
   A_LASTNAME           VARCHAR(200)         null,
   constraint PK_ADMIN primary key (A_ID)
);

/*==============================================================*/
/* Index: ADMIN_PK                                              */
/*==============================================================*/
create unique index ADMIN_PK on ADMIN (
A_ID
);

/*==============================================================*/
/* Index: LOCATION_ADMIN_FK                                     */
/*==============================================================*/
create  index LOCATION_ADMIN_FK on ADMIN (
L_ID
);

/*==============================================================*/
/* Table: BOOK                                                  */
/*==============================================================*/
create table BOOK (
   B_ID                 INT4                 not null,
   B_NAME               VARCHAR(200)         null,
   B_AUTHOR             VARCHAR(2000)        null,
   B_CATEGORY           VARCHAR(200)         null,
   constraint PK_BOOK primary key (B_ID)
);

/*==============================================================*/
/* Index: BOOK_PK                                               */
/*==============================================================*/
create unique index BOOK_PK on BOOK (
B_ID
);

/*==============================================================*/
/* Table: BORROW                                                */
/*==============================================================*/
create table BORROW (
   BR_ID                INT4                 not null,
   U_ID                 INT4                 null,
   A_ID                 INT4                 null,
   R_ID                 INT4                 null,
   C_ID                 INT4                 null,
   BR_BORROW_DATE       DATE                 not null,
   BR_CREATE_AT         DATE                 not null,
   BR_RETURN_DATE       DATE                 not null,
   constraint PK_BORROW primary key (BR_ID)
);

/*==============================================================*/
/* Index: BORROW_PK                                             */
/*==============================================================*/
create unique index BORROW_PK on BORROW (
BR_ID
);

/*==============================================================*/
/* Index: BORROW_USER_FK                                        */
/*==============================================================*/
create  index BORROW_USER_FK on BORROW (
U_ID
);

/*==============================================================*/
/* Index: BORROW_COPY_FK                                        */
/*==============================================================*/
create  index BORROW_COPY_FK on BORROW (
C_ID
);

/*==============================================================*/
/* Index: ADMIN_BORROW_FK                                       */
/*==============================================================*/
create  index ADMIN_BORROW_FK on BORROW (
A_ID
);

/*==============================================================*/
/* Table: COPY                                                  */
/*==============================================================*/
create table COPY (
   C_ID                 INT4                 not null,
   L_ID                 INT4                 null,
   B_ID                 INT4                 null,
   BR_ID                INT4                 null,
   C_NUMBER             INT4                 not null,
   constraint PK_COPY primary key (C_ID)
);

/*==============================================================*/
/* Index: COPY_PK                                               */
/*==============================================================*/
create unique index COPY_PK on COPY (
C_ID
);

/*==============================================================*/
/* Index: BOOK_COPY_FK                                          */
/*==============================================================*/
create  index BOOK_COPY_FK on COPY (
B_ID
);

/*==============================================================*/
/* Index: BORROW_COPY2_FK                                       */
/*==============================================================*/
create  index BORROW_COPY2_FK on COPY (
BR_ID
);

/*==============================================================*/
/* Index: LOCATION_COPY_FK                                      */
/*==============================================================*/
create  index LOCATION_COPY_FK on COPY (
L_ID
);

/*==============================================================*/
/* Table: LOCATION                                              */
/*==============================================================*/
create table LOCATION (
   L_ID                 INT4                 not null,
   L_NAME               VARCHAR(200)         null,
   L_ADDRESS            VARCHAR(200)         null,
   constraint PK_LOCATION primary key (L_ID)
);

/*==============================================================*/
/* Index: LOCATION_PK                                           */
/*==============================================================*/
create unique index LOCATION_PK on LOCATION (
L_ID
);

/*==============================================================*/
/* Table: RETURN_BOOK                                           */
/*==============================================================*/
create table RETURN_BOOK (
   R_ID                 INT4                 not null,
   U_ID                 INT4                 null,
   A_ID                 INT4                 null,
   BR_ID                INT4                 not null,
   R_CREATE_AT          DATE                 not null,
   R_RETURN_DATE        DATE                 not null,
   constraint PK_RETURN_BOOK primary key (R_ID)
);

/*==============================================================*/
/* Index: RETURN_BOOK_PK                                        */
/*==============================================================*/
create unique index RETURN_BOOK_PK on RETURN_BOOK (
R_ID
);

/*==============================================================*/
/* Index: USER_RETURN_FK                                        */
/*==============================================================*/
create  index USER_RETURN_FK on RETURN_BOOK (
U_ID
);

/*==============================================================*/
/* Index: ADMIN_RETURN_FK                                       */
/*==============================================================*/
create  index ADMIN_RETURN_FK on RETURN_BOOK (
A_ID
);

/*==============================================================*/
/* Index: BORROW_RETURN_BOOK2_FK                                */
/*==============================================================*/
create  index BORROW_RETURN_BOOK2_FK on RETURN_BOOK (
BR_ID
);

/*==============================================================*/
/* Table: USERS                                                 */
/*==============================================================*/
create table USERS (
   U_ID                 INT4                 not null,
   U_FIRSTNAME          VARCHAR(200)         null,
   U_LASTNAME           VARCHAR(200)         null,
   U_SCHOOL             INT4                 null,
   constraint PK_USERS primary key (U_ID)
);

/*==============================================================*/
/* Index: USERS_PK                                              */
/*==============================================================*/
create unique index USERS_PK on USERS (
U_ID
);

alter table ADMIN
   add constraint A_L foreign key (L_ID)
      references LOCATION (L_ID)
      on delete restrict on update restrict;

alter table BORROW
   add constraint BR_A foreign key (A_ID)
      references ADMIN (A_ID)
      on delete restrict on update restrict;

alter table BORROW
   add constraint BR_CP foreign key (C_ID)
      references COPY (C_ID)
      on delete restrict on update restrict;

alter table BORROW
   add constraint FK_BORROW_BORROW_RE_RETURN_B foreign key (R_ID)
      references RETURN_BOOK (R_ID)
      on delete restrict on update restrict;

alter table BORROW
   add constraint FK_BORROW_BORROW_US_USERS foreign key (U_ID)
      references USERS (U_ID)
      on delete restrict on update restrict;

alter table COPY
   add constraint CP_B foreign key (B_ID)
      references BOOK (B_ID)
      on delete restrict on update restrict;

alter table COPY
   add constraint CP_BR foreign key (BR_ID)
      references BORROW (BR_ID)
      on delete restrict on update restrict;

alter table COPY
   add constraint CP_L foreign key (L_ID)
      references LOCATION (L_ID)
      on delete restrict on update restrict;

alter table RETURN_BOOK
   add constraint FK_RETURN_B_ADMIN_RET_ADMIN foreign key (A_ID)
      references ADMIN (A_ID)
      on delete restrict on update restrict;

alter table RETURN_BOOK
   add constraint FK_RETURN_B_BORROW_RE_BORROW foreign key (BR_ID)
      references BORROW (BR_ID)
      on delete restrict on update restrict;

alter table RETURN_BOOK
   add constraint FK_RETURN_B_USER_RETU_USERS foreign key (U_ID)
      references USERS (U_ID)
      on delete restrict on update restrict;

