//import express
const port = 3001;
const express = require('express');
const path = require('path');

//create app or server using the express function
const app = express();

app.use(express.urlencoded());
app.use(express.static(path.join(__dirname, 'public')));

//configure routing

app.get('/', (req, res) => {
  const file_path = path.join(__dirname, 'pages', 'homepage.html');
  res.sendFile(file_path);
})

//localhost:3001/contact?type=form
//localhost:3001/contact?type=text
//localhost:3001/contact -> text
app.get('/contact', (req, res) => {
  const type = req.query.type;

  if (type === 'form') {
    res.sendFile(path.join(__dirname, 'pages', 'contact-form.html'));
  } else {
    res.sendFile(path.join(__dirname, 'pages', 'contact-text.html'));
  }
})

const products = [
  {
    name: 'Banana',
    price: 5
  },
  {
    name: 'Coke',
    price: 3
  },
  {
    name: 'Pasta',
    price: 8
  },
  {
    name: 'Grapes',
    price: 4
  }
];

//localhost:3001/products?id=3
app.get('/products', (req, res) => {
  const id = req.query.id;

  if (id >= products.length || id < 0) {
    res.status(404);
    res.send('Product not found!');
    return;
  }

  res.send(`<p>Name: ${products[id].name}</p>
  <p>Price: ${products[id].price}</p>`);
})

//launch server calling listen function
app.listen(port, () => console.log(`Running on port ${port}`));