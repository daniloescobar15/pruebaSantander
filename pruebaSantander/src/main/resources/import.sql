INSERT INTO cliente (cedula,client_name  ) values (1,'rafa escobar');
INSERT INTO cliente (cedula,client_name  ) values (2,'camilo sexto');

INSERT INTO producto (id,nombre  ) values (1,'cuentaAhorro');
INSERT INTO producto (id,nombre  ) values (2,'cuentaCorriente');


INSERT INTO clientexproducto (cedula,idproducto,fecha_Registro  ) values (1,1,CURRENT_TIMESTAMP());
INSERT INTO clientexproducto (cedula,idproducto,fecha_Registro  ) values (2,2,CURRENT_TIMESTAMP());