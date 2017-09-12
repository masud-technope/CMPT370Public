ALTER TABLE `cmpt370`.`staff` 
ADD INDEX `branchNo_idx` (`branchNo` ASC);
ALTER TABLE `cmpt370`.`staff` 
ADD CONSTRAINT `branchNo`
  FOREIGN KEY (`branchNo`)
  REFERENCES `cmpt370`.`branch` (`branchNo`)
  ON DELETE NO ACTION
  ON UPDATE CASCADE;