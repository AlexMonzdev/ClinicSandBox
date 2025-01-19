-- Insert guardians
INSERT INTO guardian (name, phone, email, address) VALUES
('John Doe', '123456789', 'john.doe@example.com', '123 Elm Street'),
('Jane Smith', '987654321', 'jane.smith@example.com', '456 Oak Avenue'),
('Michael Brown', '555555555', 'michael.brown@example.com', '789 Pine Road'),
('Emily Johnson', '222222222', 'emily.johnson@example.com', '101 Maple Lane'),
('William Wilson', '333333333', 'william.wilson@example.com', '202 Birch Drive'),
('Linda Garcia', '444444444', 'linda.garcia@example.com', '303 Cedar Court'),
('Elizabeth Martinez', '666666666', 'elizabeth.martinez@example.com', '404 Cherry Circle'),
('James Anderson', '777777777', 'james.anderson@example.com', '505 Walnut Street'),
('Patricia Thomas', '888888888', 'patricia.thomas@example.com', '606 Spruce Boulevard'),
('Robert Jackson', '999999999', 'robert.jackson@example.com', '707 Fir Terrace');

-- Insert pets
INSERT INTO pet (name, species, breed, birth_date, id_guardian) VALUES
('Fluffy', 'Dog', 'Golden Retriever', '2020-01-01', 1),
('Whiskers', 'Cat', 'Siamese', '2019-05-15', 2),
('Buddy', 'Dog', 'Beagle', '2018-03-10', 3),
('Mittens', 'Cat', 'Persian', '2021-07-22', 4),
('Shadow', 'Dog', 'German Shepherd', '2017-11-05', 5),
('Daisy', 'Dog', 'Bulldog', '2016-02-28', 6),
('Tiger', 'Cat', 'Maine Coon', '2018-12-14', 7),
('Coco', 'Dog', 'Poodle', '2019-08-09', 8),
('Simba', 'Cat', 'Bengal', '2020-06-18', 9),
('Max', 'Dog', 'Labrador', '2015-04-25', 10),
('Bella', 'Dog', 'Chihuahua', '2020-09-01', 1),
('Luna', 'Cat', 'Russian Blue', '2019-02-11', 2),
('Charlie', 'Dog', 'Boxer', '2017-03-14', 3),
('Lucy', 'Cat', 'Ragdoll', '2018-10-10', 4),
('Rocky', 'Dog', 'Doberman', '2016-05-20', 5),
('Milo', 'Dog', 'Husky', '2018-07-07', 6),
('Lily', 'Cat', 'Abyssinian', '2019-09-30', 7),
('Oscar', 'Dog', 'Corgi', '2020-11-25', 8),
('Leo', 'Cat', 'Savannah', '2017-01-16', 9),
('Jack', 'Dog', 'Great Dane', '2016-08-08', 10);

-- Insert appointments
INSERT INTO appointment (local_date, local_time, reason, id_pet) VALUES
('2023-12-01', '09:00:00', 'Vaccination', 1),
('2023-12-01', '10:00:00', 'Check-up', 2),
('2023-12-02', '11:00:00', 'Dental Cleaning', 3),
('2023-12-02', '12:30:00', 'Spaying', 4),
('2023-12-03', '14:00:00', 'Neutering', 5),
('2023-12-03', '15:15:00', 'Ear Infection', 6),
('2023-12-04', '16:00:00', 'Skin Allergy', 7),
('2023-12-04', '08:30:00', 'Vaccination', 8),
('2023-12-05', '09:45:00', 'Injury Check', 9),
('2023-12-05', '11:15:00', 'Parasite Treatment', 10),
('2023-12-06', '10:00:00', 'Vaccination', 11),
('2023-12-06', '13:30:00', 'Dental Check-up', 12),
('2023-12-07', '14:45:00', 'X-ray', 13),
('2023-12-07', '15:30:00', 'Grooming', 14),
('2023-12-08', '08:00:00', 'Surgery Follow-up', 15),
('2023-12-08', '10:30:00', 'Weight Loss Consultation', 16),
('2023-12-09', '11:45:00', 'Vaccination', 17),
('2023-12-09', '13:00:00', 'Eye Infection', 18),
('2023-12-10', '09:30:00', 'Check-up', 19),
('2023-12-10', '10:15:00', 'Wound Care', 20),
('2023-12-11', '08:45:00', 'Fever Treatment', 1),
('2023-12-11', '10:00:00', 'Joint Pain', 2),
('2023-12-12', '11:30:00', 'Vaccination', 3),
('2023-12-12', '13:00:00', 'Ear Mite Treatment', 4),
('2023-12-13', '14:30:00', 'Dental Surgery', 5),
('2023-12-13', '15:45:00', 'Behavioral Issue', 6),
('2023-12-14', '09:00:00', 'Post-Op Check', 7),
('2023-12-14', '10:15:00', 'Diet Consultation', 8),
('2023-12-15', '11:45:00', 'Vaccination', 9);

INSERT INTO `user` (`password`, `role`, `username`)
VALUES ('1234', 'ROLE_USER', 'admin');