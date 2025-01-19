CREATE TABLE guardian (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    phone VARCHAR(50),
    email VARCHAR(255),
    address VARCHAR(255)
);

CREATE TABLE pet (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    species VARCHAR(255),
    breed VARCHAR(255),
    birth_date DATE,
    id_guardian BIGINT,
    CONSTRAINT fk_guardian FOREIGN KEY (id_guardian) REFERENCES guardian(id)
);

CREATE TABLE appointment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    local_date DATE NOT NULL,
    local_time TIME NOT NULL,
    reason VARCHAR(255),
    id_pet BIGINT NOT NULL,
    CONSTRAINT fk_pet FOREIGN KEY (id_pet) REFERENCES pet(id)
);

CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)






