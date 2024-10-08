delimiter %%
create procedure Usp_Listar_Alumno(pdato varchar(50))
begin
select*from talumno where Nombres like concat(pdato,'%')
or codalumno like concat(pdato,'%')or DNI like concat(pdato,'%');
end %%;

delimiter %%
create procedure Usp_Listar_Alumnos(pdato varchar(50))
begin
select*from talumno where DNI=pdato;
end %%;

delimiter %%
create procedure Usp_Listar_Alumnos_Nombres(pdato varchar(50))
begin
select*from talumno where Nombres=pdato;
end %%;

if exists(select* from talumno where codalumno=pdato)then
delimiter %%
create function fn_Codsiguiente_Alumno()
returns varchar(8)
begin

declare codsiguiente varchar(8);
declare codactual varchar(8);
declare ultimo varchar(8);

if exists(select*from talumno)then
set codactual=(select max(codalumno)from talumno);
set ultimo=(substring(codactual,3,10))+1;
set codsiguiente=concat('AL', right(concat('00000',ultimo),10));

else
set codsiguiente='AL000001';
end if;
return codsiguiente;
end%%;

delimiter %%
create procedure usp_Eliminar_Alumno(
codalumno char(8))
begin
#--declaramos variable--
declare coderror varchar(1);
declare mensaje varchar(50);

#validar si el usuario ya existe
 if exists(select* from talumno where codalumno=pcodalumno)then         
 delete from talumno where codalumno=pcodalumno;
 set coderror='0';
 set mensaje='el registro se elimino correctamente';
     #elseset coderror='1';set mensaje='error: ya existe el dni';end if;
 else
 set coderror='1';
 set mensaje='error: no existe el alumno';
 end if;
select coderror,mensaje;
end %%

delimiter %%
create procedure usp_Insertar_Alumno(pcodalumno varchar(8),pnombres varchar(50) ,
pDNI varchar(8) ,
pdireccion varchar(50) ,
ptelefono varchar(9) ,
pfoto blob,
pcorreo varchar(50),
pfecha_graduacion varchar(50),
pred_social varchar(50),
psexo varchar(50))
begin
#--declaramos variable--
declare coderror varchar(1);
declare mensaje varchar(50);

#validar si el usuario ya existe
if not exists(select* from talumno where codalumno=pcodalumno)then
 if not exists(select* from talumno where correo=pcorreo )then
  if not exists(select* from talumno where DNI=pDNI )then
    if not exists(select* from talumno where telefono=ptelefono)then
       
 insert into talumno values(fn_Codsiguiente_Alumno(),pnombres,pDNI,
 pdireccion,ptelefono,pfoto,pcorreo,pfecha_graduacion,pred_social,psexo);
 

 set coderror='0';
 set mensaje='El Alumno se inserto correctamente';
    else set coderror='0';set mensaje='error: ya existe el TELEFONO';end if;

   else set coderror='0';set mensaje='error: ya existe el DNI';end if;
   else set coderror='0';set mensaje='error: ya existe el EMAIL';end if;
  
 else
 
   if exists(select* from talumno where codalumno=pcodalumno)then
 if  not exists(select* from talumno where correo=pcorreo and codalumno<>pcodalumno)then
    if not  exists(select* from talumno where telefono=ptelefono and codalumno<>pcodalumno)then

 update talumno set codalumno=pcodalumno,nombres=pnombres,DNI=pDNI,
 direccion=pdireccion,telefono=ptelefono,foto=pfoto,correo=pcorreo,
 fecha_graduacion=pfecha_graduacion,red_social=pred_social,sexo=psexo
 where codalumno=pcodalumno;
 
 set coderror='0';
 set mensaje='El registro se modifico correctamente';
    else set coderror='0';set mensaje='error: ya existe el TELEFONO no modifico';end if;
	else set coderror='0';set mensaje='error: ya existe el EMAIL no modifico';end if;

end if;
 
 end if;
 
select coderror,mensaje;
end %% 
delimiter ;

call Usp_Listar_Alumno('');

  call usp_Insertar_Alumno('','ALEXANDER ROJAS','10101010','AREQUIPA','999999888','','lordruso@gmail.com','2018/01/01','AL RED OR','MASCULINO');
  call usp_Insertar_Alumno('','WILBERT ROSAS','20202020','MEXICO','987987777','','WILBERR@gmail.com','2017/12/01','WILBER ROSAS','MASCULINO');
  call usp_Insertar_Alumno('','yet alexander','123','av.la cultura','9400410','','er00@','2018/01/01','san pq','MASCULINO');

