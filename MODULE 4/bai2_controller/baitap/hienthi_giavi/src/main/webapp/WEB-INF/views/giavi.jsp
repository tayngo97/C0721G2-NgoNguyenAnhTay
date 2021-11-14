<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/11/2021
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<form action="giavi1"  method="post">
    <div class="form-check">
        <input class="form-check-input" name="giavi" type="checkbox" value="lettuce" id="flexCheckDefault">
        <label class="form-check-label" for="flexCheckDefault">
            Lettuce
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" name="giavi" type="checkbox" value="tomato" id="flexCheckChecked1" checked>
        <label class="form-check-label" for="flexCheckChecked1">
            Tomato
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" name="giavi" type="checkbox" value="mustard" id="flexCheckChecked2" checked>
        <label class="form-check-label" for="flexCheckChecked2">
            Mustard
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" name="giavi" type="checkbox" value="sprouts" id="flexCheckChecked3" checked>
        <label class="form-check-label" for="flexCheckChecked3">
            Sprouts
        </label>
    </div>
    <button type="submit">Submit</button>
</form>

    <p>Kết quả là : ${giavi1}</p>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>
