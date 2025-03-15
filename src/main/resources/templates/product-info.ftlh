<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BySell</title>
</head>
<body>
<h1> BUYSELL PRODUCTS </h1><hr>
<h4> Информация о товаре </h4>
<b>Название товара: </b>${product.title}
<b>Описание товара: </b>${product.description}
<b>Цена товара: </b>${product.price}
<b>Город товара: </b>${product.city}
<b>Автор товара: </b>${product.author}
<hr>
<form action="/product/delete/${product.id}" method="post"></form>
<input type="submit" value="Удалить товар">
</body>
</html>