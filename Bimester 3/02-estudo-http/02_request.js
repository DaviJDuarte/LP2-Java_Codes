const express = require('express');
const path = require('path');

const app = express();
app.use(express.urlencoded());

app.use(express.static(path.join(__dirname, 'public')));

app.get("/register", (req, res) => {
  const file_path = path.join(__dirname, 'pages', 'register.html');
  res.sendFile(file_path);
});

app.post("/register", (req, res) => {
  const name = req.body.name;
  const email = req.body.email;
  const password = req.body.password;

  const errors = [];

  if (!name) {
    errors.push("Invalid name!");
  }

  if (!email) {
    errors.push("Invalid email!");
  }
  if (!password) {
    errors.push("Invalid password!");
  }

  if (errors.length) {
    res.send(errors);
    return;
  }

  console.log(req.body);

  res.status(303);
  res.header("Location", "/login");
  res.send();
});

app.get("/login", (req, res) => {
  const file_path = path.join(__dirname, "pages", "login.html");
  res.sendFile(file_path);
});

app.post("/login", (req, res) => {
  const email = req.body.email;
  const password = req.body.password;

  const errors = [];

  if (!email) {
    errors.push("Invalid email!");
  }
  if (!password) {
    errors.push("Invalid password!");
  }

  if (errors.length) {
    res.send(errors);
    return;
  }
  console.log(req.body);

  res.status(303);
  res.header('Location', '/homepage')
  res.send();
});

app.get('/homepage', (req, res) => {
  const file_path = path.join(__dirname, 'pages', 'homepage.html');
  res.sendFile(file_path);
})

app.listen(3001, () => console.log("Running on port 3001"));