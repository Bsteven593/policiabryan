url post= http://localhost:8012/api/v2/weapons
weapons
{
    "name": "Pistol",
    "code": 12345,
    "power": "High"
}

url post= http://localhost:8012/api/v2/patrols
patrols
{
    "plate": "ABC-123",
    "category": "Sedan"
}

url post= http://localhost:8012/api/v2/police
padre-police
{
    "name": "Nombre del policía",
    "lastname": "Apellido del policía",
    "charge": "Cargo del policía",
    "patrol": {
        "id": 1   
    },
    "weapon": {
        "id": 1   
    },
    
}

url post= http://localhost:8012/api/v2/place

hijo-place
{
    "range": "Updated Range",
    "date": "2024-05-21",
    "stade": false,
    "name": "Updated Place Name"
    
}


![image](https://github.com/Bsteven593/policiabryan/assets/110885930/58a8febb-7148-4e11-8392-f61363bfb9d9)


url:http://localhost:8012/swagger-ui/index.html#/
![image](https://github.com/Bsteven593/policiabryan/assets/110885930/dcc9b8f8-2b70-43a7-a6a3-2fb7f133e556)


EL DELETE POR EL NOMBRE NO ME SALIO
http://localhost:8012/api/v2/police/nombre


