const express = require("express");
const fs = require("fs");
const app = express();

app.get('/homepage.js', (request, response) => {
    response.setHeader('Content-Type', 'application/javascript');
    fs.readFile(__dirname + "/homepage.js", "utf8", (err, data) => {
        if (err) {
            console.error("Error reading homepage.js file:", err);
            response.status(500).send("Error reading homepage.js file");
        } else {
            response.send(data);
        }
    });
});

app.get("/", (request, response) => {
    console.log(request.method);
    console.log(request.url);

    response.status(404);
    response.sendFile(__dirname + "/homepage.html");
});

app.get("/contact", (request, response) => {
    response.send("contacts");
});

app.get("/contato", (request, response) => {
    response.status(301);
    response.header("location", "/contact");
    response.send("");
});

app.listen(3002, () => console.log("Using port 3002..."));
