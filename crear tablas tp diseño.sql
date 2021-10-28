create database if not exists TPDISENO9C;
-- drop database TPDISENO9C; 
 use TPDISENO9C;
CREATE TABLE if not exists pais  (
	idPais bigint PRIMARY KEY ,
	nombre varchar(40),
	nacionalidad varchar(40)
);
-- drop table pais;
CREATE TABLE if not exists provincia(
	idProvincia bigint PRIMARY KEY ,
	nombre varchar(40),
	pais bigint,
	 FOREIGN KEY (pais) REFERENCES pais (idPais) 
);

CREATE TABLE if not exists localidad(
	idLocalidad bigint PRIMARY KEY,
	nombre varchar(40),
	codigoPostal integer,
	provincia bigint,
	FOREIGN KEY (provincia) REFERENCES provincia(idProvincia)
);

CREATE TABLE if not exists direccion(
	idDireccion bigint PRIMARY KEY,
	calle varchar(15),
	numero integer,
	departamento varchar(15),
	piso integer,
	localidad bigint,
	FOREIGN KEY (localidad) REFERENCES localidad(idLocalidad)
);

CREATE TABLE if not exists contacto(
	idContacto bigint PRIMARY KEY AUTO_INCREMENT,
	nombre varchar(20),
	apellido varchar(20),
	telefono integer,
	mail varchar(40)
);

CREATE TABLE if not exists conserje(
	usuario varchar(20) PRIMARY KEY,
	contrasenia varchar(20),
	apellido varchar(20),
	nombre varchar(20)
);

CREATE TABLE if not exists tipo_habitacion(
	nombre varchar(25) PRIMARY KEY ,
	costoPorNoche real
);

CREATE TABLE if not exists habitacion(
	idHabitacion bigint PRIMARY KEY AUTO_INCREMENT,
	observacionEstado varchar(10),
	numero varchar(5),
	capacidad integer,
	piso varchar(5),
	tipoHabitacion varchar(25),
	FOREIGN KEY (tipoHabitacion) REFERENCES tipo_habitacion(nombre)
);

CREATE TABLE if not exists reserva(
	idReserva bigint PRIMARY KEY AUTO_INCREMENT,
	fechaInicio date,
	fechaFin date,
	idContacto bigint,
	usuario varchar(20),
	idHabitacion bigint,
	FOREIGN KEY (idContacto) REFERENCES contacto(idContacto),
	FOREIGN KEY (usuario) REFERENCES conserje(usuario),
	FOREIGN KEY (idHabitacion) REFERENCES habitacion(idHabitacion)
);


CREATE TABLE if not exists ocupacion(
	idOcupacion bigint PRIMARY KEY AUTO_INCREMENT,
	fechaInicio date,
	horaCheckIn integer,
	fechaFin date,
	horaCheckOut integer,
	usuario varchar(20),
	idHabitacion bigint,
	FOREIGN KEY (usuario) REFERENCES conserje(usuario),
	FOREIGN KEY (idHabitacion) REFERENCES habitacion(idHabitacion),
	CONSTRAINT check_hora CHECK (horaCheckIn >=0 AND horaCheckIn <=2359 AND horaCheckOut >=0 AND horaCheckOut <=2359 )
);

CREATE TABLE if not exists pasajero(
	idPasajero bigint  PRIMARY KEY AUTO_INCREMENT,
	apellido varchar(20),
	nombre varchar(20),
	tipoDoc varchar(10),
	numeroDoc integer,
	cuit varchar(13),
	posIVA varchar(20),
	fecNacimiento date,
	telefono integer,
	mail varchar(40),
	ocupacion varchar(25),
	nacionalidad bigint,
	direccion bigint,
	FOREIGN KEY (nacionalidad) REFERENCES pais(idPais),
	FOREIGN KEY (direccion) REFERENCES direccion(idDireccion)
);

