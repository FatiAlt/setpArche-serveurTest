CREATE TABLE book (
  id BIGINT NOT NULL,
   title VARCHAR(255),
   author VARCHAR(255),
   isbn VARCHAR(255),
   resume VARCHAR(255),
   CONSTRAINT pk_book PRIMARY KEY (id)
);

INSERT TO book (title, author, isbn, resume) VALUES
('1984',
'Georges Orwell',
'0141036141',
'Published in 1949, 1984 takes place in our world divided into 3 totalitarian superpowers...
)
