<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Голосования</title>
</head>
<body>
    <h1>Все голосования</h1>
    <ol>
        <#list polls as obj>
            <li><a href="/polls/${obj.id}">${obj.title}</a></li>
        </#list>
    </ol>
</body>
</html>