CREATE TABLE if not exists pasajero_responsable(
	idPasajeroResponsable bigint PRIMARY KEY AUTO_INCREMENT,
	idPasajero bigint,
	idOcupacion bigint,
	FOREIGN KEY (idPasajero) REFERENCES pasajero(idPasajero),
	FOREIGN KEY (idOcupacion) REFERENCES ocupacion(idOcupacion)
);

CREATE TABLE if not exists pasajeros_ocupan(
	idPasajerosOcupan bigint PRIMARY KEY AUTO_INCREMENT,
	idPasajero bigint,
	idOcupacion bigint,
	FOREIGN KEY (idPasajero) REFERENCES pasajero(idPasajero),
	FOREIGN KEY (idOcupacion) REFERENCES ocupacion(idOcupacion)
);

CREATE TABLE if not exists producto_frigobar(
	idProductoFrigobar bigint PRIMARY KEY AUTO_INCREMENT,
	nombre varchar(20),
	monto real
);

CREATE TABLE if not exists servicio(
	idServicio bigint PRIMARY KEY AUTO_INCREMENT,
	nombre varchar(20),
	monto real
);

CREATE TABLE if not exists detalle_ocupacion_frigobar(
	idDetalleOcupacionFrigobar bigint PRIMARY KEY AUTO_INCREMENT,
	idProductoFrigobar bigint,
	idOcupacion bigint,
	FOREIGN KEY (idProductoFrigobar) REFERENCES producto_frigobar(idProductoFrigobar),
	FOREIGN KEY (idOcupacion) REFERENCES ocupacion(idOcupacion)
);

CREATE TABLE if not exists detalle_ocupacion_servicio(
	idDetalleOcupacionServicio bigint PRIMARY KEY AUTO_INCREMENT,
	idServicio bigint,
	idOcupacion bigint,
	FOREIGN KEY (idServicio) REFERENCES Servicio(idServicio),
	FOREIGN KEY (idOcupacion) REFERENCES ocupacion(idOcupacion)
);



CREATE TABLE if not exists persona_juridica(
	idPersonaJuridica bigint PRIMARY KEY AUTO_INCREMENT,
	nombre varchar(20),
	cuit varchar(13),
	razonSocial varchar(20),
	telefono integer,
	mail varchar(40),
	direccion bigint,
	FOREIGN KEY (direccion) REFERENCES direccion(idDireccion)
);
-- POSIBLEMENTE SEA REDUNDANTE LA INFORMACION. YA ESTA DISPONIBLE EN PERSONA JURIDICA O PASAJERO
CREATE TABLE if not exists responsable_de_pago(
	idResponsableDePago bigint PRIMARY KEY AUTO_INCREMENT,
	mailEmpresa varchar(40),
	direccionEmpresa bigint,
	telefonoEmpresa integer,
	nombre varchar(20),
	condFiscalEmpresa varchar(15),
	pasajero bigint,
	personaJuridica bigint,
	FOREIGN KEY (pasajero) REFERENCES pasajero(idPasajero),
	FOREIGN KEY (personaJuridica) REFERENCES persona_juridica(idPersonaJuridica),
	FOREIGN KEY (direccionEmpresa) REFERENCES direccion(idDireccion)
);

CREATE TABLE  if not exists factura(
	numeroFactura bigint PRIMARY KEY AUTO_INCREMENT,
	IVA real,
	mailEmpresa varchar(40),
	direccionEmpresa bigint,
	telefonoEmpresa integer,
	condFiscalEmpresa varchar(15),
	fechaEmision date,
	tipoFactura char,
	valorEstadia real,
	totalFinal real,
	idOcupacion bigint,
	idResponsableDePago bigint,
	usuario varchar(20),
	CONSTRAINT check_tipoFactura CHECK (tipoFactura='A' OR tipoFactura='B'),
	FOREIGN KEY (idOcupacion) REFERENCES ocupacion(idOcupacion),
	FOREIGN KEY (idResponsableDePago) REFERENCES responsable_de_pago(idResponsableDePago),
	FOREIGN KEY (direccionEmpresa) REFERENCES direccion(idDireccion),
	FOREIGN KEY (usuario) REFERENCES conserje(usuario)
);

