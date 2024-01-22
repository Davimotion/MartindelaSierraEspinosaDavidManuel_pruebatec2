# Gestor de turnos.

Se trata de un sencillo gestor de turnos que permite hacer un CRUD de ciudadanos y turnos a una base de datos.

## Funcionalidad

Ciudadanos y turnos tienen una relación @OnetoMany, pero en mi proyecto se les trabaja por separado, aunque se respeta la relación y es visible en la base de datos.
El proyecto tiene una serie de utilidades dadas por servlets como:
-Añadir registros para ciudadanos y turnos.
-Hacer búsquedas por Id.
-Hacer consultas específicas por apellido e ID de turno.
-Mostrar listas de turnos con diferentes órdenes y filtros. (falta el de espera, mas informacion en el apartado nota personal).
-Editar y borrar turnos.

## Front-End

El front end de este proyecto ha sido realizado a base de modificar un template gratuito de bootsrap. Para mejor legibilidad del código he aplicado un modelo de capas.
Las capas se encuentran en el directorio components.



## Nota personal.

Este proyecto ha sido muy duro por circumstancias imprevisibles. El jueves, cuando estaba empezandolo, mi abuela a la que cuido y con quien vivo sufrió una bradicardia y tuvo que
ser ingresada en el hospital, donde ha sido operada y donde ha permanecido hasta esta misma noche del 22/01/2024. Mi hermano y yo hemos pasado varios dias y noches con ella en el 
hospital, lo cual ha repertcutido en el tiempo y las energías que podiamos dedicar a esta prueba técnica. Me alegra decir que mi abuela está bien y se recupera favorablemente, y
que dadas las circumstancias estoy bastante orgulloso de mi proyecto, sin embargo he de mencionar las siguientes carencias:

-Falta el filtrado por espera de la consigna.
-Falta comentario y formateo en general, no me ha dado tiempo.
-Empecé el proyecto en Inglés (clases Controller y PersistanceController), pero después de pasar la noche en observación del hospital con mi abuela estaba tan cansado que continué 
 en Español sin darme cuenta y ya era tarde para cuando me di cuenta. Mas tarde por la falta de tiempo, hay muchos atributos y funciones en inglés que he cogido de diversas fuentes
 y que no he tenido tiempo de traducir o no llegaba a la entrega.

 Aun así, estoy contento de mi trabajo y si fuera posible me gustaria modificar el proyecto antes de la corrección, aunque no repercutiese tanto en la nota.
 Un saludo y gracias por tu comprensión.
 David.

 PD: no sé si mi hermano Enrique (tambien en este bootcamp) querrá comunicar algo de esto, pero el tambien ha pasado mucho tiempo estresado y en el hospital, y ha tenido las mismas
 dificultades que yo. Así que extiendo mi petición a el también.
