USE GSCookieDB;

-- TRIGGERS --
DROP TRIGGER IF EXISTS UPDATE_MONEY_RECEIVED;

USE DELIMITER $$

CREATE TRIGGER UPDATE_MONEY_RECEIVED
AFTER UPDATE ON `MONEY`
FOR EACH ROW BEGIN
	-- SELECT PRICE AS PRODUCT_PRICE INTO @PRODUCT_PRICE FROM PRODUCT WHERE `PRODUCT`.`PRODUCT_ID` = NEW.PRODUCT_ID;
    -- SELECT SCOUT_ID AS ORDERS_SCOUT_ID INTO @ORDERS_SCOUT_ID FROM PRODUCT_ORDER WHERE PRODUCT_ORDER.SCOUT_ID = NEW;
    -- SELECT QUANTITY AS ORDERS_QUANTITY INTO @ORDERS_QUANTITY FROM PRODUCT_ORDER WHERE PRODUCT_ORDER.QUANTITY = NEW.AMOUNT/PRODUCT_ORDER.QUANTITY;
    
    IF NEW.AMOUNT_RECEIVED = OLD.AMOUNT THEN  
		UPDATE PRODUCT_ORDER SET STATUS = 'COMPLETED' WHERE PRODUCT_ORDER.ORDER_ID = NEW.TRANSACTION_ID;
	END IF;
    
END;