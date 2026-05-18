<!doctype html>
<html>
<head>
<title>login Demo</title>
</head>
<body>
<h2>login page</h2>
<form onsubmit="return validate()">
<input type="text"id="username"
placeholder="username"required><br><br>
<inputtype="password"id="passward"
placeholder="password"required><br><br>
<buttoon type ="submit"<login</button>
</form>
<p id="result"</p>

<script>
function validate(){
    let user=
    document.grtElementByld("username").value;
    let pass=
    document.getElementByld("password").value;
    
    if(user==="admin"&&pass==="1234")}
    document.getelementBYLD("result").innerText=
    "Login Successful";
}else{ 
     doocument.getElementByld("result").innertext=
     "invaild Credentials";
   }

   return false;
   }
   </script>
   </body>
   </html>
   <!doctype html>
