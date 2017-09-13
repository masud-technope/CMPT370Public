
-- create a class table

CREATE TABLE `cmpt370`.`class` (
  `classID` INT NOT NULL,
  `instructor` VARCHAR(45) NOT NULL,
  `credit` INT NOT NULL,
  PRIMARY KEY (`classID`));