CREATE TABLE if not exists cantidad_consumo_frigobar(
	idCantidadConsumoFrigobar bigint PRIMARY KEY AUTO_INCREMENT,
	idProductoFrigobar bigint,
	numeroFactura bigint,
	cantidad integer,
	FOREIGN KEY (idProductoFrigobar) REFERENCES producto_frigobar(idProductoFrigobar),
	FOREIGN KEY (numeroFactura) REFERENCES factura(numeroFactura)
);

CREATE TABLE if not exists cantidad_consumo_servicio(
	idCantidadConsumoServicio bigint PRIMARY KEY AUTO_INCREMENT,
	idServicio bigint,
	numeroFactura bigint,
	cantidad integer,
	FOREIGN KEY (idServicio) REFERENCES Servicio(idServicio),
	FOREIGN KEY (numeroFactura) REFERENCES factura(numeroFactura)
);

CREATE TABLE if not exists banco(
	idBanco bigint PRIMARY KEY AUTO_INCREMENT,
	nombre varchar(30),
	direccion bigint,
	FOREIGN KEY (direccion) REFERENCES direccion(idDireccion)
);

CREATE TABLE if not exists cheque(
	nroCheque bigint PRIMARY KEY AUTO_INCREMENT,
	fechaDeCobro date,
	bancoCheque bigint,
	plaza integer,
	FOREIGN KEY (bancoCheque) REFERENCES banco(idBanco)
);

CREATE TABLE if not exists tarjeta(
	numeroTarjeta bigint PRIMARY KEY AUTO_INCREMENT,
	nombreTarjeta varchar(15),
	tipo varchar(10),
	banco bigint,
	FOREIGN KEY (banco) REFERENCES banco(idBanco)
);


CREATE TABLE if not exists detalle_pago_factura(
	idDetallePagoFactura bigint PRIMARY KEY AUTO_INCREMENT,
	metodoDePago varchar(20),
	montoAbonado real,
	abonaEstadia bool,
	nroCheque bigint,
	numeroTarjeta bigint,
	numeroFactura bigint,
	FOREIGN KEY (nroCheque) REFERENCES cheque(nroCheque),
	FOREIGN KEY (numeroTarjeta) REFERENCES tarjeta(numeroTarjeta),
	FOREIGN KEY (numeroFactura) REFERENCES factura(numeroFactura)
);

CREATE TABLE if not exists nota_de_credito(
	idNotaDeCredito bigint PRIMARY KEY AUTO_INCREMENT,
	numero integer,
	monto real,
	numeroFactura bigint,
	idResponsableDePago bigint,
	FOREIGN KEY (numeroFactura) REFERENCES factura(numeroFactura),
	FOREIGN KEY (idResponsableDePago) REFERENCES responsable_de_pago(idResponsableDePago)
);

CREATE TABLE if not exists detalle_pago_frigobar(
	idDetallePagoFrigobar bigint PRIMARY KEY AUTO_INCREMENT,
	valorTotalEnPesos real,
	idCantidadConsumoFrigobar bigint,
	idDetallePagoFactura bigint,
	FOREIGN KEY (idCantidadConsumoFrigobar) REFERENCES cantidad_consumo_frigobar(idCantidadConsumoFrigobar),
	FOREIGN KEY (idDetallePagoFactura) REFERENCES detalle_pago_factura(idDetallePagoFactura)
);

CREATE TABLE if not exists detalle_pago_servicio(
	idDetallePagoServicio bigint PRIMARY KEY AUTO_INCREMENT,
	valorTotalEnPesos real,
	idCantidadConsumoServicio bigint,
	idDetallePagoFactura bigint,
	FOREIGN KEY (idCantidadConsumoServicio) REFERENCES cantidad_consumo_servicio(idCantidadConsumoServicio),
	FOREIGN KEY (idDetallePagoFactura) REFERENCES detalle_pago_factura(idDetallePagoFactura)
);

