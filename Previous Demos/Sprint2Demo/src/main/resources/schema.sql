CREATE TABLE receipts (
  id INT UNSIGNED AUTO_INCREMENT,
  uploaded TIME DEFAULT CURRENT_TIME(),
  merchant VARCHAR(255),
  amount DECIMAL(12,2),
  receipt_type INT UNSIGNED,

  PRIMARY KEY (id)
);

CREATE TABLE datainfo (
  companyName VARCHAR (255),
  id INT UNSIGNED AUTO_INCREMENT,
  uploaded TIME DEFAULT CURRENT_TIME(),
  dataType VARCHAR(255),
  reason VARCHAR(1024),
  shared BIT,
  address VARCHAR (255),
  contact VARCHAR (255),
  website VARCHAR (255),
  dopName VARCHAR (255),
  dopContact VARCHAR (255),
  companyType VARCHAR (255),
  PRIMARY KEY (id)
);

CREATE TABLE tags (
 id INT UNSIGNED AUTO_INCREMENT,
 receipt_id INT UNSIGNED,
  tag VARCHAR(255),

)