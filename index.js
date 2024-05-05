const express = require('express');
const path = require('path');

const app = express();

app.use(express.static(path.join(__dirname, 'public')));

app.get('/', (req, res) => {
    res.send();
});

app.listen(3001, () => {
    console.info("[LOTUS] - Server running at port 3001");
});