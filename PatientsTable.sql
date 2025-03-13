-- Initialize Database

create database dentistsdb;
use dentistsdb;

-- Create Patients Table
CREATE TABLE patients (
    patient_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    phone  varchar(200),
    email varchar(50) not null,
    date_of_birth DATE NOT NULL,
    address varchar(100) not null,
    city varchar(100),
    state  varchar(100),
    zipcode  varchar(100),
    gender  varchar(100),

    constraint gender_constraint check (gender in
    ('F', 'M', 'O'))
);

-- Create Procedures Table
CREATE TABLE procedures (
    procedure_id INT PRIMARY KEY AUTO_INCREMENT,
    procedure_name VARCHAR(100) NOT NULL
);

-- Create Patient History Table
CREATE TABLE patient_history (
    record_id INT primary key,
    patient_id INT NOT NULL,
    procedure_id INT NOT NULL,
    procedure_date DATE NOT NULL,
    dentist VARCHAR(100) NOT NULL,
    assistant VARCHAR(100) NOT NULL,
    notes  varchar(200),

    FOREIGN KEY (patient_id) REFERENCES patients(patient_id), 
    FOREIGN KEY (procedure_id) REFERENCES procedures(procedure_id), 
    
    constraint dentist_constraint check(
    dentist in
    ('John Smith', 'Samuel Duro-Aina', 'Brittany Klose')),
    
    constraint assistant check(
    assistant in
    ('Sam Winchester','Nathaniel bacon','Nicolas Jackson','Mark Grayson', 'Nolan Edward', 'Harry Porter'))
);

select * from patients;

select * from patient_history;

select * from procedures
