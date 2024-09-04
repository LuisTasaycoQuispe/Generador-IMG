![Diseño sin título](https://github.com/user-attachments/assets/3696cb14-6270-46f6-a51a-a9a3b2d901d8)

# GENERADOR DE IMAGEN POR TEXTO <img src="https://images.emojiterra.com/google/noto-emoji/animated-emoji/1f916.gif" style="width: 30px; height: 30px;" >      <img src="https://media.tenor.com/OEAjabUzGKEAAAAi/microsoft-computer.gif" style="width: 35px; height: 35px;" >

## DESCRIPCION  <img src="https://images.emojiterra.com/google/noto-emoji/animated-emoji/1f609.gif" style="width: 30px; height: 30px;" >
Se ha creado un generador de imágenes basado en texto es una innovadora herramienta de inteligencia artificial que transforma descripciones textuales en imágenes visuales. Este tipo de tecnología utiliza modelos avanzados de aprendizaje automático para interpretar las descripciones proporcionadas por los usuarios y crear imágenes que representan esas descripciones de manera precisa y detallada.

## Puntos
<img src="https://cdn0.iconfinder.com/data/icons/social-messaging-ui-color-shapes-3/3/31-512.png" style="width: 20px; height: 20px;" > Este proyecto ya esta configurado para genera imagens
Solo necesitamos crear nuestra api con la plataforma Rapid y crear nuestra api y con ello obtener el key
[Enlace a la plataforma](https://rapidapi.com/bussinesonline250/api/ai-text-to-image-generator-api/)


### Dentro de la Pagina

Seleccionamos esta opcion para poder crear el generador
![image](https://github.com/user-attachments/assets/60279b49-78a8-4463-8a05-209c1b47b5ae)

Ahora procedemos a seleccionar esta opcion  AI Text to Image Generator API
  
![image](https://github.com/user-attachments/assets/2f326745-f432-40f3-adc3-c7b63158485c)

Haremos clic en Subscribe to Test

![image](https://github.com/user-attachments/assets/5feb4d29-8e37-4afc-995b-095c225b6b03)

Y Seleccionamos el plan Free con el cual podremos hacer un total de 20 consultas al mes 

![image](https://github.com/user-attachments/assets/976c88fa-0c03-4c31-8954-955f64b8e464)

Una vez echo lo anterior prodremos ver como ya nos da para poder ejecutar
![image](https://github.com/user-attachments/assets/fbcc49f5-1f51-45dc-8729-0a4a5d180ab7)

Podremos hacer una consulta ingresando una descripcion de la imagen que queremos generar y como respuesta nos dara una URL el cual sera de la imagen generada

![image](https://github.com/user-attachments/assets/c309e4bb-b586-4ce0-bfb3-66a41eee397f)

La imagen generada

![image](https://github.com/user-attachments/assets/b822ae48-6fd3-4293-b04c-b2dcd723abde)




# COMO PODEMOS IMPLEMENTARLO EN NUESTRO PROYECTO SPRING BOOT <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Spring_Boot.svg/640px-Spring_Boot.svg.png" style="width: 30px; height: 30px;" >

Dentro de nuestro proyecto vamos a colocar solamente el KEY lo remaplzaremos por el que nos da la plataforma Rapid
  
![image](https://github.com/user-attachments/assets/28a043c5-3d11-4c3c-8be5-c2812e575e48)

Ese key lo remplazaremos su ubicacion es el aplication.properties

![image](https://github.com/user-attachments/assets/9a20460e-eb4b-46c0-8749-a2559ea923c4)
![image](https://github.com/user-attachments/assets/5ba0c45c-c89f-4785-a446-5a616c515f91)


Ahora si queremos probarlo en postman ya no habra necesidad de agregar header debido a que el proyecto ya esta configurado con todo ello lo unico que varia siempre es el kEY


``` JSON
{
  "inputs": "Un gato durante el dia"
}

``` 
![image](https://github.com/user-attachments/assets/e739e27e-1bd2-44d3-bd1b-f562778c6708)



La imagen generada [Enlace de la Imagen](https://storage.googleapis.com/face-10b17.appspot.com/1725485016212_realistic.jpg?GoogleAccessId=face-10b17%40appspot.gserviceaccount.com&Expires=1725488616&Signature=WM2CymCh42cpk6qnf7NzKauQQQ0FOlYkoIHXelwyTeGE9aqpwCW2xWurM7lfw%2F7j%2FezQZnB0byz1HTDnkBsOuqJMhNqqEwztPTPBKQLFf6kSwvZcFKIG2fE1HmtGvs5TWNPxdeke%2FgGZkGAgvl8I%2BuqJlRpMsrK5zyYz2WCLmpCCo7w8aeVhu8x%2F83KDQw12%2BoJVOcAQF6ppJHgh2QCy7pfxp%2FqKr0o%2BKxLNsj6Hi1T8EAhTMkjj1v4cxgzpgqQ2PKIec69TF96NmpG2iVLlHKpUv1rYq6OrT5Zv9n6n3tbY2KmV9hLqD%2FIL4SUfTxnfCADyZyrcBA%2BRvgx7QUkOCw%3D%3D)  

![image](https://github.com/user-attachments/assets/52faedef-aa7f-4a2a-bcad-dc5983d32ff5)


