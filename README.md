**Intro**

El Web trabaja con ciertos protocolos y arquitecturas.

La principal arquitectura es Cliente - Servidor.
Cliente hace peticiones o consultas (HTTP) a Servidor Web. El servidor Web le retorna la respuesta HTTP.

HTTP -> Protocolo de transferencia de hipertexto.
Cliente suele ser una persona o navegador pero puede ser que tambien sea un servidor.

HTTPS -> Tiene más seguridad (encriptada). se suele pasar a este protocolo cuando se pasa a producción.

FrontEnd (Cliente) <-> BackEnd (Servidor)

**URL**
EndPoints son direcciones que van a tener recursos de una dirección que consume.

Forma de una URL
protocolo://subdominio.nombredeldominio.extension.geolocalizacion/ruta
https://www.google.com.ar/ruta


**Protocolo HTTP**

Cliente, Servidor, Solicitudes que van y vienen.

**Header**
Metadatos muy importantes

**Request**

Una solicitud es un mensaje desde el cliente hacia el servidor:
1) Metodo
2) Cabecera
3) Header
4) Body
   Get, Post (añade), Put (reemplaza), Patch (reemplaza parcial), Delete son los metodos mas usados.

**Response**

Status Code ( 100, 200, 404 etc)


**API**

API Rest : Representational State Transfer, no tiene algun estado, las peticiones van y vienen sin limites y retornan respuestas json o xml. No se le guarda el estado
Cliente solicita a Rest API y API a Database que retorna a API la respuesta


**Spring vs SpringBoot**

Spring main Frame  (Framework).
Conjunto de proyectos opensource en Java para agilizar los procedimientos de desarrollo de aplicaciones. No tenia un servidor web embebido, habia que configuarlo, levantarlo, deployarlo etc y llevava muchos dias (de promedio era 2 dias solo para levantar el servidor) Entonces Spring facilitó la vida a todos =>

Spring boot -> Herramientas dentro de Spring, es una extensión del framework.

Spring + Servidor Web Embedded (TomCat) - XML = SPRINGBOOT

1) Spring initializr
   start.spring.io

**Inyección de dependencias**
Inyectar con constructores todas las dependencias que necesiten. Ayuda a descoplar componentes de la clase usando abstracciones y no implementaciones. Se suele trabajar con fabricas.