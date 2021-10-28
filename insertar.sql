use tpdiseno9c;

insert into pais (idPais, nombre, nacionalidad) value (0,"Argentina","Argentino");
insert into provincia (idProvincia, nombre, pais) value (0,"Santa Fe",0);
insert into localidad (idLocalidad, nombre, codigoPostal, provincia) value (0,"Santa Fe",3000,0);
insert into localidad (idLocalidad, nombre, codigoPostal, provincia) value (2,"Totora",3000,0);
insert into direccion (idDireccion, calle, numero, departamento, piso, localidad ) value (0,"domingo silva",3333,2,2,0);

insert into pasajero ( apellido, nombre,tipoDoc, numeroDoc, cuit, posIVA, fecNacimiento, telefono, mail, ocupacion, nacionalidad, direccion)
values ("Perez", "Pedro", "DNI", 325468 , "20-32568-8", "algo", "1990-01-01", 333333, "relojero@gmail.com", "relojero", 0, 0);

insert into pasajero ( apellido, nombre,tipoDoc, numeroDoc, cuit, posIVA, fecNacimiento, telefono, mail, ocupacion, nacionalidad, direccion)
values ("Perez", "pablo", "DNI", 325468 , "20-32568-8", "algo", "1990-01-01", 333333, "relojero@gmail.com", "relojero", 0, 0);


insert into pais (idPais, nombre, nacionalidad) value (1,"Brasil","Argentino");
insert into provincia (idProvincia, nombre, pais) value (1,"San Pablo",1);
insert into localidad (idLocalidad, nombre, codigoPostal, provincia) value (1,"San Pablo",8000,0);
select * from pasajero;
-- delete from localidad where idLocalidad =1