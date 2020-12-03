<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>

<body>
<style>
    .visual-section {
        width: 100%;
        height: auto;
    }

    .form {
        margin-top: 300px;
        width: 200px;
        height: 200px;
        margin-left: auto;
        margin-right: auto;
    }
    .get-img{
        width: 80%;
        height: auto;
        margin-left: auto;
        margin-right: auto;
    }
</style>
<div class="visual-section">
        <input type="text" placeholder="URL" width="150" height="15" name="url" class="input">
        <input type="Button" value="입력" name="send" class="send">
    <div class="get-img">

    </div>
</div>
</body>
<script src="/script/query.js"></script>
</html>