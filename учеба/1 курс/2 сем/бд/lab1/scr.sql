DROP TABLE IF EXISTS columnn cascade;
DROP TABLE IF EXISTS horizon cascade;
DROP TABLE IF EXISTS view_row_of_columns cascade;
DROP TABLE IF EXISTS views cascade;
DROP TABLE IF EXISTS doubtful cascade;
 
CREATE TABLE columnn(
	id SERIAL PRIMARY KEY,
	height int,
	distance_to_next int
	);

CREATE TABLE horizon(
	id SERIAL PRIMARY KEY,
	absorbed_columns int references columnn(id)
	);

CREATE TABLE view_row_of_columns(
	id SERIAL PRIMARY KEY,
	column_id int references columnn(ID),
	is_absorbed boolean
	);

CREATE TABLE views(
	id SERIAL PRIMARY KEY,
	appearance INT references view_row_of_columns(id),
	comment varchar(255)
	);

CREATE TABLE doubtful (
	id SERIAL PRIMARY KEY,
	view INT references views(id),
	name varchar(255),
	phone varchar(30)
	);

INSERT INTO columnn (id,height,distance_to_next) VALUES 
	(DEFAULT, 234,242);

INSERT INTO horizon (id, absorbed_columns) VALUES
	(DEFAULT,1);
INSERT INTO view_row_of_columns(id,column_id,is_absorbed) VALUES	
	(DEFAULT, 1, false);
INSERT INTO views (id,appearance,comment) VALUES
	(DEFAULT,1,'gg');
INSERT INTO doubtful (id,view,name,phone) VALUES
	(DEFAULT,1,'name','88005553535');


