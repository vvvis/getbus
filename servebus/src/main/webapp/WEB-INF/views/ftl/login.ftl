<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>GetBus login</title>


</head>

<body>

<div class="container" style="width: 300px;">
    <form action="/j_spring_security_check" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="form-control" name="j_username" placeholder="Email address" required autofocus value="e-mail">
        <input type="password" class="form-control" name="j_password" placeholder="Password" required value="">
        <button type="submit">login</button>
    </form>
</div>

</body>
</html>