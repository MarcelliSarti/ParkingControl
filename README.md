# Parking Control
Api CRUD de controle de vagas de estacionamento desenvolvido em Java com SpringBoot e banco de dados PostGress.

# Configurações
- em application.properties (src/main/resources/application.properties) alterar a senha com a senha do seu banco de dados `PostGress`.

# Rotas
- GET /parking-spot: retorna todas as vagas cadastradas
Opções de paginação:
- GET /parking-spot?page={page}&size={size}&sort={field},{DESC/ASC}
- GET /parking-spot/{id} - retorna a vaga cadastrada com aquele id
- POST /parking-spot - cadastra uma nova vaga. Usar o json abaixo:
```
{
    "parkingSpotNumber": "",
    "licensePlateCar": "",
    "brandCar": "",
    "modelCar": "",
    "colorCar": "",
    "responsibleName": "",
    "apartment": "",
    "block": ""
}
```
- DELETE /parking-spot/{id} - deleta a vaga cadastrada com aquele id
- PUT /parking-spot/{id} - atualiza a vaga cadastrada com aquele id. Usar o json abaixo:
```
{
    "parkingSpotNumber": "",
    "licensePlateCar": "",
    "brandCar": "",
    "modelCar": "",
    "colorCar": "",
    "responsibleName": "",
    "apartment": "",
    "block": ""
}
```

# Vídeo de demonstração
https://www.youtube.com/watch?v=5SaYxwMHi3M
