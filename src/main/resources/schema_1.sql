CREATE TABLE IF NOT EXISTS AUDUSD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPAUD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPJPY (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPCAD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS EURJPY (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS EURAUD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS EURGBP (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS EURUSD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS GBPUSD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS USDJPY (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS NZDUSD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

CREATE TABLE IF NOT EXISTS USDCAD (
  id integer PRIMARY KEY AUTO_INCREMENT,
  currency VARCHAR(10) NOT NULL,
  open numeric (18,5) NOT NULL,
  close numeric (18,5) NOT NULL,
  high numeric (18,5) NOT NULL,
  low numeric (18,5) NOT NULL,
  period VARCHAR(20) NOT NULL,
  data timestamp NOT NULL
);

-- CREATE TABLE IF NOT EXISTS QUOTES (
--   id integer PRIMARY KEY AUTO_INCREMENT,
--   currency VARCHAR(10) NOT NULL,
--   open numeric (18,5) NOT NULL,
--   close numeric (18,5) NOT NULL,
--   high numeric (18,5) NOT NULL,
--   low numeric (18,5) NOT NULL,
--   period VARCHAR(20) NOT NULL,
--   data timestamp NOT NULL
-- );