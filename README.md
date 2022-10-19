# springboot-rest-api-library

# Steps for Installation

1. Clone the project

git clone https://github.com/aditpatel45/springboot-rest-api-library.git

2. Setting up the Database

Create a new database named "db"

3. Change mysql username and password as per your installation

open src/main/resources/application.properties file from the root directory
change username and password of the database according to your setup


# Functionalities of REST API

GET request to get all books.  /books

<img width="1098" alt="image" src="https://user-images.githubusercontent.com/52651771/196582441-07cbad11-b809-4cc4-859f-49037367cd72.png">

GET request to find a particular book using barcode.  /books/{barcode}

<img width="1098" alt="image" src="https://user-images.githubusercontent.com/52651771/196583106-6a504957-a928-40e2-a33c-a301118ba266.png">

POST request to add a new book.   /add

<img width="1064" alt="image" src="https://user-images.githubusercontent.com/52651771/196583455-20322cf6-6ee9-4059-be4b-948bfd5b6df5.png">

DELETE request to delete a book by barcode.  /delete/{barcode}

<img width="1094" alt="image" src="https://user-images.githubusercontent.com/52651771/196583618-ffa30cdd-5a3c-424b-b40f-0035adee968c.png">


# Testing

You can test the project using POSTMAN.
