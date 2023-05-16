<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- BEGIN -->
<html>
    <head>
        <title>Delete</title>
        <meta charset="UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
              rel="stylesheet"
              integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
              crossorigin="anonymous">
    </head>
    <body>
    <div class="container">
        <a href="/users">All users</a>
        <div>Are you sure that you want to delete ${user.get("firstName")} ${user.get("lastName")}?</div>
        <table>
            <tr><td>
                <form action="delete?id=${user.get("id")}" method="post">
                    <button type="submit" class="btn btn-danger">Delete</button>
                </form></td>
                <td><form action="/users" method="get">
                    <button class="btn btn-outline-success">Cancel</button>
                </form></td></tr><tr>
            <td><a href='/users/show?id=${user.get("id")}'>Back</a></td>
        </tr>
        </table>
    </div>
    </body>
</html>
<!-- END -->
