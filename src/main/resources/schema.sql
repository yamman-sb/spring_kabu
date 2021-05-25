/* Drop Tables */
DROP TABLE IF EXISTS holding;
DROP TABLE IF EXISTS chart;
DROP TABLE IF EXISTS portfolio;
DROP TABLE IF EXISTS stock;

/* Create Tables */
CREATE TABLE stock
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(128)
);

CREATE TABLE chart
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    plot_date DATE,
    price INTEGER,
    stock_id INTEGER,
    CONSTRAINT fk_stock_chart_id FOREIGN KEY (stock_id) REFERENCES stock(id)
);

CREATE TABLE portfolio
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(128),
    balance INTEGER
);

CREATE TABLE holding
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    possession INTEGER,
    stock_id INTEGER,
    portfolio_id INTEGER,
    CONSTRAINT fk_stock_holding_id FOREIGN KEY (stock_id) REFERENCES stock(id),
    CONSTRAINT fk_stock_portfolio_id FOREIGN KEY (portfolio_id) REFERENCES portfolio(id)
);
