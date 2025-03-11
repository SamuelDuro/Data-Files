-- Create Patients Table
CREATE TABLE patients (
    patient_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    date_of_birth DATE NOT NULL,
    age VARCHAR(45) NOT NULL,
    gender ENUM('Male', 'Female', 'Other') NOT NULL,
    contact_number VARCHAR(20),
    address VARCHAR(255)
);

-- Create Procedures Table
CREATE TABLE procedures (
    procedure_id INT PRIMARY KEY AUTO_INCREMENT,
    procedure_name VARCHAR(100) NOT NULL,
    cost DECIMAL(10,2) NOT NULL,
    medical_practitioner VARCHAR(45)
);

-- Create Patient History Table
CREATE TABLE patient_history (
    history_id INT PRIMARY KEY AUTO_INCREMENT,
    patient_id INT NOT NULL,
    procedure_id INT NOT NULL,
    procedure_date DATE NOT NULL,
    notes TEXT,
    FOREIGN KEY (patient_id) REFERENCES patients(patient_id) ON DELETE CASCADE,
    FOREIGN KEY (procedure_id) REFERENCES procedures(procedure_id) ON DELETE CASCADE
);
