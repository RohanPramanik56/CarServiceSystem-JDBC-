create database CAR_SERVICES;
use CAR_SERVICES;

-- CUSTOMER TABLE
CREATE TABLE CUSTOMERS (
                           ID INT AUTO_INCREMENT PRIMARY KEY,
                           NAME VARCHAR(50),
                           PHONE_NO VARCHAR(13) UNIQUE,
                           NO_OF_CAR INT
);

-- VEHICLE TABLE, VEHICLE WILL BE RELATED TO CUSTOMERS
CREATE TABLE VEHICLES (
                          VEH_ID INT AUTO_INCREMENT PRIMARY KEY,
                          PLATE_NO VARCHAR(30),
                          CAR_MODEL VARCHAR(20),
                          MODEL_YEAR VARCHAR(4),
                          CUST_ID INT,
                          FOREIGN KEY (CUST_ID)
                              REFERENCES CUSTOMERS (ID)
);

-- SERVICES TABLE
CREATE TABLE SERVICES (
                          ID INT AUTO_INCREMENT PRIMARY KEY,
                          DESCRIPTION VARCHAR(100),
                          COST DOUBLE
);

INSERT INTO SERVICES(DESCRIPTION, COST) VALUES
                                            ('OIL CHANGE', 1500),
                                            ('ENGINE REPAIR', 5000),
                                            ('TYRE REPLACEMENT', 2500),
                                            ('WASHING', 700),
                                            ('FULL SERVICES', 75000);

-- CREATE TABLE INVOICES, INVOICE WILL BE RELATED TO CUSTOMER AND SERVICES AND ALSO VEHICLE
CREATE TABLE INVOICES (
                          INV_ID INT AUTO_INCREMENT PRIMARY KEY,
                          CUST_ID INT,
                          VHCL_ID INT,
                          SRVC_ID INT,
                          INVOICE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          FOREIGN KEY (CUST_ID)
                              REFERENCES CUSTOMERS (ID),
                          FOREIGN KEY (VHCL_ID)
                              REFERENCES VEHICLES (VEH_ID),
                          FOREIGN KEY (SRVC_ID)
                              REFERENCES SERVICES (ID)
);


SHOW TABLES;