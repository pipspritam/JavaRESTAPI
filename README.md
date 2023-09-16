<h3>An application in java which provides a REST API with endpoints for searching, creating and deleting “server” objects</h3>

<h4>Server Model Body</h4>

```json
{
  "name": "my centos",
  "id": "123",
  "language": "java",
  "framework": "django"
}
```

## End points of API
1. Create a new server <br>
   http://127.0.0.1:8081/addServer

   <img src="./screenshot/addServer.png">
   
2. Get a list of all servers <br>
   http://127.0.0.1:8081/getServers

   <img src="./screenshot/getServers.png">
   
3. Get a single server by ID <br>
   http://127.0.0.1:8081/getServerByid/{id}

   <img src="./screenshot/getServerByid.png">
   
4. Find servers by name <br>
   http://127.0.0.1:8081/getServers/{name}

   <img src="./screenshot/gerServeraByname.png">
   
5. Delete a server <br>
   http://127.0.0.1:8081/deleteServer/{id} 

   <img src="./screenshot/deleteServer.png">  


