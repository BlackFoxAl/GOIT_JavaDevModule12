INSERT INTO client(name)
VALUES
('Olivia Bennett'),
('Ethan Chambers'),
('Isabella Martinez'),
('Aiden Thompson'),
('Sophia Reynolds'),
('Caleb Mitchell'),
('Ava Harper'),
('Liam Sanchez'),
('Mia Anderson'),
('Noah Patel');

INSERT INTO planet(id, name)
VALUES
('MER','Mercury'),
('VEN','Venus'),
('EAR','Earth'),
('MARS','Mars'),
('JUP','Jupiter');

INSERT INTO ticket(created_at, client_id, from_planet_id, to_planet_id)
VALUES
('2024-02-10 01:00:00',1,'EAR','MER'),
('2024-02-10 02:00:00',2,'EAR','VEN'),
('2024-02-10 03:00:00',3,'EAR','MARS'),
('2024-02-10 04:00:00',4,'EAR','JUP'),
('2024-02-10 05:00:00',5,'MER','JUP'),
('2024-02-10 01:01:00',1,'MER','EAR'),
('2024-02-10 02:01:00',2,'VEN','EAR'),
('2024-02-10 03:01:00',3,'MARS','EAR'),
('2024-02-10 04:01:00',4,'JUP','EAR'),
('2024-02-10 05:01:00',5,'JUP','MER');