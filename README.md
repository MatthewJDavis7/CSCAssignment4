# ASSIGNMENT 4 CRUD API

This API performs CRUD operations on Student objects as described below.

## API Endpoints
Use POSTMAN to try the following endpoints:

## Get list of all Animals

### Request

    `GET /animals/all`

    `http://localhost:8080/animals/all`

   
### Response

     [
   
     {"animalId": 1, "name": "Robin", "scientificName": "Turdus migratorius", "species": "bird", "habitat": "Forest", "description": "filler description for ID 1"}, 
      
     {"animalId": 2, "name": "Russian Blue", "scientificName": "Felis catus", "species": "cat", "habitat": "City", "description": "filler description for ID 2"},
     
     {"animalId": 3, "name": "Blue Jay", "scientificName": "Cyanocitta cristata", "species": "bird", "habitat": "Forest", "description": "filler description for ID 3"} 
 
     ]

## Get a specific Animal

### Request

    `GET /animals/{animalId}`

    `http://localhost:8080/animals/1`

### Response

    {
      "animalId": 1, "name": "Robin", "scientificName": "Turdus migratorius", "species": "bird", "habitat": "Forest", "description": "filler description for ID 1"
    }

## Create a new Animal

### Request

    `POST /animals/new`
    
    `http://localhost:8080/animals/new` --data '{ "name": "Husky", "scientificName": "Canis lupus familiaris", "species": "dog", "habitat": "City", "description": "filler description for ID 4"}'

### Response

     [
   
     {"animalId": 1, "name": "Robin", "scientificName": "Turdus migratorius", "species": "bird", "habitat": "Forest", "description": "filler description for ID 1"}, 
      
     {"animalId": 2, "name": "Russian Blue", "scientificName": "Felis catus", "species": "cat", "habitat": "City", "description": "filler description for ID 2"},
     
     {"animalId": 3, "name": "Blue Jay", "scientificName": "Cyanocitta cristata", "species": "bird", "habitat": "Forest", "description": "filler description for ID 3"}, 

     {"animalId": 4, "name": "Husky", "scientificName": "Canis lupus familiaris", "species": "dog", "habitat": "City", "description": "filler description for ID 4"}
     
     ]

## Get Animals by species

### Request

    `GET /animals?species=bird`

    `http://localhost:8080/animals?species=bird`

   
### Response

     [
   
     {"animalId": 1, "name": "Robin", "scientificName": "Turdus migratorius", "species": "bird", "habitat": "Forest", "description": "filler description for ID 1"}, 
   
     {"animalId": 3, "name": "Blue Jay", "scientificName": "Cyanocitta cristata", "species": "bird", "habitat": "Forest", "description": "filler description for ID 3"} 
   
     ]

## Get Animals whose name contains

### Request

    `GET /animals/name?name=blue`

    `http://localhost:8080/animals/name?name=blue`

   
### Response

     [
   
     {"animalId": 2, "name": "Russian Blue", "scientificName": "Felis catus", "species": "cat", "habitat": "City", "description": "filler description for ID 2"},
   
     {"animalId": 3, "name": "Blue Jay", "scientificName": "Cyanocitta cristata", "species": "bird", "habitat": "Forest", "description": "filler description for ID 3"}
     
     ]

## Update an existing Animal

### Request

    `PUT /animals/update/{animalId}`
    
    `http://localhost:8080/animal/update/1` --data '{ "name": "robinUpdated", "scientificName": "Turdus migratorius", "species": "bird", "habitat": "Forest", "description": "filler description for ID 1"}'

   ### Response
   
    {
     "animalId": 1, "name": "RobinUpdated", "scientificName": "Turdus migratorius", "species": "bird", "habitat": "Forest", "description": "filler description for ID 1"
    }


## Delete an existing Animal

### Request

    `DELETE /animals/delete/{animalId}`
    
    `http://localhost:8080/animals/delete/1`

### Response
    [
   
    {"animalId": 2, "name": "Russian Blue", "scientificName": "Felis catus", "species": "cat", "habitat": "City", "description": "filler description for ID 2"},
    
    {"animalId": 3, "name": "Blue Jay", "scientificName": "Cyanocitta cristata", "species": "bird", "habitat": "Forest", "description": "filler description for ID 3"}, 

    {"animalId": 4, "name": "Husky", "scientificName": "Canis lupus familiaris", "species": "dog", "habitat": "City", "description": "filler description for ID 4"}
     
    ]
