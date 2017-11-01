# scala_akka_rest_starter
Original article is posted on https://danielasfregola.com/2016/02/07/how-to-build-a-rest-api-with-akka-http/

Scala AkkaHTTP web service starter InMemory CRUD. 
which answers below REST calls: 

curl -v -H "Content-Type: application/json" \
   -X POST http://localhost:5000/questions \
   -d '{"id": "test", "title": "MyTitle", "text":"The text of my question"}'
   
curl -v http://localhost:5000/questions/test

curl -v http://localhost:5000/questions/non-existing-question

curl -v -H "Content-Type: application/json" \
   -X PUT http://localhost:5000/questions/test \
   -d '{"text":"Another text"}'
   
   
curl -v -X DELETE http://localhost:5000/questions/test
