CREATE TABLE IF NOT EXISTS users(
                                    user_id bigserial not null PRIMARY KEY,
                                    email VARCHAR(100) not null unique,
                                    username VARCHAR(100) not null ,
                                    password VARCHAR(100) not null ,
                                    profile_summary varchar(160)
                                    
);
CREATE TABLE IF NOT EXISTS messages(
                                      mess_id bigserial not null PRIMARY KEY,
                                      user_id bigint,
                                      message VARCHAR(400) not null,
                                      offset_time time with time zone not null,
                                      local_date date not null,
                                      FOREIGN KEY (user_id) REFERENCES users(user_id)
                                      --не удалять сообщения при удалении профиля TODO
);

INSERT INTO users(email, username, password, profile_summary) VALUES('test@mail.ru', 'test', '$2a$12$xuK3RGvW2Pv8r4X2Qke/AO963rfa.KDDXjSvdDzfra6xtmwXaOkbG', 'profile description');

