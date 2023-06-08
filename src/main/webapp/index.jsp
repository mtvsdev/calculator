<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>사칙연산 계산기</title>
</head>
<body>
    <h1>사칙연산 계산기</h1>
    <br>
    <form action="calculator" method="get">
        <label>첫번째 숫자 </label><input type="number" name="num1">
        <br>
        <label>사칙연산자 </label><select name="operator">
            <option value="plus">+</option>
            <option value="minus">-</option>
            <option value="multiply">*</option>
            <option value="divide">/</option>
            <option value="mod">%</option>
        </select>
        <br>
        <label>두번째 숫자 </label><input type="number" name="num2">
        <br>
        <input type="submit" value="결과 확인">
    </form>
</body>
</html>