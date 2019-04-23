alter table MEDEWERKERS2
add geslacht varchar(1);
constraint check_geslacht
CHECK (geslacht if not null and geslacht = "M" or "V");

CREATE SEQUENCE afdelingnr
START WITH 10
INCREMENT BY 10
minvalue 10 
maxvalue 100;

insert into afdelingen
VALUES (60, 'HENK', 'EINDHOVEN', 7698); 
insert into afdelingen
VALUES (70, 'JAN' , 'EINDHOVEN' , 7839);
insert into afdelingen
VALUES (80, 'FREEK', 'SCHIJNDEL', 7752);
insert into afdelingen
VALUES (90, 'PIETHEIJN' , 'GREUNINGEN', 7782);

CREATE TABLE adressen
POSTCODE VARCHAR(6)
    constraint PK
    primary key, 
HUISNUMMER VARCHAR(6)
    constraint H_PK
    primary key, 
INGANGSDATUM DATE NOT NULL,
    constraint I_PK
    primary key, 
EINDDATUM DATE constraint datum_chk
                check (ingangsdatum < einddatum)
MED_MNR number not null constraint M_FRK
    foreign key;